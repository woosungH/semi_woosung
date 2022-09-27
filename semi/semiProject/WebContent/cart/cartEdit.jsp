<%@page import="cart.CartDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int product_count = Integer.parseInt(request.getParameter("product_count"));
	int cart_number = Integer.parseInt(request.getParameter("cart_number"));
	
	System.out.println("상품 숫자 :"+product_count+"카트 번호 :"+cart_number);
	
	CartDBBean cartdb = CartDBBean.getInstance();
	int re = cartdb.editCart(product_count, cart_number);
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
				alert("해당 상품의 수량이 수정되었습니다.")
				location.href = "main.jsp?pages=../cart/cartList";
			</script>
	<%
		}else{
	%>
			<script>
				alert("장바구니 수정 실패")
				history.go(-1);
			</script>
	<%
		}
	%>
</body>
</html>