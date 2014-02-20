<!--
 ------------------------------------------------------------------------
 OrderController.jsp (Controller)
 
 
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<!-- calls Customer Bean for the session -->
<jsp:useBean id="model" class="model.Customer" scope="session"/>
<jsp:useBean id="order" class="model.Order" scope="session"/>
<%@page import  = "java.util.*"%>

<%
    int numberofitems = 14;

    order.createOrder();

    ArrayList lineItems = new ArrayList();   
    for (int i = 1; i <= numberofitems; i++)
    {
        String j = Integer.toString(i);
        String quantityasstring = request.getParameter(j);
        int quantityasint = Integer.parseInt(quantityasstring);
        
        
        if (quantityasint > 0)
        {               
            order.addLineItem(j,quantityasint);                   
        }          
    }
%>

<!-- redirects to order summary page -->
<jsp:forward page="OrderConfirm.jsp" />

