package pack1;

import java.util.Scanner;

public class Cal1 {

	int num1,num2;
	
	// Function with No Arguments and no Return Type
	void Addition()
	{
		Scanner myobj= new Scanner(System.in);
		System.out.println("Enter the values :");
		num1=myobj.nextInt();
		num2=myobj.nextInt();
		int result=num1+num2;
		System.out.println("Addition of the Two Number :"+result);
	}
	
	// Function with Arguments and no Return Value
	void Subtraction(int a,int b)
	{
		num1=a;
		num2=b;
		int result=num1-num2;
		System.out.println("Subtraction of the two number :"+result);
	}
	
	//Function with Argument and Return Value
	int Multiplication(int a, int b)
	{
		num1=a;
		num2=b;
		int result=num1*num2;
		return result;
		
	}
	
	//Function with No Argument and Return Value
	float Division()
	{
		num1=6;
		num2=2;
		float result=num1/num2;
		return result;
	}
	public static void main(String[] args) {
		
		Cal1 c1= new Cal1();
		
		//Calling the Function of the Addition 
		c1.Addition();
		
		// calling the Function of the Subtraction by passing the Argument to it.
		c1.Subtraction(7, 5);
		
		// Calling the Function of the Multiplication by passing the Argument to it.
		// and storing that return value by creating the new variable inside the main function.
		int result= c1.Multiplication(5,7);
		System.out.println("Multiplication of Two Number :"+result);
		
		// Calling the Function of the Division by passing the Return type inside the function
		// and storing that return value by creating the new variable inside the main function
		float result1=c1.Division();
		System.out.println("Division of Two Number :"+result1);

	}

}
