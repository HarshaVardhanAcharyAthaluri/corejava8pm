import java.util.*;

public class TreeSetComapartor {
	
	public static void main(String[] args) {
	 
	Student s1 = new Student(7,"Joe Tribianny");
	Student s2 = new Student(5,"Monika");
	Student s3 = new Student(3,"Chandler");
	Student s4 = new Student(2,"Rachel");
	Student s5 = new Student(1,"Ross");
	Student s6 = new Student(4,"Pheebe");
	Student s7 = new Student(6,"Gunthur");
	 
	 Set ts = new TreeSet();
	 ts.add(s1);
	 ts.add(s2);
	 ts.add(s3);
	 ts.add(s4);
	 ts.add(s5);
	 ts.add(s6);
	 ts.add(s7);

	 
	 for(Object obj: ts){
		 Student s = (Student)obj;
		 s.details();
		 
	 }
	 
	 
	 
	 
	 
	}
	
	
}

