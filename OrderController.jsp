<!--
 ------------------------------------------------------------------------
 OrderController.jsp (Controller)
 
 
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<!-- calls Customer Bean for the session -->
<jsp:useBean id="model" class="model.Customer" scope="session"/>
<jsp:useBean id="order" class="model.Order" scope="page"/>
<%@page import  = "java.util.*"%>
<%@page import  = "java.*"%>

<%
    int numberofitems = 14;

//create an order
    order.createOrder();


    ArrayList lineItems = new ArrayList();   
    for (int i = 1; i <= numberofitems; i++)
    {
        String j = Integer.toString(i);
        String quantityasstring = request.getParameter(j);
        int quantityasint = Integer.parseInt(quantityasstring);
        
        
        if (quantityasint > 0)
        {   
            // invoke Order.addLineItem(j,quantityasint);
                    order.addLineItem(j,quantityasint);
                    
        }    
        
    }
  out.println(order.getOrderTotalCost());
%>


