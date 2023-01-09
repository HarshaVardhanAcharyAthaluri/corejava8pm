

public class MultipleThreadOnMultipleObjDemo implements Runnable{
	
	String threadname;
	
	public MultipleThreadOnMultipleObjDemo(String threadname){
		this.threadname = threadname;
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(threadname + " :: Number :: "+ i);
		}
	}
	
	public static void main(String[] args){
		MultipleThreadOnMultipleObjDemo m = new MultipleThreadOnMultipleObjDemo("Thread1");
		Thread t = new Thread(m);
		
		MultipleThreadOnMultipleObjDemo m1 = new MultipleThreadOnMultipleObjDemo("Thread2");
		Thread t1 = new Thread(m1);
		
		t.start();
		t1.start();
		
		
	}
	
	
}

