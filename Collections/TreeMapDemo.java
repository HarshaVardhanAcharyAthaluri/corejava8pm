import java.util.*;

public class TreeMapDemo {
	
	public static void main(String[] args){
	  
	  TreeMap<String,String> hm = new TreeMap<String,String>();
	  
	  hm.put("Monika","NY");
	  hm.put("Rachel","LA");
	  hm.put("Ross","Texas");
	  hm.put("Chandler","Ohio");
	  hm.put("JoeTribiani","Ohio");
	  
	  //System.out.println(hm);
	  
	  Set s = hm.keySet();

	  Iterator it = s.iterator();
		while(it.hasNext()){
			String key = it.next().toString();
			System.out.println(key + " :: "+hm.get(key));
		}
	}
	
	
}

