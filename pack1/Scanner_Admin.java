package pack1;

import java.util.Scanner;

public class Scanner_Admin {

	public static void main(String[] args) {
		
		String username, password;
		 
		
		Scanner myobj = new Scanner (System.in);
		System.out.println("Enter the User Name");
		username=myobj.nextLine();
		
		System.out.println("Enter the Password");
		password=myobj.nextLine();
		
		if(username.equals("admin") && password.equals("Admin123"))
		{
			System.out.println("Correct Username & Password! Login Successfully");
		}
		else {
			System.out.println("Incorrect Username & Password ! Please Enter Correct Username & Password");
		}

	}

}
