<%@page import="cart.CartDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int product_count = Integer.parseInt(request.getParameter("product_count"));
	int cart_number = Integer.parseInt(request.getParameter("cart_number"));
	
	System.out.println("��ǰ ���� :"+product_count+"īƮ ��ȣ :"+cart_number);
	
	CartDBBean cartdb = CartDBBean.getInstance();
	int re = cartdb.editCart(cart_number, product_count);
%>    
<!DOCTYPE html>
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
				alert("�ش� ��ǰ�� ������ �����Ǿ����ϴ�.")
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