

public class ThreadClassDemo extends Thread{
	
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("Number "+ i);
		}
	}
	
	public static void main(String[] args){
		ThreadClassDemo m = new ThreadClassDemo();
		
		Thread t = new Thread(m);
		
		t.start();
		
		
	}
	
	
}

