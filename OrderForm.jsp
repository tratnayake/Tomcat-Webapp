<!--
 ------------------------------------------------------------------------
 OrderForm.jsp (View)
 

 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<%@ include file="template/header.jsp" %>




	<section>	
		<!-- Form layout -->
		<div class="formcontainer">

			<h2>Enter Customer Information:</h2>
			<form name="OrderForm" action='OrderController.jsp' method="post">
			<table>

			<%= model.getProductTable() %>

			<tr>
				<td><button class="button" type="submit" value="submit">SUBMIT</button></td>
			</tr>
			</table>
		</div> <!-- formcontainer -->
	</section>

<%@ include file="template/footer.jsp" %>