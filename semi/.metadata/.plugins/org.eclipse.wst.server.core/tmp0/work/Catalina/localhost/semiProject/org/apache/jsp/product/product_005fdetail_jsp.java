/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-28 07:20:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.LikeDBBean;
import product.ProductBean;
import product.ProductDBBean;
import member.MemberBean;
import member.MemberDBBean;

public final class product_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("member.LikeDBBean");
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

	String id = (String)session.getAttribute("id");	
	int product_number = Integer.parseInt(request.getParameter("product_number"));
	ProductDBBean product = ProductDBBean.getInstance();	
	ProductBean get = product.getproduct(product_number, false);
	
	ProductBean img = product.getImg(product_number);
	
	String p_name = get.getProduct_name();
	int p_price = get.getProduct_price();
	int img_number = img.getFile_number();
	String p_desc = get.getProduct_desc();
	
	String file_name = img.getStored_file_name();
	
	LikeDBBean like = LikeDBBean.getInstance();

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>?????? ???????????????</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	*{\r\n");
      out.write("         list-style: none;\r\n");
      out.write("         padding: 0;\r\n");
      out.write("         margin: 0;\r\n");
      out.write("     }\r\n");
      out.write("     a{\r\n");
      out.write("         text-decoration: none;\r\n");
      out.write("         color: black;\r\n");
      out.write("         display: block;\r\n");
      out.write("     }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <div class=\"row justify-content-center\">\r\n");
      out.write("        <div class=\"col-12 col-lg-10 col-xl-8\">\r\n");
      out.write("          <div class=\"my-4\">\r\n");
      out.write("            <form method=\"post\" action=\"main.jsp?pages=../buy/buy_body&product_number=");
      out.print( product_number );
      out.write("\">\r\n");
      out.write("              <div class=\"row mt-5 align-items-center\">\r\n");
      out.write("                   <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/");
      out.print(file_name);
      out.write("\" alt=\"...\" class=\"col-md-8\">\r\n");
      out.write("                <div class=\"col-md-4\">\r\n");
      out.write("                    <div class=\"col\">\r\n");
      out.write("					 <h2 class=\"mb-2\">");
      out.print( p_name);
      out.write("</h2>\r\n");
      out.write("					 <input type=\"hidden\" value=\"");
      out.print( p_name);
      out.write("\" name=\"product_name\" />\r\n");
      out.write("					 <hr>\r\n");
      out.write("					 <div>\r\n");
      out.write("                      	<h4 class=\"mb-3\">???????????? : ");
      out.print( p_price );
      out.write("</h4>\r\n");
      out.write("						 <input type=\"hidden\" value=\"");
      out.print( p_price );
      out.write("\" name=\"product_price\" />\r\n");
      out.write("                      </div>\r\n");
      out.write("					 <hr>\r\n");
      out.write("                      <div style=\"height: 200;\">\r\n");
      out.write("                       <p class=\"text-muted\">?????? ?????? : ");
      out.print( p_desc );
      out.write("</p>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div style=\"text-align: center;\">\r\n");
      out.write("                      	??????&nbsp;&nbsp;&nbsp;&nbsp; \r\n");
      out.write("                      	<input style=\"text-align: center;\" type=\"number\" step=\"1\" min=\"1\" max=\"10\" value=\"1\" id=\"count\" name=\"product_count\">\r\n");
      out.write("                      </div>\r\n");
      out.write("					<div class=\"btn-box w-100 mt-1 mb-1\">\r\n");
      out.write("						<a href=\"../product/likeButton.jsp?product_number=");
      out.print(product_number);
      out.write("\" class=\"btn mb-2 btn-primary btn-lg btn-block\">\r\n");
      out.write("							");
 
								int re = like.likeCheck(id, product_number);
								if(re == 0) {
							
      out.write("\r\n");
      out.write("								<i class=\"fe fe-heart fe-12 mx-2\" style=\"color: red;\"></i>\r\n");
      out.write("								\r\n");
      out.write("							");
 
								}else {
							
      out.write("\r\n");
      out.write("								<i class=\"fe fe-heart fe-12 mx-2\" style=\"color: white;\"></i>\r\n");
      out.write("							");
 
								}
							
      out.write("\r\n");
      out.write("							<span class=\"small\">LIKE</span>\r\n");
      out.write("						</a>\r\n");
      out.write("					 </div>\r\n");
      out.write("					 <div class=\"btn-box w-100 mt-1 mb-1\">\r\n");
      out.write("						<a href=\"#\" target=\"_blank\" class=\"btn mb-2 btn-primary btn-lg btn-block\" onclick=\"count()\">\r\n");
      out.write("							<i class=\"fe fe-shopping-cart fe-12 mx-2\"></i><span class=\"small\">????????????</span>\r\n");
      out.write("						</a>\r\n");
      out.write("					 </div>\r\n");
      out.write("					 <div class=\"btn-box w-100 mb-1\">\r\n");
      out.write("						<input type=\"submit\" value=\"??????\" id=\"order\" class=\"btn mb-2 btn-secondary btn-lg btn-block\" />\r\n");
      out.write("					 </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <hr class=\"my-4\">\r\n");
      out.write("            </form>\r\n");
      out.write("          </div> <!-- /.card-body -->\r\n");
      out.write("  </div> <!-- /.col-12 -->\r\n");
      out.write("</div> <!-- .row -->\r\n");
      out.write("</div> <!-- .container-fluid -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function count(){\r\n");
      out.write("		var count = document.getElementById(\"count\").value;\r\n");
      out.write("		location.href=\"main.jsp?pages=../cart/cartOk&product_number=");
      out.print(product_number);
      out.write("&count=\"+count;\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
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
