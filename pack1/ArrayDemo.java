package pack1;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[];
		a=new int[8];
		a[0]=6;
		a[1]=8;
		a[3]=5;
		
		int b[]=new int[8];
		Scanner myobj= new Scanner(System.in);
		//To enter the values into b
		for(int i=0;i<b.length;i++)
		{
			System.out.println("Enter the Value");
			b[i]=myobj.nextInt();
		}
		System.out.println();
		
		//Display the array of b
		for(int z=0;z<b.length;z++)
		{
			System.out.println("Counter Variable="+z+" is "+b[z]);
		}
		System.out.println();
		
		int c[]= {2,4,5,6,8};
		
		//Display the array of a
		for(int j=0;j<a.length;j++) 
		{
			System.out.println("Counter Variable="+j+" is "+a[j]);
		}
	}

}
