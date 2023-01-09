public class WaitDemo extends Thread{
	
	static int total = 0;

	public synchronized void run(){
		System.out.println(" Thread Stated User calculation");
		
		for(int i = 0;i<=10;i++){
			total = total+1;
			
		}
		
		System.out.println(" Thread Sending notification");
		notifyAll();
		System.out.println(" Thread sent notification "+ total);
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		WaitDemo w = new WaitDemo();
		Thread t = new Thread(w);
		System.out.println("Main thread ");
		
		t.start();
		synchronized(w){
			w.wait();
		}
		
		System.out.println("amin thread notification");
		
		System.out.println("main total :: "+ total);
		
		
		
		
	}
	
	
	
}