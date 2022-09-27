<%@page import="product.ProductBean"%>
<%@page import="product.ProductDBBean"%>
<%@page import="cart.CartBean"%>
<%@page import="cart.CartDBBean"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("id");
	String name = (String)session.getAttribute("name");
	if(id == null){
%>
		<script>
			alert("로그인이 필요한 페이지입니다.");
		</script>
<%
		response.sendRedirect("../user_log/login.jsp");
	}
	
	
	CartDBBean cartdb = CartDBBean.getInstance();
	ArrayList<CartBean> cartList = cartdb.getCart(id);
	
	ProductDBBean productdb = ProductDBBean.getInstance();
	
	int i, product_price=0, cart_number=0, product_number, product_count=0, ship=3000;
	String user_id, product_name;
	int total_price = 0;
%>
<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <title>장바구니</title>
  </head>
  <body class="vertical  light  ">
    <div class="wrapper">
        <div class="container-fluid">
          <div class="row justify-content-center">
            <div class="col-12">
              <div class="row">
                <!-- Small table -->
                <div class="col-md-12 my-4">
                  <h2 class="h4 mb-1">장 바 구 니</h2>
                  <p class="mb-3"><%= name %>님의 장바구니 입니다.</p>
                  <div class="card shadow">
                    <div class="card-body" style="text-align:center">
                    <form method="post" action="main.jsp?pages=../buy/buy_body"></form>
                      <!-- table -->
                      <table class="table table-borderless table-hover">
                        <thead>
                          <tr>
                          	<th>선택</th>
                          	<th>번호</th>
                            <th class="w-25">제품사진</th>
                            <th>제품이름</th>
                            <th>수량</th>
                            <th>가격(원)</th>
                            <th>주문삭제</th>
                            <th>주문수정</th>
                          </tr>
                        </thead>
                        <tbody>
            <%
					String stored_file_name;
					for(i=0; i<cartList.size(); i++){
						CartBean cart = cartList.get(i);
						ProductBean prod = productdb.getproduct(cart.getProduct_number(), false);

						cart_number = cart.getCart_number();
						user_id = cart.getUser_id();
						product_number = cart.getProduct_number();
						product_count = cart.getProduct_count();
						
						product_name = prod.getProduct_name();
						product_price = prod.getProduct_price();
					
					stored_file_name = productdb.getImg(product_number).getStored_file_name();
			%>
                          <tr>
                          	<td>
                          		<input type="checkbox" value="<%= product_number %>" name="product_number" />
                          	</td>
                          	<td>
                          		<p><%= cart_number %></p>
                          	</td>
                            <td>
                              <div class="avatar avatar-md">
                                <img src="./assets/avatars/face-3.jpg" alt="제품사진" class="avatar-img rounded-circle">
                                <!-- 사진 가져오기 -->
                              </div>
                            </td>
                            <td>
                              <p class="mb-0 text-muted"><a href="#" class="text-muted"><strong><%= product_name %></strong></a></p>
                              <!-- 제품명 가져오기 -->
                            </td>
                            <td>
                            	<small class="mb-0 text-muted">
                            		<input type="number" step="1" min="1" max="10" value="<%= product_count %>" onchange="priceCal(i)" id="count<%= i %>" name="product_count">	
                            	</small>
                           	</td>
                            <td>
                           		<input type="text" value="<%= product_count * product_price %>" name="product_price" id="price" readonly />	
                             <%--  <p class="mb-0 text-muted"><%= product_count * product_price %>(원)</p> --%>
                              <!-- 가격 가져오기 -->
                            </td>
                            <td>
                            	<a href="main.jsp?pages=../cart/cartDelete&cart_number=<%= cart_number %>" class="btn btn-secondary btn-sm">삭제하기</a>
                            </td>
                            <td>
                            	<a href="#" class="btn btn-secondary btn-sm" onclick="count(<%= i %>)">수정하기</a>
                           	</td>
                          </tr>
                          <br>
						<%
                          	total_price += product_count * product_price;
						
							if(product_price>=20000 || total_price == 0){
	                    		ship = 0;
	                    	}
							
						} 
						%>		
                          <tr>
                          	<td colspan="2" style="text-align: right;">&nbsp;</td>
                          	<td colspan="2" style="text-align: right;"></td>
                          	<td colspan="2" style="text-align: right;"><strong>총 가격(원) &nbsp;&nbsp;:&nbsp;&nbsp; <%= total_price%>(소계) + <%= ship %>(배송비) = </strong></td>
                          	<td colspan="2" style="text-align: center;"><strong style="color:red"><b><%= total_price + ship %>원</b></strong></td>
                          </tr>
                          <tr>
                          	<td colspan="7" style="text-align: right;">
                          		20000원 이상 구매 시 무료배송
                          	</td>
	                          <td style="text-align:right">
	                        	<input type="submit" class="btn btn-primary btn-lg btn-block" value="구매하기" />
		                	  </td>
                		  </tr>
                        </tbody>
                      </table>
                      </form>
                    </div>
                  </div>
                </div> <!-- customized table -->
              </div> <!-- end section -->
            </div> <!-- .col-12 -->
          </div> <!-- .row -->
        </div> <!-- .container-fluid -->
    </div> <!-- .wrapper -->
    <script type="text/javascript">
 	function count(i){
 		var counted = "count"+i;
 		var count = document.getElementById("counted").value;
 		
 		location.href="main.jsp?pages=../cart/cartEdit&cart_number=<%= cart_number %>&product_count="+count;
 	}
 	function priceChange(i){
 		var counted = "count"+i;
 		var count = document.getElementById("counted").value;
 		var one = document.getElementById("ori_price").value / document.getElementById("counted").value;
 		document.getElementById("price").value = one * count;
 		
 	}
 	function priceCal(i){
 		var counted = "count"+i;
 		var count = document.getElementById("counted").value;
 		document.getElementById("price").value = (parseInt(count) * <%= product_price %>);
 	}
 </script>
  </body>
</html>