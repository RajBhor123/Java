package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(22);
		al.add(3);
		al.add(6);
		al.add(89);
		al.add(34);
		al.add(29);

		Collections.sort(al);
		for(Integer itr:al) 
		{
			System.out.println(itr);
		}
	}

}
