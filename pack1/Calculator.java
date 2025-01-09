package pack1;

public class Calculator {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=2;
		int result=0;
		char operator='/';
				
		if(operator == '+')
		{
			result=num1+num2;
		}
		else if(operator == '-')
		{
			result=num1-num2;
		}
		else if(operator == '*')
		{
			result=num1*num2;
		}
		else if(operator == '/')
		{
			if(num2!=0)
			{
				result=num1/num2;
		    }
			else
			{
				System.out.println("Divion of Zero is Not Divisible");
			}
		}
		else if(operator =='%')
		{
			result=num1%num2;
		}
		else
		{
			System.out.println("Enter the Valid Choices");
		}
		
		System.out.println("The Result="+result);
	}

}
