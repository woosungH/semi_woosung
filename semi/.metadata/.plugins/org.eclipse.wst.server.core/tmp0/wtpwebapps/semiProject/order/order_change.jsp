<%@page import="order.OrderManageDBBean"%>
<%@page import="order.OrderManageBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String o_num = (String)request.getParameter("o_num");
	boolean change = Boolean.parseBoolean(request.getParameter("change"));
	String pageNum = request.getParameter("pageNum");
	OrderManageDBBean omdb = OrderManageDBBean.getInstance();
	int result = omdb.changeOrderState(o_num, change);
	
	if(result == 1){
%>
	<script type="text/javascript">
		alert("요청이 완료되었습니다.");
		location.href="../main/main.jsp?pages=../order/order_body&pageNum=<%=pageNum%>";
	</script>
<%
	}else {
%>
	<script type="text/javascript">
		alert("요청이 실패했습니다.");
		history.go(-1);
	</script>
<%
	}
%>