package String;

public class Stringdemo {

	public static void main(String[] args) {
		
		String str =" Hello Good Morning";
		
		String str1 = new String();
		str1="How are you ?";
		
		String str2 = new String("Good Afternoon");
		
		String a="hello";
		String b="hello";
		String c=new String("hello");
		
		//Using == operator
		if(a==c)
		{
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		
		// equals method
		if(a.equals(b))
		{
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		
	    

		//Print the String Using the CharAt method by using the for loop
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		//replacing the all word o in str String by i
		System.out.println(str.replace('o','i'));
		
		//replacing the all String Hello in str String by Replacing it 
		//String Hey
		System.out.println(str.replaceAll("Hello", "Hey"));
		
		//using the string contain method in which the string contains method checks 
		//weather the String Hello is there in String str .
		
		System.out.println(str.contains("Hello"));
		
		//index of method gives index of the first occurrences of l
		System.out.println(str.indexOf('l'));
		
		//index of method gives index of the last occurrences of M
		System.out.println(str.lastIndexOf('M'));
	}

}
