<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="member.MemberDBBean"%>
<%@page import="member.MemberBean"%>
<%@page import="order.OrderManageBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="order.OrderManageDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	OrderManageDBBean omdb = OrderManageDBBean.getInstance();
	
	int o_rank = 0;
	int o_dNum, p_num, p_count, p_price;
	String o_num, o_dStat, refund, stat, pageNum;
	
/* 	if(request.getParameter("pageNum") == null){
		pageNum = "1";
	} else {
		pageNum = request.getParameter("pageNum");
	} */
	ArrayList<OrderManageBean> list = omdb.orderList("1","N");
	
	String s_user_id="";
	
	if(request.getParameter("search_user_id")!=null){
		s_user_id = request.getParameter("search_user_id");
	} 
	MemberBean.s_user_id = s_user_id;
	
	MemberBean member = new MemberBean();
	MemberDBBean memberDB = MemberDBBean.getInstance();
	ArrayList<MemberBean> memberList = memberDB.listMember("1",s_user_id);
	ArrayList<Integer> n_numbers = new ArrayList<>();
	
	String user_id, user_pwd, user_name, user_phone1, user_phone2, user_phone3, user_email
		, user_pcode, user_raddr, user_jibun, user_detailaddr;
	Timestamp user_regdate;
	
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String today = sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="row">
  <div class="col-md-6 col-xl-6 mb-4">
    <div class="card shadow bg-primary text-white border-0">
      <div class="card-body">
        <div class="row align-items-center">
          <div class="col-3 text-center">
            <span class="circle circle-sm bg-primary-light">
              <i class="fe fe-16 fe-shopping-bag text-white mb-0"></i>
            </span>
          </div>
          <div class="col pr-0">
            <p class="small text-muted mb-0">신규 상품</p>
            <span class="h3 mb-0 text-white"></span>
            <!-- 오늘 등록된 상품 수 -->
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="col-md-6 col-xl-6 mb-4">
    <div class="card shadow border-0">
      <div class="card-body">
        <div class="row align-items-center">
          <div class="col-3 text-center">
            <span class="circle circle-sm bg-primary">
              <i class="fe fe-16 fe-filter text-white mb-0"></i>
            </span>
          </div>
          <div class="col">
            <p class="small text-muted mb-0">신규 문의</p>
            <div class="row align-items-center no-gutters">
              <div class="col-auto">
                <span class="h3 mr-2 mb-0"> 86.6% </span>
                <!-- 답변 체크가 안되어 있는 문의 수 -->
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="wrapper">
   <div class="container-fluid">
     <div class="row justify-content-center">
       <div class="col-12">
         <h2 class="h3 mb-3 page-title">신규 주문</h2>
         <div class="card shadow">
           <div class="card-body">
         <div style="text-align: center;">
         <table class="table table-borderless table-hover">
           <thead>
             <tr role="row">
               <th>주문 순서</th>
               <th>주문 번호</th>
               <th>제품 번호</th>
               <th>수량</th>
               <th>금액</th>
             </tr>
           </thead>
           <tbody>
    <%
		for(int i=0; i < 5; i++) {
			OrderManageBean omb = list.get(i); // 배열에 넣은 역순으로 board 객체에 값을 넣어줌
			o_rank++;
			o_dNum = omb.getOrder_detail_number();
			o_num = omb.getOrder_number();
			p_num = omb.getProduct_number();
			p_count = omb.getProduct_count();
			p_price = omb.getProduct_price();
			o_dStat = omb.getOrder_detail_status();
			refund = omb.getRefund_check();

			if(o_dStat.equals("입금 완료")){
	%>
           		 <tr>
                  	<td><%=o_rank%></td>
					<td><%=o_num%></td>
					<td><%=p_num%></td>
					<td><%= p_count %></td>
					<td><%=p_price%></td>
					
	<%	
			}
		}
	%>
                 </tr>
               </tbody>
             </table>
            </div>
          </div>
           </div>
         </div>
       </div> <!-- .row -->
     </div> <!-- .container-fluid -->
 </div> <!-- .wrapper -->
 <div class="wrapper">
        <div class="container-fluid">
          <div class="row justify-content-center">
            <div class="col-12">
              <div class="row">
                <!-- Small table -->
                <div class="col-md-12 my-4">
                  <h2 class="h3 mb-3 page-title">신규 회원</h2>
                  <div class="card shadow">
                    <div class="card-body">
                      <!-- table -->
                      <div style="text-align: center;">
                      <table class="table table-borderless table-hover">
                        <thead>
                          <tr>
                            <th>ID</th>
							<th>이름</th>
							<th>전화번호</th>
							<th>이메일</th>
							<th>가입일</th>
							<th>주소</th>
                          </tr>
                        </thead>
                        <tbody>
		<%
			for(int i=0; i<5;i++){
				member = memberList.get(i);
				
				user_id = member.getUser_id();
				user_pwd=member.getUser_pwd();
				user_name=member.getUser_name();
				user_phone1=member.getUser_phone1();
				user_phone2=member.getUser_phone2();
				user_phone3=member.getUser_phone3();
				user_email=member.getUser_email();
				user_pcode=member.getUser_pcode();
				user_raddr=member.getUser_raddr();
				user_jibun=member.getUser_jibun();
				user_detailaddr=member.getUser_detailaddr();
				user_regdate=member.getUser_regdate();
			
				System.out.println(today);
				if(today.equals(sdf.format(user_regdate))){
				
		%>
				<tr>
					<td class="mb-0 text-muted"><%= user_id%></td>
					<td class="mb-0 text-muted"><%= user_name %></td>
					<td class="mb-0 text-muted">
						<%= user_phone1 %>-<%= user_phone2 %>-<%= user_phone3 %>
					</td>
					<td class="mb-0 text-muted">
						<%= user_email %>
					</td>
					<td class="mb-0 text-muted">
						<%= sdf.format(user_regdate) %>
					</td>
					<td class="mb-0 text-muted">
						우편번호 : <%= user_pcode %> <br>
						도 로 명 : <%= user_raddr %> <br>
						지     번 : <%= user_jibun %> <br>
						상세주소 : <%= user_detailaddr %>
					</td>
				</tr>
		<%
				}
			}
		%>
			</table>
			</div>
				
			</div>
            </div>
          </div>
        </div> <!-- customized table -->
      </div> <!-- end section -->
    </div> <!-- .col-12 -->
  </div> <!-- .row -->
</div> <!-- .container-fluid -->
</body>
</html>