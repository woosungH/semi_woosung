<%@page import="product.ProductBean"%>
<%@page import="product.ProductDBBean"%>
<%@page import="member.LikeDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String id = (String)session.getAttribute("id");	
	int product_number = Integer.parseInt(request.getParameter("product_number"));
	ProductDBBean product_db = ProductDBBean.getInstance();
	ProductBean product_bd = product_db.getproduct(product_number, false);
	
	String product_name = product_bd.getProduct_name();
	int product_price = product_bd.getProduct_price();
	int product_file_num = product_bd.getFile_number();
	LikeDBBean like = LikeDBBean.getInstance();
	
	
	
	if(id != null){
	int likecheck = like.likeCheck(id, product_number);
	
	System.out.println("re ================ "+likecheck);
	
		if(likecheck == 1){
			like.updateLike(id, product_number, product_name, product_price, product_file_num);
	%>
			<script>
				alert("좋아요 하셨습니다.")
				location.href="../main/main.jsp?pages=../product/product_detail&product_number=<%=product_number%>";
			</script>
			
	<%
		}else{
			like.deleteLike(id, product_number);
			%>
			<script>
				alert("좋아요 취소 하셨습니다.")
				location.href="../main/main.jsp?pages=../product/product_detail&product_number=<%=product_number%>";
			</script>
	<%
		}
	}else{
%>
		<script>
				alert("회원이 아닙니다.")
				location.href="main.jsp?pages=../user_log/login";
		</script>
<%
	}
%>