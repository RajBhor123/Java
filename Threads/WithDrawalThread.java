package Threads;

import java.util.Scanner;

public class WithDrawalThread extends Thread{

	public Bank bobj;
	public int wamount;
	public String wname;
	
	public WithDrawalThread(Bank bobj, int wamount, String wname)
	{
		
		this.bobj = bobj;
		this.wamount = wamount;
		this.wname = wname;
	}

	public void run()
	{
		bobj.withdraw(wname, wamount);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
