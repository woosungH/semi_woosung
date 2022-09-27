<%@page import="product.ProductBean"%>
<%@page import="product.ProductDBBean"%>
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
	
	//String[] category = {"","t-shirt", "hude-t", "nite", "shirt", "pants", "blue-jeans"};
	
	String n_user_id = "test";
	String category_code="";
	session.setAttribute("n_user_id", n_user_id);
	
	if(request.getParameter("category_code")!=null){
		category_code = request.getParameter("category_code").toString();
	}
	System.out.println("카테고리================"+category_code);
	
	ProductDBBean db = ProductDBBean.getInstance();
	ArrayList<ProductBean> productList = db.productList(pageNum, category_code);
	
	ArrayList<Integer> n_numbers = new ArrayList<>();
	
	int n_num, n_hit, product_number, product_price, file_number, i;
	String n_title, user_id, product_name;
	Timestamp n_date;
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	String path = request.getSession().getServletContext().getRealPath("\\img");
%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Tiny Dashboard - A Bootstrap Dashboard Template</title>

    <style>
      .card-deck {
        width: 800px;
      }
      .card-body{
        margin: 0;
        padding: 0;
        float: left;
      }
      .card img{
        max-height: 356px;
        min-height: 356px;
      }
 
    </style>
  </head>
  <body class="vertical  light  ">
      <div class="container-fluid">
        <div class="row justify-content-center">
          <div class="col-12 col-lg-10">
            <div class="row align-items-center my-4">
            </div>
            <h6 class="mb-3">상품리스트</h6>
            <div class="card-deck mb-4">
	      <%
			String stored_file_name;
			System.out.print(productList.size());
				for(i=0; i<productList.size(); i++){
					ProductBean product = productList.get(i);
					
					product_number = product.getProduct_number();
					product_name = product.getProduct_name();
					product_price = product.getProduct_price();
					file_number = product.getFile_number();
					
					stored_file_name = db.getImg(product_number).getStored_file_name();
			%>
              <div class="card border-0 bg-transparent">
                <img src="${pageContext.request.contextPath}/img/<%= stored_file_name %>" alt="..." class="card-img-top img-fluid rounded" >
                <div class="card-body" >
                  <h5 class="h6 card-title mb-1" style="margin-right: 50px;"><%= product_name %></h5>
                  <p class="card-text">
                    <span><b>가격 : <%= product_price %>원</b></span>
                  </p>
                    <br>
                </div>
              </div> <!-- .card -->
              <%} %>
            </div> <!-- .card-deck -->
          </div>
        </div> <!-- .row -->
      </div> <!-- .container-fluid -->
  </body>
</html>