<%@page import="product.ProductBean"%>
<%@page import="product.ProductDBBean"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="order.OrderManageDBBean"%>
<%@page import="order.OrderManageBean"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	/* long o_dNum = Long.parseLong(request.getParameter("orderDNum")); */
	String[] o_dNums = request.getParameterValues("orderDNum");

	OrderManageBean omb = new OrderManageBean();
	OrderManageDBBean omdb = OrderManageDBBean.getInstance();
	omb = omdb.getOrder(Long.parseLong(o_dNums[0]));
	String p_name = omb.getProduct_name();
	int count = omb.getProduct_count();
	int price = omb.getProduct_price();
	int productNum = omb.getProduct_number();
	String orderNum = omb.getOrder_number();
	
	ProductDBBean pdb = ProductDBBean.getInstance();
	ProductBean pb = new ProductBean();
	int ship,totalPrice = 0;
	if(price >= 20000){
		ship = 0;
	} else {
		ship = 3000;
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	String orderDate = sdf.format(omb.getOrder_date());
	
	String name = omb.getReceiver_name();
	String phone = omb.getReceiver_phone1()+"-"+omb.getReceiver_phone2()+"-"+omb.getReceiver_phone3();
	String raddr = omb.getReceiver_raddr();
	String detailaddr = omb.getReceiver_detailaddr();
	String requested = "";
	if(omb.getRequested() == null){
		requested = "��û���� ����";
	} else {
		requested = omb.getRequested();
	}
	String pcode = omb.getReceiver_pcode();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <div class="container-fluid">
   <div class="row justify-content-center">
     <div class="col-12 col-lg-10 col-xl-8">
       <div class="row align-items-center mb-4">
         <div class="col">
           <h2 class="h5 page-title"><small class="text-muted text-uppercase">Invoice</small><br />#<%= orderNum %></h2>
         </div>
       </div>
       <div class="card shadow">
         <div class="card-body p-5">
           <div class="row mb-5">
             <div class="col-12 text-center mb-4">
               <img src="../assets/images/logo.svg" class="navbar-brand-img brand-sm mx-auto mb-4" alt="...">
               <h2 class="mb-0 text-uppercase">�ֹ�������</h2>
               <p class="text-muted"> ���ѹα�<br /> �λ걤���� �λ����� �߾Ӵ�� 688 ���غ��� 2�� </p>
             </div>
             <div class="col-md-7">
               <p class="small text-muted text-uppercase mb-2">Invoice from</p>
               <p class="mb-4">
                 <strong>Green</strong><br /> �����<br /> �λ걤���� �λ�����<br /> �߾Ӵ�� 688 ���غ��� 2��<br /> 051-912-1000<br />
               </p>
               <p>
                 <span class="small text-muted text-uppercase">Invoice #</span><br />
                 <strong><%= orderNum %></strong>
               </p>
             </div>
             <div class="col-md-5">
               <p class="small text-muted text-uppercase mb-2">Invoice to</p>
               <p class="mb-4">
                 <strong><%= name %></strong><br /> <%= pcode %><br /> <%= raddr %><br /> <%= detailaddr %><br /> <%= phone %><br />
               </p>
               <p>
                 <small class="small text-muted text-uppercase">order Date</small><br />
                 <strong><%= orderDate %></strong>
               </p>
             </div>
           </div> <!-- /.row -->
           <table class="table table-borderless table-striped">
             <thead>
               <tr>
                 <th scope="col">#</th>
                 <th scope="col">Description</th>
                 <th scope="col" class="text-right">���� ����</th>
                 <th scope="col" class="text-right">����</th>
                 <th scope="col" class="text-right">��ۺ�</th>
                 <th scope="col" class="text-right">�� ����</th>
               </tr>
             </thead>
             <%
             for(int i=0;i<o_dNums.length;i++){
            	 omb=omdb.getOrder(Long.parseLong(o_dNums[i]));
           		 p_name = omb.getProduct_name();
           		 count = omb.getProduct_count();
           		 price = omb.getProduct_price();
           		 productNum = omb.getProduct_number();

           		 pb = pdb.getproduct(productNum, false);
           		 int one_price = pb.getProduct_price();
           		 
           		 totalPrice += price;
             %> 
             <tbody>
               <tr>
                 <th scope="row"><%= i+1 %></th>
                 <td><%= p_name %></td>
                 <td class="text-right"><%= one_price %>��</td>
                 <td class="text-right"><%= count %>��</td>
                 <td class="text-right"><%= ship %>��</td>
                 <td class="text-right"><%= price %>��</td>
               </tr>
             <%
             }
             %>
             </tbody>
           </table>
           <div class="row mt-5">
             <div class="col-md-5">
               <p class="text-muted small">
                 <strong>��û����</strong>
	             <div><%= requested %></div>
             </div>
             <div class="col-md-5">
               <div class="text-right mr-2">
                 <p class="mb-2 h6">
                   <span class="text-muted">Total : </span>
                   <span><%= totalPrice %>��</span>
                 </p>
               </div>
             </div>
           </div> <!-- /.row -->
         </div> <!-- /.card-body -->
       </div> <!-- /.card -->
     </div> <!-- /.col-12 -->
   </div> <!-- .row -->
 </div> <!-- .container-fluid -->
</body>
</html>