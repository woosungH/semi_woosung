/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-28 01:51:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import net.coobird.thumbnailator.Thumbnails;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.ParameterBlock;
import product.ProductBean;
import product.ProductDBBean;
import java.sql.Timestamp;
import java.util.Enumeration;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.oreilly.servlet.MultipartRequest;

public final class productReg_005fok_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("product.ProductBean");
    _jspx_imports_classes.add("java.awt.Graphics2D");
    _jspx_imports_classes.add("java.awt.image.BufferedImage");
    _jspx_imports_classes.add("product.ProductDBBean");
    _jspx_imports_classes.add("java.util.Enumeration");
    _jspx_imports_classes.add("com.oreilly.servlet.multipart.DefaultFileRenamePolicy");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("javax.imageio.ImageIO");
    _jspx_imports_classes.add("net.coobird.thumbnailator.Thumbnails");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.awt.image.renderable.ParameterBlock");
    _jspx_imports_classes.add("com.oreilly.servlet.MultipartRequest");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>up load file</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

		ProductBean pBean = new ProductBean();
		String path = request.getSession().getServletContext().getRealPath("\\img");
		//String path = request.getRealPath("img");
		int size = 1024*1024*10; // 10MB로 크기 제한
		int fileSize = 0;
		String file = "";
		String oriFile = "";
		
		MultipartRequest multi = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
		
		Enumeration files = multi.getFileNames();
		String str = (String) files.nextElement();
		file = multi.getFilesystemName(str);
		
		if(file != null) {
			oriFile = multi.getOriginalFileName(str);
			fileSize = file.getBytes().length;
		}
		
		pBean.setCategory_code(multi.getParameter("category_code"));
		pBean.setProduct_name(multi.getParameter("product_name"));
		pBean.setProduct_price(Integer.parseInt(multi.getParameter("product_price")));
		pBean.setProduct_stock(Integer.parseInt(multi.getParameter("product_stock")));
		pBean.setProduct_desc(multi.getParameter("product_desc"));
		pBean.setProduct_date(new Timestamp(System.currentTimeMillis()));
		
		if(file != null) {
		    File fileIO = new File(path,oriFile);
		    Thumbnails.of(new File(path,oriFile)).forceSize(100, 100).toFile(new File(path,"/sm_"+file));
		 
			pBean.setStored_file_name(file);
			pBean.setFile_size(fileSize);
			pBean.setOrgin_file_name(oriFile);
			pBean.setStored_thumbnail("sm_"+file);
			pBean.setCreate_date(new Timestamp(System.currentTimeMillis()));
		}
		
		ProductDBBean updb = ProductDBBean.getInstance();
		int re = updb.insertUploadProduct(pBean);
		
		if(re == 1){
	
      out.write("\r\n");
      out.write("			<script type=\"text/javascript\">\r\n");
      out.write("				alert(\"상품을 등록했습니다.\");\r\n");
      out.write("				location.href=\"adminIndex.jsp?pages=productList\";\r\n");
      out.write("			</script>\r\n");
      out.write("	");
		
		}else{
	
      out.write("\r\n");
      out.write("			<script type=\"text/javascript\">\r\n");
      out.write("				alert(\"상품등록에 실패했습니다.\");\r\n");
      out.write("				history.go(-1);\r\n");
      out.write("			</script>\r\n");
      out.write("	");
		
		}
	
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