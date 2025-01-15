package Abstract;

import java.util.Scanner;

public class Output_Of_Abstract {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Which Shape Do you wnat to Calculate ? \n 1.Circle 2.Rectangle 3.Triangle");
		int choice=sc.nextInt();
		
		switch(choice) 
		{
		  case 1: 
			    Circle c= new Circle();
				c.area(2, 0);
				break;
				
				
		  case 2:
			    Rectangle r= new Rectangle();
				r.area(3,5);
				break;
				
		  case 3:
			    Triangle t = new Triangle();
			    t.area(2, 6);
			    break;
		}

	}

}
