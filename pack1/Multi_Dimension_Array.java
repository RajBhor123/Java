package pack1;

import java.util.Scanner;

public class Multi_Dimension_Array {

	public static void main(String[] args) {
		
		//MultiDimensionArray
		int a[][]= new int[3][3]; //a[rows][colums]
		Scanner myobj= new Scanner(System.in);
		
		//Outer Loop for Rows
		for(int i=0;i<3;i++)
		{
			//Inner Loop for COlums
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter the Values at index a[" + i + "][" + j + "]:");
				a[i][j]= myobj.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
