<%@page import="product.ProductBean"%>
<%@page import="product.ProductDBBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="cs.NoticeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="cs.NoticeDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="product.ProductBean" id="product"></jsp:useBean>
<%

	String pageNum =""; 
	if(request.getParameter("pageNum")!=null){
		request.getParameter("pageNum");//
	}else{
		pageNum = "1";
	}
	
	String n_user_id = "test";
	String category_code="";
	session.setAttribute("n_user_id", n_user_id);
	
	if(request.getParameter("category_code")!=null){
		category_code = request.getParameter("category_code").toString();
	}
	System.out.println("카테고리 ================"+category_code);
	
	NoticeDBBean noticeDB = NoticeDBBean.getInstance();
	ProductDBBean db = ProductDBBean.getInstance();
	ArrayList<ProductBean> productList = db.productList(pageNum, category_code);
	
	ArrayList<Integer> n_numbers = new ArrayList<>();
	
	int n_num, n_hit;
	String n_title, user_id;
	Timestamp n_date;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	String path = request.getSession().getServletContext().getRealPath("\\img");
	String id = (String)session.getAttribute("id");
	ProductDBBean updb = ProductDBBean.getInstance();

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
	String product_thumbnail[] = new String[productList.size()];
	for(int i=0; i<productList.size();i++){
		product = productList.get(i);
	
		int p_num = product.getProduct_number();
		String p_name = product.getProduct_name();
		int p_price = product.getProduct_price();
		product_thumbnail[i] = db.getImg(p_num).getStored_thumbnail();
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	a {
		text-decoration-line : none;
	}
	a:hover {
		text-decoration-line : none;
	}
	.img_container {
		display: flex;
		justify-content:center;
		width: 33.3%;
		float: left;
		text-align:center;
		margin-bottom:0.125rem;
		filter: brightness(1);
  		transition: all 0.2s linear;
	}
	.img_container img {
  		object-fit: cover;
  		justify-content:center;
	}
	.img_container:hover {
		filter: brightness(0.75);
	}
	
</style>
</head>
<body>
<h2 class="h3 mb-3 page-title">상품</h2>
<div class="row justify-content-center">
	<div class="card shadow">
		<div class="card-body">
			<div class="justify-content-right" style="float: left;">
				<%
					for(int i=0; i < productList.size(); i++) {
				%>
					<div class="img_container">
						<a href="main.jsp?pages=../product/product_detail&product_number=<%=product_number[i]%>">
							<img src="${pageContext.request.contextPath}/img/<%=stored_file_name[i]%>" >
							<h4><%=product_name[i]%></h4>
							<p><%=product_price[i]%>원</p>
						</a>
					</div>
				<%
					}
				%>
			</div>
		</div>
	</div>
</div>



 <%-- <div class="wrapper">
     <div class="container-fluid">
       <div class="row justify-content-center">
         <div class="col-12">
           <div class="row">
             <!-- Small table -->
             <div class="col-md-12 my-4">
               <h2 class="h3 mb-3 page-title">상품</h2>
               <div class="card shadow">
                 <div class="card-body">
					<div style="text-align: center;">
						<table class="table table-borderless table-hover">
						    <thead>
						      <tr>
						        <th class="w-30">제품 사진</th>
						        <th>상품명</th>
						        <th class="w-30">설명</th>
						        <th>가격</th>
						      </tr>
						    </thead>
						    <tbody>
						    <%
									String product_thumbnail[] = new String[productList.size()];
									for(int i=0; i<productList.size();i++){
										product = productList.get(i);
									
										int p_num = product.getProduct_number();
										String p_name = product.getProduct_name();
										int p_price = product.getProduct_price();
										product_thumbnail[i] = db.getImg(p_num).getStored_thumbnail();
							%>
								<tr>
								<tr onclick="location.href='main.jsp?pages=../product/product_detail&product_number=<%=product_number[i]%>'" style="cursor:pointer">
								<td>
									<img src="${pageContext.request.contextPath}/img/<%= product_thumbnail[i]%>">
								</td>
								<td class="mb-0 text-muted"><%= product_name[i] %></td>
								<td class="mb-0 text-muted"><%= product_desc[i] %></td>
								<td class="mb-0 text-muted">
									<%= product_price[i] %>원
									</a>
								</td>
							</tr>
						<%
							}
							productList.clear();
						%>
						<%
							if(session.getAttribute("n_user_id")!=null){
						%>
								    </tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%
		}
%>
	</div> --%>
</body>
</html>