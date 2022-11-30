class Discount{
	
	 void dissount(int price){
		int finalPrice = price - ((price*5)/100);
		System.out.println("After 5 % discount :: "+finalPrice);
	}
	
}