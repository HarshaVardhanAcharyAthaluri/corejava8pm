public class College implements Runnable{
	
	int seats;
	
	public College(int seats){
		this.seats = seats;
	}
	
	public void run(){
		seatAllotment();
		
		
	}
	
	private synchronized void seatAllotment(){
		Thread t = Thread.currentThread();
		
		String threadName = t.getName();
		
		System.out.println("Before Allotment to ::"+ threadName +",  No of Seats are ::  "+ seats);
		
		if(seats>0){
			try{
			Thread.sleep(2000);
			seats = seats-1;
			System.out.println(" Seat Allocated Succfully to :: " + threadName );
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
		}else{
			System.out.println("Unable to allocate the seat to :: "+ threadName);
			
		}
		
		if(seats>0)
		System.out.println("After Allotment to ::"+ threadName +" No of Seats are ::  "+ seats);
		
	}
	
	
}