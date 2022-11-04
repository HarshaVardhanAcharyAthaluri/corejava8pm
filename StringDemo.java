class StringDemo{

	public static void main(String[] args){
		
		String s  = new String("Hello String");
		System.out.println("Before COnact:: "+s);
		s = s.concat("PlayGround");
		System.out.println("After COncat ::"+s);
		System.out.println("Cahr AT 13 "+ s.charAt(13));
		System.out.println("Lenght of String "+s.length());
		System.out.println("contains  "+s.contains("world"));
		s = s.trim();
		System.out.println("Trim  "+s);
		
		
		String cource = new String("java");
		String cource1 = new String("Java PrOgramIng");
		
		System.out.println(cource==cource1); 
		System.out.println(cource.equals(cource1));
		System.out.println(cource.equalsIgnoreCase(cource1));
		System.out.println("Upper case "+cource.toUpperCase());
		System.out.println("Upper case "+cource1.toLowerCase());
		
		
		cource = cource.replace('j','a');
		System.out.println(cource);


		
	}
}