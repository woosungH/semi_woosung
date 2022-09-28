/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-23 03:34:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cs.NoticeBean;
import cs.NoticeDBBean;
import java.util.ArrayList;
import cs.QnABoardBean;
import cs.QnABoardDBBean;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;

public final class noticeWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("cs.NoticeBean");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("cs.NoticeDBBean");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	int  n_num = 0;
	String n_user_id;
	String n_title="";
	NoticeDBBean noticeDB = NoticeDBBean.getInstance();
	NoticeBean notice = null;

	String pageNum=null;
	if(request.getParameter("pageNum")==null){
		pageNum="1";
	}else{
		pageNum=request.getParameter("pageNum");		
	}
	if(request.getParameter("n_user_id")!=null){
		n_user_id=request.getParameter("n_user_id");
	} else{
		n_user_id="";
		response.sendRedirect("adminIndex.jsp?pages=noticeList&pageNum="+pageNum);
	}
	

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\">\r\n");
      out.write("    <title>Tiny Dashboard - A Bootstrap Dashboard Template</title>\r\n");
      out.write("     <!-- 부트스트랩 CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\r\n");
      out.write("    <!-- Simple bar CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/simplebar.css\">\r\n");
      out.write("    <!-- Fonts CSS -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Overpass:ital,wght@0,100;0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Icons CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/feather.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/dataTables.bootstrap4.css\">\r\n");
      out.write("    <!-- Date Range Picker CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/daterangepicker.css\">\r\n");
      out.write("    <!-- App CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/app-light.css\" id=\"lightTheme\" disabled>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/app-dark.css\" id=\"darkTheme\">\r\n");
      out.write("   	<script src=\"admin.js\"></script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"vertical  dark  \">\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"row justify-content-center\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("              <h2 class=\"page-title\">공지 작성</h2>\r\n");
      out.write("              <br />\r\n");
      out.write("              <form method=\"post\" action=\"noticeWrite_ok.jsp\" name=\"wrt_frm\">\r\n");
      out.write("              <div class=\"card shadow mb-2\">\r\n");
      out.write("                  <div class=\"card shadow\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                      <div class=\"form-group mb-3\">\r\n");
      out.write("                        <label for=\"simpleinput\">작성자</label>\r\n");
      out.write("                        <input type=\"text\" name=\"n_user_id\" id=\"simpleinput\" class=\"form-control\" value=\"");
      out.print(n_user_id);
      out.write("\" readonly />\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"form-group mb-3\">\r\n");
      out.write("                        <label for=\"example-palaceholder\">제목</label>\r\n");
      out.write("                        <input type=\"text\" id=\"example-palaceholder\" class=\"form-control\" name=\"n_title\" placeholder=\"제목을 입력해주세요.\" />\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"form-group mb-3\">내용\r\n");
      out.write("                 		<div id=\"editor\" style=\"min-height:300px;\" contenteditable=\"true\">\r\n");
      out.write("                 		</div>\r\n");
      out.write("                  		<input type=\"hidden\" value=\"\" name=\"n_content\" id=\"content\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"form-group mb-3\">\r\n");
      out.write("                        <label for=\"example-password\">비밀번호</label>\r\n");
      out.write("                        <input type=\"password\" name=\"n_pwd\" id=\"example-password\" class=\"form-control\" placeholder=\"비밀번호를 입력해주세요.\">\r\n");
      out.write("                      </div>\r\n");
      out.write("                  	<div style=\"text-align:center\">\r\n");
      out.write("	                  <div class=\"btn-group\" role=\"group\" aria-label=\"Basic example\">\r\n");
      out.write("	                    <input type=\"button\" class=\"btn btn-primary\" value=\"목록\" onclick=\"location.href='adminIndex.jsp?pages=noticeList&pageNum=");
      out.print(pageNum);
      out.write("'\" />\r\n");
      out.write("		                 <input type=\"reset\" class=\"btn btn-primary\" value=\"다시 작성\" />\r\n");
      out.write("		                 <input type=\"button\" class=\"btn btn-primary\" value=\"작성\" onclick=\"onclick_ok()\" />\r\n");
      out.write("	                  </div>\r\n");
      out.write("                	</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                	</div>\r\n");
      out.write("              	</div> <!-- end section -->\r\n");
      out.write("              </form>\r\n");
      out.write("            </div> <!-- .col-12 -->\r\n");
      out.write("          </div> <!-- .row -->\r\n");
      out.write("<!--     <script src=\"js/jquery.min.js\"></script> -->\r\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"js/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/simplebar.min.js\"></script>\r\n");
      out.write("    <script src='js/daterangepicker.js'></script>\r\n");
      out.write("    <script src='js/jquery.stickOnScroll.js'></script>\r\n");
      out.write("    <script src=\"js/tinycolor-min.js\"></script>\r\n");
      out.write("    <script src=\"js/config.js\"></script>\r\n");
      out.write("    <script src='js/jquery.mask.min.js'></script>\r\n");
      out.write("    <script src='js/select2.min.js'></script>\r\n");
      out.write("    <script src='js/jquery.steps.min.js'></script>\r\n");
      out.write("    <script src='js/jquery.validate.min.js'></script>\r\n");
      out.write("    <script src='js/jquery.timepicker.js'></script>\r\n");
      out.write("    <script src='js/dropzone.min.js'></script>\r\n");
      out.write("    <script src='js/uppy.min.js'></script>\r\n");
      out.write("	<!-- <script src='js/quill.min.js'></script> -->\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    // editor\r\n");
      out.write("    var editor = document.getElementById('editor');\r\n");
      out.write("    if (editor)\r\n");
      out.write("    {\r\n");
      out.write("      var toolbarOptions = [\r\n");
      out.write("        [\r\n");
      out.write("        {\r\n");
      out.write("          'font': []\r\n");
      out.write("        }],\r\n");
      out.write("        [\r\n");
      out.write("        {\r\n");
      out.write("          'header': [1, 2, 3, 4, 5, 6, false]\r\n");
      out.write("        }],\r\n");
      out.write("        ['bold', 'italic', 'underline', 'strike'],\r\n");
      out.write("        ['blockquote', 'code-block'],\r\n");
      out.write("        [\r\n");
      out.write("        {\r\n");
      out.write("          'header': 1\r\n");
      out.write("        },\r\n");
      out.write("        {\r\n");
      out.write("          'header': 2\r\n");
      out.write("        }],\r\n");
      out.write("        [\r\n");
      out.write("        {\r\n");
      out.write("          'list': 'ordered'\r\n");
      out.write("        },\r\n");
      out.write("        {\r\n");
      out.write("          'list': 'bullet'\r\n");
      out.write("        }],\r\n");
      out.write("        [\r\n");
      out.write("        {\r\n");
      out.write("          'script': 'sub'\r\n");
      out.write("        },\r\n");
      out.write("        {\r\n");
      out.write("          'script': 'super'\r\n");
      out.write("        }],\r\n");
      out.write("        [\r\n");
      out.write("        {\r\n");
      out.write("          'indent': '-1'\r\n");
      out.write("        },\r\n");
      out.write("        {\r\n");
      out.write("          'indent': '+1'\r\n");
      out.write("        }], // outdent/indent\r\n");
      out.write("        [\r\n");
      out.write("        {\r\n");
      out.write("          'direction': 'rtl'\r\n");
      out.write("        }], // text direction\r\n");
      out.write("        [\r\n");
      out.write("        {\r\n");
      out.write("          'color': []\r\n");
      out.write("        },\r\n");
      out.write("        {\r\n");
      out.write("          'background': []\r\n");
      out.write("        }], // dropdown with defaults from theme\r\n");
      out.write("        [\r\n");
      out.write("        {\r\n");
      out.write("          'align': []\r\n");
      out.write("        }],\r\n");
      out.write("        ['clean'] // remove formatting button\r\n");
      out.write("      ];\r\n");
      out.write("      var quill = new Quill(editor,\r\n");
      out.write("      {\r\n");
      out.write("        modules:\r\n");
      out.write("        {\r\n");
      out.write("          toolbar: toolbarOptions\r\n");
      out.write("        },\r\n");
      out.write("        theme: 'snow'\r\n");
      out.write("      });\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
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
