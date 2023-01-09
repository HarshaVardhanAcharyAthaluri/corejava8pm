public class SleepDemo implements Runnable{
	
	public void run(){
		try{
			
			for(int i=1;i<=10;i++){
				Thread.sleep(2000);
			System.out.println("Number "+ i);
		}
			
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
		
	}
	
	public static void main(String[] args){
		SleepDemo m = new SleepDemo();
		
		Thread t = new Thread(m);
		
		t.start();
		
		
	}
	
	
}