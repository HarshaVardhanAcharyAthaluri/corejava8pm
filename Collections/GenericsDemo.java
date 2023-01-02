import java.util.*;

public class GenericsDemo {
	
	public static void main(String[] args){
	  
		Student s = new Student(1,"Rachel");
		Student s2 = new Student(2,"Ross";
		
		
		
		List<Student> l = new ArrayList<Student>();
		l.add(s);
		l.add(s2);
	
		
		for(Student item : l){
			System.out.println(item.roll + " :: "+ item.name);
			
		}

	}
	
	
}

