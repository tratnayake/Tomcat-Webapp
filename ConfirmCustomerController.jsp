<!--
 ------------------------------------------------------------------------
 ConfirmOptionController.jsp (Controller)
 

 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<jsp:useBean id="model" class="model.Customer" scope="session"/>



<% out.println(model.save()); %> 