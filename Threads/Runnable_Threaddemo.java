package Threads;

public class Runnable_Threaddemo implements Runnable{

	
	@Override
	public void run() 
	{
		System.out.println("Thread is Running");
		
	}
	
	public static void main(String[] args) {
		
		Runnable_Threaddemo t1 = new Runnable_Threaddemo();
		Thread tobj1 = new Thread(t1);
		
		tobj1.start();
		

	}

	

}
