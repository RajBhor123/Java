package pack1;

public class Constructor {
	
	int id;
	String name;
	//Constructor Overloading
	// Constructor With No Parameter
	Constructor(){
		id=0;
		name="Unknown";
	}
	//Constructor With Parameter
	Constructor(int id){
		this.id=id;
		name="Unknown1";
	}
	//Constructor With Parameter
	Constructor(String name)
	{
		id=2;
		this.name=name;
	}
	Constructor(int a,String b)
	{
		id=a;
		name=b;
	}
	
	// Method Overloading
	void show() 
	{
		System.out.println("id :"+id);
		System.out.println("Name :"+name);
	}
	void show(String greeting) 
	{
		System.out.println(greeting);
		System.out.println("id :"+id);
		System.out.println("Name :"+name);
	}
	public static void main(String[] args) 
	{
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(1);
		Constructor c3=new Constructor("Raj");
		Constructor c4=new Constructor(3,"Mayur");
		
		System.out.println("------S1 ------");
		c1.show();
		System.out.println("-------S2 ------");
		c2.show("hello");
		System.out.println("-------S3-------");
		c3.show();
		System.out.println("-------S4-------");
		c4.show();
	}

}
