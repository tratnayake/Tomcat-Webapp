package model;
import database.Database;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Order {
   
    Database database = new Database();
    ArrayList<LineItem> items = new ArrayList<LineItem>();
    ArrayList<String[]> itemsSummary = new ArrayList<>();
    

    String orderId, orderDate, customerId;
    int orderTotalCost;    


    public Order() {
        orderId="";
        orderDate="";
        orderTotalCost=0;
        customerId = "";       
    }

    public void setOrderId( String value )
    {
        orderId = database.nextOrderId();
    }
    
    public void setOrderDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        this.orderDate = dateFormat.format(date);
    }
    
    public String getOrderId() { return orderId; }
    
    public String getOrderDate() { return orderDate; }
    
    
    public void createOrder(){
       Customer customer = new Customer();
       
        //Set the Order ID for this order
        this.orderId = database.nextOrderId();
        
        //Set the date for this order
       setOrderDate();
       
       // Set the customer ID
       this.customerId = customer.getCustomerId();        
    }
    
    public void addLineItem(String productId, int Qty){
        
        LineItem item = new LineItem();
        item.setOrderId(this.orderId);
        item.setLineItemId(database.nextLineItemId());
        item.setProductId(productId);
        item.setQuantity(Qty);
        
        //Add to array
        items.add(item);
        
        String[] itemCustomer = new String[7];
        
        String quantity = Integer.toString(Qty);
        String type = database.getIndividualItem(productId, "type");
        String size = database.getIndividualItem(productId, "size");
        String color = database.getIndividualItem(productId, "color");
        
        String productCostString = database.getIndividualItem(productId, "price");
        int productCost = Integer.parseInt(productCostString);        
      
        int costofItem = productCost * Qty;
        String totalCostofItem = Integer.toString(costofItem);
        orderTotalCost = orderTotalCost + costofItem;
    
        itemCustomer[0] = productId;
        itemCustomer[1] = quantity;
        itemCustomer[2] = type;
        itemCustomer[3] = size;
        itemCustomer[4] = color;
        itemCustomer[5] = productCostString;
        itemCustomer[6] = totalCostofItem;
        itemsSummary.add(itemCustomer);       
    }
    
    
    public String orderSummary(){

        String summary = "<h3>Date of Order: " + orderDate + "</h3><br/>"
                       + "<h3>Total Cost $" + orderTotalCost + "</h3><br/><br/>"
                       + "<tr><td>Product ID</td><td>Quantity</td><td>Type</td><td>Size</td>"
                       + "<td>Color</td><td>Cost Per</td><td>Total Cost</td></tr><tr>";
        
        for (int i=0; i < itemsSummary.size(); i++)
        {
            String[] item = itemsSummary.get(i);
            for (int j=0; j < 7; j++)
            {
                summary += "<td>" + item[j] + "</td>";
            }
            summary += "</tr><tr>";
        }
		summary += "</tr>";

        return summary;
    }
      
}    