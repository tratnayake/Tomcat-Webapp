<!DOCTYPE html>

<!--
 ------------------------------------------------------------------------
 index.jsp (View)
 
 Start page: choose View Products or Place Order
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<%@ include file="template/header.jsp" %>

	
	
	<summary>
		"WACKO Furniture" is a online furniture company. If you're looking for tables, chairs, or couches, you've come to the right place.	
	</summary>
	
	
	
	<!-- Buttons for view products/place order -->
	<section>
		<h2>Choose an option:</h2>
		<form action="http://google.com">
			<input class="btn" type="submit" value="View Products">
		</form>
		<form action="PlaceOrderController.jsp">
			<input class="btn" type="submit" value="Place Order">
		</form>
	</section> 
	
<%@ include file="template/footer.jsp" %>
