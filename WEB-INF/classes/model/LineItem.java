package model;

public class LineItem {
    String LineItemId, productId, orderId;
    int quantity;
    double totalprice,price;
    

    public LineItem() {
        LineItemId = "";
        quantity = 0;
        productId = "";
        totalprice = 0.0;
        orderId ="";

    }

    
    public void setOrderId (String value){
        orderId = value;
    }
    public void setLineItemId( String value )
    {
        LineItemId = value;
    }

    public void setProductId( String value )
    {
        productId = value;
    }

   
    
    public void setQuantity( int value )
    {
        quantity = value;
    }
    

    
    public void setPrice (double value){
        price = value;
    }
    
    public void setTotalPrice(){
        totalprice = price * quantity;
    }
  

    public String getLineitemId() { return LineItemId; }

    public String getProductId() { return productId; }
    

    
    public int getQuantity() { return quantity; }
    

    
    public double getPrice() { return price; }
    
    public double getTotalPrice() { return totalprice; }
    
    public String getOrderId() { return orderId; }
}