package Threads;

public class ThreadMainDemo {

	public static void main(String[] args) {

		Threaddemo1 t1 = new Threaddemo1();
		Threaddemo2 t2 = new Threaddemo2();
		
		t1.start();
		t2.start();

	}

}
