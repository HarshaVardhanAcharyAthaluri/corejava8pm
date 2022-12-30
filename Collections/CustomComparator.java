import java.util.*;

public class CustomComparator {
	
	public static void main(String[] args){
	  
	 TreeSet ts = new TreeSet(new DemoComperator());
	 ts.add(500);
	 ts.add(250);
	 ts.add(650);
	 ts.add(100);
	 ts.add(750);
	 
	 System.out.println(ts);
	 
	 
	 
	}
	
	
}

