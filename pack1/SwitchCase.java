package pack1;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=19,result=0;
		
		char choice='+';
		
		switch(choice)
		{
		case '+':
				 result=a+b;
				 System.out.println("Addition of two Number="+result);
				 break;
		case '-':
				result=a-b;
				System.out.println("Subtraction of two Number="+result);
				break;
		case '*':
			 	result=a*b;
			 	System.out.println("Multipliocation of two Number="+result);
			 	break;
		case '/':
			 	result=a+b;
			 	System.out.println("Division two Number="+result);
			 	break;
		default:
				System.out.println("Enter the Valid Choice:");
		}
	}

}
