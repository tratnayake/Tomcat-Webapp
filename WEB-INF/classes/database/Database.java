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

public Database(){ }
    
	
//more methods  ...


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
		 System.out.println("method invoked");
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
    
	
	
	//More methods  ...

/*--------------------------------Private ---------------------------------------*/

private String connect(){
    try
    {
		//Load driver
          Class.forName(dbdriver);
              /*  getConnection(URL) */
Connection dbconn = DriverManager.getConnection(dburl);
        
              /*  create Statement */
		String query = "select * from product;";
         stmt = dbconn.createStatement();
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
