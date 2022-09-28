package cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CartDBBean {
	private static CartDBBean instance = new CartDBBean();

	public static CartDBBean getInstance() {
		return instance; 
	}

	public static Connection getConnection() throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection();
	}
	
	// ��ٱ��ϸ� db�� �����ϴ� �޼���
	public int insertCart(String user_id, int product_number, int product_count) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "";
		int re = -1;
		int number = 0;
		int count = 0;
		
		try {
			conn = getConnection();
			
			// cart_number�� �����ϱ� ����
			query = "select max(cart_number) from cart";
			pstmt = conn.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				number = rs.getInt(1)+1;
			} else {
				number=1;
			}
			
			// product_count�� ����+īƮ�� ���
			query = "select product_count from cart where user_id=? and product_number=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user_id);
			pstmt.setInt(2, product_number);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {	// ������ �߰��� ��
				count = rs.getInt(1)+product_count;
				
				query = "update cart set product_count=? where user_id=? and product_number=?";
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, count);
				pstmt.setString(2, user_id);
				pstmt.setInt(3, product_number);
				
				re = pstmt.executeUpdate();
				re = 1;
				
			} else {	//  �� ��ǰ�� �߰��� ���� ��
				query = "insert into cart"
						+ "(cart_number, user_id, product_number, product_count)"
						+ "values(?,?,?,?)";
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, number);
				pstmt.setString(2, user_id);
				pstmt.setInt(3, product_number);
				pstmt.setInt(4, product_count);
				
				re = pstmt.executeUpdate();
				re = 1;
			}
			
			System.out.println("�߰� ����");
		}catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return re;
	}
	
	// user_id�� ��ġ�ϴ� cart�� ������ ������ �޼���
	public ArrayList<CartBean> getCart(String user_id) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select cart_number, product_number, product_count from cart where user_id=? order by cart_number";
		
		ArrayList<CartBean> cartArr = new ArrayList<CartBean>();
		CartBean cart = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				cart = new CartBean();
				cart.setCart_number(rs.getInt("cart_number"));
				cart.setProduct_number(rs.getInt("product_number"));
				cart.setProduct_count(rs.getInt("product_count"));
				cartArr.add(cart);
			}
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return cartArr;
	}
	
	// cart_number ���� �����ϴ� �޼���
	public int deleteCart(int cart_number) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "delete from cart where cart_number=?";
		int re = -1;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, cart_number);
			re = pstmt.executeUpdate();
			re = 1;
			
			System.out.println("���� ����");
		}catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			try{
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return re;
	}
	
	// cart_number�� ���� ������ �����ϴ� �޼���
	public int editCart(int cart_number, int product_count) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "Update cart set product_count=? where cart_number=?";
		int re = -1;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, product_count);
			pstmt.setInt(2, cart_number);
			re = pstmt.executeUpdate();
			re = 1;
			
			System.out.println("���� ����");
		}catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			try{
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return re;
	}
	public CartBean getCartContent(int cartNum) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select product_number, product_count from cart where cart_number=?";
		
		CartBean cart = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, cartNum);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				cart = new CartBean();
				cart.setProduct_number(rs.getInt("product_number"));
				cart.setProduct_count(rs.getInt("product_count"));
			}
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return cart;
	}
	public CartBean overlapTest(String user_id) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select product_number, product_count, cart_number from cart where user_id=?";
		
		CartBean cart = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				cart = new CartBean();
				cart.setProduct_number(rs.getInt("product_number"));
				cart.setProduct_count(rs.getInt("product_count"));
				cart.setCart_number(rs.getInt("cart_number"));
			}
			
		}catch(SQLException ex){
			ex.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return cart;
	}
}