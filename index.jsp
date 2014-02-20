<!DOCTYPE html>

<!--
 ------------------------------------------------------------------------
 index.jsp (View)
 
 Start page: choose View Products or Place Order
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<%@ include file="template/header.jsp" %>


	<!-- Buttons for view products/place order -->

	<section>
		<h2>Choose an option:</h2>	
			<form action="http://google.com">
				<input class="btn" type="submit" value="View Products">
			</form>
			<br style="clear: left;" />
			<form action="PlaceOrderController.jsp">
				<input class="btn" type="submit" value="Place Order">
			</form>
	</section> 

	
<%@ include file="template/footer.jsp" %>
