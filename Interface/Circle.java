package Interface;

public class Circle implements Shape{
	
	@Override
	public void area(int a) {
		
		System.out.println("Variable b from Interface Shape :"+b);
//		b=9; can not assign the value inside the class because it is assign inside inside interface and it is static and final
		double area=3.14*a*a;
		System.out.println("Area of Circle :"+area);
		
	}

	
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.area(4);

	}

	
}
