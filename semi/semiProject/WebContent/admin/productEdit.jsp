<%@page import="java.text.SimpleDateFormat"%>
<%@page import="product.ProductDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="product.ProductBean" id="product"></jsp:useBean>
<jsp:useBean class="product.ProductBean" id="productImg"></jsp:useBean>
<%
	int product_number=0;
	String date="",thumbName="",product_name="";

	if(request.getParameter("product_number")==null){
		response.sendRedirect("adminIndex.jsp?pages=productList");
	} else{
		product_number = Integer.parseInt(request.getParameter("product_number"));
		ProductDBBean db = ProductDBBean.getInstance();
		product = db.getproduct(product_number, false);
		product = db.getImg(product_number);
		thumbName = product.getStored_thumbnail();
		product_name = product.getProduct_name();
	}
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh-mm");
	
	if(product.getProduct_date()!=null){
		 date = sdf.format(product.getProduct_date());		
	}
	
	String imgs = "test";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
    	<thead>
			<tr>
				<th>번호</th>
				<th>카테고리</th>
				<th>제품명</th>
				<th>가격</th>
				<th>재고량</th>
				<th>제품 등록 일자</th>
				<!-- 수정시 등록일자 수정되게 -->
			</tr>
		</thead>
		<tbody>
		
			<tr>
				<td><%= product_number %></td>
				<td><%= product.getCategory_code() %></td>
				<td>
					<%
							if(thumbName==null){
						%>
								<div style="background-color: #777">이미지 없음</div>
						<%
							} else{
						%>
								<div>
									<!-- <img src="http://localhost:8181/semiProject/upload/test.jpg" width="100px"> -->
									<img src="../img/<%= thumbName %>" width="100px">
						<%
							}
						%>
									<%= product_name %>
				</div>
				</td>
				<%-- <td><%= product_name %></td> --%>
				<td><%= product.getProduct_price() %></td>
				<td><%= product.getProduct_stock() %></td>
				<td><%= date %></td>
			</tr>
		</tbody>
	</table>
</body>
</html>