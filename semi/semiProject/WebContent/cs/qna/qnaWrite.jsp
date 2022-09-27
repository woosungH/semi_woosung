<%@page import="member.MemberDBBean"%>
<%@page import="member.MemberBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cs.QnABoardBean"%>
<%@page import="cs.QnABoardDBBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String id = (String)session.getAttribute("id");

	String name="", phone="", email="";
	//수정된 부분@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	if(id.equals("")){
		//수정된 부분@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		response.sendRedirect("main.jsp?pages=../user_log/login");
	} else {
		MemberBean mb = new MemberBean();
		MemberDBBean mdb = MemberDBBean.getInstance();
		//System.out.println("===========>"+id);
		mb = mdb.getMember(id);
		//System.out.print(mb);
		name = mb.getUser_name();
		phone = mb.getUser_phone1()+""+mb.getUser_phone2()+""+mb.getUser_phone3();
		email = mb.getUser_email();
	}
	String pageNum = request.getParameter("pageNum");
	if(pageNum == null){
		pageNum = "1";
	} 
%>
<!doctype html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <title></title>
    <script src="../js/board.js" charset="UTF-8"></script>
  </head>
  <body class="vertical  dark  ">
    <div class="wrapper">
        <div class="container-fluid">
          <div class="row justify-content-center">
            <div class="col-12">
              <h2 class="page-title">문의 작성</h2>
              <br />
              		<!-- 수정된 부분@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
              <form action="main.jsp?pages=../cs/qna/qna_write_ok" method="post" name="write_frm" enctype="multipart/form-data">
              		<!-- 수정된 부분@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
              <div class="card shadow mb-2">
                  <div class="card shadow">
                    <div class="card-body">
                      <div class="form-group mb-3">
                        <label for="custom-select">문의 유형</label>
                        <select name="b_category" class="custom-select" id="custom-select category">
	                        <option value="nonSelect" selected>문의 유형을 선택해 주세요.</option>
	                        <option value="회원정보">회원정보</option>
	                        <option value="상품문의">상품문의</option>
	                        <option value="주문/결제">주문/결제</option>
	                        <option value="배송">배송</option>
	                        <option value="교환/취소">교환/취소</option>
	                        <option value="서비스">서비스</option>
                        </select>
                      </div>
                      <div class="form-group mb-3">
                        <label for="simpleinput">작성자</label>
                        <input type="text" id="simpleinput" class="form-control" value="<%= name %>" readonly />
                      </div>
                      <div class="form-group mb-3">
                        <label for="example-palaceholder">휴대전화</label>
                        <input type="text" id="example-palaceholder" class="form-control" value="<%= phone %>" readonly />
                      </div>
                      <div class="form-group mb-3">
                        <label for="example-email">이메일</label>
                        <input type="email" id="example-email" name="example-email" class="form-control" value="<%= email %>" readonly />
                      </div>
                      <div class="form-group mb-3">
                        <label for="example-palaceholder">제목</label>
                        <input type="text" id="example-palaceholder" class="form-control" name="b_title" placeholder="제목을 입력해주세요." />
                      </div>
                     <div class="form-group mb-3">
                        <label for="example-textarea">문의 내용</label>
                        <textarea class="form-control" name="b_content" id="example-textarea" rows="10"></textarea>
                      </div>
                      <div class="form-group mb-3">
                        <label for="fileinput">이미지</label>
	                        <!-- 첨부파일(이미지파일만 업로드가능) -->
							<input type="file" id="fileinput" name="b_fname" accept="image/*">
							
							<!-- 이미지 미리보기 영역 -->
							<div id="imgViewArea" style="margin-top:10px; display:none;">
								<img id="imgArea" style="width:250px; height:250px;" onerror="imgAreaError()"/>
							</div>
	                      <div style="text-align:center;">
                      </div>
                      <div class="form-group mb-3">
                        <label for="example-password">비밀번호</label>
                        <input type="password" name="b_pwd" id="example-password" class="form-control" placeholder="비밀번호를 입력해주세요.">
                      </div>
                      <div class="form-check">
                        <input class="form-check-input" type="checkbox" name="b_secret" id="defaultCheck1">비밀글
                      </div>
                  	<div style="text-align:center">
	                  <div aria-label="Basic example">
	                    <input type="button" class="btn btn-primary" value="목록" onclick="location.href='main.jsp?pages=../cs/qna/qnaList_u&pageNum=<%= pageNum %>'" />
		                 <input type="reset" class="btn btn-primary" value="다시 작성" />
		                 <input type="button" class="btn btn-primary" value="작성" onclick="check_ok()" />
	                  </div>
                	</div>
                    </div>
                  </div>
                  </div>
	              </form>
            	</div>
          	</div> <!-- end section -->
        </div> <!-- .col-12 -->
      </div> <!-- .row -->
     <script src="../js/jquery.min.js"></script>
    <script type="text/javascript">
	// 콘텐츠 수정 :: 사진 수정 시 이미지 미리보기
	function readURL(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();
			reader.onload = function(e) {
				$('#imgArea').attr('src', e.target.result); 
			}
			reader.readAsDataURL(input.files[0]);
		}
	}

	$(":input[name='b_fname']").change(function() {
		if( $(":input[name='b_fname']").val() == '' ) {
			$('#imgArea').attr('src' , '');  
		}
		$('#imgViewArea').css({ 'display' : '' });
		readURL(this);
	});

	// 이미지 에러 시 미리보기영역 미노출
	function imgAreaError(){
		$('#imgViewArea').css({ 'display' : 'none' });
	}
</script>
  </body>
</html>