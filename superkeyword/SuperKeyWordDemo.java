class SuperKeyWordDemo extends Demo{
	
	int a = 55;
	
	void show(){
		int a = 77;
		Test t = new Test();
		System.out.println("t.a :: " + t.a);
		System.out.println("a :: " + a);
		System.out.println("this.a :: " + this.a);
		System.out.println("super.a :: " + super.a);
		System.out.println("C :: " + c);
	}
	
}