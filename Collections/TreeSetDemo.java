import java.util.*;

public class TreeSetDemo {
	
	public static void main(String[] args){
	  
	  TreeSet hs = new TreeSet();
	  
	  System.out.println(hs.isEmpty());
	  
	  hs.add("Samsung");
	  hs.add("Nokia");
	  hs.add("Moto");
	  hs.add("Apple");
	  hs.add("BlackBerry");
	  hs.add("Apple");
	  hs.add("Sony");
	  hs.add("Asus");
	  
	  System.out.println(hs);
	  
	 System.out.println(hs.contains("lkjlk"));
	 System.out.println(hs.isEmpty());
	 
	 Iterator it = hs.iterator();
	 
	 System.out.println(" :::: Iterating :::: ");
	 while(it.hasNext()){
		 System.out.println(it.next());
	 }

	   
	}
	
	
}

