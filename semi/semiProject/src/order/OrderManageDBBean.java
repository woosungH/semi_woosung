package order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class OrderManageDBBean {
private static OrderManageDBBean OrderMangeDBBean = new OrderManageDBBean();
	
	public static OrderManageDBBean getInstance() {
		return OrderMangeDBBean;
	}
	
	public Connection getConnection() throws Exception{
		Connection conn = ((DataSource)(new InitialContext().lookup("java:comp/env/jdbc/oracle"))).getConnection();
		return conn;
	}
	
	public ArrayList<OrderManageBean> orderList(int startRow, int pageSize, String refundCheck) throws Exception {
		String sql = "SELECT ORDER_DETAIL_NUMBER, ORDER_NUMBER, PRODUCT_NUMBER, PRODUCT_COUNT\r\n" + 
				"     , PRODUCT_PRICE, ORDER_DETAIL_STATUS, REFUND_CHECK\r\n" + 
				"  FROM (SELECT ROWNUM AS rnum, A.* \r\n" + 
				"         FROM (SELECT * FROM USERORDER_DETAIL ORDER BY ORDER_DETAIL_NUMBER)A)\r\n" + 
				" WHERE rnum >= ? AND rnum <= ? AND REFUND_CHECK = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<OrderManageBean> list = new ArrayList<OrderManageBean>();
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, startRow+pageSize-1);
			pstmt.setString(3, refundCheck);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				OrderManageBean omb = new OrderManageBean();
				omb.setOrder_detail_number(rs.getInt("ORDER_DETAIL_NUMBER"));
				omb.setOrder_number(rs.getString("ORDER_NUMBER"));
				omb.setProduct_number(rs.getInt("PRODUCT_NUMBER"));
				omb.setProduct_count(rs.getInt("PRODUCT_COUNT"));
				omb.setProduct_price(rs.getInt("PRODUCT_PRICE"));
				omb.setOrder_detail_status(rs.getString("ORDER_DETAIL_STATUS"));
				omb.setRefund_check(rs.getString("REFUND_CHECK"));
				list.add(omb);
			}
			
		} catch (SQLException ex) {
			System.out.print("��ȸ ����");
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public int getCount(OrderManageBean omb) throws Exception {
		String sql = "SELECT COUNT(*) FROM USERORDER_DETAIL WHERE REFUND_CHECK = 'N'";
		int re=0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				re = rs.getInt(1); // �� ����
			} else {
				re = 0; // �� ����
			}
		}catch (SQLException ex) {
			System.out.print("��ȸ ����");
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return re;
	}
	public OrderManageBean getBoard(int o_dNum) throws Exception {
		String sql = "SELECT ORDER_NUMBER, PRODUCT_NUMBER, PRODUCT_COUNT\r\n" + 
				"     , PRODUCT_PRICE, ORDER_DETAIL_STATUS\r\n" + 
				"  FROM USERORDER_DETAIL\r\n" + 
				" WHERE order_detail_number = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		OrderManageBean omb = null;
		String o_num="";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, o_dNum);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				omb = new OrderManageBean();
				omb.setOrder_number(rs.getString(1));
				omb.setProduct_number(rs.getInt(2));
				omb.setProduct_count(rs.getInt(3));
				omb.setProduct_price(rs.getInt(4));
				omb.setOrder_detail_status(rs.getString(5));
				o_num = rs.getString(1);
			}
			
			sql = "SELECT USER_ID, ORDER_DATE, RECEIVER_NAME, RECEIVER_PCODE\r\n" + 
					"     , RECEIVER_PHONE1, RECEIVER_PHONE2, RECEIVER_PHONE3\r\n" + 
					"     , RECEIVER_RADDR, RECEIVER_JIBUN, RECEIVER_DETAILADDR\r\n" + 
					"  FROM USER_ORDER\r\n" + 
					" WHERE ORDER_NUMBER = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, o_num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				omb.setUser_id(rs.getString(1));
				omb.setOrder_date(rs.getTimestamp(2));
				omb.setReceiver_name(rs.getString(3));
				omb.setReceiver_pcode(rs.getString(4));
				omb.setReceiver_phone1(rs.getString(5));
				omb.setReceiver_phone2(rs.getString(6));
				omb.setReceiver_phone3(rs.getString(7));
				omb.setReceiver_raddr(rs.getString(8));
				omb.setReceiver_jibun(rs.getString(9));
				omb.setReceiver_detailaddr(rs.getString(10));
			}
			
		} catch (SQLException ex) {
			System.out.print("��ȸ ����");
			ex.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return omb;
	}
	public int editOrder(OrderManageBean omb) throws Exception {
		String sql = "UPDATE userorder_detail SET PRODUCT_COUNT=?, PRODUCT_PRICE=?, ORDER_DETAIL_STATUS=? WHERE ORDER_NUMBER=?"; 
		int re = -1; // ���� ����
		Connection conn = null;
		PreparedStatement first_pstmt = null;
		PreparedStatement second_pstmt = null;
		try {
			conn = getConnection();
			first_pstmt = conn.prepareStatement(sql);
			first_pstmt.setInt(1, omb.getProduct_count());
			first_pstmt.setInt(2, omb.getProduct_price());
			first_pstmt.setString(3,omb.getOrder_detail_status());
			first_pstmt.setString(4,omb.getOrder_number());
			first_pstmt.executeUpdate();
			
			sql = "UPDATE user_order SET RECEIVER_NAME=?, RECEIVER_PCODE=?\r\n" + 
					"     , RECEIVER_PHONE1=?, RECEIVER_PHONE2=?, RECEIVER_PHONE3=?\r\n" + 
					"     , RECEIVER_RADDR=?, RECEIVER_JIBUN=?, RECEIVER_DETAILADDR=? \r\n" + 
					" WHERE ORDER_NUMBER=?";
			
			second_pstmt = conn.prepareStatement(sql);
			second_pstmt.setString(1,omb.getReceiver_name());
			second_pstmt.setString(2,omb.getReceiver_pcode());
			second_pstmt.setString(3,omb.getReceiver_phone1());
			second_pstmt.setString(4,omb.getReceiver_phone2());
			second_pstmt.setString(5,omb.getReceiver_phone3());
			second_pstmt.setString(6,omb.getReceiver_raddr());
			second_pstmt.setString(7,omb.getReceiver_jibun());
			second_pstmt.setString(8,omb.getReceiver_detailaddr());
			second_pstmt.setString(9,omb.getOrder_number());
			second_pstmt.executeUpdate();
			
			re = 1; // ���� ����
		}catch (SQLException ex) {
			System.out.print("���� ����");
			ex.printStackTrace();
		} finally {
			try {
				if (first_pstmt != null) {
					first_pstmt.close();
				}
				if (second_pstmt != null) {
					second_pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return re;
	}
}
