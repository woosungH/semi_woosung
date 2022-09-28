/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-26 08:13:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import order.OrderManageBean;
import order.OrderManageDBBean;

public final class order_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("order.OrderManageBean");
    _jspx_imports_classes.add("order.OrderManageDBBean");
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

	OrderManageDBBean omdb = OrderManageDBBean.getInstance();
	
	long o_dNum;
	int p_num, p_count, p_price;
	String o_num, o_dStat, refund, stat, pageNum, shipment;
	
	if(request.getParameter("pageNum") == null){
		pageNum = "1";
	} else {
		pageNum = request.getParameter("pageNum");
	}
	ArrayList<OrderManageBean> list = omdb.orderList(pageNum,"N");

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>document</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body class=\"vertical  dark  \">\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"row justify-content-center\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("              <h2 class=\"h3 mb-3 page-title\">주문 관리</h2>\r\n");
      out.write("              <div class=\"card shadow\">\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("              <div style=\"text-align: center;\">\r\n");
      out.write("              <table class=\"table table-borderless table-hover\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                  <tr role=\"row\">\r\n");
      out.write("                    <th>주문 상세 번호</th>\r\n");
      out.write("                    <th>주문 번호</th>\r\n");
      out.write("                    <th>상품 이름(번호)</th>\r\n");
      out.write("                    <th>수량</th>\r\n");
      out.write("                    <th>금액</th>\r\n");
      out.write("                    <th>주문 상태</th>\r\n");
      out.write("                    <th>운송장 번호</th>\r\n");
      out.write("                    <th>주문 수정</th>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("    ");

		for(int i=0; i < list.size(); i++) {
			OrderManageBean omb = list.get(i); // 배열에 넣은 역순으로 board 객체에 값을 넣어줌
			o_dNum = omb.getOrder_detail_number();
			o_num = omb.getOrder_number();
			p_num = omb.getProduct_number();
			p_count = omb.getProduct_count();
			p_price = omb.getProduct_price();
			o_dStat = omb.getOrder_detail_status();
			refund = omb.getRefund_check();
			
			omb = omdb.getOrder(o_dNum);
			String p_name = omb.getProduct_name();
			
			if(omb.getShipment() == null){
				shipment = "-";
			} else{
				shipment = omb.getShipment();
			}
			
			if(o_dStat.equals("입금 완료")){
				stat = URLEncoder.encode("입금 완료","UTF-8");
			} else if(o_dStat.equals("배송 준비")){
				stat = URLEncoder.encode("배송 준비","UTF-8");
			} else if(o_dStat.equals("배송중")){
				stat = URLEncoder.encode("배송중","UTF-8");
			} else if(o_dStat.equals("배송 완료")){
				stat = URLEncoder.encode("배송 완료","UTF-8");
			} else if(o_dStat.equals("구매 확정")){
				stat = URLEncoder.encode("구매 확정","UTF-8");
			}
	
      out.write("\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <td>");
      out.print(o_dNum);
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(o_num);
      out.write("</td>\r\n");
      out.write("					<td>\r\n");
      out.write("						<a href=\"#\">");
      out.print( p_name );
      out.write('(');
      out.print(p_num);
      out.write(")</a>\r\n");
      out.write("					</td>\r\n");
      out.write("					<td>");
      out.print( p_count );
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(p_price);
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(o_dStat);
      out.write("</td>\r\n");
      out.write("					<td>");
      out.print(shipment);
      out.write("</td>\r\n");
      out.write("					<td>\r\n");
      out.write("                      <div class=\"dropdown\">\r\n");
      out.write("                        <button class=\"btn btn-sm dropdown-toggle more-vertical\" type=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                          <span class=\"text-muted sr-only\">Action</span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                          <a class=\"dropdown-item\" href=\"adminIndex.jsp?pages=order_edit&o_dNum=");
      out.print( o_dNum);
      out.write("&o_dStat=");
      out.print(o_dStat);
      out.write("&pageNum=");
      out.print( pageNum );
      out.write("\">수정</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </td>\r\n");
      out.write("	");
		
			
		}
	
      out.write("\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("              </table>\r\n");
      out.write("               <nav aria-label=\"Table Paging\" class=\"mb-0 text-muted\">\r\n");
      out.write("	                 <ul class=\"pagination justify-content-center mb-0\">\r\n");
      out.write("	                 	");
      out.print( OrderManageBean.pageNumber(5,"order_list") );
      out.write("\r\n");
      out.write("	                 </ul>\r\n");
      out.write("               </nav>\r\n");
      out.write("	              </div>\r\n");
      out.write("	            </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div> <!-- .row -->\r\n");
      out.write("        </div> <!-- .container-fluid -->\r\n");
      out.write("    </div> <!-- .wrapper -->\r\n");
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
