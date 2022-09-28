/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-22 02:20:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import login.MemberBean;
import java.util.ArrayList;
import login.MemberDBBean;

public final class listMember_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("login.MemberBean");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("login.MemberDBBean");
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
      login.MemberBean member = null;
      member = (login.MemberBean) _jspx_page_context.getAttribute("member", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (member == null){
        member = new login.MemberBean();
        _jspx_page_context.setAttribute("member", member, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

	String pageNum = request.getParameter("pageNum");//
	String s_user_id="";
	
	if(pageNum == null){
		pageNum = "1";
	}
	
	if(request.getParameter("search_user_id")!=null){
		s_user_id = request.getParameter("search_user_id");
	} 
	MemberBean.s_user_id = s_user_id;
	
	MemberDBBean memberDB = MemberDBBean.getInstance();
	ArrayList<MemberBean> memberList = memberDB.listMember(pageNum,s_user_id);
	ArrayList<Integer> n_numbers = new ArrayList<>();
	
	String user_id, user_pwd, user_name, user_phone1, user_phone2, user_phone3, user_email
		, user_pcode, user_raddr, user_jibun, user_detailaddr;
	Timestamp user_regdate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"script.js?a=b\"></script>\r\n");
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
      out.write("    <link rel=\"stylesheet\" href=\"css/app-dark.css?\" id=\"darkTheme\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h3>회원 관리</h3>\r\n");
      out.write("	<div style=\"text-align: right;\">\r\n");
      out.write("	<form method=\"post\" action=\"adminIndex.jsp?pages=listMember&pageNum=");
      out.print( pageNum );
      out.write("\" style=\"margin: 20px;\">\r\n");
      out.write("		<input type=\"text\" name=\"search_user_id\">\r\n");
      out.write("		<input class=\"btn btn-primary\" type=\"submit\" value=\"검색\">\r\n");
      out.write("	</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div style=\"text-align: center;\">\r\n");
      out.write("	<table class=\"table table-bordered table-hover mb-0\" border=\"1\" style=\"margin: 0 auto; width:90%; cellspacing:0;\">\r\n");
      out.write("		<tr height=\"25\" style=\"background-color: #343a40\">\r\n");
      out.write("			<th width=\"40\" align=\"center\">ID</th>\r\n");
      out.write("			<th width=\"100\" align=\"center\">이름</th>\r\n");
      out.write("			<th width=\"180\" align=\"center\">전화번호</th>\r\n");
      out.write("			<th width=\"140\" align=\"center\">이메일</th>\r\n");
      out.write("			<th width=\"180\" align=\"center\">가입일</th>\r\n");
      out.write("			<th width=\"250\" align=\"center\">주소</th>\r\n");
      out.write("			<th width=\"140\" align=\"center\">탈퇴</th>\r\n");
      out.write("		</tr>\r\n");

	for(int i=0; i<memberList.size();i++){
		member = memberList.get(i);
		
		user_id = member.getUser_id();
		user_pwd=member.getUser_pwd();
		user_name=member.getUser_name();
		user_phone1=member.getUser_phone1();
		user_phone2=member.getUser_phone2();
		user_phone3=member.getUser_phone3();
		user_email=member.getUser_email();
		user_pcode=member.getUser_pcode();
		user_raddr=member.getUser_raddr();
		user_jibun=member.getUser_jibun();
		user_detailaddr=member.getUser_detailaddr();
		user_regdate=member.getUser_regdate();
		
		
      out.write("\r\n");
      out.write("		<tr height=\"25\" style=\"background-color: #343a40\"\r\n");
      out.write("			onmouseover=\"this.style.backgroundColor='#454b51'\"\r\n");
      out.write("			onmouseout=\"this.style.backgroundColor='#343a40'\">\r\n");
      out.write("			<td  align=\"center\">");
      out.print( user_id);
      out.write("</td>\r\n");
      out.write("			<td  align=\"center\" style=\"text-align: left\">\r\n");
      out.write("				<a href=\"showMember.jsp?user_id=");
      out.print( user_id );
      out.write("&pageNum=");
      out.print( pageNum );
      out.write("\">\r\n");
      out.write("					");
      out.print( user_name );
      out.write("\r\n");
      out.write("				</a>\r\n");
      out.write("			</td>\r\n");
      out.write("			<td  align=\"center\">\r\n");
      out.write("				");
      out.print( user_phone1 );
      out.write('-');
      out.print( user_phone2 );
      out.write('-');
      out.print( user_phone3 );
      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("			<td  align=\"center\">\r\n");
      out.write("				");
      out.print( user_email );
      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("			<td  align=\"center\">\r\n");
      out.write("				");
      out.print( sdf.format(user_regdate) );
      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("			<td  align=\"center\">\r\n");
      out.write("				우편번호 : ");
      out.print( user_pcode );
      out.write(" <br>\r\n");
      out.write("				도 로 명 : ");
      out.print( user_raddr );
      out.write(" <br>\r\n");
      out.write("				지     번 : ");
      out.print( user_jibun );
      out.write(" <br>\r\n");
      out.write("				상세주소 : ");
      out.print( user_detailaddr );
      out.write("\r\n");
      out.write("			</td>\r\n");
      out.write("			<td  align=\"center\">\r\n");
      out.write("				<form method=\"post\" action=\"deleteM_ok.jsp?user_id=");
      out.print(user_id);
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("\" name=\"del_frm\">\r\n");
      out.write("					<input type=\"submit\" onclick=\"exitCheck()\" value=\"탈퇴\" name=\"send\">\r\n");
      out.write("				</form>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");
      out.write("		");

	}
	memberList.clear();

      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("	");
      out.print( MemberBean.pageNumber(5) );
      out.write("\r\n");
      out.write("	</div>\r\n");
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
