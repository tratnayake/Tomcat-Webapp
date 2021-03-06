package model;
import database.Database;

public class Customer {
    String firstName, lastName, address, phoneNumber, email, id;
    Database database = new Database();

    public Customer() {
            firstName = "";
            lastName = "";
            address = "";
            phoneNumber = "";
            email = "";
            id = "";
    }

    public void setFirstName( String value )
    {
        firstName = value;
    }

    public void setLastName( String value )
    {
        lastName = value;
    }

    public void setAddress( String value )
    {
        address = value;
    }

    public void setEmail( String value )
    {
        email = value;
    }

    public void setPhoneNumber( String value )
    {
        phoneNumber = value;
    }
    
    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getAddress() { return address; }
    
    public String getEmail() { return email; }
    
    public String getPhoneNumber() { return phoneNumber; }
	
    public String getCustomerId()
    {
        return database.nextCustomerId();
    }
    
    public String save(){
        return database.saveCustomer(firstName,lastName,address,email,phoneNumber);
    }
    
    public String getProductTable()
    {
        this.id = database.productTable();
        return this.id;
    }
}