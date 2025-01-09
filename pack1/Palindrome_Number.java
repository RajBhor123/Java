package pack1;

public class Palindrome_Number {

	public static void main(String[] args) {
		 
		int num=171;
		int rem=0,temp,rev;
		
		rev=0;
		temp=num;
		
		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		
		if(temp==rev)
		{
			System.out.println("Given Number is Palindrome");
		}
		else {
			System.out.println("Given Number is Not Palindrome");
		}
	}

}
