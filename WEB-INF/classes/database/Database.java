package database;
import  java.sql.*;
import java.util.*;

public class Database{

private Statement stmt = null;
private Connection dbconn = null;

private String result   = "OK";
private String query    = "";
private String dburl    = "jdbc:odbc:WACKO";
private String dbdriver = "sun.jdbc.odbc.JdbcOdbcDriver" ;
public String customerid = "";
public String productTable = "";
public String productId = "";


public Database(){ }
    
    // You will need to add some parameters
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
    
	
	
    //Get Customer ID
    public String customerId()
    {
        result = connect();
        query = " select customerId from Customer";

        try{
            if (stmt.execute(query))
            {
                ResultSet searchResult = stmt.getResultSet();         
                
                if (searchResult != null)
                {
                    while (searchResult.next())
                    {
                        customerid = "";
                        customerid = searchResult.getString("customerId");
                    }    
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
    
        //Get Customer ID
    public String productTable()
    {
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
                                  
                    productTable += "<td><input type=\"number\" name=\"" + productId +"\" min=\"0\"></td>";
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
