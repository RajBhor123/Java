package Interface;

public class Employee {
	
	String ename;
	
	void getname(String name)
	{
	    ename=name;
		
	}
	
	void printname()
	{
		System.out.println("Name of the Employee :"+ename);
	}

	public static void main(String[] args) {
		
//		Employee e= new Employee();
//		e.printname("Raj");

	}

}
