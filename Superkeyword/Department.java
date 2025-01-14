package Superkeyword;

public class Department {

	String name;
	String HOD;
	
	Department(String name,String HOD)
	{
		this.name=name;
		this.HOD=HOD;
	}
	
	void display()
	{
		System.out.println("Department Name :"+name);
		System.out.println("HOD Name:"+HOD);
	}
	public static void main(String[] args) 
	{
		
	}

}
