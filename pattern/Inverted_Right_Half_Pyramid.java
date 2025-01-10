package pattern;

public class Inverted_Right_Half_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		//Outer Loop
		for(int i=1;i<=n;i++)
		{
			//Inner Loop->space print
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//Inner Loop-> star Print
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
