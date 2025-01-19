package FunctionalInterface;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {

		Scanner myobj = new Scanner(System.in);
		Shape s1 = new Shape() {

			@Override
			public void area() 
			{
				System.out.println("Please enter length and width");
				int l = myobj.nextInt();
				int w = myobj.nextInt();
				System.out.println("Area of rectange"+(l*w));
				
			}
		};
		
		Shape tri=() -> {
			System.out.println("Triangle Method");
			System.out.println("Please enter height and width ");
			double l = myobj.nextDouble();
			double w = myobj.nextDouble();
			System.out.println("Area of triangle :"+(0.5*l*w));
		};
		
		Shape s2 = new Shape() {
			@Override
			public void area() {
				
				int l=20;
				int b=10;
				int res1=l*b;
				System.out.println("Area of the Rectangle :"+res1);	
			}
		};
		
		
		tri.area();

	}

}
