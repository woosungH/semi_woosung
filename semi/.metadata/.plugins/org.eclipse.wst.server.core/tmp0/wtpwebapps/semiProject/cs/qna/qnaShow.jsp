<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cs.QnABoardBean"%>
<%@page import="cs.QnABoardDBBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%
	QnABoardDBBean qdb = QnABoardDBBean.getInstance();
	QnABoardBean qbb = qdb.getBoard(Integer.parseInt(request.getParameter("b_id")),true);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	String pageNum = request.getParameter("pageNum");
	
	String user_grade = "";
	int grade = 0;
	if(session.getAttribute("grade") == null){
		response.sendRedirect("main.jsp?pages=error");
	} else {
		user_grade = String.valueOf(session.getAttribute("grade"));
		grade = Integer.parseInt(user_grade);
	}
	int b_id = qbb.getB_id();
	QnABoardBean qbb1 = qdb.getFileName(b_id);
	String fileName = qbb.getB_rfname();
	String category="", b_category="";
	b_category = qbb.getB_category();
	if(b_category.equals("회원정보")){
		category = URLEncoder.encode("회원정보","UTF-8");
	} else if(b_category.equals("상품문의")){
		category = URLEncoder.encode("상품문의","UTF-8");
	} else if(b_category.equals("주문/결제")){
		category = URLEncoder.encode("주문/결제","UTF-8");
	} else if(b_category.equals("배송")){
		category = URLEncoder.encode("배송","UTF-8");
	} else if(b_category.equals("교환/취소")){
		category = URLEncoder.encode("교환/취소","UTF-8");
	} else if(b_category.equals("서비스")){
		category = URLEncoder.encode("서비스","UTF-8");
	}
	if(qbb.getB_secret().equals("Y")&&!qbb.getU_id().equals(session.getAttribute("id"))){
%>
		<script>
			alert("작성자만 읽을 수 있습니다.");
			history.back();
		</script>	
<%
	}
%>
<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
<body class="vertical  dark  ">
    <div class="wrapper">
    <div class="container-fluid">
          <div class="row justify-content-center">
            <div class="col-12">
              <h2 class="page-title">문의 확인</h2>
              <div class="row">
                <div class="col-md-12">
                  <div class="card shadow mb-4">
                    <div class="card-body">
                      <form class="needs-validation" novalidate>
                        <div class="form-row">
                          <div class="col-md-6 mb-3">
                            <span>글 번호</span>
                            <span class="form-control"><%= b_id %></span>
                          </div>
                          <div class="col-md-6 mb-3">
                            <span>문의 유형</span>
                            <span class="form-control"><%= b_category %></span>
                          </div>
                        </div>
                        <div class="form-row">
                          <div class="col-md-6 mb-3">
                            <span>작성자</span>
                            <span class="form-control"><%= qbb.getU_id() %></span>
                          </div>
                          <div class="col-md-6 mb-3">
                            <span>작성일</span>
                            <span class="form-control"><%= sdf.format(qbb.getB_date()) %></span>
                          </div>
                        </div>
                        <div class="form-row">
                          <div class="col-md-4 mb-3">
                            <span>조회수</span>
                            <span class="form-control"><%= qbb.getB_view() %></span>
                          </div>
                          <div class="col-md-8 mb-3">
                            <span>이미지</span>
                            <span class="form-control">
                            <%
								if(qbb.getB_fname() != null){
							%>
									<img src="../images/download.png" style="width:20px;" />
									<a href="../cs/qna/FileDownload.jsp?fileNum=<%= qbb.getB_id() %>">(파일명 :<%= qbb.getB_rfname() %>)</a>
							<%
								}else{
							%>
									업로드한 사진이 없습니다.
							<%
								}
							%>
							</span>
                          </div>
                        </div>
                        <div class="form-group mb-3">
                        	<span>제목</span>
                            <span class="form-control"><%= qbb.getB_title() %></span>
                        </div>
                        <div class="form-group mb-3">
                          <span>문의 내용</span>
                          <span class="form-control" style="height: 350px;"><%= qbb.getB_content() %></span>
                        </div>
                        <div class="form-group mb-3">
	                      	<label for="fileinput">업로드 이미지</label>
							<img src="../upload/<%= fileName %>" alt="이미지 없음" style="width:250px; height:250px;" />
	                      </div>
                        <div style="text-align:center;">
	                        <input class="btn btn-primary" type="button" value="목록" onclick="location.href='main.jsp?pages=../cs/qna/qnaList_u&pageNum=<%= pageNum %>'" />
							<% 
								if(qbb.getU_id().equals(session.getAttribute("id"))||grade==1) {
							%>
							<input class="btn btn-primary" type="button" value="삭제" onclick="location.href='main.jsp?pages=../cs/qna/qnaDelete&b_id=<%= qbb.getB_id() %>&pageNum=<%= pageNum %>'" />
							<% 
								}
							%>
							<% 
								if(qbb.getU_id().equals(session.getAttribute("id"))){
							%>
							<input class="btn btn-primary" type="button" value="수정" onclick="location.href='main.jsp?pages=../cs/qna/qnaEdit&b_id=<%= qbb.getB_id() %>&pageNum=<%= pageNum %>&b_category=<%= category %>'" />
							<% 
								}
							%>
						</div>
                      </form>
                    </div> <!-- /.card-body -->
                  </div> <!-- /.card -->
                </div> <!-- /.col -->
              </div>
            </div>
          </div>
        </div>
      </div>
  </body>
</html>