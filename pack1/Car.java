package pack1;

import java.util.Scanner;

public class Car {
	
	int id;
	String name;
	String model;
	long price;
	
	void enter_details()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the ID of the car : ");
		id = obj.nextInt();
		System.out.println("Enter the Name of the car : ");
		name = obj.next();
		System.out.println("Enter the Model of the car : ");
		model = obj.next();
		System.out.println("Enter the Price of the car : ");
		price = obj.nextLong();
		
		System.out.println("Id of a car : "+id);
		System.out.println("name of a car : "+name);
		System.out.println("model of a car : "+model);
		System.out.println("price of a car : "+price);
	}
	
	void enter_details2(int a, String b, String c, long d)
	{
		
		id = a;
		name = b;
		model = c;
		price = d;
		System.out.println("Id of a car : "+id);
		System.out.println("name of a car : "+name);
		System.out.println("model of a car : "+model);
		System.out.println("price of a car : "+price);
		
	}
	Car enter_details3(int id, String name, String model, long price)
	{
		
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
		System.out.println("Id of a car : "+id);
		System.out.println("name of a car : "+name);
		System.out.println("model of a car : "+model);
		System.out.println("price of a car : "+price);
		return this;
		
	}
	
	Car enter_details4()
	{
		
		id = 4;
		name = "BMW";
		model = "M5";
		price = 5000000;
		System.out.println("Id of a car : "+id);
		System.out.println("name of a car : "+name);
		System.out.println("model of a car : "+model);
		System.out.println("price of a car : "+price);
		return this;
	}
	


	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.enter_details();
		
		Car c2 = new Car();
		c2.enter_details2(2, "BMW", "M3", 300000);
		
		Car c3 = new Car();
		Car c4 = c3.enter_details3(3, "BMW", "M4", 400000);
		
		Car c5 = new Car();
		c5.enter_details4();

	}

}
