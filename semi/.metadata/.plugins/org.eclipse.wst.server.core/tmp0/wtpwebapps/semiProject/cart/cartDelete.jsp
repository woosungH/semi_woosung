<%@page import="cart.CartDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int cart_number = Integer.parseInt(request.getParameter("cart_number"));
	
	CartDBBean cartdb = CartDBBean.getInstance();
	int re = cartdb.deleteCart(cart_number);
%>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		if(re == 1) {
	%>
			<script>
				alert("�ش� ��ǰ�� ��ٱ��Ͽ��� ���� �Ǿ����ϴ�.")
				location.href = "main.jsp?pages=../cart/cartList";
			</script>
	<%
		}else{
	%>
			<script>
				alert("��ٱ��� ���� ����")
				history.go(-1);
			</script>
	<%
		}
	%>
</body>
</html>