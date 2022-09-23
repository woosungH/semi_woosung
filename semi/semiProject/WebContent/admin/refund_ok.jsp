<%@page import="order.OrderManageDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean class="order.OrderManageBean" id="omb"></jsp:useBean>
<jsp:setProperty property="*" name="omb"/>
<%
	String pageNum = request.getParameter("pageNum");
	String orderNum = request.getParameter("orderNum");
	OrderManageDBBean omdb = OrderManageDBBean.getInstance();
	
	omb.setOrder_number(orderNum);
	
	int re = omdb.refundOrder(omb);
	if(re == 1){
%>
		<script>
			alert("환불이 완료되었습니다.");
			location.href= "adminIndex.jsp?pages=refund_list&pageNum=<%= pageNum %>";
		</script>
<%
	} else {
%>
		<script>
			alert("주문 수정에 실패했습니다.")
			history.go(-1);
		</script>
<%
	}
%>