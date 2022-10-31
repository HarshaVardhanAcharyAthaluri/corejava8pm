class DoWhile{

	
	public static void main(String[] args){
	
		int n = 11;
		
		int j = 11;
		
		while(j<=10){
			System.out.println(" While :: "+ " 2 * "+ j + " = " + j*2);
			j++;
			
		}
		
		System.out.println("======= ======");
		
		do{
			System.out.println(" Do - While :: "+ " 2 * "+ n + " = " + n*2);
			n++;
		}while(n<=10);
		

	}
}