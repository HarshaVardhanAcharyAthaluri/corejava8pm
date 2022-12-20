public class MyApp {
	public static void main(String[] args){
		Calc c = new Calc();
		
		try{
		    c.devide(4,0);
		}catch(ArithmeticException ex){
			ex.printStackTrace();
		}
		
		try{
		    c.devide1(4,0);
		}catch(ArithmeticException ex){
			ex.printStackTrace();
		}
		
		System.out.println("Operation Complete");
		
	}
	
	
}

