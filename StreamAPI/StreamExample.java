package StreamAPI;

import java.util.ArrayList;

public class StreamExample {

	public static void main(String[] args) {

		ArrayList<Character> al = new ArrayList<Character>();
		
		al.add('h');
		al.add('e');
		al.add('l');
		al.add('l');
		al.add('o');
		
		//Sequential Stream
		//al.stream().forEach(itr -> System.out.println(itr));
		
		//ParallelStream
		al.parallelStream().forEach(itr -> System.out.println(itr));
	

	}

}
