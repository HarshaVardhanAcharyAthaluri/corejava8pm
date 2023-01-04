import java.io.*;

public class SerializationDemo {
	
	public static void main(String[] args) throws IOException{
		
		Customer c = new Customer(007,"firstcustomer",123);
		
		FileOutputStream fos = new  FileOutputStream("customer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.close();
		
	}
	
	
}

