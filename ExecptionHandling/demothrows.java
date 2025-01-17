package ExecptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class demothrows {

	void check(int number) throws ArithmeticException	
	{
		System.out.println("Please Enetr the Number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0) 
		{
			System.out.println("Number is Positive");
		}
		else
		{
			throw new ArithmeticException("Number is not Positive .It is a Negative Number") ;
		}
	}
	public static void main(String[] args) {
		
		demothrows obj=new demothrows();
		try 
		{
			obj.check(5);
		}
		catch(ArithmeticException e)
		{
				System.out.println("Arithmetic Exception in catch block");
		}
		
		}

//		try {
//			obj.check(9);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Inside the catch block of public static void main method \n Please Enter the positive Number");
//		}
//		finally 
//		{
//			System.out.println("Inside the Finally Block");
//		}

		
		
		
		
	}

