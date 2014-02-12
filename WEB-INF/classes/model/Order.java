package model;
import database.Database;

public class Order {
   
	Database database = new Database();
	public String orderId = "";

	public Order() {
	
	}

    public void setOrderId( String value )
    {
        orderId = database.order();
    }
    
    public String getOrderId() { return orderId; }
 
    
    
}    