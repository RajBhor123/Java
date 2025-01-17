package ExecptionHandling;

public class Execption_example {

	public static void main(String[] args) {
	
		int a=8;
		int b=5;
		
		String str=" Hello Good Morning";
		int c[]= {2,3,46,7};
		
		System.out.println("Inside the Sop"+str);
		try {
			int ans=b/0;
			try 
			{
				System.out.println("array"+c[10]);
			}
			catch(ArithmeticException e) 
			{
				System.out.println("Arithmetic Exception"+e);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Array index out of Bound error");
		}
		catch(Exception e) 
		{
			System.out.println("Parent Class of Exception ");
		}
		System.out.println("End of Program");
	}

}
