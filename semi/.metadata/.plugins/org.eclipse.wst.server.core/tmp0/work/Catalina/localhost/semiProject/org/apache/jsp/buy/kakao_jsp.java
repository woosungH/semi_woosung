/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-28 08:42:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.buy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import order.OrderManageDBBean;
import order.OrderManageBean;

public final class kakao_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("order.OrderManageBean");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("order.OrderManageDBBean");
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

     String name = (String)request.getParameter("name");
     String id = (String)session.getAttribute("id");
     String email = (String)request.getParameter("email");
     String phone1 = (String)request.getParameter("phone1");
     String phone2 = (String)request.getParameter("phone2");
     String phone3 = (String)request.getParameter("phone3");
     String raddr = (String)request.getParameter("raddr");
     String jibun = (String)request.getParameter("jibun");
     String detailaddr = (String)request.getParameter("detailaddr");
     String pcode = (String)request.getParameter("pcode");
     String[] p_name = request.getParameterValues("p_name");
     String[] p_count = request.getParameterValues("count");
     String[] p_nums = request.getParameterValues("p_num");
     String[] p_prices = request.getParameterValues("price");
     String requested = (String)request.getParameter("requested");
     
     
     int totalPrice = Integer.parseInt(request.getParameter("totalPrice"));/* 
     int p_num = Integer.parseInt(request.getParameter("p_num"));
     int count = Integer.parseInt(request.getParameter("count"));
     int price = Integer.parseInt(request.getParameter("price")); */
     String phone = phone1+phone2+phone3;
     String address = raddr+detailaddr;
     
     // ????????????, ???????????? ??????
	Date nowDate = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss"); 
	String today = sdf.format(nowDate);
	
	String[] orderDNums = new String[p_name.length];
	long[] o_dNums = new long[p_name.length];
	for(int i=0;i<p_name.length;i++){	
		o_dNums[i] = Long.parseLong(p_nums[i]+today.toString());
	}
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyMMddHHmmssSSS"); 
	String orderNum = sdf2.format(nowDate); 
     
     OrderManageBean omb = new OrderManageBean();
     OrderManageDBBean omdb = OrderManageDBBean.getInstance();

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>kakao</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-1.12.4.min.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdn.iamport.kr/js/iamport.payment-1.1.5.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
	
	int re=0;
	
	for(int i=0;i<p_name.length;i++){
		omb.setUser_id(id);
		omb.setReceiver_name(name);
		omb.setReceiver_phone1(phone1);
		omb.setReceiver_phone2(phone2);
		omb.setReceiver_phone3(phone3);
		omb.setReceiver_pcode(pcode);
		omb.setReceiver_raddr(raddr);
		omb.setReceiver_jibun(jibun);
		omb.setReceiver_detailaddr(detailaddr);
		omb.setProduct_name(p_name[i]);
		omb.setProduct_number(Integer.parseInt(p_nums[i]));
		omb.setProduct_count(Integer.parseInt(p_count[i]));
		omb.setProduct_price(Integer.parseInt(p_prices[i]));
		omb.setRequested(requested);
		omb.setOrder_detail_number(o_dNums[i]);
		omb.setOrder_number(orderNum);
		
		if(i==0)omdb.insertUserOrder(omb);
		re = omdb.insertOrder(omb);
		if(re!=1)break;
	}


      out.write("\r\n");
      out.write("<input type=\"hidden\" value=\"");
      out.print( re );
      out.write("\" id=\"re\">\r\n");
      out.write("\r\n");
      out.write("	<form action=\"main.jsp\" method=\"post\" id=\"product\">\r\n");

	for(int i=0;i<p_name.length;i++){

      out.write("\r\n");
      out.write("		<input type=\"hidden\" value=\"../buy/buy_body\" name=\"pages\">\r\n");
      out.write("		<input type=\"hidden\" value=\"");
      out.print( p_name[i] );
      out.write("\" name=\"p_name\">\r\n");
      out.write("		<input type=\"hidden\" value=\"");
      out.print( p_nums[i] );
      out.write("\" name=\"p_num\">\r\n");
      out.write("		<input type=\"hidden\" value=\"");
      out.print( p_prices[i] );
      out.write("\" name=\"p_price\">\r\n");

	}

      out.write("\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("	<form action=\"main.jsp\" method=\"post\" id=\"paySuccess\">\r\n");

	for(int i=0;i<p_name.length;i++){

      out.write("\r\n");
      out.write("		<input type=\"hidden\" value=\"../buy/paySuccess\" name=\"pages\">\r\n");
      out.write("		<input type=\"hidden\" value=\"");
      out.print( o_dNums[i] );
      out.write("\" name=\"orderDNum\">\r\n");
      out.write("		");
      out.write('\r');
      out.write('\n');

	}

      out.write("\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");

	System.out.println(re);
	if(re==1){

      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("        var IMP = window.IMP; // ????????????\r\n");
      out.write("        IMP.init('imp04783078'); // 'iamport' ?????? ???????????? \"????????? ????????????\"??? ??????\r\n");
      out.write("        var msg;\r\n");
      out.write("        \r\n");
      out.write("        IMP.request_pay({\r\n");
      out.write("            pg : 'kakaopay',\r\n");
      out.write("            pay_method : 'card',\r\n");
      out.write("            merchant_uid : 'merchant_' + new Date().getTime(),\r\n");
      out.write("            name : '");
      out.print( p_name[0]+"??? "+(p_name.length-1)+"???" );
      out.write("',\r\n");
      out.write("            amount : ");
      out.print(totalPrice);
      out.write(",\r\n");
      out.write("            buyer_email : '");
      out.print(email);
      out.write("',\r\n");
      out.write("            buyer_name : '");
      out.print(name);
      out.write("',\r\n");
      out.write("            buyer_tel : '");
      out.print(phone);
      out.write("',\r\n");
      out.write("            buyer_addr : '");
      out.print(address);
      out.write("',\r\n");
      out.write("            buyer_postcode : '");
      out.print( pcode );
      out.write("',\r\n");
      out.write("            //m_redirect_url : 'http://www.naver.com'\r\n");
      out.write("        }, function(rsp) {\r\n");
      out.write("            if ( rsp.success ) {\r\n");
      out.write("                //[1] ??????????????? ???????????? ????????? ?????? jQuery ajax??? imp_uid ????????????\r\n");
      out.write("                jQuery.ajax({\r\n");
      out.write("                    url: \"/buy/\", //cross-domain error??? ???????????? ????????? ??????????????????\r\n");
      out.write("                    method: \"POST\",\r\n");
      out.write("                    headers: { \"Content-Type\": \"application/json\" },\r\n");
      out.write("                    data: {\r\n");
      out.write("                        imp_uid : rsp.imp_uid,\r\n");
      out.write("                        merchant_uid: rsp.merchant_uid,\r\n");
      out.write("                        amount : rsp.paid_amount,\r\n");
      out.write("                        //?????? ????????? ???????????? ????????? ?????? ??????\r\n");
      out.write("                    }\r\n");
      out.write("                }).done(function(data) {\r\n");
      out.write("                    //[2] ???????????? REST API??? ?????????????????? ??? ?????????????????? ???????????? ??????\r\n");
      out.write("                    if ( everythings_fine ) {\r\n");
      out.write("                       msg = '????????? ?????????????????????.';\r\n");
      out.write("                        msg += '\\n??????ID : ' + rsp.imp_uid;\r\n");
      out.write("                        msg += '\\n?????? ??????ID : ' + rsp.merchant_uid;\r\n");
      out.write("                        msg += '\\?????? ?????? : ' + rsp.paid_amount;\r\n");
      out.write("                        msg += '?????? ???????????? : ' + rsp.apply_num;\r\n");
      out.write("                        \r\n");
      out.write("                        alert(msg);\r\n");
      out.write("                    } else {\r\n");
      out.write("                        //[3] ?????? ????????? ????????? ?????? ???????????????.\r\n");
      out.write("                        //[4] ????????? ????????? ????????? ????????? ?????? ????????? ?????????????????????????????????.\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("                //????????? ????????? ?????????\r\n");
      out.write("				//document.getElementById(\"paySuccess\").submit;\r\n");
      out.write("				$(\"#paySuccess\").submit();\r\n");
      out.write("                //location.href='main.jsp?pages=../buy/paySuccess?orderDNum='+o_dNums;\r\n");
      out.write("            } else {\r\n");
      out.write("                msg = '????????? ?????????????????????.';\r\n");
      out.write("                msg += '???????????? : ' + rsp.error_msg;\r\n");
      out.write("                //????????? ????????? ?????????\r\n");
      out.write("                location.href=\"main.jsp?pages=../buy/payFail\";\r\n");
      out.write("                alert(msg);\r\n");
      out.write("    			//$(\"#product\").submit();\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("    });\r\n");
      out.write("    </script>\r\n");

	} else if(re==2) {

      out.write("\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("	    var re = document.getElementById(\"re\").value;\r\n");
      out.write("	    if(re == 2){\r\n");
      out.write("			alert(\"????????? ????????????.\");\r\n");
      out.write("			document.getElementById(\"product\").submit;\r\n");
      out.write("			");
      out.write("	        \r\n");
      out.write("	    }\r\n");
      out.write("		</script>\r\n");

	} else if(re==3) {

      out.write("\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("	    var re = document.getElementById(\"re\").value;\r\n");
      out.write("	    if(re == 3){\r\n");
      out.write("			alert(\"????????? ??????????????????.\");\r\n");
      out.write("			document.getElementById(\"product\").submit;\r\n");
      out.write("			");
      out.write("	        \r\n");
      out.write("	    }\r\n");
      out.write("		</script>\r\n");
		
	} else{
		System.out.println("????????? ?????????.");
	}

      out.write("\r\n");
      out.write("???????????????\r\n");
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
