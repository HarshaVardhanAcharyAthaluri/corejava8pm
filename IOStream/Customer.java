import java.io.*;

public class Customer implements Serializable{
	
	int customeId;
	
	String customerName;
	transient int pin = 0;
	
	public Customer(int customeId, String customerName,int pin){
		this.customeId = customeId;
		this.customerName = customerName;
		this.pin = pin;
	}
	
	
	public void getCustomer(){
		
		System.out.println("CID :: "+ customeId +" :: "+ " customerName :: "+ customerName + "  pin :: "+ pin);
	}
	
	
}