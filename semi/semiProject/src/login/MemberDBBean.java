package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import cs.NoticeBean;
import cs.QnABoardBean;


public class MemberDBBean {
	private static MemberDBBean instance = new MemberDBBean();

	public static MemberDBBean getInstance() {
		// 媛믪쓣 �엯�젰諛쏅뒗 硫붿냼�뱶
		return instance; // BoardDBBean�쓽 媛앹껜瑜� �엯�젰諛쏆쓬.

	}

	public static Connection getConnection() throws Exception {
		// 荑쇰━�옉�뾽 �궗�슜�븷 Connection媛앹껜 由ы꽩�븯�뒗 硫붿냼�뱶
		// �뵲濡쒕쭔�뱺 �씠�쑀 -> �뿬�윭踰� �궗�슜�븯湲� �쐞�빐�꽌

		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");
		return ds.getConnection();
	}
	
	// �쑀�� 媛��엯 硫붿냼�뱶
	public static int register(MemberBean member) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		String sql = "";
		
		try {
			con = getConnection();
			
			sql = "INSERT INTO user_table\r\n" + 
					"(USER_ID,USER_PWD,USER_NAME,USER_PHONE1,USER_PHONE2,USER_PHONE3,USER_EMAIL\r\n" + 
					",USER_PCODE,USER_RADDR,USER_JIBUN,USER_DETAILADDR,USER_GRADE,USER_REGDATE)\r\n" + 
					"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,sysdate);";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getUser_id());
			pstmt.setString(2, member.getUser_pwd());
			pstmt.setString(3, member.getUser_name());
			pstmt.setString(4, member.getUser_phone1());
			pstmt.setString(5, member.getUser_phone2());
			pstmt.setString(6, member.getUser_phone3());
			pstmt.setString(7, member.getUser_email());
			pstmt.setString(8, member.getUser_pcode());
			pstmt.setString(9, member.getUser_raddr());
			pstmt.setString(10, member.getUser_jibun());
			pstmt.setString(11, member.getUser_detailaddr());
			pstmt.setString(12, member.getUser_grade());
			pstmt.setTimestamp(13, member.getUser_regdate()); 
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		return 1;
	}
	public int confirmID(String id) throws Exception{
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int re= -1;
		String sql = "select mem_id from memberT where mem_id =?";
		//�뙆�씪誘명꽣媛믪쓣 ?濡� 諛쏆쓬.
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); //sql�쓽 寃곌낵媛�.
		
			if(rs.next()) {
				re =1;
			}
			else {
				re = -1;
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
			return re;
	}
	
	public MemberBean getMember(String id) throws Exception{
		//�븘�씠�뵒媛� �씪移섑븯�뒗 硫ㅻ쾭�쓽 �젙蹂대�� �뼸�뼱�삤�뒗 硫붿냼�뱶
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from user_table where user_id=?";
		MemberBean member = null;
		
		try {	con = getConnection();
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, id);
		
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			member = new MemberBean();
			member.setUser_id(rs.getString("user_id")); 
			member.setUser_pwd(rs.getString("user_pwd"));
			member.setUser_name(rs.getString("user_name"));  
			member.setUser_phone1(rs.getString("user_phone1"));  
			member.setUser_phone2(rs.getString("user_phone2"));  
			member.setUser_phone3(rs.getString("user_phone3"));  
			member.setUser_email(rs.getString("user_email"));  
			member.setUser_pcode(rs.getString("user_pcode"));  
			member.setUser_raddr(rs.getString("user_raddr"));  
			member.setUser_jibun(rs.getString("user_jibun"));  
			member.setUser_detailaddr(rs.getString("detailaddr"));  
			member.setUser_grade(rs.getString("user_grade"));  
			member.setUser_regdate(rs.getTimestamp("user_regdate"));
		}
		rs.close();
		pstmt.close();
		con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
	
	 public int userCheck(String id, String pwd) throws Exception {
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  ResultSet rs = null;
		  String sql = "select user_pwd from user_table where user_id = ?";
		  String db_user_pwd;
		  int re = -1;

		  try {
		   con = getConnection();
		   pstmt = con.prepareStatement(sql);
		   pstmt.setString(1, id);
		   rs = pstmt.executeQuery();

		   if(rs.next()) {
		    db_user_pwd = rs.getString("user_pwd");
		    
		    if (db_user_pwd.equals(pwd))
		     re = -1;
		    else
		     re = 0;
		     
		   } else {
		    re = -1;
		   }
		  } catch(Exception e) {
		   System.out.println(e.getMessage()); 
		  }

		  rs.close();
		  pstmt.close();
		  con.close();

		  return re;
	 }
	 
	 public String findId(String user_name, String user_phone) {
		String re=null;
		
		try {			
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			String sql = "select user_id from user_table where user_name=? and user_phone=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user_name);
			pstmt.setString(2, user_phone);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				re = rs.getString("user_id");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return re;
	 }
	
	 
		public ArrayList<MemberBean> listMember(String pageNumber, String user_id) throws Exception{
			ArrayList<MemberBean> memberList = new ArrayList<>();
			Connection conn = null;
			Statement stmt= null;
			PreparedStatement pstmt =null;
			ResultSet rs = null;
			ResultSet pageSet = null;
			int dbCount=0;
			int absolutePage=0;
			String sql=""; 
			String sql2=""; 
			sql = "select user_id\r\n" + 
					"     , user_pwd\r\n" + 
					"     , user_name\r\n" + 
					"     , user_phone1\r\n" + 
					"     , user_phone2\r\n" + 
					"     , user_phone3\r\n" + 
					"     , user_email\r\n" + 
					"     , user_pcode\r\n" + 
					"     , user_raddr\r\n" + 
					"     , user_jibun\r\n" + 
					"     , user_detailaddr\r\n" + 
					"     , user_regdate\r\n" + 
					"  from user_table\r\n"+
					" where user_id like '%"+user_id+"%'";
			
			sql2="SELECT COUNT(user_id) FROM user_table where user_id like '%"+user_id+"%'";
			try {
				conn = getConnection();
				
				stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				pageSet=stmt.executeQuery(sql2);
				
				if(pageSet.next()) {
					dbCount = pageSet.getInt(1);
					pageSet.close();
				}
				
				if(dbCount%MemberBean.pageSize==0) { //dbCount => 珥� �닽�옄 , pageSize =10 => ex) 84%10 = 4
					MemberBean.pageCount = dbCount / MemberBean.pageSize; //80/10=> 8
				} else {
					MemberBean.pageCount = dbCount / MemberBean.pageSize +1;//84/10 +1=> 8+1 => 9
				}
				
				if(pageNumber != null) {
					MemberBean.pageNum = Integer.parseInt(pageNumber);
					absolutePage = (MemberBean.pageNum - 1) * MemberBean.pageSize +1;
				}
				rs=stmt.executeQuery(sql);
				if(rs.next()) {
					rs.absolute(absolutePage);
					int count = 0;
					
					while(count<MemberBean.pageSize){
						MemberBean member = new MemberBean();
						
						member.setUser_id(rs.getString("user_id")); 
						member.setUser_pwd(rs.getString("user_pwd"));
						member.setUser_name(rs.getString("user_name"));  
						member.setUser_phone1(rs.getString("user_phone1"));  
						member.setUser_phone2(rs.getString("user_phone2"));  
						member.setUser_phone3(rs.getString("user_phone3"));  
						member.setUser_email(rs.getString("user_email"));  
						member.setUser_pcode(rs.getString("user_pcode"));  
						member.setUser_raddr(rs.getString("user_raddr"));  
						member.setUser_jibun(rs.getString("user_jibun"));  
						member.setUser_detailaddr(rs.getString("detailaddr"));  
						member.setUser_regdate(rs.getTimestamp("user_regdate"));
						
						memberList.add(member);
						
						if(rs.isLast()) {
							break;
						} else {
							rs.next();
						}
						
						count++;
					}
				}
				
			}catch(SQLException ex){
				System.out.println("議고쉶 �떎�뙣");
				ex.printStackTrace();
			}finally{
				try{
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			return memberList;
		}
		
		/*
		 * �옉�꽦�옄 : �씠誘쇳븯
		 * �씪  �떆 : 2022.09.20
		 * �뜲�씠�꽣 �궘�젣臾� 
		 * */
		public int deleteMember(String user_id) throws Exception {
			Connection conn = null;
			PreparedStatement pstmt = null;

			int re=-1;
			String sql;
			try {
				conn = getConnection();
				
				sql = "DELETE FROM USER_TABLE WHERE USER_ID = ?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, user_id);
				pstmt.executeUpdate();
				
				System.out.println("�궘�젣 �꽦怨�");
				
			}catch(SQLException ex){
				System.out.println("蹂�寃� �떎�뙣");
				ex.printStackTrace();
			}finally{
				try{
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			return re;
		}

		/*
		 * �옉�꽦�옄 : �씠誘쇳븯
		 * �씪  �떆 : 2022.09.20
		 * �뜲�씠�꽣 �뾽�뜲�씠�듃 
		 * */
		public int editMember(MemberBean member) throws Exception{
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String check_pw="";
			int re=-1;
			String sql;
			
			try {
				conn = getConnection();
				
				sql = "update user_table\r\n" + 
						"    set user_name = ?\r\n" + 
						"      , user_phone1 = ?\r\n" + 
						"      , user_phone2 = ?\r\n" + 
						"      , user_phone3 = ?\r\n" + 
						"      , user_email = ?\r\n" + 
						"      , user_pcode = ?\r\n"+
						"      , user_raddr = ?\r\n"+
						"      , user_jibun = ?\r\n"+
						"      , user_detailaddr = ?\r\n"+
						"  where user_id = ?";

				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, member.getUser_name());
				pstmt.setString(2, member.getUser_phone1());
				pstmt.setString(3, member.getUser_phone2());
				pstmt.setString(4, member.getUser_phone3());
				pstmt.setString(5, member.getUser_email());
				pstmt.setString(6, member.getUser_pcode());
				pstmt.setString(7, member.getUser_raddr());
				pstmt.setString(8, member.getUser_jibun());
				pstmt.setString(9, member.getUser_detailaddr());
				
				re=pstmt.executeUpdate();
				
				re=1;
				
			}catch(SQLException ex){
				ex.printStackTrace();
			}finally{
				try{
					if(pstmt != null)pstmt.close();
					if(conn != null)conn.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
			
			return re;
		}
		
}