import java.util.Stack;
import java.util.Iterator;

public class StackDemo {
	
	public static void main(String[] args){
	  
	  Stack al = new Stack();
	  
	   al.push("KITKAT SHAKE");
	   al.push("OREO SHAKE");
	   al.push("SNICKERS SHAKE");
	   al.push("BANANA CRUNCH");
	   al.push("BLUEBERRY SHAKE");
	   al.push("BANANA CRUNCH");
	  
	   System.out.println(al);
	   
	   System.out.println(al.pop());
	   
	    System.out.println(" After POP "+al);
		System.out.println(al.pop());
	   
	    System.out.println(" After POP "+al);
		System.out.println(al.peek());
		System.out.println(" After PEEK "+al);
	   
	}
	
	
}

