<!DOCTYPE html>

<!--
 ------------------------------------------------------------------------
 CustomerForm.jsp (View)
 
 Customer enters/updates information
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<!-- calls Customer Bean for the session -->
<jsp:useBean id="model" class="model.Customer" scope="session"/>

<html>
<head>
	<title>Customer Form</title>
	<link rel="stylesheet" href="assets/main.css">
</head>

<body> 
	<section>
	
		<!-- Form layout -->
		<div class="formcontainer">
		
			<h2>Enter Customer Information:</h2>
			<form name="CustomerForm" action='CustomerController.jsp' method="post">		
				<table class="form">
				  <tr class="textfield">	    
				  	<td><h3>First Name</h3></td>
				    <td><input  type="text" name="firstName" id="firstName" placeholder="FIRST NAME"
				    			value="<jsp:getProperty name="model" property="firstName" />" required></td>
				  </tr>
				  <tr class="textfield">	    
				    <td><h3>Last Name</h3></td>
				    <td><input  type="text" name="lastName" id="lastName" placeholder="LAST NAME"
				    			value="<jsp:getProperty name="model" property="firstName" />" required></td>
				  </tr>
				  <tr class="textfield">	    
				  	<td><h3>Address</h3></td>
				    <td><input type="text" name="address" id="address" placeholder="ADDRESS" value="<jsp:getProperty name="model" property="firstName" />" required></td>
				  </tr>
				  <tr class="textfield">	    
				    <td><h3>Email</h3></td>
				    <td><input type="text" name="email" id="email" placeholder="EMAIL" value="<jsp:getProperty name="model" property="firstName" />" required></td>
				  </tr>
				  <tr class="textfield">	    
				    <td><h3>Phone Number</h3></td>
				    <td><input type="text" name="phoneNumber" id="phoneNumber" placeholder="PHONE NUMBER" value="<jsp:getProperty name="model" property="firstName" />" required></td>
				  </tr>
				  <tr>
					<td><button class="button" type="submit" value="submit">SUBMIT</button></td>
				  </tr>
				</table
			</form>  
			
		</div> <!-- formcontainer -->
	</section>

	<footer>
		<%@ include file="template/footer.jsp" %>
	</footer>




</body>
</html>