package FinalKeyword;

final public class Circle {

	int r;
	final double pi;
	
	Circle  (double a)
	{
		pi=a;	
	}
	final void area(int r) 
	{
		double areaofcircle=pi*r*r;
		System.out.println("Area of Circle "+areaofcircle);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c= new Circle(3.14);
		c.area(3);
//		c.pi=2.22;    Resigning the value of the pi is not allowed in one assign in constructor
	}

}
