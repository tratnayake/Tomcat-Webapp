package model;
import database.Database;

public class Customer {
    String firstName, lastName, address, phoneNumber, email;
	Database database = new Database();

	public Customer() {
		firstName = "";
		lastName = "";
		address = "";
		phoneNumber = "";
		email = "";
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
	
	public String save(){
	return database.saveCustomer(firstName,lastName,address,email,phoneNumber);
	}
    
}