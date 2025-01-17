package ExecptionHandling;

import java.io.IOException;

public class throwsdemo1 {

	public void print() 
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {

		throwsdemo obj1 =new throwsdemo();
		try {
			obj1.demo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
