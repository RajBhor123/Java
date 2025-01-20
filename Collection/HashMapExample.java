package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap <Integer,String> hm =new  HashMap <Integer,String>();
		
		hm.put(1,"Raj");
		hm.put(2,"Omkar");
		hm.put(3,"Aftab");
		
		hm.remove(1,"Raj");
		//Map.entry is a Class  and entrySet is the method return the view of the HashMap
		for(Map.Entry e : hm.entrySet())
		{
			//getKey is the method that return the key and the getValue return the Values
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		System.out.println(hm.get(1));//It will display the values inside the key which is inserted
		System.out.println(hm.containsKey(1)); // It will return the true or False if it is present
		System.out.println(hm.containsValue("Raj")); // It will return the true or False if it is present
		//System.out.println(hm.remove(2));
	}

}
