package ComparatorInterface;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		
		return obj1.name.compareTo(obj2.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
