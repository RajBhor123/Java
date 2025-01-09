package pack1;

public class Compare_Floating_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=25.67875;
		double b=29.87887;
		
		double result1 = a - (int) a; 
		double result2 = b - (int) b;
		
		
		System.out.println("The value of Result1="+result1);
		System.out.println("The value of Result2="+result2);
		
		int value1=(int)(result1*1000);
		int value2=(int)(result2*1000);
		
        if (value1 == value2) {
            System.out.println("The Number of the two floating-point numbers are same.");
        } else {
            System.out.println("The Number  of the two floating-point numbers are different.");
			
		}
		
/*		double a=25.68745;
		int b=(int)a;
		double c=a-b;
		double d=c*1000;
		int e=(int)d;
		
		double f=26.68795;
		int g=(int)f;
		double h=f-g;
		double i=h*1000;
		int j=(int)i;
		
		if(e==j)
		{
			System.out.println("The Number of the two floating-point numbers are same.");
		}
		else {
			 System.out.println("The Number  of the two floating-point numbers are different.");
		}*/
	}

}
