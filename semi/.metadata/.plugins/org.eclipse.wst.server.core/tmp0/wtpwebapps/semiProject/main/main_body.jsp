<%@page import="product.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="product.ProductDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String id = (String)session.getAttribute("id");
	ProductDBBean updb = ProductDBBean.getInstance();

	ArrayList<ProductBean> productList = updb.productList("1");
	int product_number[] = new int[productList.size()];
	String product_name[] = new String[productList.size()];
	int product_price[] = new int[productList.size()];
	String stored_file_name[] = new String[productList.size()];
	String product_desc[] = new String[productList.size()];
	for (int i = 0; i < productList.size(); i++) {
		ProductBean upbd = productList.get(i);

	product_number[i] = upbd.getProduct_number();
	product_name[i] = upbd.getProduct_name().toString();
	product_price[i] = upbd.getProduct_price();
	product_desc[i] = updb.getproduct(product_number[i], false).getProduct_desc();
	stored_file_name[i] = updb.getImg(product_number[i]).getStored_file_name();

}
%>
<html>
<head>
<meta charset="UTF-8">
<title>index_body</title>
<style>
	.img_container {
		width : 33.3%;
		float: left;
		text-align:center;
		margin-bottom:0.125rem;
		filter: brightness(1);
  		transition: all 0.2s linear;
	}
	.img_container img {
		object-fit: cover;
	}
	.img_container:hover {
		filter: brightness(0.75);
	}
</style>
</head>
<body>
<div class="row justify-content-center">
	<div class="card shadow">
		<div class="card-body">
			<div class="justify-content-right">
				<%
					for(int i=0; i < productList.size(); i++) {
				%>
					<div class="img_container">
						<a href="main.jsp?pages=../product/product_detail&product_number=<%=product_number[i]%>" style="width: 433px; height: 593px;">
							<img src="${pageContext.request.contextPath}/img/<%=stored_file_name[i]%>" style="width: 433px; height: 593px;">
							<p><%=product_price[i]%>원</p>
							<h4><%=product_name[i]%></h4>
						</a>
					</div>
				<%
					}
				%>
			</div>
		</div>
	</div>
</div>
</body>
</html>