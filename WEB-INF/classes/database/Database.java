package database;
import  java.sql.*;

public class Database{

private Statement stmt = null;
private Connection dbconn = null;

private String result   = "OK";
private String query    = "";
private final String dburl    = "jdbc:odbc:WACKO";
private final String dbdriver = "sun.jdbc.odbc.JdbcOdbcDriver" ;


public Database(){ }
    
    // Saves customer class into Customer Database
    public String saveCustomer(String lName, String fName, String address, String email, String phone){ 

        result = connect();

        query  = " insert into Customer (lastName,firstName,address,email,phone)";
        query += " values (";
        query += "'" + lName + "',";
        query += "'" + fName + "',";
        query += "'" + address + "',";
        query += "'" + email + "',";
        query += "'" + phone + "')";

        try{
            stmt.execute(query);
        }
        catch (SQLException e){   
            result  = " Save Customer:  Error processing the SQL!";
            result += " <br/>" +  e.toString();
        }
        finally{
        close();
        }
        return result;
    }
    
    // Saves order class into Order Database
    public String saveOrder(String orderId, String orderDate, String orderTotal, String customerId){ 

        result = connect();

        query  = " insert into Customer (lastName,firstName,address,email,phone)";
        query += " values (";
        query += "'" + orderId + "',";
        query += "'" + orderDate + "',";
        query += "'" + orderTotal + "',";
        query += "'" + customerId + "')";

        try{
            stmt.execute(query);
        }
        catch (SQLException e){   
            result  = " Save Customer:  Error processing the SQL!";
            result += " <br/>" +  e.toString();
        }
        finally{
        close();
        }
        return result;
    }	
    
    
    // Saves lineitem class into LineItem Database
    public String saveLineItem(String lineItemId, int qty, String productId, String orderId){ 

        result = connect();

        query  = " insert into Customer (lastName,firstName,address,email,phone)";
        query += " values (";
        query += "'" + lineItemId + "',";
        query += "'" + qty + "',";
        query += "'" + productId + "',";
        query += "'" + orderId + "')";

        try{
            stmt.execute(query);
        }
        catch (SQLException e){   
            result  = " Save Customer:  Error processing the SQL!";
            result += " <br/>" +  e.toString();
        }
        finally{
        close();
        }
        return result;
    }    
	
    //Gets next Customer ID
    public String nextCustomerId()
    {
        String customerid = "1";
        result = connect();
        query = " select customerId from Customer";

        try{          
            stmt.execute(query);
            ResultSet searchResult = stmt.getResultSet();         

            if (searchResult != null)
            {
                while (searchResult.next())
                {                      
                    searchResult.getRow();
                    customerid = searchResult.getString(1);
                }    
            }                         
            result = customerid;         
        }
        catch (SQLException e){   
           result  = " Save Customer ID:  Error processing the SQL!";
           result += " <br/>" +  e.toString();
        }
        finally{
        close();
        }

        return result;    
    }
    
    //Gets the Product Table
    public String productTable()
    {
        String productTable = "";
        result = connect();
        query = " select * from ProductCatalog";
        

        try{
            if (stmt.execute(query))
            {
                ResultSet searchResult = stmt.getResultSet();
                ResultSetMetaData metadata = searchResult.getMetaData();
                
           
                int numberofcolumns = metadata.getColumnCount();

                productTable = "<table><tr>";
                for (int i = 1; i <= numberofcolumns; i++)
                {
                    productTable += "<td>" + metadata.getColumnLabel(i) + "</td>";
                }
                productTable += "</tr>"; 

                String productId = "";
                while (searchResult.next())
                {
                    searchResult.getRow();
                    productTable += "<tr>";
                   
                    
                    for (int i = 1; i <= numberofcolumns; i++)
                    {
                        if (i == 1)
                        {
                            productId = searchResult.getObject(i).toString();
                            productTable += "<td>" + productId + "</td>";
                        }
                        else
                        {    
                            productTable += "<td>" + searchResult.getObject(i).toString() + "</td>";
                        }    
                    }
                                  
                    productTable += "<td><input type=\"number\" name=\"" + productId +"\" min=\"0\" value=\"0\"></td>";
                    productTable += "</tr>";
                }
                productTable += "</table>";
                    
            }          
            result = productTable;         
        }
        catch (SQLException e){   
           result  = " Product Table:  Error processing the SQL!";
           result += " <br/>" +  e.toString();
        }
        finally{
        close();
        }

        return result;    
    }
    
    // Gets the last Order ID
    public String nextOrderId()
    {
        String orderId = "1";    
        result = connect();
        query  = " select orderId from OrderInfo";
	    
        try{
            stmt.execute(query);    
            ResultSet searchResult = stmt.getResultSet();         

            if (searchResult != null)
            {
                while (searchResult.next())
                {
                    searchResult.getRow();
                    orderId = searchResult.getString(1);
                }    
            }
        result = orderId;
        }
	    
        catch (SQLException e){   
            result  = " Next orderid:  Error processing the SQL!";
            result += " <br/>" +  e.toString();
        }
        finally{
        close();
        }
        return result;	    	    
    }
    
    
    // Gets next LineItem ID
    public String nextLineItemId(){
        String lineItemId = "1";
        result = connect();

        query  = " select lineItemId from LineItem";

        try{	    
            stmt.execute(query);
            ResultSet searchResult = stmt.getResultSet();         

            if (searchResult != null)
            {
                while (searchResult.next())
                {
                    searchResult.getRow();
                    lineItemId = searchResult.getString(1);
                }    
            }         
        result = lineItemId;
        }

        catch (SQLException e){   
            result  = " Next line item:  Error processing the SQL!";
            result += " <br/>" +  e.toString();
        }
        finally{
        close();
        }
        return result;	    	    
    }
    
    // Gets the individual product cost from product table
    public String getIndividualItem(String productId, String columnName){

        String itemCost = "";
        result = connect();

        query  = " select " +columnName + " from ProductCatalog"
               + " where productId='" + productId + "'";

        try{	    
            stmt.execute(query);
            ResultSet searchResult = stmt.getResultSet();         

            
            if (searchResult != null)
            {
                while (searchResult.next())
                {
                    searchResult.getRow();
                    itemCost = searchResult.getString(1);
                }    
            }              
            result = itemCost;
        }

        catch (SQLException e){   
            result  = " Individual item:  Error processing the SQL!";
            result += " <br/>" +  e.toString();
        }
        finally{
        close();
        }
        return result;	    	    
    }    
    
    
    

/*--------------------------------Private ---------------------------------------*/

private String connect(){
    try
    {
		//Load driver
          Class.forName(dbdriver);
            /*  getConnection(URL) */
			dbconn = DriverManager.getConnection(dburl);
        
            /*  create Statement */		
			stmt = dbconn.createStatement();
     
        
    }
    catch (ClassNotFoundException e)
    {   result  = " Error creating database drive class!";
        result += " <br/>" +  e.toString();
    }
    catch (SQLException e)
    {   result  = " Error processing connect!";
        result += " <br/>" +  e.toString();
    }  
	return result;
  }

  private String close(){
        try
        {   if (dbconn != null)
            {
			stmt.close();
			dbconn.close(); }
        }
        catch (SQLException e)
        {   result  = "Error in closing connection.";
            result += " <br/>" +  e.toString();
        }
		return result;
    }

  
    
}
