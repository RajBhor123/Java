package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Product {
	
	int id;
	String name;
	String description;
	int price;

	public Product(int id, String name, String description, int price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public static void main(String[] args) {
		
		ArrayList<Product> al = new ArrayList<Product>();
		
		Product p1 = new Product(1,"Iphone ","16 pro max ",140000);
		Product p2 = new Product(2,"Microwave ","Philips ",50000);
		Product p3 = new Product(3,"Samsang ","Washing Machine ",30000);
		Product p4 = new Product(4,"Samsang Mobile","23 ",30000);
		
		 al.add(p1);
	     al.add(p2);
	     al.add(p3);
	     al.add(p4);

	     
//	  // New arraylist for products with price > 45,000
//	     ArrayList<Product> filteredList = new ArrayList<Product>();
//
//	  
//	     for (Product product : al) {
//	         if (product.price > 45000) {
//	              filteredList.add(product);
//	            }
//	        }
//
//	  // Output the filtered list
//	     System.out.println("Products with price greater than 45,000:");
//	      for (Product product : filteredList) {
//	          System.out.println(product.name + " : " + product.price);
//	        }
//
//	 

	     
	     ArrayList<Product> expensiveProducts1 = (ArrayList<Product>)al.stream()
	        		.filter(p -> p.price > 45000)
	        		.map(p->p)
	        		.collect(Collectors.toList());
	        
	        ArrayList<Integer> expensiveProducts2 = (ArrayList<Integer>)al.stream()
	        		.filter(p -> p.price > 45000)
	        		.map(p->p.price)
	        		.collect(Collectors.toList());
	        
	        for (Product p : expensiveProducts1) 
	        {
	            System.out.println("ID: " + p.id + ", Name: " + p.name + " Description :" + p.description);
	        }
	     
	}
	
	

}
