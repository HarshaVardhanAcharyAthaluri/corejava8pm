public class Student implements Comparable{
	
	public int rollno;
	public String name;
	
	public Student(int rollno,String name){
		this.rollno  = rollno;
		this.name = name;
	}
	
	public void details(){
		System.out.println("rollno :: "+ rollno + " name :: "+ name);
	}
	
	public int compareTo(Object obj){
		Student s = (Student)obj;
		return this.name.compareTo(s.name);
	}
}