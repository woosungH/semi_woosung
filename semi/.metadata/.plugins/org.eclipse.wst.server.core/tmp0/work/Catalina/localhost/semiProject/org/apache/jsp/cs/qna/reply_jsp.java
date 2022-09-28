/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-21 07:06:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cs.qna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cs.QnABoardBean;
import cs.QnABoardDBBean;

public final class reply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("cs.QnABoardDBBean");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../js/board.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
 
		int b_id = 0,b_ref = 1,b_level = 0,b_step = 0;
		String b_title="";
		/* if(session.getAttribute(id) == null){
			response.sendRedirect("login.jsp");
		} */
		b_id = Integer.parseInt(request.getParameter("b_id"));
		QnABoardDBBean qdb = QnABoardDBBean.getInstance();
		QnABoardBean qbb = qdb.getBoard(b_id,false);
		if(qbb != null) {
			b_ref = qbb.getB_ref();
			b_step = qbb.getB_step();
			b_level = qbb.getB_level();
			b_title = qbb.getB_title();
		}
		String pageNum = request.getParameter("pageNum");
	
      out.write("\r\n");
      out.write("	<h1>문의 답변</h1>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <form action=\"reply_ok.jsp?b_id=");
      out.print( b_id );
      out.write("&pageNum=");
      out.print( pageNum );
      out.write("\" method=\"post\" name=\"write_frm\" enctype=\"multipart/form-data\">\r\n");
      out.write("    	<table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>문의유형</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" name=\"b_category\" value=\"");
      out.print( qbb.getB_category() );
      out.write("\" readonly>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>작성자</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"text\" name=\"name\" readonly />\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>제목</td>\r\n");
      out.write("                <td>\r\n");
      out.write("					<input type=\"text\" name=\"b_title\" value=\"[답변]");
      out.print( b_title );
      out.write("\" />\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>답변내용</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <textarea name=\"b_content\" cols=\"30\" rows=\"10\" placeholder=\"내용을 입력해주세요.\"></textarea>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>사진</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                   <label for=\"qnaImg\" style=\"width: 50px; height: 50px; display: inline-block;\" >\r\n");
      out.write("                       <img src=\"../images/upload.png\" alt=\"upload\" style=\"pointer-events: none; width: 100%;\">\r\n");
      out.write("                   </label>\r\n");
      out.write("                   <input type=\"file\" name=\"b_fname\" id=\"qnaImg\" style=\"display: none;\"/>\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>비밀번호</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                	<input type=\"password\" name=\"b_pwd\" />\r\n");
      out.write("                </td>\r\n");
      out.write("                <td>비밀글</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                	<input type=\"checkbox\" name=\"b_secret\" />\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><input type=\"hidden\" name=\"b_ref\" value=\"");
      out.print( b_ref );
      out.write("\"></td>\r\n");
      out.write("                <td><input type=\"hidden\" name=\"b_step\" value=\"");
      out.print( b_step );
      out.write("\"></td>\r\n");
      out.write("                <td><input type=\"hidden\" name=\"b_level\" value=\"");
      out.print( b_level );
      out.write("\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>\r\n");
      out.write("                    <input type=\"button\" value=\"취소\" onclick=\"location.href='list.jsp?pageNum=");
      out.print( pageNum );
      out.write("'\" />\r\n");
      out.write("                    <input type=\"reset\" value=\"다시작성\" />\r\n");
      out.write("                    <input type=\"button\" value=\"작성하기\" onclick=\"check_ok()\" />\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </form>\r\n");
      out.write("    </table>\r\n");
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
