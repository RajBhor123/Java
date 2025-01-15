package String;

import java.util.Arrays;
import java.util.Random;

public class WordGuessgame {

public static void main(String[] args) {
    	
    	String word = "elephant";
    	String wordunderscore = "";
    	
    	int lengthofword = word.length();
    	//System.out.println(lengthofword);
    	int[] randomnumber = new int[3];
    	
    	if(lengthofword > 3 && lengthofword < 10)
    	{
    		for(int i = 0; i < 3; i++)
    		{
    			Random r = new Random();
    			randomnumber[i] = r.nextInt(lengthofword); 
    			System.out.println(randomnumber[i]);
    		}
    	}
    	
    	Arrays.sort(randomnumber);
		for(int i = 0; i < 3; i++)
		{
			System.out.println(randomnumber[i]);
		}
    	
		for(int j = 0; j < randomnumber.length; j++)
		{
			
			for(int i = 0; i <word.length(); i++)
				{
					if(randomnumber[j] == i)
					{
						System.out.print("_");
					}
					else
					{
						System.out.print(word.charAt(j));
					}
				}
			
		}
    }
    }


