package pack1;

public class Car1 {

	int id;
	String name;
	String model;
	int price;
	
	Car1(){
	  id=1;
	  name="Maruti";
	  model="Ertiga";
	  price=100000;
	  System.out.println(" Id of car :"+id);
	  System.out.println(" Name of car :"+name);
	  System.out.println(" Model of car :"+model);
	  System.out.println(" Price of car :"+price);
	}
	
	Car1(int id,String name)
	{
		this.id=id;
		this.name=name;
		model="X2";
		price=15000000;
		
		
	}
	Car1(String model,int price){
		id=3;
		name="Tata";
		this.model=model;
		this.price=price;
	}
	void show() 
	{
		System.out.println(" Id of car :"+id);
		System.out.println(" Name of car :"+name);
		System.out.println(" Model of car :"+model);
		System.out.println(" Price of car :"+price);
	}
	public static void main(String[] args) {
		
		Car1 c1 = new Car1();
		
		Car1 c2 = new Car1(2,"BMW");
		c2.show();
		
		Car1 c3 = new Car1("Harrier",150000);
		c3.show();
		
	}

}
