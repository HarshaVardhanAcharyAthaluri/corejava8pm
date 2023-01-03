import java.io.*;

public class CharachterOutputDemo {
	
	public static void main(String[] args) throws IOException{
		File f = new File("Output.txt");
		
		
		FileWriter fw = new FileWriter(f);
		
		String s = "Hello Iam output";
		
		fw.write(s);
		fw.close();
		
		
		
	}
	
	
}

