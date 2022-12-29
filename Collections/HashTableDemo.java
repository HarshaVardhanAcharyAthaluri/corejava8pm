import java.util.*;

public class HashTableDemo {
	
	public static void main(String[] args){
	  
	  Hashtable <String,String> hm = new Hashtable <String,String>();
	  
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

