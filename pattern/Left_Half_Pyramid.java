package pattern;

public class Left_Half_Pyramid {

	public static void main(String[] args) {
		// 
		int n=4;
		int m=5;
		
		//Outer Loop
		for(int i=1;i<=n;i++)
		{
			//Inner Loop
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
