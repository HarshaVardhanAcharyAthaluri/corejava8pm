import java.util.*;

public class HashSetDemo {
	
	public static void main(String[] args){
	  
	  HashSet hs = new HashSet();
	  
	   System.out.println(hs.isEmpty());
	  
	  hs.add("Samsung");
	  hs.add("Nokia");
	  hs.add("Moto");
	  hs.add("Apple");
	  hs.add("BlackBerry");
	  hs.add("Apple");
	  
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

