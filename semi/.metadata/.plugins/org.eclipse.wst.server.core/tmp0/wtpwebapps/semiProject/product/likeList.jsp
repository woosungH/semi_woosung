<%@page import="product.ProductBean"%>
<%@page import="product.ProductDBBean"%>
<%@page import="member.LikeBean"%>
<%@page import="member.LikeDBBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	request.setCharacterEncoding("utf-8");

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

	String id = (String)session.getAttribute("id");
	String name = (String)session.getAttribute("name");
	System.out.println("id==========================="+id);
	LikeDBBean db = LikeDBBean.getInstance();
	ArrayList<LikeBean> likeList = db.likeList(id);
	ProductDBBean productdb = ProductDBBean.getInstance();
	
	int i, product_price, product_number, file_number;
	String user_id, product_like, product_name;
%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>like</title>
    <style type="text/css">
    	.cardtwo {
    		width:33.3%;
    		float: left;
    	}
    </style>
  </head>
  <body class="vertical  light  ">
      <div class="container-fluid">
        <h2 class="h4 mb-1">나의 찜 목록</h2>
        <p class="mb-3"><%= name %>님이 좋아요한 제품의 목록 입니다.</p>
			<%
				if(likeList.size()!=0){
					
			%>
	        <div class="row justify-content-center">
	            <div class="img_contianer mb-4">
		     	 <%
					String stored_file_name;
					System.out.print(likeList.size());
					for(i=0; i<likeList.size(); i++){
						LikeBean like = likeList.get(i);
						
						user_id = like.getUser_id();
						product_number = like.getProduct_number();
						product_like = like.getProduct_like();
						product_name = like.getProduct_name();
						product_price = like.getProduct_price();
						file_number = like.getFile_number();
						
						stored_file_name = productdb.getImg(product_number).getStored_file_name();
						
					%>
	              <div class="cardtwo border-0 bg-transparent">
	                <img src="${pageContext.request.contextPath}/img/<%= stored_file_name %>" alt="..." class="card-img-top img-fluid rounded" >
	                <div class="card-body" style="text-align:center;" >
	                    <span class="badge badge-light text-muted mr-2" style="font-size:1.125em;"><strong>제품명 : <%= product_name %></strong></span><br>
	                    <span class="badge badge-pill badge-light text-muted" style="font-size:1.125em;"><strong>가격 : <%= product_price %>원</strong></span><br>
					</div>
				</div> <!-- .card -->
				<%
						}
					} else {
				%>
					<div class="card shadow">
						<div class="card-body">
							<p class="mb-3">찜 목록이 비어있습니다. 마음에 드는 제품을 찜 목록에 추가해보세요.</p>
						</div>
					</div>
				<%				
					}
				%>
			</div> <!-- .card-deck -->
		</div>
	</div> <!-- .row -->
</body>
</html>