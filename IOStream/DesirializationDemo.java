import java.io.*;

public class DesirializationDemo{
	
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("customer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
		
		Customer ct = (Customer)obj;
		
		ct.getCustomer();
		
		fis.close();
		ois.close();
	}
	
	
	
	
}