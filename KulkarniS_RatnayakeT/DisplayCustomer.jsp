<!DOCTYPE html>

<!--
 ------------------------------------------------------------------------
 DisplayCustomer.jsp (View)
 
 Displays customer info and gives customer a choice of:
 cancel, confirming, or restarting
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<!-- calls Customer Bean for the session -->
<jsp:useBean id="model" class="model.Customer" scope="session"/>

<html>
<head>
	<title>Title</title>
	<link rel="stylesheet" href="assets/main.css">
</head>

<body>
	<header>
		<%@ include file="template/header.jsp" %>
	</header>
	
	<section>
	
		<!-- customer info is displayed -->
		<div class="formcontainer">
		
			<h2>Customer Information:</h2>		
			<table class="form">
			  <tr class="textfield">	    
			  	<td><h3>First Name:</h3></td>
			    <td><jsp:getProperty name="model" property="firstName" /></td>
			  </tr>
			  <tr class="textfield">	    
			    <td><h3>Last Name:</h3></td>
			    <td><jsp:getProperty name="model" property="lastName" /></td>
			  </tr>
			  <tr class="textfield">	    
			  	<td><h3>Address:</h3></td>
			    <td><jsp:getProperty name="model" property="address" /></td>
			  </tr>
			  <tr class="textfield">	    
			    <td><h3>Email:</h3></td>
			    <td><jsp:getProperty name="model" property="email" /></td>
			  </tr>
			  <tr class="textfield">	    
			    <td><h3>Phone Number:</h3></td>
			    <td><jsp:getProperty name="model" property="phoneNumber" /></td>
			  </tr>
			</table>
			
			<table>
				<tr>
					<td>
						<form action="ConfirmCustomerController.jsp">
							<button class="btn" name="option" type="submit" value="confirm">Confirm</button>
						</form>
					</td>
					<td>
						<form action="CustomerOptionController.jsp">
							<button class="btn" name="option" type="submit" value="cancel">Cancel</button>
						</form>
					</td>
					<td>
						<form action="CustomerOptionController.jsp">
							<button class="btn" name="option" type="submit" value="return">Return To Form</button>
						</form>
					</td>	
				</tr>					
			</table>

			
		</div> <!-- formcontainer -->	
	</section>
	
	<footer>
		<%@ include file="template/footer.jsp" %>
	</footer>
</body>
</html>