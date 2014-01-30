<!DOCTYPE html>

<!--
 ------------------------------------------------------------------------
 DisplayCustomer.jsp (View)
 
 Displays customer info and gives customer a choice of:
 cancel, confirming, or restarting
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<%@ include file="template/header.jsp" %>
	
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
			

						<form action="ConfirmCustomerController.jsp">
							<button class="btn" name="option" type="submit" value="confirm">Confirm</button>
						</form>

						<form action="CustomerOptionController.jsp">
							<button class="btn" name="option" type="submit" value="cancel">Cancel</button>
						</form>

						<form action="CustomerOptionController.jsp">
							<button class="btn" name="option" type="submit" value="return">Return To Form</button>
						</form>


			
		</div> <!-- formcontainer -->	
	</section>
	

<%@ include file="template/footer.jsp" %>
