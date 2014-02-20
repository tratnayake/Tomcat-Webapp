<!--
 ------------------------------------------------------------------------
 OrderConfirmController.jsp (Controller)
 
 
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<!-- calls Customer Bean for the session -->
<jsp:useBean id="model" class="model.Customer" scope="session"/>
<jsp:useBean id="order" class="model.Order" scope="session"/>
<%@page import  = "java.util.*"%>

<% 
	String Clicked = request.getParameter("option");
   
    if (Clicked.equals("cancel"))
    {
		session.invalidate();%>
        <jsp:forward page="index.jsp" />      
  <%}
  
	else if (Clicked.equals("confirm"))
    {
	
        order.addDatabaseOrder();

	order.addDatabaseLineItems();
        
		
		
		
        %><jsp:forward page="Goodbye.jsp" />      
  <%}%>