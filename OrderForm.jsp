<!--
 ------------------------------------------------------------------------
 OrderForm.jsp (View)
 

 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<%@ include file="template/header.jsp" %>

	<section>	

		<h2>Enter Customer Information:</h2>
		<form name="OrderForm" action='OrderController.jsp' method="post">
			<table class="form searchtable">
				<%= model.getProductTable() %>
			</table>
                        <button class="btn" type="submit" value="submit">SUBMIT</button>
		</form>
	</section>

<%@ include file="template/footer.jsp" %>