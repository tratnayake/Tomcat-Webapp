<!--
 ------------------------------------------------------------------------
 CustomerController.jsp (Controller)
 
 Customer info is added to Customer Bean
 Redirected to page where customer info is displayed
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<!-- calls Customer Bean for the session -->
<jsp:useBean id="model" class="model.Customer" scope="session"/>

<!-- sets values for Customer Bean -->
<jsp:setProperty name="model" property="*"/> 

<!-- redirects to display customer page -->
<jsp:forward page="DisplayCustomer.jsp" />