/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-22 07:48:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cs.NoticeDBBean;

public final class noticeEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("cs.NoticeDBBean");
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
      response.setContentType("text/html; charset=utf-8");
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
      cs.NoticeBean notice = null;
      notice = (cs.NoticeBean) _jspx_page_context.getAttribute("notice", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (notice == null){
        notice = new cs.NoticeBean();
        _jspx_page_context.setAttribute("notice", notice, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

	int n_num=0;
	if(request.getParameter("n_num") == null){
		response.sendRedirect("adminIndex.jsp");
	} else{
		NoticeDBBean noticeDBBean = NoticeDBBean.getInstance();
		n_num = Integer.parseInt(request.getParameter("n_num"));
		notice = noticeDBBean.getNotice(n_num,false);				
	}
	String pageNum=request.getParameter("pageNum");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("    <!-- Simple bar CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/simplebar.css\">\r\n");
      out.write("    <!-- Fonts CSS -->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Overpass:ital,wght@0,100;0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Icons CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/feather.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/select2.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/dropzone.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/uppy.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.steps.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/quill.snow.css\">\r\n");
      out.write("    <!-- Date Range Picker CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/daterangepicker.css\">\r\n");
      out.write("    <!-- App CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/app-light.css\" id=\"lightTheme\" disabled>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/app-dark.css\" id=\"darkTheme\">\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"notice.js?a=b\"></script>\r\n");
      out.write("<body>\r\n");
      out.write("	<div style=\"text-align: center; margin: 10px auto; width: 90%\" class=\"card shadow\">\r\n");
      out.write("		<h1 style=\"margin: 10px\">??? ????????????</h1>\r\n");
      out.write("		<form method=\"post\" action=\"noticeEdit_ok.jsp?n_num=");
      out.print( n_num );
      out.write("&pageNum=");
      out.print( pageNum );
      out.write("\" name=\"wrt_frm\">\r\n");
      out.write("			<table style=\"margin: 0 auto; width: 90%\" >\r\n");
      out.write("				<tr height=\"30\">\r\n");
      out.write("					<td width=\"80\">?????????</td>\r\n");
      out.write("					<td width=\"140\" align=\"left\">\r\n");
      out.write("						");
      out.write("\r\n");
      out.write("	                        <input type=\"text\" class=\"form-control\" value=\"");
      out.print( notice.getUser_id() );
      out.write("\" aria-label=\"Username\" aria-describedby=\"basic-addon1\" readonly style=\"height: 25px; width: 90%;\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr height=\"30\">\r\n");
      out.write("					<td width=\"80\">?????????</td>\r\n");
      out.write("					<td colspan=\"3\" width=\"460\">\r\n");
      out.write("	                        <input name=\"n_title\" type=\"text\" class=\"form-control\" value=\"");
      out.print( notice.getN_title() );
      out.write("\" aria-label=\"Username\" aria-describedby=\"basic-addon1\" style=\"height: 25px; width: 90%;\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td colspan=\"4\">\r\n");
      out.write("                   		<div class=\"card-body\" style=\"color: #ccc; width: 100%;\">\r\n");
      out.write("                   			<div id=\"editor\" style=\"min-height:300px;\" contenteditable=\"true\">\r\n");
      out.write("                   				");
      out.print( notice.getN_content() );
      out.write("\r\n");
      out.write("                   			</div>\r\n");
      out.write("                   		</div>\r\n");
      out.write("                  		<input type=\"hidden\" value=\"\" name=\"n_content\" id=\"content\">\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>\r\n");
      out.write("						???&nbsp;&nbsp;???\r\n");
      out.write("					</td>\r\n");
      out.write("					<td height=\"50\">\r\n");
      out.write("                        <input type=\"password\" name=\"n_pwd\" class=\"form-control\" aria-label=\"Username\" aria-describedby=\"basic-addon1\" style=\"height: 25px; width: 100px;\">\r\n");
      out.write("					</td>	\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td height=\"50\" colspan=\"4\" align=\"center\">\r\n");
      out.write("						<input class=\"btn btn-primary\" type=\"button\" value=\"??????\" onclick=\"onclick_ok()\">\r\n");
      out.write("						<input class=\"btn btn-primary\" type=\"reset\" value=\"????????????\">\r\n");
      out.write("						<input class=\"btn btn-primary\" type=\"button\" value=\"??????\" onclick=\"location.href='adminIndex.jsp?pages=noticeList&pageNum=");
      out.print( pageNum );
      out.write("&n_num=");
      out.print(n_num);
      out.write("'\">\r\n");
      out.write("					</td>	\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("      $('.select2').select2(\r\n");
      out.write("      {\r\n");
      out.write("        theme: 'bootstrap4',\r\n");
      out.write("      });\r\n");
      out.write("      $('.select2-multi').select2(\r\n");
      out.write("      {\r\n");
      out.write("        multiple: true,\r\n");
      out.write("        theme: 'bootstrap4',\r\n");
      out.write("      });\r\n");
      out.write("      $('.drgpicker').daterangepicker(\r\n");
      out.write("      {\r\n");
      out.write("        singleDatePicker: true,\r\n");
      out.write("        timePicker: false,\r\n");
      out.write("        showDropdowns: true,\r\n");
      out.write("        locale:\r\n");
      out.write("        {\r\n");
      out.write("          format: 'MM/DD/YYYY'\r\n");
      out.write("        }\r\n");
      out.write("      });\r\n");
      out.write("      $('.time-input').timepicker(\r\n");
      out.write("      {\r\n");
      out.write("        'scrollDefault': 'now',\r\n");
      out.write("        'zindex': '9999' /* fix modal open */\r\n");
      out.write("      });\r\n");
      out.write("      /** date range picker */\r\n");
      out.write("      if ($('.datetimes').length)\r\n");
      out.write("      {\r\n");
      out.write("        $('.datetimes').daterangepicker(\r\n");
      out.write("        {\r\n");
      out.write("          timePicker: true,\r\n");
      out.write("          startDate: moment().startOf('hour'),\r\n");
      out.write("          endDate: moment().startOf('hour').add(32, 'hour'),\r\n");
      out.write("          locale:\r\n");
      out.write("          {\r\n");
      out.write("            format: 'M/DD hh:mm A'\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("      var start = moment().subtract(29, 'days');\r\n");
      out.write("      var end = moment();\r\n");
      out.write("\r\n");
      out.write("      function cb(start, end)\r\n");
      out.write("      {\r\n");
      out.write("        $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));\r\n");
      out.write("      }\r\n");
      out.write("      $('#reportrange').daterangepicker(\r\n");
      out.write("      {\r\n");
      out.write("        startDate: start,\r\n");
      out.write("        endDate: end,\r\n");
      out.write("        ranges:\r\n");
      out.write("        {\r\n");
      out.write("          'Today': [moment(), moment()],\r\n");
      out.write("          'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],\r\n");
      out.write("          'Last 7 Days': [moment().subtract(6, 'days'), moment()],\r\n");
      out.write("          'Last 30 Days': [moment().subtract(29, 'days'), moment()],\r\n");
      out.write("          'This Month': [moment().startOf('month'), moment().endOf('month')],\r\n");
      out.write("          'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]\r\n");
      out.write("        }\r\n");
      out.write("      }, cb);\r\n");
      out.write("      cb(start, end);\r\n");
      out.write("      $('.input-placeholder').mask(\"00/00/0000\",\r\n");
      out.write("      {\r\n");
      out.write("        placeholder: \"__/__/____\"\r\n");
      out.write("      });\r\n");
      out.write("      $('.input-zip').mask('00000-000',\r\n");
      out.write("      {\r\n");
      out.write("        placeholder: \"____-___\"\r\n");
      out.write("      });\r\n");
      out.write("      $('.input-money').mask(\"#.##0,00\",\r\n");
      out.write("      {\r\n");
      out.write("        reverse: true\r\n");
      out.write("      });\r\n");
      out.write("      $('.input-phoneus').mask('(000) 000-0000');\r\n");
      out.write("      $('.input-mixed').mask('AAA 000-S0S');\r\n");
      out.write("      $('.input-ip').mask('0ZZ.0ZZ.0ZZ.0ZZ',\r\n");
      out.write("      {\r\n");
      out.write("        translation:\r\n");
      out.write("        {\r\n");
      out.write("          'Z':\r\n");
      out.write("          {\r\n");
      out.write("            pattern: /[0-9]/,\r\n");
      out.write("            optional: true\r\n");
      out.write("          }\r\n");
      out.write("        },\r\n");
      out.write("        placeholder: \"___.___.___.___\"\r\n");
      out.write("      });\r\n");
      out.write("      // editor\r\n");
      out.write("      var editor = document.getElementById('editor');\r\n");
      out.write("      if (editor)\r\n");
      out.write("      {\r\n");
      out.write("        var toolbarOptions = [\r\n");
      out.write("          [\r\n");
      out.write("          {\r\n");
      out.write("            'font': []\r\n");
      out.write("          }],\r\n");
      out.write("          [\r\n");
      out.write("          {\r\n");
      out.write("            'header': [1, 2, 3, 4, 5, 6, false]\r\n");
      out.write("          }],\r\n");
      out.write("          ['bold', 'italic', 'underline', 'strike'],\r\n");
      out.write("          ['blockquote', 'code-block'],\r\n");
      out.write("          [\r\n");
      out.write("          {\r\n");
      out.write("            'header': 1\r\n");
      out.write("          },\r\n");
      out.write("          {\r\n");
      out.write("            'header': 2\r\n");
      out.write("          }],\r\n");
      out.write("          [\r\n");
      out.write("          {\r\n");
      out.write("            'list': 'ordered'\r\n");
      out.write("          },\r\n");
      out.write("          {\r\n");
      out.write("            'list': 'bullet'\r\n");
      out.write("          }],\r\n");
      out.write("          [\r\n");
      out.write("          {\r\n");
      out.write("            'script': 'sub'\r\n");
      out.write("          },\r\n");
      out.write("          {\r\n");
      out.write("            'script': 'super'\r\n");
      out.write("          }],\r\n");
      out.write("          [\r\n");
      out.write("          {\r\n");
      out.write("            'indent': '-1'\r\n");
      out.write("          },\r\n");
      out.write("          {\r\n");
      out.write("            'indent': '+1'\r\n");
      out.write("          }], // outdent/indent\r\n");
      out.write("          [\r\n");
      out.write("          {\r\n");
      out.write("            'direction': 'rtl'\r\n");
      out.write("          }], // text direction\r\n");
      out.write("          [\r\n");
      out.write("          {\r\n");
      out.write("            'color': []\r\n");
      out.write("          },\r\n");
      out.write("          {\r\n");
      out.write("            'background': []\r\n");
      out.write("          }], // dropdown with defaults from theme\r\n");
      out.write("          [\r\n");
      out.write("          {\r\n");
      out.write("            'align': []\r\n");
      out.write("          }],\r\n");
      out.write("          ['clean'] // remove formatting button\r\n");
      out.write("        ];\r\n");
      out.write("        var quill = new Quill(editor,\r\n");
      out.write("        {\r\n");
      out.write("          modules:\r\n");
      out.write("          {\r\n");
      out.write("            toolbar: toolbarOptions\r\n");
      out.write("          },\r\n");
      out.write("          theme: 'snow'\r\n");
      out.write("        });\r\n");
      out.write("      }\r\n");
      out.write("      // Example starter JavaScript for disabling form submissions if there are invalid fields\r\n");
      out.write("      (function()\r\n");
      out.write("      {\r\n");
      out.write("        'use strict';\r\n");
      out.write("        window.addEventListener('load', function()\r\n");
      out.write("        {\r\n");
      out.write("          // Fetch all the forms we want to apply custom Bootstrap validation styles to\r\n");
      out.write("          var forms = document.getElementsByClassName('needs-validation');\r\n");
      out.write("          // Loop over them and prevent submission\r\n");
      out.write("          var validation = Array.prototype.filter.call(forms, function(form)\r\n");
      out.write("          {\r\n");
      out.write("            form.addEventListener('submit', function(event)\r\n");
      out.write("            {\r\n");
      out.write("              if (form.checkValidity() === false)\r\n");
      out.write("              {\r\n");
      out.write("                event.preventDefault();\r\n");
      out.write("                event.stopPropagation();\r\n");
      out.write("              }\r\n");
      out.write("              form.classList.add('was-validated');\r\n");
      out.write("            }, false);\r\n");
      out.write("          });\r\n");
      out.write("        }, false);\r\n");
      out.write("      })();\r\n");
      out.write("    </script>\r\n");
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
