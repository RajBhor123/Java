package Threads;

public class ThreadExample extends Thread{

	public void run() 
	{
		System.out.println("Thread is Running");
		for(int i=1;i<5;i++)
		{
			System.out.println("i :"+i);
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		
		ThreadExample t1 = new ThreadExample();
		t1.setName("Thread 1");
		t1.start();
		
		ThreadExample t2 = new ThreadExample();
		t2.setName("Thread 2");
		t2.start();
		
		ThreadExample t3 = new ThreadExample();
		t3.setName("Thread 3");
		t3.start();
		
//		ThreadExample t4 = new ThreadExample();
//		t4.start();
	}
}
