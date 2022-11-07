class StringStringBufferStringBuilderDemo{

	public static void main(String[] args){
		
		String s = "Hello";
		System.out.println("HashCode ::" +s.hashCode() +" :: Content ::"+ s);
		s.concat(" World!");
		System.out.println("HashCode ::" +s.hashCode() +" :: Content After Concat ::"+ s);
		s = s.concat(" World!");
		System.out.println("HashCode ::" +s.hashCode() +" :: Content After Concat and asigning ::"+ s);
		
		System.out.println(" :: ============ :: ");
		StringBuffer sb = new StringBuffer("Java");
		System.out.println("HashCode for StringBuffer ::" +sb.hashCode() +" :: Content ::"+ sb);
		sb.append(" Programing!");
		System.out.println("HashCode for StringBuffer ::" +sb.hashCode() +" :: Content After Append::"+ sb);
		
		System.out.println(" :: ============ :: ");
		StringBuilder sbu = new StringBuilder("Demo");
		System.out.println("HashCode for StringBuilder ::" +sbu.hashCode() +" :: Content ::"+ sbu);
		sbu.append("Program");
		System.out.println("HashCode for StringBuilder ::" +sbu.hashCode() +" :: Content After Append::"+ sbu);
	}
}

