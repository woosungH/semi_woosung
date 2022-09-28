<%@page import="member.LikeDBBean"%>
<%@page import="product.ProductBean"%>
<%@page import="product.ProductDBBean"%>
<%@page import="member.MemberBean"%>
<%@page import="member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("id");	
	int product_number = Integer.parseInt(request.getParameter("product_number"));
	ProductDBBean product = ProductDBBean.getInstance();	
	ProductBean get = product.getproduct(product_number, false);
	
	ProductBean img = product.getImg(product_number);
	
	String p_name = get.getProduct_name();
	int p_price = get.getProduct_price();
	int img_number = img.getFile_number();
	String p_desc = get.getProduct_desc();
	
	String file_name = img.getStored_file_name();
	
	LikeDBBean like = LikeDBBean.getInstance();
%>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세페이지</title>
<style type="text/css">
	*{
         list-style: none;
         padding: 0;
         margin: 0;
     }
     a{
         text-decoration: none;
         color: black;
         display: block;
     }
</style>
</head>
<body>
    <div class="container-fluid">
      <div class="row justify-content-center">
        <div class="col-12 col-lg-10 col-xl-8">
          <div class="my-4">
            <form method="post" action="main.jsp?pages=../buy/buy_body&product_number=<%= product_number %>">
              <div class="row mt-5 align-items-center">
                   <img src="${pageContext.request.contextPath}/img/<%=file_name%>" alt="..." class="col-md-8">
                <div class="col-md-4">
                    <div class="col">
					 <h2 class="mb-2"><%= p_name%></h2>
					 <input type="hidden" value="<%= p_name%>" name="product_name" />
					 <hr>
					 <div>
                      	<h4 class="mb-3">상품금액 : <%= p_price %></h4>
						 <input type="hidden" value="<%= p_price %>" name="product_price" />
                      </div>
					 <hr>
                      <div style="height: 200;">
                       <p class="text-muted">상품 설명 : <%= p_desc %></p>
                      </div>
                      <div style="text-align: center;">
                      	수량&nbsp;&nbsp;&nbsp;&nbsp; 
                      	<input style="text-align: center;" type="number" step="1" min="1" max="10" value="1" id="count" name="product_count">
                      </div>
					<div class="btn-box w-100 mt-1 mb-1">
						<a href="../product/likeButton.jsp?product_number=<%=product_number%>" class="btn mb-2 btn-primary btn-lg btn-block">
							<% 
								int re = like.likeCheck(id, product_number);
								if(re == 0) {
							%>
								<i class="fe fe-heart fe-12 mx-2" style="color: red;"></i>
								
							<% 
								}else {
							%>
								<i class="fe fe-heart fe-12 mx-2" style="color: white;"></i>
							<% 
								}
							%>
							<span class="small">LIKE</span>
						</a>
					 </div>
					 <div class="btn-box w-100 mt-1 mb-1">
						<a href="#" target="_blank" class="btn mb-2 btn-primary btn-lg btn-block" onclick="count()">
							<i class="fe fe-shopping-cart fe-12 mx-2"></i><span class="small">장바구니</span>
						</a>
					 </div>
					 <div class="btn-box w-100 mb-1">
						<input type="submit" value="구매" id="order" class="btn mb-2 btn-secondary btn-lg btn-block" />
					 </div>
                    </div>
                </div>
              </div>
              <hr class="my-4">
            </form>
          </div> <!-- /.card-body -->
  </div> <!-- /.col-12 -->
</div> <!-- .row -->
</div> <!-- .container-fluid -->
<script type="text/javascript">
	function count(){
		var count = document.getElementById("count").value;
		location.href="main.jsp?pages=../cart/cartOk&product_number=<%=product_number%>&count="+count;
	}
</script>
</body>
</html>