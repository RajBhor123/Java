package Threads;

import java.util.Scanner;

public class DepositThread extends Thread{
	
	Bank bobj;
	int amount;
	String depositer;
	
	
	public DepositThread(Bank bobj, int amount, String depositer) {
		this.bobj = bobj;
		this.amount = amount;
		this.depositer = depositer;
	}

	public void run()
	{
		bobj.deposit(depositer, amount);
		
	}

	public static void main(String[] args) {
		

	}

}
