<!DOCTYPE html>

<!--
 ------------------------------------------------------------------------
 index.jsp (View)
 
 Start page: choose View Products or Place Order
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->


<html>
<head>
	<title>Wacko Products</title>
	<link rel="stylesheet" href="assets/main.css">
</head>

<body>
	<header>
		<%@ include file="template/header.jsp" %>
	</header>
	
	
	<summary>
		About the company.	
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
	
	
	
	
	<footer>
		<%@ include file="template/footer.jsp" %>
	</footer>




</body>
</html>