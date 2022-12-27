import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args){
	  
	  ArrayList al = new ArrayList();
	  
	   al.add("KITKAT SHAKE");
	   al.add("OREO SHAKE");
	   al.add("SNICKERS SHAKE");
	   al.add("BANANA CRUNCH");
	   al.add("BLUEBERRY SHAKE");
	   al.add("BANANA CRUNCH");
	  
	   System.out.println(al);
	   
	   al.remove("BLUEBERRY SHAKE");
	   
	   System.out.println(al);
	   
	   System.out.println(al.size());
	   
	   System.out.println("At index 1 ::: "+ al.get(1));
	   
	   // Simple For Loop
	   System.out.println("ITERATING WITH SIMPLE FOR LOOP");
	   
	   for(int i = 0; i<al.size();i++){
		   System.out.println("At index  ::: "+ i +" ::: "+ al.get(i));
	   }
	   
	   // Simple ForEach Loop
	   
	   System.out.println("ITERATING WITH SIMPLE FOREACH LOOP");
	   
	   for(Object item:al){
		   System.out.println(item.toString());
	   }
	   
	   Iterator itr = al.iterator();
	   
	   System.out.println("ITERATING WITH Iterator");
	   while(itr.hasNext()){
		   System.out.println(itr.next());
	   }
	   
	   
	   
	   
	   
	}
	
	
}

