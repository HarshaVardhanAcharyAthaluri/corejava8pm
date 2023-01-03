import java.io.*;

public class CharacterInputStreamDemo {
	
	public static void main(String[] args) throws IOException{
		File f = new File("input.txt");
		FileReader fr = new FileReader(f);
		int temp;
		
		while((temp = fr.read())!=-1){
			System.out.print((char)temp);
			
		}
		
		fr.close();
		
		
		
	}
	
	
}

