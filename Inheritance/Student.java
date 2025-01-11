package Inheritance;

public class Student extends College{

	int id;
	String name;
	
	void display() {
		System.out.println("Id :"+id);
		System.out.println("Student name :"+name);
	}
	public static void main(String[] args) {
		
		College c1= new College();
		c1.clgname="ITVEDANT";
		c1.city="Mumbai";
		System.out.println("  C1 object ");
		c1.displayinfo();
		
		Student s1= new Student();
		s1.id=1;
		s1.name="Raj";
		s1.clgname="ITvedant";
		s1.city="Pune";
		System.out.println(" S1 Object ");
		s1.displayinfo();
		s1.display();
		

	}

}
