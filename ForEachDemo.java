class ForEachDemo{

	
	public static void main(String[] args){
	
		int items[] = {10,200,300,700,80};
		
		for(int i = 0;i<items.length;i++){
			System.out.println(" Element ::: "+items[i]);
		}

		System.out.println(" === Iteration with ForEach ===== ");
	
		for(int temp:items){
			System.out.println(" Element ::: "+temp);
		}
		

	}
}