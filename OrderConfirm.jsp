<!DOCTYPE html>

<!--
 ------------------------------------------------------------------------
 OrderConfirm.jsp (View)
 
 Summary of the order
 Customer can confirm or cancel order
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<%@ include file="template/header.jsp" %>

<section>
   
	<h2>Customer:&nbsp<%= model.getLastName() %>&nbsp<%= model.getFirstName() %></h2><br/>
	<h2>ID:&nbsp<%= model.getCustomerId() %></h2><br/>	
	<br style="clear: left;" />	
	
	<table class="form searchtable">
		<%= order.orderSummary() %>
	</table>
	<br style="clear: left;" />
       
	<form action="OrderConfirmController.jsp">
		<button class="btn" name="option" type="submit" value="confirm">Confirm</button>
	</form>

	<form action="OrderConfirmController.jsp">
		<button class="btn" name="option" type="submit" value="cancel">Cancel</button>
	</form>

</section>

<%@ include file="template/footer.jsp" %>