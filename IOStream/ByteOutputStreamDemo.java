import java.io.*;

public class ByteOutputStreamDemo {
	
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("input.txt");
		
		FileOutputStream fos = new FileOutputStream("output.txt",true);
		
		int temp;
		while((temp = fis.read())!=-1){
			fos.write(temp);
		}
		
		fis.close();
		fos.close();
		
	}
	
	
}

