package Threads;

public class Demo {

	public static void main(String[] args) {

		Bank b1 = new Bank("Prachi",799,10000);
		WithDrawalThread t1 = new WithDrawalThread(b1, 2000, "mummy");
		DepositThread t2 = new DepositThread(b1,5000,"Papa");
		WithDrawalThread t3 = new WithDrawalThread(b1, 1000, "bhumika");
		DepositThread t4 = new DepositThread(b1,4000,"Kartik");
		WithDrawalThread t5 = new WithDrawalThread(b1, 8000, "aftab");
		DepositThread t6 = new DepositThread(b1,15000,"komal");



		t1.start(); 
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		b1.checkBalance();

	}

}
