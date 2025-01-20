package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Array {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("Raj");
		al.add("Omkar");
		al.add("Navin");
		al.add("xyz");
		al.add(2,"ravi");
		
		System.out.println("Data at index 2 :"+al.get(2));
		System.out.println(al.contains("ada"));
		
		System.out.println(al.indexOf("Navin"));
		System.out.println(al.lastIndexOf("xyz"));
		Iterator itr=al.iterator();
		
		System.out.println("***************");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
