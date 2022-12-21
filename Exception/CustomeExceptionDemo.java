public class CustomeExceptionDemo{
	
	public static void main(String[] args){
	  int age = Integer.parseInt(args[0]);
			
		if(age>18){
			System.out.println("Eligible to Cast your Vote");
		}else{
			throw new AgeException("Age is not Suffecient");
		}
		
	}
}