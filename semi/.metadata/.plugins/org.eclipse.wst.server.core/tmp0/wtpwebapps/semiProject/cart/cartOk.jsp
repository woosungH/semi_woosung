<%@page import="java.util.ArrayList"%>
<%@page import="cart.CartDBBean"%>
<%@page import="cart.CartBean"%>
<%@page import="product.ProductBean"%>
<%@page import="product.ProductDBBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = (String)session.getAttribute("id");
	if(session.getAttribute("Member") == null && session.getAttribute("id") == null){ 
		// member�� null(�ʱ�ȭ)�Ǹ�  main���� �� �� ���� 
		// jsp:forward�� login���� ���ư�.
	%>
		<script type="text/javascript">
			alert("�α����� �ʿ��� �׸��Դϴ�.");
			location.href="main.jsp?pages=../user_log/login";
		</script>
	<%
	} else {
		int product_number = Integer.parseInt(request.getParameter("product_number"));
		int count = Integer.parseInt(request.getParameter("count"));
		CartDBBean cartdb = CartDBBean.getInstance();
		
		ProductDBBean product = ProductDBBean.getInstance();
		ProductBean get = product.getproduct(product_number, false);
		
		ProductBean img = product.getImg(product_number);
		
		String p_name = get.getProduct_name();
		int p_price = get.getProduct_price();
		int img_number = img.getFile_number();
		
		String file_name = img.getStored_file_name();
		CartBean cart = cartdb.overlapTest(id);
		ArrayList<CartBean> list = cartdb.getCart(id);
		if(list.size()==0){
			cartdb.insertCart(id, product_number, count);
	%>
		<script>
			alert("��ٱ��Ͽ� �߰��Ǿ����ϴ�.")
			document.location.href="main.jsp?pages=../cart/cartList";
		</script>
	<%
		} else {
		// �ߺ� Ȯ��
			if(product_number == cart.getProduct_number()){
		%>
			<script type="text/javascript">
				alert("��ٱ��Ͽ� �߰��� ��ǰ�Դϴ�.");
				location.href="main.jsp?pages=../product/product_detail&product_number=<%=product_number%>"
			</script>
		<%
			} else {
				cartdb.insertCart(id, product_number, count);
		%>
			<script>
				alert("��ٱ��Ͽ� �߰��Ǿ����ϴ�.")
				document.location.href="main.jsp?pages=../cart/cartList";
			</script>
		<%
			} 
		}
	}
%>
		

