/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-27 05:17:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user_005flog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

	request.setCharacterEncoding("utf-8");

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\">\n");
      out.write("    <title>회원가입</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/simplebar.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Overpass:ital,wght@0,100;0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/feather.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/daterangepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/app-light.css\" id=\"lightTheme\">\n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("    .form-group1 {width: 50%; margin-bottom: 15px;}\n");
      out.write("    .form-row1 {margin-right: -5px;  }\n");
      out.write("    .form-row1 ul {list-style: none; display: flex; justify-content: flex;}\n");
      out.write("    .form-row1 ul li{margin-right: 3%;}\n");
      out.write("    .form-row1 ul li:first-child {list-style: none; width: 20%; }\n");
      out.write("    .row.mb-4{ margin-bottom: 5px;}\n");
      out.write("    input#sample4_postcode{width: 50%; display: inline-block; margin-right: 20px; margin-bottom: 10px;}\n");
      out.write("    input#sample4_roadAddress {margin-bottom: 10px;}\n");
      out.write("    #juso{height: 28px; font-size: 12px; background-color: #1B68FF; border-color: #1B68FF; border-radius: 3px; color: white;\n");
      out.write("    font-family: sans-serif;}\n");
      out.write("  </style>\n");
      out.write("  <script type=\"text/javascript\" src=\"script.js\" charset=\"utf-8\"></script>\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\n");
      out.write("<script>\n");
      out.write("    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.\n");
      out.write("    function sample4_execDaumPostcode() {\n");
      out.write("        new daum.Postcode({\n");
      out.write("            oncomplete: function(data) {\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\n");
      out.write("\n");
      out.write("                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\n");
      out.write("                var roadAddr = data.roadAddress; // 도로명 주소 변수\n");
      out.write("                var extraRoadAddr = ''; // 참고 항목 변수\n");
      out.write("\n");
      out.write("                // 법정동명이 있을 경우 추가한다. (법정리는 제외)\n");
      out.write("                // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\n");
      out.write("                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\n");
      out.write("                    extraRoadAddr += data.bname;\n");
      out.write("                }\n");
      out.write("                // 건물명이 있고, 공동주택일 경우 추가한다.\n");
      out.write("                if(data.buildingName !== '' && data.apartment === 'Y'){\n");
      out.write("                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);\n");
      out.write("                }\n");
      out.write("                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\n");
      out.write("                if(extraRoadAddr !== ''){\n");
      out.write("                    extraRoadAddr = ' (' + extraRoadAddr + ')';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\n");
      out.write("                document.getElementById('sample4_postcode').value = data.zonecode;\n");
      out.write("                document.getElementById(\"sample4_roadAddress\").value = roadAddr;\n");
      out.write("                document.getElementById(\"sample4_jibunAddress\").value = data.jibunAddress;\n");
      out.write("                \n");
      out.write("                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.\n");
      out.write("                if(roadAddr !== ''){\n");
      out.write("                    document.getElementById(\"sample4_extraAddress\").value = extraRoadAddr;\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById(\"sample4_extraAddress\").value = '';\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var guideTextBox = document.getElementById(\"guide\");\n");
      out.write("                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.\n");
      out.write("                if(data.autoRoadAddress) {\n");
      out.write("                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;\n");
      out.write("                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';\n");
      out.write("                    guideTextBox.style.display = 'block';\n");
      out.write("\n");
      out.write("                } else if(data.autoJibunAddress) {\n");
      out.write("                    var expJibunAddr = data.autoJibunAddress;\n");
      out.write("                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';\n");
      out.write("                    guideTextBox.style.display = 'block';\n");
      out.write("                } else {\n");
      out.write("                    guideTextBox.innerHTML = '';\n");
      out.write("                    guideTextBox.style.display = 'none';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }).open();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("  <body class=\"light \">\n");
      out.write("      <div class=\"row align-items-center h-100\">\n");
      out.write("        <form class=\"col-lg-6 col-md-8 col-10 mx-auto\" name=\"reg_frm\" action=\"main.jsp?pages=../user_log/registerOk\" method=\"post\">\n");
      out.write("          <div class=\"mx-auto text-center my-4\">\n");
      out.write("            <a class=\"navbar-brand mx-auto mt-2 flex-fill text-center\" href=\"./index.html\">\n");
      out.write("              <svg version=\"1.1\" id=\"logo\" class=\"navbar-brand-img brand-md\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\" viewBox=\"0 0 120 120\" xml:space=\"preserve\">\n");
      out.write("                <g>\n");
      out.write("                  <polygon class=\"st0\" points=\"78,105 15,105 24,87 87,87 	\" />\n");
      out.write("                  <polygon class=\"st0\" points=\"96,69 33,69 42,51 105,51 	\" />\n");
      out.write("                  <polygon class=\"st0\" points=\"78,33 15,33 24,15 87,15 	\" />\n");
      out.write("                </g>\n");
      out.write("              </svg>\n");
      out.write("            </a>\n");
      out.write("            <h2 class=\"my-3\">회원가입</h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row mb-12\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"ID\"><strong>ID</strong></label>\n");
      out.write("	            <input type=\"text\" class=\"form-control\" id=\"ID\" name=\"user_id\" placeholder=\"4자리 이상 입력해주세요.\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-row\">\n");
      out.write("              <div class=\"form-group col-md-6\">\n");
      out.write("                <label for=\"inputPassword5\"><strong>비밀번호</strong></label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"inputPassword5\" name=\"user_pwd\"  placeholder=\"4자리 이상 입력해주세요.\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group col-md-6\">\n");
      out.write("                <label for=\"inputPassword6\"><strong>비밀번호 확인</strong></label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"inputPassword6\" name=\"user_pwdch\"  placeholder=\"비밀번호와 같은 값을 입력하세요.\">\n");
      out.write("              </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"inputPassword6\"><strong>이름</strong></label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"user_name\"  placeholder=\"예) 홍길동\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-row\">\n");
      out.write("	          <div class=\"col-md-2 mb-3\">\n");
      out.write("	            <label for=\"phone1\"><strong>전화번호</strong></label>\n");
      out.write("	            <input type=\"text\" class=\"form-control\" id=\"validationCustom01\" name=\"user_phone1\" maxlength=\"3\" required placeholder=\"ex) 010\">\n");
      out.write("	          </div>\n");
      out.write("	          <div class=\"col-md-2 mb-3\">\n");
      out.write("	            <label for=\"phone2\"> &nbsp;   &nbsp;   &nbsp; </label>\n");
      out.write("	            <input type=\"text\" class=\"form-control\" id=\"validationCustom02\" name=\"user_phone2\" maxlength=\"4\" required placeholder=\"1234\">\n");
      out.write("	          </div>\n");
      out.write("	          <div class=\"col-md-2 mb-3\">\n");
      out.write("	            <label for=\"phone3\"> &nbsp;   &nbsp;   &nbsp; </label>\n");
      out.write("	            <input type=\"text\" class=\"form-control\" id=\"validationCustom02\" name=\"user_phone3\" maxlength=\"4\" required placeholder=\"5678\">\n");
      out.write("	          </div>\n");
      out.write("          <div class=\"form-group col-md-6\">\n");
      out.write("            <label for=\"inputEmail4\"><strong>이메일</strong></label>\n");
      out.write("            <input type=\"email\" class=\"form-control\" id=\"inputEmail4\" name=\"user_email\" placeholder=\"example@example.com\">\n");
      out.write("          </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-row1\">\n");
      out.write("            <label for=\"sample4_postcode\"><strong>주소</strong></label>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("              <input type=\"text\" class=\"form-control\" aria-label=\"Recipient's username\" aria-describedby=\"button-addon2\" name=\"user_pcode\" id=\"sample4_postcode\"  placeholder=\"우편번호\" >\n");
      out.write("              <div class=\"input-group-append\">\n");
      out.write("                <button class=\"btn btn-primary\" type=\"button\" onclick=\"sample4_execDaumPostcode()\" id=\"juso\">우편번호 찾기</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"user_raddr\" id=\"sample4_roadAddress\" placeholder=\"도로명주소\">\n");
      out.write("            <input type=\"hidden\" name=\"user_jibun\" id=\"sample4_jibunAddress\" placeholder=\"지번주소\">\n");
      out.write("            <span id=\"guide\" style=\"color:#999;display:none\"></span>\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"user_detailaddr\" id=\"sample4_detailAddress\" placeholder=\"상세주소\">\n");
      out.write("            <input type=\"hidden\" id=\"sample4_extraAddress\" placeholder=\"참고항목\">\n");
      out.write("          </div>\n");
      out.write("          <hr class=\"my-4\">\n");
      out.write("          <button class=\"btn btn-lg btn-primary btn-block\" onclick=\"check_ok()\">가입완료</button>\n");
      out.write("          <p class=\"mt-5 mb-3 text-muted text-center\">© 2022 GREENSHOP</p>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
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
      out.write("    <!-- Global site tag (gtag.js) - Google Analytics -->\n");
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
      out.write("    \n");
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
