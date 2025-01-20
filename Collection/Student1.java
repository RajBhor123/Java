package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Student1 implements Comparable<Student1>{
	
	int id;
	String name;
	
	//Comparable Interface methods 
	@Override
	public int compareTo(Student1 obj) {
		//To compareTo method is a string method  that will compare the name of the 
		return this.name.compareTo(obj.name);
	}

	public Student1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}




	public static void main(String[] args) {

		Student1 s1 = new Student1(87,"Raj");
		Student1 s2 = new Student1(19,"Aftab");
		Student1 s3 = new Student1(54,"Omkar");
		Student1 s4 = new Student1(86,"Mayur");

		
		
		ArrayList<Student1> al = new ArrayList<Student1>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al);

       
        for (Student1 s : al) {
            System.out.println(" Name: " + s.name);
        }
		
	}

}


