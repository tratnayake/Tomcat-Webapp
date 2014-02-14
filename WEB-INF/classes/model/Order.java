package model;
import database.Database;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Order {
   
	Database database = new Database();
	
        String orderId;
        String orderDate;
        Double orderTotalCost;
        ArrayList<LineItem> items = new ArrayList<LineItem>();
        String customerId;
        

	public Order() {
	orderId="";
        orderDate="";
        orderTotalCost=0.0;
        customerId = "";
        
	}

    public void setOrderId( String value )
    {
        orderId = database.nextOrderID();
    }
    
    public void setOrderDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        orderDate = dateFormat.format(date);
    }
    
   
    
    public String getOrderId() { return orderId; }
    
    public String getOrderDate() { return orderDate; }
    
    public String getOrderTotalCost() { 
        
        String test ="";
    //STILL TESTING
    for (LineItem item: items){
         test += item.toString();
    }
    
    return test;
    
        //foreach lineitem in the order, compute the cost

    
    }
    

 
    
    public void createOrder(){
       Customer cust = new Customer();
        //Set the Order ID for this order
        this.orderId = database.nextOrderID();
        
        //Set the date for this order
       this.setOrderDate();
       
       // Set the customer ID
       this.customerId = cust.getCustomerId();
        
        //Create lineorders for each element in array
        
    }
    
    public void addLineItem(String ProductID, int Qty){
        LineItem item = new LineItem();
        Database database = new Database();
        item.setOrderId(this.orderId);
        item.setLineItemId(database.nextLineItemId());
        item.setProductId(ProductID);
        item.setQuantity(Qty);
        
        //Add to array
        items.add(item);
        
        
    }
}    