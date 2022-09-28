/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-27 00:51:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cs.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import cs.NoticeDBBean;
import java.sql.Timestamp;
import java.sql.Date;
import java.text.SimpleDateFormat;

public final class noticeShow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("cs.NoticeDBBean");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.sql.Date");
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
      response.setContentType("text/html; charset=utf-8");
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
      cs.NoticeBean notice = null;
      notice = (cs.NoticeBean) _jspx_page_context.getAttribute("notice", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (notice == null){
        notice = new cs.NoticeBean();
        _jspx_page_context.setAttribute("notice", notice, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

	String pageNum=request.getParameter("pageNum");
	int n_num = 0,n_hit=0,n_before=0,n_after=0;
	String n_date="", user_id="", n_title="", n_content="";
	NoticeDBBean noticeDBBean = NoticeDBBean.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	if(request.getParameter("n_num")==null){
		response.sendRedirect("adminIndex.jsp");
	} else {
		n_num = Integer.parseInt(request.getParameter("n_num"));
		notice = noticeDBBean.getNotice(n_num, true);
		n_date = sdf.format(notice.getN_date());
		user_id=notice.getUser_id();
		n_hit=notice.getN_hit();
		n_title=notice.getN_title();
		n_content = notice.getN_content();
		n_before = notice.getBefore();
		n_after = notice.getAfter();
	}
	String n_title2="";

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("  </head>\r\n");
      out.write("<body class=\"vertical  dark  \">\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"row justify-content-center\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("              <h2 class=\"page-title\">공지 확인</h2>\r\n");
      out.write("              <br />\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                  <div class=\"card shadow mb-4\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                      <form class=\"needs-validation\" novalidate>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                            <span>글 번호</span>\r\n");
      out.write("                            <span class=\"form-control\">");
      out.print( n_num );
      out.write("</span>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                            <span>조회수</span>\r\n");
      out.write("                            <span class=\"form-control\">");
      out.print( n_hit );
      out.write("</span>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-row\">\r\n");
      out.write("                          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                            <span>작성자</span>\r\n");
      out.write("                            <span class=\"form-control\">");
      out.print( user_id );
      out.write("</span>\r\n");
      out.write("                          </div>\r\n");
      out.write("                          <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                            <span>작성일</span>\r\n");
      out.write("                            <span class=\"form-control\">");
      out.print( n_date );
      out.write("</span>\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group mb-3\">\r\n");
      out.write("                        	<span>제목</span>\r\n");
      out.write("                            <span class=\"form-control\">");
      out.print( n_title );
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group mb-3\">\r\n");
      out.write("                          <span>내용</span>\r\n");
      out.write("                          <span class=\"form-control\" style=\"height: 350px;\">");
      out.print( n_content );
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div style=\"text-align:center;\">\r\n");
      out.write("							<input class=\"btn btn-primary\" type=\"button\" value=\"목록\" onclick=\"location.href='main.jsp?pages=../cs/notice/noticeList_u&pageNum=");
      out.print(pageNum);
      out.write("'\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<div style=\"margin: 20px 0; text-align:center;\">\r\n");
      out.write("						");

							if(n_num+1 >0 ){
								notice = noticeDBBean.getNotice(n_after, false);
								n_title2 = notice.getN_title();
								if(n_title2 != null){
						
      out.write("\r\n");
      out.write("										<a class=\"btn btn-primary\" href=\"main.jsp?pages=../cs/notice/noticeShow&n_num=");
      out.print( n_after );
      out.write("&pageNum=");
      out.print( pageNum );
      out.write("\" id=\"upPage\">\r\n");
      out.write("											이전글 [");
      out.print( n_title2 );
      out.write("]\r\n");
      out.write("										</a>\r\n");
      out.write("						");

								}		
							}
						
      out.write("\r\n");
      out.write("						");

							if(n_num-1 >0 ){
								notice = noticeDBBean.getNotice(n_before, false);
								n_title2 = notice.getN_title();
						
      out.write("\r\n");
      out.write("									<a class=\"btn btn-primary\" href=\"main.jsp?pages=../cs/notice/noticeShow&n_num=");
      out.print( n_before );
      out.write("&pageNum=");
      out.print( pageNum );
      out.write("\" id=\"upPage\">\r\n");
      out.write("										다음글 [");
      out.print( n_title2 );
      out.write("]\r\n");
      out.write("									</a>\r\n");
      out.write("						");

							}
						
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("                      </form>\r\n");
      out.write("                    </div> <!-- /.card-body -->\r\n");
      out.write("                  </div> <!-- /.card -->\r\n");
      out.write("                </div> <!-- /.col -->\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("	<script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\" src=\"../js/board.js\" charset=\"UTF-8\"></script>\r\n");
      out.write("  </body>\r\n");
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
