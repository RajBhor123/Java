package ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;


public class Demo {

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
		
		//Collections.sort(al,new NameComparator());
		Collections.sort(al,new IdComparator());
		
		for(Student a: al) {
			//System.out.println("Name :"+a.name);
			System.out.println("Id :"+a.id);
		}

	}

}
