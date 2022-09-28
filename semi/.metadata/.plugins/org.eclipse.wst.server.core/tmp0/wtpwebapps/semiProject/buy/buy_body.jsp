<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="cart.CartBean"%>
<%@page import="cart.CartDBBean"%>
<%@page import="product.ProductBean"%>
<%@page import="product.ProductDBBean"%>
<%@page import="member.MemberBean"%>
<%@page import="member.MemberDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int p_num = 0,price=0,count=0,ship=0,totalPrice=0;
	String phone1="",phone2="",phone3="",email="",pcode="",raddr="",jibun="",detailaddr="",p_name="",phone="",address="",name="",id="",shipping="";
	if(session.getAttribute("Member") == null){ 
	// member가 null(초기화)되면  main으로 들어갈 수 없게 
	// jsp:forward로 login으로 돌아감.
%>
	<script type="text/javascript">
		alert("로그인이 필요한 항목입니다.");
		location.href="main.jsp?pages=../user_log/login";
	</script>
<%
	} else {
	id = (String)session.getAttribute("id"); // 타입을 맞도록 해야함.
	name = (String)session.getAttribute("name");
	
	MemberDBBean member = MemberDBBean.getInstance();
	MemberBean mb = member.getMember(id);
	ProductDBBean pdb = ProductDBBean.getInstance();
	
	phone1 = mb.getUser_phone1();
	phone2 = mb.getUser_phone2();
	phone3 = mb.getUser_phone3();
	email = mb.getUser_email();
	pcode = mb.getUser_pcode();
	raddr = mb.getUser_raddr();
	jibun = mb.getUser_jibun();
	detailaddr = mb.getUser_detailaddr();
    address = raddr+detailaddr;
    
    Calendar cal = Calendar.getInstance();
    cal.setTime(new Date());
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    cal.add(Calendar.DATE, 2);
    shipping = df.format(cal.getTime());
	}
%>
<html>
<head>
<meta charset="UTF-8">
<title>결제</title>
</head>
<body>
	<div class="container-fluid">
	  <div class="row justify-content-center">
	    <div class="col-12">
	      <h2 class="page-title" style="text-align: center;">주문서</h2>
	      <div class="row">
	       <div class="col-md-6" style="margin: 0 auto;">
	         <div class="card shadow mb-4">
	           <div class="card-body">
	             <form class="needs-validation" method="post" action="main.jsp?pages=../buy/kakao" name="order_frm">
				<table class="table table-bordered">
					<thead style="text-align: center;">
					  <tr role="row">
					    <th>상품 이름</th>
					    <th>수량</th>
					    <th>주문금액</th>
					    <th>배송 예정일</th>
					  </tr>
					</thead>
					<tbody>
					<%
					if(request.getParameterValues("cart_number")!=null){
					String[] cart_numbers = request.getParameterValues("cart_number");
					
					for(int i =0;i<cart_numbers.length;i++){
						int cartNum = Integer.parseInt(cart_numbers[i]); 
						CartDBBean cdb = CartDBBean.getInstance();
						CartBean cart = new CartBean();
						cart = cdb.getCartContent(cartNum);
						
						p_num = cart.getProduct_number();
						count = cart.getProduct_count();
						id = cart.getUser_id();
						
						ProductBean product = new ProductBean();
						ProductDBBean pdb = ProductDBBean.getInstance();
						
						product = pdb.getproduct(p_num, false);
						p_name =product.getProduct_name();
						price = product.getProduct_price() * count;
						totalPrice += price;
					
					%>
					  <tr>
					    <td>
	                   		<input type="text" class="form-control" value="<%= p_name %>" name="p_name" readonly>		
	                   		<input type="hidden" class="form-control" value="<%= p_num %>" name="p_num" readonly>		
					    </td>
					    <td>
					    	<input type="number" min="1" onchange="priceCal()"  class="form-control" id="count" value="<%= count %>" name="count">
					    	<input type="hidden" class="form-control" id="ori_count" value="<%= count %>" readonly>
					    </td>
					    <td>
					   		<input type="text" class="form-control" id="price" value="<%= price %>" name="price" readonly>
					   		<input type="hidden" class="form-control" id="ori_price" value="<%= price %>" readonly>
					    </td>
					    <td style="text-align: center;">
					   		<p style="padding-top:13px;"><%= shipping %></p>
					    </td>
					  </tr>
					  <%
						}
					}else{
						p_name = (String)request.getParameter("product_name");
					    p_num = Integer.parseInt(request.getParameter("product_number"));
					    count = Integer.parseInt(request.getParameter("product_count"));
					    price = Integer.parseInt(request.getParameter("product_price"));
					    
					    totalPrice += price;
					    
					    %>
						  <tr>
						    <td>
		                   		<input type="text" class="form-control" value="<%= p_name %>" name="p_name" readonly>		
		                   		<input type="hidden" class="form-control" value="<%= p_num %>" name="p_num" readonly>		
						    </td>
						    <td>
						    	<input type="number" min="1" class="form-control" id="count" value="<%= count %>" onchange="priceCal()" name="count">
						    	<input type="hidden" class="form-control" id="ori_count" value="<%= count %>" readonly>
						    </td>
						    <td>
						   		<input type="text" class="form-control" id="price" value="<%= price %>" name="price" readonly>
						   		<input type="hidden" class="form-control" id="ori_price" value="<%= price %>" readonly>
						    </td>
						    <td style="text-align: center;">
					   			<p style="padding-top:13px;"><%= shipping %></p>
					    	</td>
						  </tr>
						 <%
					}
					 %>
					</tbody>
					<%
					    if(totalPrice>=20000){
					    	ship = 0;
					    } else {
					    	ship = 3000;
					    }
					    totalPrice +=ship;
					%>
					<tbody>
					  <tr>
					    <td>배송비</td>
					    <td>
					   		<input type="text" class="form-control" id="ship" value="<%= ship %>" name="ship" readonly>
					    </td>
					    <td >총 금액</td>
					    <td>
					   		<input type="text" class="form-control" id="totalPrice" value="<%= totalPrice %>" name="totalPrice" readonly>
					    </td>
					  </tr>
					</tbody>
				 </table>
	               <div class="form-row">
	                 <div class="col-md-4 mb-3">
	                   <label for="validationCustom3">수령인</label>
	                   <input type="text" class="form-control" id="validationCustom3" value="<%= name %>" name="name" required>
	                   <div class="invalid-feedback"> 수령인을 입력해주세요. </div>
	                 </div>
	               </div> <!-- /.form-row -->
	               <div class="form-row">
	                 <div class="col-md-2 mb-3">
	                   <label for="custom-phone">연락처</label>
	                   <input class="form-control" id="custom-phone" value="<%= phone1 %>" name="phone1" required>
	                   <div class="invalid-feedback"> 연락처를 입력해주세요. </div>
	                 </div>
	                 <div class="col-md-3 mb-3">
	                   <label for="custom-phone">&nbsp;</label>
	                   <input class="form-control" id="custom-phone" value="<%= phone2 %>" name="phone2" required>
	                   <div class="invalid-feedback"> 연락처를 입력해주세요. </div>
	                 </div>
	                 <div class="col-md-3 mb-3">
	                   <label for="custom-phone">&nbsp;</label>
	                   <input class="form-control" id="custom-phone" value="<%= phone3 %>" name="phone3" required>
	                   <div class="invalid-feedback"> 연락처를 입력해주세요. </div>
	                 </div>
                   </div>
	               <div class="form-row">
	                 <div class="col-md-8 mb-3">
	                   <label for="exampleInputEmail2">이메일</label>
	                   <input type="email" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp1" value="<%= email %>" name="email" required>
	                   <div class="invalid-feedback"> 이메일주소를 입력해주세요. </div>
	                 </div>
	               </div> <!-- /.form-row -->
	               <div class="form-row1">
		            <label for="sample4_postcode"><strong>주소</strong></label>
		            <br>
		            <div class="input-group">
		              <input type="text" class="form-control" aria-label="Recipient's username" aria-describedby="button-addon2" name="pcode" id="sample4_postcode" value="<%= pcode %>" >
		              <div class="input-group-append">
		                <button class="btn btn-primary" type="button" onclick="sample4_execDaumPostcode()" id="juso">우편번호 찾기</button>
		              </div>
		            </div>
		            <input type="text" class="form-control" name="raddr" id="sample4_roadAddress" value="<%= raddr %>">
		            <input type="hidden" name="jibun" id="sample4_jibunAddress" value="<%= jibun %>">
		            <span id="guide" style="color:#999;display:none"></span>
		            <input type="text" class="form-control" name="detailaddr" id="sample4_detailAddress" value="<%= detailaddr %>">
		            <input type="hidden" id="sample4_extraAddress" placeholder="참고항목">
		          </div>
	               <button class="btn btn-primary" type="submit">결제하기</button>
	             </form>
	           </div> <!-- /.card-body -->
	         </div> <!-- /.card -->
	       </div> <!-- /.col -->
	     </div> <!-- end section -->
	   </div> <!-- /.col-12 col-lg-10 col-xl-10 -->
	 </div> <!-- .row -->
	</div> <!-- .container-fluid -->
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
</script>
<script type="text/javascript">
/*주문 수량을 변경하면 가격이 자동으로 설정되는 스크립트*/
function priceCal(){
	var ori_count = document.getElementById("ori_count").value;
	var count = document.getElementById("count").value;
	var one_price = document.getElementById("ori_price").value/ori_count;
	document.getElementById("price").value = (parseInt(count) * parseInt(one_price));
	
	if ((parseInt(count) * parseInt(one_price)) >= 20000 ) {
		document.getElementById("ship").value = 0;
	} else {
		document.getElementById("ship").value = 3000;
	}
	
	document.getElementById("totalPrice").value = Number(document.getElementById("ship").value) + Number(document.getElementById("price").value);
}
</script>

</body>
</html>