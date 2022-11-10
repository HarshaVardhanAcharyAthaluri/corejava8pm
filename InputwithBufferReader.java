import java.io.*;

class InputwithBufferReader{
	
	 
	public static void main(String[] args) throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println(" Enter first Number :: ");
	int firstnumber = Integer.parseInt(br.readLine());
	
	System.out.println(" Enter Second Number :: ");
	int secondnumer = Integer.parseInt(br.readLine());
	
	int res = firstnumber+secondnumer;
	System.out.println(" Addition of " + firstnumber + " and "+ secondnumer + " :: "+ res );

	}
}