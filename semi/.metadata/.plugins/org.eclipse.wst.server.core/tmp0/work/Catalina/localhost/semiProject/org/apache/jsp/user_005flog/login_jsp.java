/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-27 05:38:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user_005flog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <title>로그인</title>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Overpass:ital,wght@0,100;0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/simplebar.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/feather.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/daterangepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/app-light.css\" id=\"lightTheme\">\n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("    *{list-style: none;}\n");
      out.write("    .info ul{display: flex; justify-content: center; width: 100%;}\n");
      out.write("    .info ul li{text-align: center; width: 33.33%; border-right: 1px solid gray;}\n");
      out.write("    .info ul li:last-child{border: none;}\n");
      out.write("  </style>\n");
      out.write("  <body class=\"light \">\n");
      out.write("    <div class=\"wrapper vh-100\">\n");
      out.write("      <div class=\"row align-items-center h-100\">\n");
      out.write("        <form class=\"col-lg-3 col-md-4 col-10 mx-auto text-center\" action = \"../user_log/login_ok.jsp\" method=\"post\">\n");
      out.write("          <a class=\"navbar-brand mx-auto mt-2 flex-fill text-center\" href=\"../main/main.jsp\">\n");
      out.write("            <svg version=\"1.1\" id=\"logo\" class=\"navbar-brand-img brand-md\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\" viewBox=\"0 0 120 120\" xml:space=\"preserve\">\n");
      out.write("              <g>\n");
      out.write("                <polygon class=\"st0\" points=\"78,105 15,105 24,87 87,87 	\" />\n");
      out.write("                <polygon class=\"st0\" points=\"96,69 33,69 42,51 105,51 	\" />\n");
      out.write("                <polygon class=\"st0\" points=\"78,33 15,33 24,15 87,15 	\" />\n");
      out.write("              </g>\n");
      out.write("            </svg>\n");
      out.write("          </a>\n");
      out.write("          <h1 class=\"h6 mb-3\">로그인</h1>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"inputEmail\" class=\"sr-only\">아이디</label>\n");
      out.write("            <input type=\"text\" name= \"user_id\"  id=\"inputEmail\" class=\"form-control form-control-lg\" placeholder=\"ID\" required=\"\" autofocus=\"\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"inputPassword\" class=\"sr-only\">비밀번호</label>\n");
      out.write("            <input type=\"password\" name=\"user_pwd\" id=\"inputPassword\" class=\"form-control form-control-lg\" placeholder=\"Password\" required=\"\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"checkbox mb-3\">\n");
      out.write("            <label>\n");
      out.write("              <input type=\"checkbox\" value=\"remember-me\"> 로그인 유지 </label>\n");
      out.write("          </div>\n");
      out.write("          <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">로그인 하기</button>\n");
      out.write("          <p class=\"mt-5 mb-3 text-muted\">&nbsp;</p>\n");
      out.write("          <div class=\"info\">\n");
      out.write("			<div class=\"btn-group\" role=\"group\" aria-label=\"Basic example\">\n");
      out.write("				<a href=\"main.jsp?pages=../user_log/findId\" role=\"button\" class=\"btn mb-2 btn-outline-link btn-link\" >아이디 찾기</a>\n");
      out.write("				<a href=\"main.jsp?pages=../user_log/findPw\" role=\"button\" class=\"btn mb-2 btn-outline-link btn-link\" >비밀번호 찾기</a>\n");
      out.write("				<a href=\"main.jsp?pages=../user_log/register\" role=\"button\" class=\"btn mb-2 btn-outline-link btn-link\" >회원 가입</a>\n");
      out.write("           </div>\n");
      out.write("          </div>\n");
      out.write("          <p class=\"mt-5 mb-3 text-muted\">© 2022 GREENSHOP</p>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script src=\"../js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../js/popper.min.js\"></script>\n");
      out.write("    <script src=\"../js/moment.min.js\"></script>\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../js/simplebar.min.js\"></script>\n");
      out.write("    <script src='../js/daterangepicker.js'></script>\n");
      out.write("    <script src='../js/jquery.stickOnScroll.js'></script>\n");
      out.write("    <script src=\"../js/tinycolor-min.js\"></script>\n");
      out.write("    <script src=\"../js/config.js\"></script>\n");
      out.write("    <script src=\"../js/apps.js\"></script>\n");
      out.write("    <script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-56159088-1\"></script>\n");
      out.write("    <script>\n");
      out.write("      window.dataLayer = window.dataLayer || [];\n");
      out.write("\n");
      out.write("      function gtag()\n");
      out.write("      {\n");
      out.write("        dataLayer.push(arguments);\n");
      out.write("      }\n");
      out.write("      gtag('js', new Date());\n");
      out.write("      gtag('config', 'UA-56159088-1');\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("</body>\n");
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