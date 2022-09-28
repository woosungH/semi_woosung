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
			location.href="main.jsp"
		</script>
<%
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
                    <form method="post" action="main.jsp?pages=../buy/buy_body" name="cart_frm">
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
                          		<%-- <input type="checkbox" value="<%= product_number %>" name="product_number" /> --%>
                          		<input type="checkbox" value="<%= cart_number %>" name="cart_number" id="cart<%=i%>" onchange="itemSum(cart_frm)"/>
                          	</td>
                          	<td>
                          		<p style="line-height: 115px;"><%= cart_number %></p>
                          		<%-- <input type="hidden" value="<%= cart_number %>" id="cart<%=i%>" > --%>
                          	</td>
                            <td>
                              <div class="avatar avatar-md">
                                <img src="../img/<%=stored_file_name%>" alt="제품사진" class="avatar-img rounded-circle">
                                <!-- 사진 가져오기 -->
                              </div>
                            </td>
                            <td class="form-group col-md-2">
                              <p class="mb-0 text-muted"><a href="main.jsp?pages=../product/product_detail&product_number=<%=product_number%>" class="text-muted"><strong><%= product_name %></strong></a></p>
                              <!-- 제품명 가져오기 -->
                            </td>
                            <td class="form-group col-md-1">
                            	<small class="mb-0 text-muted">
                            		<input type="number" style="text-align: center;" class="form-control" step="1" min="1" max="10" value="<%= product_count %>" onchange="priceCal(<%= i %>)" id="count<%= i %>" name="product_count">	
                            		<input type="hidden" style="text-align: center;" class="form-control" step="1" min="1" max="10" value="<%= product_count %>" name="product_count<%= i%>">	
                            	</small>
                           	</td>
                            <td class="form-group col-md-1">
                           		<input type="text" style="text-align: center;" class="form-control" value="<%= product_count * product_price %>" name="product_price" id="price<%= i %>" readonly />	
                           		<input type="hidden" class="form-control" value="<%= product_price %>" name="one_price" id="one_price<%= i %>" readonly />	
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
                          <!-- <br> -->
						<%
                          	/* total_price += product_count * product_price;
						
							if(product_price>=20000 || total_price == 0){
	                    		ship = 0;
	                    	} */
						} 
						%>		
                          <tr>
                          	<td colspan="2" style="text-align: right;">&nbsp;</td>
                          	<td colspan="2" style="text-align: right;"></td>
                          	<td colspan="2" style="text-align: right;"><strong>총 가격(원) &nbsp;&nbsp;:&nbsp;&nbsp; <span id="total"><%= total_price%></span>(소계) + <span id="ship"><%= ship %></span>(배송비) = </strong></td>
                          	<td colspan="2" style="text-align: center;"><strong style="color:red" id="ships"><b><%= total_price + ship %></b></strong></td>
                          </tr>
                          <tr>
                          	<td colspan="7" style="text-align: right;">
                          		20000원 이상 구매 시 무료배송
                          	</td>
	                          <td style="text-align:right">
	                        	<input type="button" class="btn btn-primary btn-lg btn-block" value="구매하기" onclick="check()">
		                	  </td>
                		  </tr>
                        </tbody>
                      </table>
                      </form>
                      <!-- <input type="text" value="" id="total" /> -->
                    </div>
                  </div>
                </div> <!-- customized table -->
              </div> <!-- end section -->
            </div> <!-- .col-12 -->
          </div> <!-- .row -->
        </div> <!-- .container-fluid -->
    </div> <!-- .wrapper -->
    <script src="../js/jquery.min.js"></script>
    <script type="text/javascript">
 	function count(i){
 		var counted = "count"+i;
 		var cartNum = "cart"+i;
 		var count = document.getElementById(counted).value;
 		var cart = document.getElementById(cartNum).value;
 		
 		location.href="main.jsp?pages=../cart/cartEdit&cart_number="+cart+"&product_count="+count;
 	}
 	function priceCal(i){
 		var counted = "count"+i;
 		var cartprice = "price"+i;
 		var one = "one_price"+i;
 		var count = document.getElementById(counted).value;
 		var price = document.getElementById(one).value;
 		var calc = count*price;
 		
 		document.getElementById(cartprice).value = calc;
 		itemSum(cart_frm);
 	}
 	function check() {
 		if ($("input:checkbox[name='cart_number']").is(":checked")==false) {
 			alert("적어도 하나는 선택하여 주십시오.");
 			return;
 		}else{
 			$("form[name=cart_frm]").submit();
 		}
 	}
 	function itemSum(frm)
 	{
 	   var sum = 0;
 	   var count = frm.cart_number.length;
 	   for(var i=0; i < count; i++ ){
 	       if( frm.cart_number[i].checked == true ){
 		    sum += parseInt(frm.one_price[i].value) * parseInt(frm.product_count[i].value);
 	       }
 	   }
 	  document.getElementById("total").innerText = sum;
 	   if(sum >= 20000){
 		   sum = sum;
	 	  document.getElementById("ship").innerText = 0;
 	   } else{
 		   sum += 3000;
	 	  document.getElementById("ship").innerText = 3000;
 	   }
 	  document.getElementById("ships").innerText = sum;
 	}
 	</script>
  </body>
</html>