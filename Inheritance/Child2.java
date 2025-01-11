package Inheritance;

public class Child2 extends Parent{
	
	String child2name;
	
	void DisplayChild2name() 
	{
		System.out.println(child2name);
	}
	
	void display() {
		System.out.println(child2name+" "+parentname+" "+Grandparentname);
	}
	public static void main(String[] args) {
		
		Child2  c2= new Child2();
		
		c2.Grandparentname="Bhor";
		c2.parentname="Sharad";
		c2.child2name="Neel";
		
		c2.display();
	}

}
