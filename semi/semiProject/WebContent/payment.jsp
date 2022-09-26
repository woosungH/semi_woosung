<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbswrite.jsp</title>
<style>
span {
	width: 60px;
	display: inline-block;
}

textarea {
	width: 40%;
	height: 280px;
}
</style>
</head>
<body>
<h2>kakao</h2>

	<form action="/buy/kakao.jsp">

		<p>
			<span>이름:</span> <input type="text" name="name">
			<span>아이디:</span> <input type="text" name="id">
			<!-- 값 가져오기 -->
		</p>
		<p>
			<span>이메일:</span> <input type="text" name="email">
		</p>
		<span>폰넘버:</span>
		<p>
			<input type="text" name="phone1">-
			<input type="text" name="phone2">-
			<input type="text" name="phone3">
		</p>
		<span>주소:</span>
		<p>
			<input type="text" name="raddr">
			<input type="text" name="jibun">
			<input type="text" name="detailAddr">
		</p>
		<span>우편번호:</span>
		<p>
			<input type="text" name="pcode">
		</p>
		<span>상품번호:</span>
		<p>
			<input type="text" name="p_num">
			<input type="text" name="p_name">
		</p>
		<span>개수:</span>
		<p>
			<input type="text" name="count">
		</p>
		<span>가격:</span>
		<p>
			<input type="text" name="totalPrice">
		</p>
		<input type="submit" value="결제하기"> 
		<input type="reset"	value="취소하기">
	</form>


</body>
</html>