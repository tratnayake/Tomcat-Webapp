<!--
 ------------------------------------------------------------------------
 CustomerOptionController.jsp (Controller)
 
 Customer info is added to Customer Bean
 Redirected to page where customer info is displayed
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<% 
	String Clicked = request.getParameter("option");
   
    if (Clicked.equals("cancel"))
    {
		session.invalidate();%>
        <jsp:forward page="index.jsp" />      
  <%}
      
	else
	{%>
		<jsp:forward page="CustomerForm.jsp" />
  <%}%>


   
