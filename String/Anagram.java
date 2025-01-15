package String;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {

		String originalword="eat";
		
		String[] words= {"tea","ate"};
		
		System.out.println("Please enter the word");
		Scanner myobj = new Scanner(System.in);
		String userdata = myobj.next() ;
		int count=0;
		
		
		for(int i=0;i<words.length;i++)
		{
			if(userdata.equalsIgnoreCase(words[i])) {
				
				count =count+1;
			}
			
		}
		
		if(count>0)
		{
			System.out.println("Your anagram word Guess is Correct");
		}
		else {
			System.out.println("Your anagram word Guess is InCorrect");
		}

	}

}
