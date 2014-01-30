<!--
 ------------------------------------------------------------------------
 CustomerOptionController.jsp (Controller)
 
 Customer info is added to Customer Bean
 Redirected to page where customer info is displayed
 
 @author  Samir and T
 ------------------------------------------------------------------------
-->

<% out.println(request.getParameter("option")); 
   
   String Clicked = request.getParameter("option");
   
            if (Clicked.equals("Cancel")){
                    session.invalidate();
                    out.println(Clicked);
   
                        %>
                        <jsp:forward page="index.jsp" />
    
    
                          
               <%}
      
                else { 
                        out.println(Clicked); %>
      
                           
            <jsp:forward page="CustomerForm.jsp" />
                    <% }
                       out.println("test"); %>
           
       
   