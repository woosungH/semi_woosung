/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-19 05:32:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.FAQ;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import cs.QnABoardBean;
import java.util.ArrayList;
import cs.FAQDBBean;
import cs.QnABoardDBBean;

public final class FAQ_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("cs.QnABoardBean");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("cs.QnABoardDBBean");
    _jspx_imports_classes.add("cs.FAQDBBean");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      cs.QnABoardBean board = null;
      board = (cs.QnABoardBean) _jspx_page_context.getAttribute("board", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (board == null){
        board = new cs.QnABoardBean();
        _jspx_page_context.setAttribute("board", board, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("<!-- 객체 생성 -->\r\n");
      cs.QnABoardBean board2 = null;
      board2 = (cs.QnABoardBean) _jspx_page_context.getAttribute("board2", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (board2 == null){
        board2 = new cs.QnABoardBean();
        _jspx_page_context.setAttribute("board2", board2, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("<!-- 객체 생성 -->\r\n");

	//아래에 사용할 변수들
	int b_id,b_view, b_level, b_fsize;
	String b_category, u_id, b_title, b_content, b_pwd, b_secret, b_anschk;
	Timestamp b_date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	String b_titleSearch = "";
	int b_categorySearch = 0;
	String[] category = {"","회원정보", "상품문의", "주문/결제", "배송", "교환/취소", "서비스"};
	
	if(request.getParameter("b_titleS")!=null){
		b_titleSearch = request.getParameter("b_titleS");		
	}
	if(request.getParameter("b_categoryS")!=null){
		b_categorySearch = Integer.parseInt(request.getParameter("b_categoryS"));
	}
	
	//객체생성 및 객체 배열
	FAQDBBean faqdbBean = FAQDBBean.getInstance();
	ArrayList<QnABoardBean> list = faqdbBean.listBoardFAQ(b_titleSearch,category[b_categorySearch]);

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("		<a href=\"../cs/cs_main.jsp\">메인페이지</a>><a href=\"../cs/cs_main.jsp\">고객센터</a>><a href=\"FAQ\">FAQ</a>\r\n");
      out.write("		<h3>자주 묻는 질문 FAQ</h3>\r\n");
      out.write("		<form method=\"post\" action=\"FAQ.jsp\">\r\n");
      out.write("			<input type=\"text\" name=\"b_titleS\">\r\n");
      out.write("			<input type=\"submit\" value=\"FAQ검색\">\r\n");
      out.write("		</form>\r\n");
      out.write("		<input type=\"radio\" name=\"category\" id=\"001\" onclick=\"location.href='?page=FAQ.jsp&b_categoryS=1'\" style=\"display: none;\">\r\n");
      out.write("		<input type=\"radio\" name=\"category\" id=\"002\" onclick=\"location.href='?page=FAQ.jsp&b_categoryS=2'\" style=\"display: none;\">\r\n");
      out.write("		<input type=\"radio\" name=\"category\" id=\"003\" onclick=\"location.href='?page=FAQ.jsp&b_categoryS=3'\" style=\"display: none;\">\r\n");
      out.write("		<input type=\"radio\" name=\"category\" id=\"004\" onclick=\"location.href='?page=FAQ.jsp&b_categoryS=4'\" style=\"display: none;\">\r\n");
      out.write("		<input type=\"radio\" name=\"category\" id=\"005\" onclick=\"location.href='?page=FAQ.jsp&b_categoryS=5'\" style=\"display: none;\">\r\n");
      out.write("		<input type=\"radio\" name=\"category\" id=\"006\" onclick=\"location.href='?page=FAQ.jsp&b_categoryS=6'\" style=\"display: none;\">\r\n");
      out.write("		<label for=\"001\">회원정보</label>\r\n");
      out.write("		<label for=\"002\">상품확인</label>\r\n");
      out.write("		<label for=\"003\">주문/결제</label>\r\n");
      out.write("		<label for=\"004\">배송</label>\r\n");
      out.write("		<label for=\"005\">교환/취소</label>\r\n");
      out.write("		<label for=\"006\">서비스</label>\r\n");
      out.write("		<table border=\"1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<!-- <td>글번호</td> -->\r\n");
      out.write("				<td>분류</td>\r\n");
      out.write("				<td>제목</td>\r\n");
      out.write("				<!-- <td>작성자</td>\r\n");
      out.write("				<td>작성일</td> -->\r\n");
      out.write("			</tr>\r\n");
      out.write("		");

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
				
		
      out.write("\r\n");
      out.write("			<tr><!-- 조회순 20개의 질문글 -->\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				<td>");
      out.print( b_category );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print( b_title );
      out.write("</td>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr><!-- 위의 질문글에 대한 답변 -->\r\n");
      out.write("		");

				
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
		
		
      out.write("\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("				<td>");
      out.print( b_category );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print( b_title );
      out.write("</td>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("		");
 
			}
		
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
