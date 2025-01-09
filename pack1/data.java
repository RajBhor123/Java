package pack1;

public class data {

	public static void main(String[] args) {
		//Arithematic Operation
		// Integer to Float Converter
		int a=3;
		int b=2;
		float ans;
		ans=a/b;
		System.out.println(ans);
		
		//FLoat to Integer Converter
		float c=3;
		float d=2;
		int res;
		res=(int) (c/d);
		System.out.println(res);
		
		//FLoat to Integer Converter
		double e=3.5;
		double f=2.5;
		double answer;
		answer= e/f;
		System.out.println(answer);
		
		double g=3.5;
		double h=2.5;
		double result;
		result=a%b;;
		System.out.println("Result="+result);
		
		
		double i=3.2;
		double j=2.5;
		double res2;
		res2=i%j;
		System.out.println("Result="+res2);
		
		double k=45;
		double n=35;
		double res3;
		res3=k%n;
		System.out.println("Result="+res3);
		
		//Relational Operator
		int x=3;
		int y=2;
		boolean res4;
		res4=x>y;
		System.out.println("Result="+res4);
		
		//Bitwise Operator
		int m = 9, o = 8;   
		// bitwise and   
		// 1001 & 1000 = 1000 = 8  
		System.out.println("m= & o= " + (m | o));  
		
		System.out.println((a&b)); 
	}

}
