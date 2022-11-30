class Garment extends Discount{
	void dissount(int price){
		int finalPrice = price - ((price*10)/100);
		System.out.println("After 10 % discount :: "+finalPrice);
	}
	
}