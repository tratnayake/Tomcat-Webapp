package model;

public class LineItem {
    String lineitemId, productId, orderId;
    int quantity;

    public LineItem() {
        lineitemId = "";
        quantity = 0;
        productId = "";
        orderId = "";         
    }

    public void setLineitemId( String value )
    {
        lineitemId = value;
    }

    public void setProductId( String value )
    {
        productId = value;
    }

    public void setOrderId( String value )
    {
        orderId = value;
    }

    public void setQuantity( int value )
    {
        quantity = value;
    }

    public String getLineitemId() { return lineitemId; }

    public String getProductId() { return productId; }

    public String getOrderId() { return orderId; }
    
    public int getQuantity() { return quantity; }
}