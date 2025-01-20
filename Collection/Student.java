package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{

	int id;
	String name;
	
	//Comparable Interface methods 
	@Override
	public int compareTo(Student sobj) {
		
		if(id== sobj.id)
		{
			return 0;
		}
		else if(id>sobj.id) {
			return 1;
		}
		else {
			return -1;
		}
	}

	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}



	public static void main(String[] args) {
		
		Student s1 = new Student(32,"Raj");
		Student s2 = new Student(14,"Aftab");
		Student s3 = new Student(34,"Omkar");
		Student s4 = new Student(19,"Mayur");
		
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al);

       
        for (Student s : al) {
            System.out.println("ID: " + s.id + " , Name: " + s.name);
        }
		
	}


}
