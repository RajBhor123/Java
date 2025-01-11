package Inheritance;

//  Inheritance 
public class Child extends Parent {

	String childname;
	
	void DisplayChildname() 
	{
		System.out.println(childname);
	}
	
	void display() {
		System.out.println(childname+" "+parentname+" "+Grandparentname);
	}
	public static void main(String[] args) {

		Child  c1= new Child();
		
		c1.Grandparentname="Bhor";
		c1.parentname="Sharad";
		c1.childname="Raj";
		
		c1.display();
	}

}
