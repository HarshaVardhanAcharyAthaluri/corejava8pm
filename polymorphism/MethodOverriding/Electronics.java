class Electronics extends Discount{
	void dissount(int price){
		int finalPrice = price - ((price*20)/100);
		System.out.println("After 20 % discount :: "+finalPrice);
	}
}