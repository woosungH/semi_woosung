/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-28 08:50:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import order.OrderManageBean;
import java.util.ArrayList;
import order.OrderManageDBBean;

public final class order_005fbody_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("order.OrderManageBean");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	String id = (String)session.getAttribute("id");
	String pageNum = request.getParameter("pageNum");
	if(pageNum==null){
		pageNum = "1";
	}
	String orderStat = request.getParameter("orderStat");
	String pages = "";
	if(request.getParameter("pages")!=null){
		pages = request.getParameter("pages");		
	} else{
		pages = "main_body";
	}
	if(id == null){

      out.write("\n");
      out.write("		<script>\n");
      out.write("			alert(\"로그인이 필요한 페이지입니다.\");\n");
      out.write("			location.href=\"main.jsp?pages=../user_log/login\"\n");
      out.write("		</script>\n");

	}
	OrderManageDBBean omdb = OrderManageDBBean.getInstance();
	long o_dNum;
	int p_num, p_count, p_price;
	String o_num, o_dStat, refund, stat, shipment;
	/* ArrayList<OrderManageBean> list = omdb.orderList(pageNum); */
	ArrayList<OrderManageBean> list = omdb.getDetail(pageNum,id);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Order progress</title>\n");
      out.write("  </head>\n");
      out.write("  <body class=\"vertical  light  \">\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"row justify-content-center\">\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <!-- Small table -->\n");
      out.write("                <div class=\"col-md-12 my-4\">\n");
      out.write("                  <h2 class=\"h4 mb-1\">배송상품 및 결제내역</h2>\n");
      out.write("                  <p class=\"mb-3\">배송상태 및 결제내역을 확인하세요.</p>\n");
      out.write("                  <div class=\"card shadow\">\n");
      out.write("                    <div class=\"card-body\" style=\"text-align:center;\">\n");
      out.write("                      <!-- table -->\n");
      out.write("                      <table class=\"table table-borderless table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                          <tr>\n");
      out.write("                            <th>주문 상세 번호</th>\n");
      out.write("                            <th>제품이름</th>\n");
      out.write("                            <th>수량(가격)</th>\n");
      out.write("                            <th>수령자</th>\n");
      out.write("                            <th>수령자 번호</th>\n");
      out.write("                            <th>수령지</th>\n");
      out.write("                            <th>주문 상태(운송장)</th>\n");
      out.write("                            <th>주문날짜</th>\n");
      out.write("                            <th>Action</th>\n");
      out.write("                          </tr>\n");
      out.write("                        </thead>\n");
      out.write("          ");

          		for(int i=0; i < list.size(); i++) {
        			OrderManageBean omb = list.get(i); // 배열에 넣은 역순으로 board 객체에 값을 넣어줌
        			o_dNum = omb.getOrder_detail_number();
        			System.out.println(o_dNum);
        			o_num = omb.getOrder_number();
        			p_num = omb.getProduct_number();
        			p_count = omb.getProduct_count();
        			p_price = omb.getProduct_price();
        			o_dStat = omb.getOrder_detail_status();
        			
        			omb = omdb.getOrder(o_dNum);
        			String p_name = omb.getProduct_name();
        			String r_name = omb.getReceiver_name();
        			String raddr = omb.getReceiver_raddr();
        			String detailaddr = omb.getReceiver_detailaddr();
        			String phone = omb.getReceiver_phone1()+"-"+omb.getReceiver_phone2()+"-"+omb.getReceiver_phone3();
        			String u_id = omb.getUser_id();
        			String date = sdf.format(omb.getOrder_date());
        			if(omb.getShipment() == null){
        				shipment = "-";
        			} else{
        				shipment = omb.getShipment();
        			}
        			
        			if(shipment == null){
        				shipment = "-";
        			}
        			if(u_id.equals(id)){
        	
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                          <tr>\n");
      out.write("                            <td>\n");
      out.write("                              <p class=\"mb-0 text-muted\"><strong>");
      out.print( o_dNum );
      out.write("</strong></p>\n");
      out.write("                              <!-- 주문상세번호 가져오기 -->\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                              <p class=\"mb-0 text-muted\"><strong>");
      out.print( p_name );
      out.write("</strong></p>\n");
      out.write("                              <!-- 제품명 가져오기 -->\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                              <p class=\"mb-0 text-muted\"><strong>");
      out.print( p_count );
      out.write('(');
      out.print( p_price );
      out.write(")</strong></p>\n");
      out.write("                              <!-- 수량(가격) 가져오기 -->\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                              <p class=\"mb-0 text-muted\">");
      out.print( r_name );
      out.write("</p>\n");
      out.write("                              <!-- 이름 가져오기-->\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                              <p class=\"mb-0 text-muted\">");
      out.print( phone );
      out.write("</p>\n");
      out.write("                              <!-- 번호 가져오기-->\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                              <p class=\"mb-0 text-muted\">");
      out.print( raddr );
      out.write("<br />");
      out.print( detailaddr );
      out.write("</p>\n");
      out.write("                              <!-- 주소 가져오기 -->\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                              <p class=\"mb-0 text-muted\">");
      out.print( o_dStat );
      out.write("<br />(");
      out.print( shipment );
      out.write(")</p>\n");
      out.write("                              <!-- 주문 상태 운송장번호 가져오기 -->\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                              <p class=\"mb-0 text-muted\"><a href=\"#\" class=\"text-muted\">");
      out.print( date );
      out.write("</a></p>\n");
      out.write("                              <!-- 주문 날짜 가져오기 -->\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                            <button class=\"btn btn-sm dropdown-toggle more-horizontal\" type=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"text-muted sr-only\">Action</span>\n");
      out.write("                              </button>\n");
      out.write("                              ");
if(!o_dStat.equals("환불 완료")) {
      out.write("\n");
      out.write("                              <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                             	 ");
 
                                if(!o_dStat.equals("구매 확정")) {
                                
      out.write("\n");
      out.write("                                <a class=\"dropdown-item\" href=\"main.jsp?pages=../order/order_edit&o_dNum=");
      out.print( o_dNum );
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("\">배송지 변경</a>\n");
      out.write("                                ");
} 
      out.write("\n");
      out.write("                                <a class=\"dropdown-item\" href=\"../order/order_change.jsp?o_num=");
      out.print( o_num );
      out.write("&change=true&pageNum=");
      out.print(pageNum);
      out.write("\">환불요청</a>\n");
      out.write("                                ");
 
                                if(!o_dStat.equals("구매 확정")) {
                                
      out.write("\n");
      out.write("                                <a class=\"dropdown-item\" href=\"../order/order_change.jsp?o_num=");
      out.print( o_num );
      out.write("&change=false&pageNum=");
      out.print(pageNum);
      out.write("\">구매확정</a>\n");
      out.write("                                ");

                                		}
                              		}
                                
      out.write("\n");
      out.write("                              </div>\n");
      out.write("                            </td>\n");
      out.write("                          </tr>\n");
      out.write("                        </tbody>\n");
      out.write("            ");

        			}
				}
            
      out.write("\n");
      out.write("                      </table>\n");
      out.write("                      <nav aria-label=\"Table Paging\" class=\"mb-0 text-muted\">\n");
      out.write("		                 <ul class=\"pagination justify-content-center mb-0\">\n");
      out.write("		                 	");
      out.print( OrderManageBean.pageNumber(5) );
      out.write("\n");
      out.write("		                 </ul>\n");
      out.write("              		 </nav>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div> <!-- customized table -->\n");
      out.write("              </div> <!-- end section -->\n");
      out.write("            </div> <!-- .col-12 -->\n");
      out.write("          </div> <!-- .row -->\n");
      out.write("        </div> <!-- .container-fluid -->\n");
      out.write("    </div> <!-- .wrapper -->\n");
      out.write("  </body>\n");
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
