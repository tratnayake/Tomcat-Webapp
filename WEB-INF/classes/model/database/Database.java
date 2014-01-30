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
    
    
  private void connect() {
    }
    
    private void close() {
    }
    
    public String saveCustomer(String IName, String fName, String address, String email, String phone){
    return "Button Has Been Pressed!";
    }
   


	// You will need to add some parameters
    }