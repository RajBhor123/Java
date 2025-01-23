package Threads;

public class Bank {
	
	String accountholder;
	int accounno;
	int totalamount;
	
	
	public Bank(int totalamount) 
	{
		
		this.totalamount = totalamount;
	}


	public Bank(String accountholder, int accounno, int totalamount) 
	{
		
		this.accountholder = accountholder;
		this.accounno = accounno;
		this.totalamount = totalamount;
	}


	synchronized void withdraw(String name,int wdamount)
	{
		if(wdamount<totalamount)
		{
			totalamount = totalamount - wdamount;
			System.out.println("Amount after withdrawal : "+totalamount+", Amount WithDrawal by :"+name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Amount is greater than avaible amount");
		}
	}
	
	
	synchronized void deposit(String name,int damount)
	{
		
			totalamount = totalamount + damount;
			System.out.println("Amount after deposit : "+totalamount+" ,Amount Deposit by :"+name);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void checkBalance() 
	{
		System.out.println("Total Amount :"+totalamount);
	}

	public static void main(String[] args) {
		
		

	}

}
