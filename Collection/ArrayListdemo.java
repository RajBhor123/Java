package Collection;

import java.util.ArrayList;

public class ArrayListdemo {

	String name;
	
	public static void main(String[] args) {
		
		ArrayList <String> al = new ArrayList<String>(); 
		
		al.add("Raj");
		
		al.add("Aftab");
		
		al.add("Omkar");
		
		for(String itr:al) 
		{
			System.out.println(itr);
		}
		
		//AutoBoxing Concept
		int a=7;
		//Explicit Conversion 
		Integer i= Integer.valueOf(a);
		
		//Implicit Conversion
		Integer j=a;
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		
		//Unboxing Concept
		Integer b=new  Integer(10);
		
		//Explicit Conversion
		int c=b.intValue();
		
		//Implicit Conversion
		int d=b;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
