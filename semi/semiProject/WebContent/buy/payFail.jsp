<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	int product_number = Integer.parseInt(request.getParameter("product_number"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <div class="wrapper vh-100">
    <div class="align-items-center h-100 d-flex w-50 mx-auto">
      <div class="mx-auto text-center">
        <h1 class="display-1 m-0 font-weight-bolder text-muted" style="font-size:80px;">결제에 실패 했습니다.</h1>
        <h1 class="mb-1 text-muted font-weight-bold">OOPS!</h1>
        <h6 class="mb-3 text-muted">상품페이지로 돌아가 다시 주문해주세요.</h6>
        <a href="main.jsp?pages=../product/product_detail&product_number=<%=product_number %>" class="btn btn-lg btn-primary px-5">Back to Product</a>
      </div>
    </div>
  </div>
</body>
</html>