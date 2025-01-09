package pack1;

public class Armstrong_Number {

	public static void main(String[] args) {
		// 
		int rem=0,sum=0,num,temp;
		num=153;
		temp=num;

		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Given Number is Armstrong Number");
		}
		else {
			System.out.println("Given Number is not Armstrong Number");
		}
	}

}
