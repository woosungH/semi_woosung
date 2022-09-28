/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-19 06:18:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cs.QnABoardBean;
import cs.QnABoardDBBean;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.util.ArrayList;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("cs.QnABoardBean");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("cs.QnABoardDBBean");
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
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');

	int b_id,b_view, b_level, b_fsize;
	String b_category, u_id, b_title, b_content, b_pwd, b_secret, b_anschk;
	Timestamp b_date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	QnABoardDBBean qdb = QnABoardDBBean.getInstance();
	
	// 페이징 처리
	int pageSize = 10; // 한페이지에 보여질 글 수
	int count = qdb.getCount(new QnABoardBean()); // 전체 글 수
	// 현재 페이지 정보 설정
	String pageNum = request.getParameter("pageNum");
	if(pageNum == null){
		pageNum = "1";
	} 
	// 첫 행번호 계산
	int currentPage = Integer.parseInt(pageNum);
	int startRow = (currentPage-1)*pageSize+ 1; // 2페이지면 11~20
	ArrayList<QnABoardBean> list = qdb.listBoard(startRow,pageSize);
	
	int pageCount=1, pageBlock=5, startPage=1, endPage=1; // pageBlock: 한 페이지에 보여줄 페이지 블럭
	if(count != 0) {
		pageCount = (int)Math.ceil((double)count / pageSize); // 전체 페이지 수
		startPage = ((currentPage-1)/pageBlock)*pageBlock+1; // 페이지 블럭 시작 번호
		endPage = startPage + pageBlock -1; // 페이지 블럭 끝 번호
		if(endPage > pageCount){
			endPage = pageCount;
		} // 전체 페이지가 10페이지인데 마지막 페이지가 11이면 안되므로 조건문 설정
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<center>\r\n");
      out.write("		<h1>Q&A</h1>\r\n");
      out.write("		<div style=\"margin-bottom:50px;\">\r\n");
      out.write("			<a href=\"../main.jsp\">스토어 홈</a>><a href=\"cs_main.jsp\">고객센터</a>><a href=\"list.jsp\">QnA</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td>글번호</td>\r\n");
      out.write("				<td>분류</td>\r\n");
      out.write("				<td>제목</td>\r\n");
      out.write("				<td>작성자</td>\r\n");
      out.write("				<td>작성일</td>\r\n");
      out.write("				<td>조회수</td>\r\n");
      out.write("				<td>첨부파일</td>\r\n");
      out.write("				<td>비공개</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("	");

			for(int i=0; i < list.size(); i++) {
				QnABoardBean board = list.get(i); // 배열에 넣은 역순으로 board 객체에 값을 넣어줌
				b_id=board.getB_id();
				u_id=board.getU_id();
				b_category=board.getB_category();
				b_pwd=board.getB_pwd();
				b_title= board.getB_title();
				b_date= board.getB_date();
				b_view= board.getB_view();
				b_level = board.getB_level();
				b_fsize = board.getB_fsize();
				b_secret = board.getB_secret();
	
      out.write("\r\n");
      out.write("			<tr height=\"25\" bgcolor=\"#E8E8E8\" onmouseover=\"this.style.backgroundColor='#AEBAB4'\"\r\n");
      out.write("			onmouseout=\"this.style.backgroundColor='#E8E8E8'\">\r\n");
      out.write("				<td align=\"center\">");
      out.print(b_id);
      out.write("</td>\r\n");
      out.write("				<td align=\"center\">");
      out.print(b_category);
      out.write("</td>\r\n");
      out.write("				<td id=\"title\" style=\"width:150px;\">\r\n");
      out.write("					");

						if(b_level > 0){
							for(int j=0; j<b_level; j++){
					
      out.write("\r\n");
      out.write("								&nbsp;\r\n");
      out.write("					");

							}
					
      out.write("\r\n");
      out.write("						<img src=\"../images/replyE.png\" style=\"width:10px;\" />\r\n");
      out.write("					");

						}
					
      out.write("\r\n");
      out.write("					<a href=\"show.jsp?b_id=");
      out.print( b_id );
      out.write("&pageNum=");
      out.print( pageNum );
      out.write('"');
      out.write('>');
      out.print(b_title);
      out.write("</a>\r\n");
      out.write("				</td>\r\n");
      out.write("				<td>");
      out.print( u_id );
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(sdf.format(b_date));
      out.write("</td>\r\n");
      out.write("				<td>");
      out.print(b_view);
      out.write("</td>\r\n");
      out.write("				<td style=\"width:80px; height:40px;\">\r\n");
      out.write("					");

						if(b_fsize != 0) {
					
      out.write("\r\n");
      out.write("							<img src=\"../images/image.png\" style=\"width:30px; margin-left:25px;\" />\r\n");
      out.write("					");

						}
					
      out.write("\r\n");
      out.write("				</td>\r\n");
      out.write("				<td style=\"width:80px; height:40px;\">\r\n");
      out.write("					");

						if(b_secret.equals("Y")) {
					
      out.write("\r\n");
      out.write("							<img src=\"../images/lock.png\" style=\"width:30px; margin-left:25px;\" />\r\n");
      out.write("					");

						}
					
      out.write("\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		");

			}
		
      out.write('\r');
      out.write('\n');
      out.write('	');
 if(session.getAttribute("id") != null){
		
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"8\"><a href=\"write.jsp?pageNum=");
      out.print( pageNum );
      out.write("\">글 쓰 기</a></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("	");
 
		}
	
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("		<div>\r\n");
      out.write("	");

		if(startPage > pageBlock) {
	
      out.write("\r\n");
      out.write("			<a href=\"list.jsp?pageNum=");
      out.print( startPage-pageBlock );
      out.write("\">이전</a>\r\n");
      out.write("	");

		}
	
      out.write('\r');
      out.write('\n');
      out.write('	');

		for(int i = startPage; i<= endPage; i++){
	
      out.write("\r\n");
      out.write("			<a href=\"list.jsp?pageNum=");
      out.print( i );
      out.write('"');
      out.write('>');
      out.print( i );
      out.write("</a>\r\n");
      out.write("	");
	
		}
	
      out.write('\r');
      out.write('\n');
      out.write('	');

		if(startPage+pageBlock <= pageCount) {
	
      out.write("\r\n");
      out.write("			<a href=\"list.jsp?pageNum=");
      out.print( startPage+pageBlock );
      out.write("\">다음</a>\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("	</center>\r\n");
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
