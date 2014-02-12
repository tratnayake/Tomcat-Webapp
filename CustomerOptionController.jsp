<!--
 ------------------------------------------------------------------------
 CustomerOptionController.jsp (Controller)
 
 Customer info is added to Customer Bean
 Redirected to page where customer info is displayed
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<jsp:useBean id="model" class="model.Customer" scope="session"/>

<% 
	String Clicked = request.getParameter("option");
   
    if (Clicked.equals("cancel"))
    {
		session.invalidate();%>
        <jsp:forward page="index.jsp" />      
  <%}
  
	else if (Clicked.equals("confirm"))
    {
		model.save(); 
		model.getCustomerId(); %>
        <jsp:forward page="OrderForm.jsp" />      
  <%}
      
	else
	{%>
		<jsp:forward page="CustomerForm.jsp" />
  <%}%>


   
