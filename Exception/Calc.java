public class Calc{
	
	public void devide(int a, int b) throws ArithmeticException{
		int res = a/b;
		System.out.println("Result::: "+ res);
	}	
	
	public void devide1(int a, int b) {
		try{
			int res = a/b;
			System.out.println("Result::: "+ res);
		}catch(ArithmeticException ex){
			throw new ArithmeticException("Hey Mr Dumb cant devided by Zero");
		}
	}	
}