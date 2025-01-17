package ExecptionHandling;

import java.io.IOException;

public class throwdemo {

	void eligible(int age) 
	{
		if(age>18) 
		{
			System.out.println("Candidate is Eligible");
		}
		else
		{
			throw new ArithmeticException("Candidate is Below 18") ;
		}
	}
	public static void main(String[] args) {
		
		throwdemo obj=new throwdemo();
		try {
			obj.eligible(14);
		}
		catch(Exception e)
		{
			System.out.println("Inside the catch block of public static void main method \n Please Update the Age");
		}
		finally 
		{
			System.out.println("Inside the Finally Block");
		}

		throwsdemo obj1 =new throwsdemo();
		try {
			obj1.demo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
