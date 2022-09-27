<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String[] values = request.getParameterValues("value");
	if(values == null) {
%>
	<script type="text/javascript">
		alert("선택한 항목이 없습니다.");
		history.go(-1);
	</script>
<%
	} else {
		for(int i=0; i<values.length; i++) {
			out.println("[" + values[i] + "] ");
		}
	}
%>
</body>
</html>