<!--
 ------------------------------------------------------------------------
 OrderController.jsp (Controller)
 
 
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<!-- calls Customer Bean for the session -->
<jsp:useBean id="model" class="model.Customer" scope="session"/>

<%
    int numberofitems = 14;
    for (int i = 1; i <= numberofitems; i++)
    {
        String j = Integer.toString(i);
        String quantityasstring = request.getParameter(j);
        int quantityasint = Integer.parseInt(quantityasstring);

        if (quantityasint > 0)
        {
            %><%=j%>&nbsp<%=quantityasint%><br/><%
        }    
        
    }
%>



