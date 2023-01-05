

public class RunnableDemo implements Runnable{
	
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Number "+ i);
		}
	}
	
	public static void main(String[] args){
		RunnableDemo m = new RunnableDemo();
		
		Thread t = new Thread(m);
		
		t.start();
		
		
	}
	
	
}

