<%@page import="cs.QnABoardDBBean"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean class="cs.QnABoardBean" id="qboard"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] b_category = {"ȸ������","��ǰ����","���","�ֹ�/����","��ȯ/���","����"};
		String[] b_secret = {"N","Y"};
		
		QnABoardDBBean db = QnABoardDBBean.getInstance();
	
		for(int i=1;i<=60;i++){
			qboard.setB_id(0);
			qboard.setU_id("admin");
			qboard.setB_category(b_category[i%6]);
			qboard.setB_view((int)(Math.random() * 100));
			qboard.setB_title("test"+i);
			qboard.setB_content("test"+i);
			qboard.setB_ip("1");
			qboard.setB_pwd("test");
			qboard.setB_date(new Timestamp(System.currentTimeMillis()));
			qboard.setB_secret(b_secret[(int)(Math.random()*2)]);
			db.insertBoard(qboard);
		}
		for(int i=61;i<=120;i++){
			qboard.setB_id(i-60);
			qboard.setU_id("admin");
			qboard.setB_category(b_category[i%6]);
			qboard.setB_view((int)(Math.random() * 100));
			qboard.setB_title("[�亯]test"+i);
			qboard.setB_content("test"+i);
			qboard.setB_ip("1");
			qboard.setB_pwd("test");
			qboard.setB_date(new Timestamp(System.currentTimeMillis()));
			qboard.setB_secret(b_secret[(int)(Math.random()*2)]);
			qboard.setB_ref(i-60);
			db.insertBoard(qboard);
			if(i==120){
				System.out.print("�ٳ���");
			}
		}
		
		for(int i=121;i<=123;i++){
			qboard.setB_id(0);
			qboard.setU_id("admin");
			qboard.setB_category(b_category[i%6]);
			qboard.setB_view((int)(Math.random() * 100));
			qboard.setB_title("test"+i);
			qboard.setB_content("test"+i);
			qboard.setB_ip("1");
			qboard.setB_pwd("test");
			qboard.setB_date(new Timestamp(System.currentTimeMillis()));
			qboard.setB_secret(b_secret[(int)(Math.random()*2)]);
			db.insertBoard(qboard);
		}
	%>
</body>
</html>