/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-27 00:42:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cs.qna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import cs.QnABoardBean;
import cs.QnABoardDBBean;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;

public final class qnaList_005fu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("cs.QnABoardBean");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("cs.QnABoardDBBean");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');

	int b_id,b_view, b_level, b_fsize;
	String b_category, u_id, b_title, b_content, b_pwd, b_secret, b_anschk;
	Timestamp b_date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	QnABoardDBBean qdb = QnABoardDBBean.getInstance();
	String pageNum = request.getParameter("pageNum");
	if(pageNum == null){
		pageNum = "1";
	} 
	ArrayList<QnABoardBean> list = qdb.listBoard(pageNum);
	

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Tiny Dashboard - A Bootstrap Dashboard Template</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"vertical  dark  \">\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"row justify-content-center\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <!-- Small table -->\r\n");
      out.write("                <div class=\"col-md-12 my-4\">\r\n");
      out.write("                  <h2 class=\"h4 mb-1\">Q & A</h2>\r\n");
      out.write("                  <br />\r\n");
      out.write("                  <div class=\"col-md-12 my-4\">\r\n");
      out.write("                   <!-- ????????? ??????@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->\r\n");
      out.write("                  	<a href=\"main.jsp\">????????? ???</a>> <a href=\"main.jsp?pages=../cs/cs_main\">????????????</a>> QnA\r\n");
      out.write("                  	<!-- ????????? ??????@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"card shadow\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                      <!-- table -->\r\n");
      out.write("                      <div style=\"text-align:center\">\r\n");
      out.write("                      <table class=\"table table-borderless table-hover\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <th>?????????</th>\r\n");
      out.write("							<th>??????</th>\r\n");
      out.write("							<th class=\"w-25\">??????</th>\r\n");
      out.write("							<th>?????????</th>\r\n");
      out.write("							<th>?????????</th>\r\n");
      out.write("							<th>?????????</th>\r\n");
      out.write("							<th>????????????</th>\r\n");
      out.write("							<th>?????????</th>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
      out.write("   ");

		for(int i=0; i < list.size(); i++) {
			QnABoardBean board = list.get(i); // ????????? ?????? ???????????? board ????????? ?????? ?????????
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
			b_anschk = board.getB_anschk();
			
	
      out.write("\r\n");
      out.write("                          <tr>\r\n");
      out.write("							<td class=\"mb-0 text-muted\">");
      out.print(b_id);
      out.write("</td>\r\n");
      out.write("							<td class=\"mb-0 text-muted\">");
      out.print(b_category);
      out.write("</td>\r\n");
      out.write("							<td class=\"mb-0 text-muted\">\r\n");
      out.write("								");

									if(b_level > 0){
										for(int j=0; j<b_level; j++){
								
      out.write("\r\n");
      out.write("											&nbsp;\r\n");
      out.write("								");

										}
								
      out.write("\r\n");
      out.write("									<img src=\"../images/replyE.png\" style=\"width:20px;\" />\r\n");
      out.write("								");

									}
								
      out.write("\r\n");
      out.write("								<a href=\"main.jsp?pages=../cs/qna/qnaShow&b_id=");
      out.print( b_id );
      out.write("&pageNum=");
      out.print( pageNum );
      out.write('"');
      out.write('>');
      out.print(b_title);
      out.write("</a>\r\n");
      out.write("							</td>\r\n");
      out.write("							<td class=\"mb-0 text-muted\">");
      out.print( u_id );
      out.write("</td>\r\n");
      out.write("							<td class=\"mb-0 text-muted\">");
      out.print(sdf.format(b_date));
      out.write("</td>\r\n");
      out.write("							<td class=\"mb-0 text-muted\">");
      out.print(b_view);
      out.write("</td>\r\n");
      out.write("							<td>\r\n");
      out.write("								");

									if(b_fsize != 0) {
								
      out.write("\r\n");
      out.write("										<img src=\"../images/image.png\" style=\"width:30px;\" />\r\n");
      out.write("								");

									}
								
      out.write("\r\n");
      out.write("							</td>\r\n");
      out.write("							<td>\r\n");
      out.write("								");

									if(b_secret.equals("Y")) {
								
      out.write("\r\n");
      out.write("										<img src=\"../images/lock.png\" style=\"width:30px;\" />\r\n");
      out.write("								");

									}
								
      out.write("\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("	");

					}
	
      out.write("\r\n");
      out.write("                      </table>\r\n");
      out.write("                      </div>\r\n");
      out.write("				<nav aria-label=\"Table Paging\" class=\"mb-0 text-muted\">\r\n");
      out.write("		        	<ul class=\"pagination justify-content-center mb-0\">\r\n");
      out.write("		        	<!-- ????????? ??????@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->\r\n");
      out.write("						");
      out.print( QnABoardBean.userPageNumber(5) );
      out.write("\r\n");
      out.write("					<!-- ????????? ??????@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->\r\n");
      out.write("					</ul>\r\n");
      out.write("	");

				 if(session.getAttribute("id") != null){
	
      out.write("\r\n");
      out.write("						<div style=\"text-align:right\">\r\n");
      out.write("							<a href=\"main.jsp?pages=../cs/qna/qnaWrite&pageNum=");
      out.print( pageNum );
      out.write("\" class=\"btn mb-2 btn-outline-primary\">??? ??? ???</a>\r\n");
      out.write("						</div>\r\n");
      out.write("			\r\n");
      out.write("	");
 
		 } 
	
      out.write("\r\n");
      out.write("                      </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div> <!-- customized table -->\r\n");
      out.write("              </div> <!-- end section -->\r\n");
      out.write("            </div> <!-- .col-12 -->\r\n");
      out.write("          </div> <!-- .row -->\r\n");
      out.write("        </div> <!-- .container-fluid -->\r\n");
      out.write("    </div> <!-- .wrapper -->\r\n");
      out.write("<!--     <script src=\"js/jquery.min.js\"></script> -->\r\n");
      out.write("\r\n");
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
