package StreamAPI;

import java.util.ArrayList;

public class TerminalOperationExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(5);
		al.add(7);
		al.add(6);
		al.add(3);
		
		//Terminal Operation Methods 
		System.out.println("********Terminal Operation Methods*********");
		
		long resultofcount = al.stream().count();
		System.out.println("Total Number of the Elements :"+resultofcount);
		
		// In the Reduce method the two parameter are passed in which 0 parameter is 
		// used to for position of the elements and another is used for operation purpose 
		long resultofreduce = al.stream().reduce(0, (a,b)->a+b );
		System.out.println("Total Sum of the Elements : "+resultofreduce);
		
		boolean result=al.stream().anyMatch(n-> n>3);
		System.out.println("At Least One Match Found in the Elements : "+result);
		
		boolean resultallmatch=al.stream().allMatch(n-> n>3);
		System.out.println("Are all Elemnts  Match Found : "+resultallmatch);

	}

}
