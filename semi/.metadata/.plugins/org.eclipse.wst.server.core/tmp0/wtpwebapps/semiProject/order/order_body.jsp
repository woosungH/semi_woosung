<%@page import="java.text.SimpleDateFormat"%>
<%@page import="order.OrderManageBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="order.OrderManageDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("id");
	String pageNum = request.getParameter("pageNum");
	if(pageNum==null){
		pageNum = "1";
	}
	String orderStat = request.getParameter("orderStat");
	String pages = "";
	if(request.getParameter("pages")!=null){
		pages = request.getParameter("pages");		
	} else{
		pages = "main_body";
	}
	if(id == null){
%>
		<script>
			alert("로그인이 필요한 페이지입니다.");
			location.href="main.jsp?pages=../user_log/login"
		</script>
<%
	}
	OrderManageDBBean omdb = OrderManageDBBean.getInstance();
	long o_dNum;
	int p_num, p_count, p_price;
	String o_num, o_dStat, refund, stat, shipment;
	/* ArrayList<OrderManageBean> list = omdb.orderList(pageNum); */
	ArrayList<OrderManageBean> list = omdb.getDetail(pageNum,id);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
%>
<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <title>Order progress</title>
  </head>
  <body class="vertical  light  ">
    <div class="wrapper">
        <div class="container-fluid">
          <div class="row justify-content-center">
            <div class="col-12">
              <div class="row">
                <!-- Small table -->
                <div class="col-md-12 my-4">
                  <h2 class="h4 mb-1">배송상품 및 결제내역</h2>
                  <p class="mb-3">배송상태 및 결제내역을 확인하세요.</p>
                  <div class="card shadow">
                    <div class="card-body" style="text-align:center;">
                      <!-- table -->
                      <table class="table table-borderless table-hover">
                        <thead>
                          <tr>
                            <th>주문 상세 번호</th>
                            <th>제품이름</th>
                            <th>수량(가격)</th>
                            <th>수령자</th>
                            <th>수령자 번호</th>
                            <th>수령지</th>
                            <th>주문 상태(운송장)</th>
                            <th>주문날짜</th>
                            <th>Action</th>
                          </tr>
                        </thead>
          <%
          		for(int i=0; i < list.size(); i++) {
        			OrderManageBean omb = list.get(i); // 배열에 넣은 역순으로 board 객체에 값을 넣어줌
        			o_dNum = omb.getOrder_detail_number();
        			System.out.println(o_dNum);
        			o_num = omb.getOrder_number();
        			p_num = omb.getProduct_number();
        			p_count = omb.getProduct_count();
        			p_price = omb.getProduct_price();
        			o_dStat = omb.getOrder_detail_status();
        			
        			omb = omdb.getOrder(o_dNum);
        			String p_name = omb.getProduct_name();
        			String r_name = omb.getReceiver_name();
        			String raddr = omb.getReceiver_raddr();
        			String detailaddr = omb.getReceiver_detailaddr();
        			String phone = omb.getReceiver_phone1()+"-"+omb.getReceiver_phone2()+"-"+omb.getReceiver_phone3();
        			String u_id = omb.getUser_id();
        			String date = sdf.format(omb.getOrder_date());
        			if(omb.getShipment() == null){
        				shipment = "-";
        			} else{
        				shipment = omb.getShipment();
        			}
        			
        			if(shipment == null){
        				shipment = "-";
        			}
        			if(u_id.equals(id)){
        	%>
                        <tbody>
                          <tr>
                            <td>
                              <p class="mb-0 text-muted"><strong><%= o_dNum %></strong></p>
                              <!-- 주문상세번호 가져오기 -->
                            </td>
                            <td>
                              <p class="mb-0 text-muted"><strong><%= p_name %></strong></p>
                              <!-- 제품명 가져오기 -->
                            </td>
                            <td>
                              <p class="mb-0 text-muted"><strong><%= p_count %>(<%= p_price %>)</strong></p>
                              <!-- 수량(가격) 가져오기 -->
                            </td>
                            <td>
                              <p class="mb-0 text-muted"><%= r_name %></p>
                              <!-- 이름 가져오기-->
                            </td>
                            <td>
                              <p class="mb-0 text-muted"><%= phone %></p>
                              <!-- 번호 가져오기-->
                            </td>
                            <td>
                              <p class="mb-0 text-muted"><%= raddr %><br /><%= detailaddr %></p>
                              <!-- 주소 가져오기 -->
                            </td>
                            <td>
                              <p class="mb-0 text-muted"><%= o_dStat %><br />(<%= shipment %>)</p>
                              <!-- 주문 상태 운송장번호 가져오기 -->
                            </td>
                            <td>
                              <p class="mb-0 text-muted"><a href="#" class="text-muted"><%= date %></a></p>
                              <!-- 주문 날짜 가져오기 -->
                            </td>
                            <td>
                            <button class="btn btn-sm dropdown-toggle more-horizontal" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="text-muted sr-only">Action</span>
                              </button>
                              <%if(!o_dStat.equals("환불 완료")) {%>
                              <div class="dropdown-menu dropdown-menu-right">
                             	 <% 
                                if(!o_dStat.equals("구매 확정")) {
                                %>
                                <a class="dropdown-item" href="main.jsp?pages=../order/order_edit&o_dNum=<%= o_dNum %>&pageNum=<%=pageNum%>">배송지 변경</a>
                                <%} %>
                                <a class="dropdown-item" href="../order/order_change.jsp?o_num=<%= o_num %>&change=true&pageNum=<%=pageNum%>">환불요청</a>
                                <% 
                                if(!o_dStat.equals("구매 확정")) {
                                %>
                                <a class="dropdown-item" href="../order/order_change.jsp?o_num=<%= o_num %>&change=false&pageNum=<%=pageNum%>">구매확정</a>
                                <%
                                		}
                              		}
                                %>
                              </div>
                            </td>
                          </tr>
                        </tbody>
            <%
        			}
				}
            %>
                      </table>
                      <nav aria-label="Table Paging" class="mb-0 text-muted">
		                 <ul class="pagination justify-content-center mb-0">
		                 	<%= OrderManageBean.pageNumber(5) %>
		                 </ul>
              		 </nav>
                    </div>
                  </div>
                </div> <!-- customized table -->
              </div> <!-- end section -->
            </div> <!-- .col-12 -->
          </div> <!-- .row -->
        </div> <!-- .container-fluid -->
    </div> <!-- .wrapper -->
  </body>
</html>