package Superkeyword;

public class Employee extends Department{
	
	int id;
	String name;
	
	Employee(int id,String name,String dname,String HOD)
	{
		super(dname,HOD); //Parent Class Constructor will be Class
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println("ID :"+id);
		System.out.println("Employee Name :"+name);
		super.display(); //parent class method 
	}
    void show() 
    {
    	System.out.println("ID :"+id);
		System.out.println("Employee Name :"+name);
		System.out.println("Department Name :"+super.name);
		System.out.println("Hod Name :"+HOD);
    }
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Raj","IT","Prachi Gehani"); 
		e1.display();
		e1.show();
	}

}
