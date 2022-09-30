/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-26 08:36:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.buy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import product.ProductBean;
import product.ProductDBBean;
import member.MemberBean;
import member.MemberDBBean;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("member.MemberDBBean");
    _jspx_imports_classes.add("product.ProductBean");
    _jspx_imports_classes.add("product.ProductDBBean");
    _jspx_imports_classes.add("member.MemberBean");
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

	if(session.getAttribute("Member") == null){ 
	// member가 null(초기화)되면  main으로 들어갈 수 없게 
	// jsp:forward로 login으로 돌아감.

      out.write("\r\n");
      out.write("		");
      if (true) {
        _jspx_page_context.forward("main.jsp?pages=../login/login");
        return;
      }
      out.write('\r');
      out.write('\n');

	}

      out.write('\r');
      out.write('\n');

	String id = (String)session.getAttribute("id"); // 타입을 맞도록 해야함.
	String name = (String)session.getAttribute("name");
	
	MemberDBBean member = MemberDBBean.getInstance();
	MemberBean mb = member.getMember(id);
	ProductDBBean pdb = ProductDBBean.getInstance();
	
	String phone1 = mb.getUser_phone1();
	String phone2 = mb.getUser_phone2();
	String phone3 = mb.getUser_phone3();
	String email = mb.getUser_email();
	String pcode = mb.getUser_pcode();
	String raddr = mb.getUser_raddr();
	String jibun = mb.getUser_jibun();
	String detailaddr = mb.getUser_detailaddr();
	
	String p_name = request.getParameter("product_name");
    int p_num = Integer.parseInt(request.getParameter("product_number"));
    int count = Integer.parseInt(request.getParameter("product_count"));
    int price = Integer.parseInt(request.getParameter("product_price"))*count;
    int ship;
    if(price>=20000){
    	ship = 0;
    } else {
    	ship = 3000;
    }
    int totalPrice = price+ship;
    String address = raddr+detailaddr;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>결제</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("	  <div class=\"row justify-content-center\">\r\n");
      out.write("	    <div class=\"col-12\">\r\n");
      out.write("	      <h2 class=\"page-title\" style=\"text-align: center;\">주문서</h2>\r\n");
      out.write("	      <div class=\"row\">\r\n");
      out.write("	       <div class=\"col-md-6\" style=\"margin: 0 auto;\">\r\n");
      out.write("	         <div class=\"card shadow mb-4\">\r\n");
      out.write("	           <div class=\"card-body\">\r\n");
      out.write("	             <form class=\"needs-validation\" method=\"post\" action=\"main.jsp?pages=../buy/kakao\" name=\"order_frm\">\r\n");
      out.write("				<table class=\"table table-bordered\">\r\n");
      out.write("					<thead>\r\n");
      out.write("					  <tr role=\"row\">\r\n");
      out.write("					    <th>상품정보</th>\r\n");
      out.write("					    <th>수량</th>\r\n");
      out.write("					    <th>배송비</th>\r\n");
      out.write("					    <th>주문금액</th>\r\n");
      out.write("					  </tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("					<tbody>\r\n");
      out.write("					  <tr>\r\n");
      out.write("					    <td>\r\n");
      out.write("	                   		<input type=\"text\" class=\"form-control\" value=\"");
      out.print( p_name );
      out.write("\" name=\"p_name\" readonly>		\r\n");
      out.write("	                   		<input type=\"hidden\" class=\"form-control\" value=\"");
      out.print( p_num );
      out.write("\" name=\"p_num\" readonly>		\r\n");
      out.write("					    </td>\r\n");
      out.write("					    <td>\r\n");
      out.write("					    	<input type=\"number\" class=\"form-control\" id=\"count\" value=\"");
      out.print( count );
      out.write("\" min=\"1\" name=\"count\" onchange=\"priceCal()\">\r\n");
      out.write("					    	<input type=\"hidden\" class=\"form-control\" id=\"ori_count\" value=\"");
      out.print( count );
      out.write("\" readonly>\r\n");
      out.write("					    </td>\r\n");
      out.write("					    <td>\r\n");
      out.write("					    	<input type=\"text\" class=\"form-control\" id=\"ship\" value=\"");
      out.print( ship );
      out.write("\" readonly>\r\n");
      out.write("					    </td>\r\n");
      out.write("					    <td>\r\n");
      out.write("					   		<input type=\"text\" class=\"form-control\" id=\"price\" value=\"");
      out.print( price );
      out.write("\" name=\"price\" readonly>\r\n");
      out.write("					   		<input type=\"hidden\" class=\"form-control\" id=\"ori_price\" value=\"");
      out.print( price );
      out.write("\" readonly>\r\n");
      out.write("					    </td>\r\n");
      out.write("					  </tr>\r\n");
      out.write("					</tbody>\r\n");
      out.write("					<tbody>\r\n");
      out.write("					  <tr>\r\n");
      out.write("					    <td colspan=\"2\">총 금액</td>\r\n");
      out.write("					    <td colspan=\"2\">\r\n");
      out.write("					   		<input type=\"text\" class=\"form-control\" id=\"totalPrice\" value=\"");
      out.print( totalPrice );
      out.write("\" name=\"totalPrice\" readonly>\r\n");
      out.write("					    </td>\r\n");
      out.write("					  </tr>\r\n");
      out.write("					</tbody>\r\n");
      out.write("				 </table>\r\n");
      out.write("	               <div class=\"form-row\">\r\n");
      out.write("	                 <div class=\"col-md-4 mb-3\">\r\n");
      out.write("	                   <label for=\"validationCustom3\">수령인</label>\r\n");
      out.write("	                   <input type=\"text\" class=\"form-control\" id=\"validationCustom3\" value=\"");
      out.print( name );
      out.write("\" name=\"name\" required>\r\n");
      out.write("	                   <div class=\"invalid-feedback\"> 수령인을 입력해주세요. </div>\r\n");
      out.write("	                 </div>\r\n");
      out.write("	               </div> <!-- /.form-row -->\r\n");
      out.write("	               <div class=\"form-row\">\r\n");
      out.write("	                 <div class=\"col-md-2 mb-3\">\r\n");
      out.write("	                   <label for=\"custom-phone\">연락처</label>\r\n");
      out.write("	                   <input class=\"form-control\" id=\"custom-phone\" value=\"");
      out.print( phone1 );
      out.write("\" name=\"phone1\" required>\r\n");
      out.write("	                   <div class=\"invalid-feedback\"> 연락처를 입력해주세요. </div>\r\n");
      out.write("	                 </div>\r\n");
      out.write("	                 <div class=\"col-md-3 mb-3\">\r\n");
      out.write("	                   <label for=\"custom-phone\">&nbsp;</label>\r\n");
      out.write("	                   <input class=\"form-control\" id=\"custom-phone\" value=\"");
      out.print( phone2 );
      out.write("\" name=\"phone2\" required>\r\n");
      out.write("	                   <div class=\"invalid-feedback\"> 연락처를 입력해주세요. </div>\r\n");
      out.write("	                 </div>\r\n");
      out.write("	                 <div class=\"col-md-3 mb-3\">\r\n");
      out.write("	                   <label for=\"custom-phone\">&nbsp;</label>\r\n");
      out.write("	                   <input class=\"form-control\" id=\"custom-phone\" value=\"");
      out.print( phone3 );
      out.write("\" name=\"phone3\" required>\r\n");
      out.write("	                   <div class=\"invalid-feedback\"> 연락처를 입력해주세요. </div>\r\n");
      out.write("	                 </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("	               <div class=\"form-row\">\r\n");
      out.write("	                 <div class=\"col-md-8 mb-3\">\r\n");
      out.write("	                   <label for=\"exampleInputEmail2\">이메일</label>\r\n");
      out.write("	                   <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail2\" aria-describedby=\"emailHelp1\" value=\"");
      out.print( email );
      out.write("\" name=\"email\" required>\r\n");
      out.write("	                   <div class=\"invalid-feedback\"> 이메일주소를 입력해주세요. </div>\r\n");
      out.write("	                 </div>\r\n");
      out.write("	               </div> <!-- /.form-row -->\r\n");
      out.write("	               <div class=\"form-row1\">\r\n");
      out.write("		            <label for=\"sample4_postcode\"><strong>주소</strong></label>\r\n");
      out.write("		            <br>\r\n");
      out.write("		            <div class=\"input-group\">\r\n");
      out.write("		              <input type=\"text\" class=\"form-control\" aria-label=\"Recipient's username\" aria-describedby=\"button-addon2\" name=\"pcode\" id=\"sample4_postcode\" value=\"");
      out.print( pcode );
      out.write("\" >\r\n");
      out.write("		              <div class=\"input-group-append\">\r\n");
      out.write("		                <button class=\"btn btn-primary\" type=\"button\" onclick=\"sample4_execDaumPostcode()\" id=\"juso\">우편번호 찾기</button>\r\n");
      out.write("		              </div>\r\n");
      out.write("		            </div>\r\n");
      out.write("		            <input type=\"text\" class=\"form-control\" name=\"raddr\" id=\"sample4_roadAddress\" value=\"");
      out.print( raddr );
      out.write("\">\r\n");
      out.write("		            <input type=\"hidden\" name=\"jibun\" id=\"sample4_jibunAddress\" value=\"");
      out.print( jibun );
      out.write("\">\r\n");
      out.write("		            <span id=\"guide\" style=\"color:#999;display:none\"></span>\r\n");
      out.write("		            <input type=\"text\" class=\"form-control\" name=\"detailaddr\" id=\"sample4_detailAddress\" value=\"");
      out.print( detailaddr );
      out.write("\">\r\n");
      out.write("		            <input type=\"hidden\" id=\"sample4_extraAddress\" placeholder=\"참고항목\">\r\n");
      out.write("		          </div>\r\n");
      out.write("	               <button class=\"btn btn-primary\" type=\"submit\">결제하기</button>\r\n");
      out.write("	             </form>\r\n");
      out.write("	           </div> <!-- /.card-body -->\r\n");
      out.write("	         </div> <!-- /.card -->\r\n");
      out.write("	       </div> <!-- /.col -->\r\n");
      out.write("	     </div> <!-- end section -->\r\n");
      out.write("	   </div> <!-- /.col-12 col-lg-10 col-xl-10 -->\r\n");
      out.write("	 </div> <!-- .row -->\r\n");
      out.write("	</div> <!-- .container-fluid -->\r\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.\r\n");
      out.write("    function sample4_execDaumPostcode() {\r\n");
      out.write("        new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                var roadAddr = data.roadAddress; // 도로명 주소 변수\r\n");
      out.write("                var extraRoadAddr = ''; // 참고 항목 변수\r\n");
      out.write("\r\n");
      out.write("                // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                    extraRoadAddr += data.bname;\r\n");
      out.write("                }\r\n");
      out.write("                // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                }\r\n");
      out.write("                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                if(extraRoadAddr !== ''){\r\n");
      out.write("                    extraRoadAddr = ' (' + extraRoadAddr + ')';\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                document.getElementById('sample4_postcode').value = data.zonecode;\r\n");
      out.write("                document.getElementById(\"sample4_roadAddress\").value = roadAddr;\r\n");
      out.write("                document.getElementById(\"sample4_jibunAddress\").value = data.jibunAddress;\r\n");
      out.write("                \r\n");
      out.write("                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.\r\n");
      out.write("                if(roadAddr !== ''){\r\n");
      out.write("                    document.getElementById(\"sample4_extraAddress\").value = extraRoadAddr;\r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById(\"sample4_extraAddress\").value = '';\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                var guideTextBox = document.getElementById(\"guide\");\r\n");
      out.write("                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.\r\n");
      out.write("                if(data.autoRoadAddress) {\r\n");
      out.write("                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;\r\n");
      out.write("                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';\r\n");
      out.write("                    guideTextBox.style.display = 'block';\r\n");
      out.write("\r\n");
      out.write("                } else if(data.autoJibunAddress) {\r\n");
      out.write("                    var expJibunAddr = data.autoJibunAddress;\r\n");
      out.write("                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';\r\n");
      out.write("                    guideTextBox.style.display = 'block';\r\n");
      out.write("                } else {\r\n");
      out.write("                    guideTextBox.innerHTML = '';\r\n");
      out.write("                    guideTextBox.style.display = 'none';\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*주문 수량을 변경하면 가격이 자동으로 설정되는 스크립트*/\r\n");
      out.write("function priceCal(){\r\n");
      out.write("	var ori_count = document.getElementById(\"ori_count\").value;\r\n");
      out.write("	var count = document.getElementById(\"count\").value;\r\n");
      out.write("	var one_price = document.getElementById(\"ori_price\").value/ori_count;\r\n");
      out.write("	document.getElementById(\"price\").value = (parseInt(count) * parseInt(one_price));\r\n");
      out.write("	\r\n");
      out.write("	if ((parseInt(count) * parseInt(one_price)) >= 20000 ) {\r\n");
      out.write("		document.getElementById(\"ship\").value = 0;\r\n");
      out.write("	} else {\r\n");
      out.write("		document.getElementById(\"ship\").value = 3000;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	document.getElementById(\"totalPrice\").value = Number(document.getElementById(\"ship\").value) + Number(document.getElementById(\"price\").value);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
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