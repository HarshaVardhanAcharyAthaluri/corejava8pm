public class Student{

	public static void main(String[] args){
		College c = new College(60);
		
		Thread student1 = new Thread(c);
		
		Thread student2 = new Thread(c);
		
		
		student1.setName("Student1");
		student2.setName("Student2");
		
		
		student1.start();
		student2.start();
		
		
		
		
	}
	
	
	
}