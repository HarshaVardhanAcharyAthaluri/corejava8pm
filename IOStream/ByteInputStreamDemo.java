import java.io.*;

public class ByteInputStreamDemo {
	
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("input.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int temp;
		while((temp = bis.read())!=-1){
			System.out.print((char)temp);
		}
		
		fis.close();
		bis.close();
		
	}
	
	
}

