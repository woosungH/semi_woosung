<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="cs.QnABoardBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cs.FAQDBBean"%>
<%@page import="cs.QnABoardDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean class="cs.QnABoardBean" id="board"></jsp:useBean><!-- 객체 생성 -->
<jsp:useBean class="cs.QnABoardBean" id="board2"></jsp:useBean><!-- 객체 생성 -->
<%
	//아래에 사용할 변수들
	int b_id,b_view, b_level, b_fsize;
	String b_category, u_id, b_title, b_content, b_pwd, b_secret, b_anschk, content;
	Timestamp b_date;
	String b_titleS="";
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	String b_titleSearch = "";//제목 검색 변수
	int b_categorySearch = 0;//카테고리를 위한 변수
	
	
	String[] category = {"","회원정보", "상품문의", "주문/결제", "배송", "교환/취소", "서비스"};
	
	
	if(request.getParameter("b_titleS")!=null){
		b_titleSearch = request.getParameter("b_titleS");		
	}
	if(request.getParameter("b_categoryS")!=null){
		b_categorySearch = Integer.parseInt(request.getParameter("b_categoryS"));
	}

	//객체생성 및 객체 배열
	FAQDBBean faqdbBean = FAQDBBean.getInstance();
	QnABoardDBBean qnadbBean = QnABoardDBBean.getInstance();
	ArrayList<QnABoardBean> list = faqdbBean.listBoardFAQ(b_titleSearch,category[b_categorySearch]);
	
	if(request.getParameter("b_titleS")!=null){
		b_titleS = request.getParameter("b_titleS");
	}
%>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/faq.js?a=b"></script>
<style type="text/css">
	.h6:hover{cursor: pointer;}
</style>
</head>
<body class="vertical  light  ">
    <div class="wrapper">
        <div class="container-fluid">
          <div class="row justify-content-center">
            <div class="col-12 col-lg-10 col-xl-12">
              <div class="row mt-4">
                <div class="col-md-4">
                  <div class="card shadow mb-4">
                    <div class="card-body">
                      <div class="row align-items-center">
                        <div class="col-3 text-center">
                          <span class="circle circle-md bg-primary">
                            <span class="fe fe-briefcase fe-24 text-white"></span>
                          </span>
                        </div>
                        <div class="col">
                        <label for="001" class="h6 mb-0 text-uppercase">회원 정보</label>
                          <p class="small text-muted mb-0">Member Information</p>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-md-4">
                  <div class="card shadow mb-4">
                    <div class="card-body">
                      <div class="row align-items-center">
                        <div class="col-3 text-center">
                          <span class="circle circle-md bg-success">
                            <span class="fe fe-shopping-bag fe-24 text-white"></span>
                          </span>
                        </div>
                        <div class="col">
                        <label for="002" class="h6 mb-0 text-uppercase">상품 확인</label>
                          <p class="small text-muted mb-0">Product Confirmation</p>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-md-4">
                  <div class="card shadow mb-4">
                    <div class="card-body">
                      <div class="row align-items-center">
                        <div class="col-3 text-center">
                          <span class="circle circle-md bg-warning">
                            <span class="fe fe-truck fe-24 text-white"></span>
                          </span>
                        </div>
                        <div class="col">
                        <label for="003" class="h6 mb-0 text-uppercase">주문 / 결제</label>	
                          <p class="small text-muted mb-0">Order / Payment</p>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-md-4">
                  <div class="card shadow mb-4">
                    <div class="card-body">
                      <div class="row align-items-center">
                        <div class="col-3 text-center">
                          <span class="circle circle-md bg-secondary">
                            <span class="fe fe-package fe-24 text-white"></span>
                          </span>
                        </div>
                        <div class="col">
                        	<label for="004" class="h6 mb-0 text-uppercase">배송</label>	
	                          <p class="small text-muted mb-0">Shipment</p>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-md-4">
                  <div class="card shadow mb-4">
                    <div class="card-body">
                      <div class="row align-items-center">
                        <div class="col-3 text-center">
                          <span class="circle circle-md bg-danger">
                            <span class="fe fe-refresh-ccw fe-24 text-white"></span>
                          </span>
                        </div>
                        <div class="col">
                          <label for="005" class="h6 mb-0 text-uppercase">교환/취소</label>
                          <p class="small text-muted mb-0">Exchange / Cancellation</p>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="col-md-4">
                  <div class="card shadow mb-4">
                    <div class="card-body">
                      <div class="row align-items-center">
                        <div class="col-3 text-center">
                          <span class="circle circle-md bg-info">
                            <span class="fe fe-smile fe-24 text-white"></span>
                          </span>
                        </div>
                        <div class="col">
                        	<label for="006" class="h6 mb-0 text-uppercase">서비스</label>
	                        <p class="small text-muted mb-0">Service</p>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div> <!-- end section -->
              <input type="radio" name="category" id="001" onclick="location.href='main.jsp?pages=../cs/faq/faq_main&b_categoryS=1&b_titleS=<%= b_titleS %>'"
        	<%
    			if(b_categorySearch == 1){
    				%>
    					checked="checked"
    				<%
    			}
      		%> style="display: none;">
			  <input type="radio" name="category" id="002" onclick="location.href='main.jsp?pages=../cs/faq/faq_main&b_categoryS=2&b_titleS=<%= b_titleS %>'"        	
			<%
	  			if(b_categorySearch == 2){
					%>
						checked="checked"
					<%
				}
	  		%> style="display: none;">
			  <input type="radio" name="category" id="003" onclick="location.href='main.jsp?pages=../cs/faq/faq_main&b_categoryS=3&b_titleS=<%= b_titleS %>'"
        	<%
    			if(b_categorySearch == 3){
    				%>
    					checked="checked"
    				<%
    			}
      		%> style="display: none;">
			  <input type="radio" name="category" id="004" onclick="location.href='main.jsp?pages=../cs/faq/faq_main&b_categoryS=4&b_titleS=<%= b_titleS %>'"
        	<%
    			if(b_categorySearch == 4){
    				%>
    					checked="checked"
    				<%
    			}
      		%> style="display: none;">
			  <input type="radio" name="category" id="005" onclick="location.href='main.jsp?pages=../cs/faq/faq_main&b_categoryS=5&b_titleS=<%= b_titleS %>'"
        	<%
    			if(b_categorySearch == 5){
    				%>
    					checked="checked"
    				<%
    			}
      		%> style="display: none;">
			  <input type="radio" name="category" id="006" onclick="location.href='main.jsp?pages=../cs/faq/faq_main&b_categoryS=6&b_titleS=<%= b_titleS %>'"
        	<%
    			if(b_categorySearch == 6){
    				%>
    					checked="checked"
    				<%
    			}
      		%> style="display: none;">
              <div class="row my-4">
                <div class="col-md-12">
                  <div class="accordion w-100" id="accordion1">
                    <div class="card shadow">
      	<%
			for(int i=0;i<list.size();i++){
				board = list.get(i);
				
				b_id=board.getB_id();
				
				u_id=board.getU_id();
				b_category=board.getB_category();
				b_pwd=board.getB_pwd();
				b_title= board.getB_title();
				b_date= board.getB_date();
				b_view= board.getB_view();
				b_level = board.getB_level();
				b_fsize = board.getB_fsize();
				b_secret = board.getB_secret();
		%>
		<!-- 수정된 부분@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
                      <div class="card-header" id="heading<%=i+1 %>">
                        <a role="button" href="#collapse<%=i+1 %>" data-toggle="collapse" data-target="#collapse<%=i+1 %>" 
                        aria-expanded="false" aria-controls="collapse<%=i+1 %>">
                          <strong>
			<div><!-- 조회순 20개의 질문글 -->
				<div>[<%= b_category %>]<%= b_title %></div>
			</div>
                          </strong>
                        </a>
                      </div>
                      <div id="collapse<%=i+1 %>" class="collapse" aria-labelledby="heading<%=i+1 %>" data-parent="#accordion1">
                        <div class="card-body">
            <div><!-- 위의 질문글에 대한 답변 -->
		<!-- 수정된 부분@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
		<%
				board2 = faqdbBean.getBoardFAQ(b_id, false);
		
				b_id=board2.getB_id();
				u_id=board2.getU_id();
				b_category=board2.getB_category();
				b_pwd=board2.getB_pwd();
				b_title= board2.getB_title();
				b_date= board2.getB_date();
				b_view= board2.getB_view();
				b_level = board2.getB_level();
				b_fsize = board2.getB_fsize();
				b_secret = board2.getB_secret();
				board2 = qnadbBean.getBoard(b_id, false);
				content = board2.getB_content();
		
		%>
				<div><%= content %></div>
			</div>
					</div>
					</div>
		<% 
			}
		%>
                	</div> 
				</div>
                </div> <!-- /.col -->
              </div> <!-- end section -->
            </div> <!-- /.col -->
          </div> <!-- .row -->
        </div> <!-- .container-fluid -->
    </div> <!-- .wrapper -->
	<script src="js/jquery.min.js"></script>
</body>
</html>