package Dateandtime;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Stop_Watch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter S to start, E to end");
        boolean watch =true;
        LocalTime starttime=LocalTime.now(),endtime=LocalTime.now();
        
        while (watch) {
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("S"))
            {
            starttime = LocalTime.now();// capture the current time using LocalTime
            System.out.println(starttime);
            }
            else if(input.equals("E"))
            {
            	
            endtime = 	LocalTime.now();// capture the stop time using LocalTime
            System.out.println(endtime);
            }
            else
            {
            	watch =false;
            	// calculate the time difference
            	Duration duration = Duration.between(starttime, endtime);
      
            	// Get the time elapsed in seconds
            	long seconds = duration.getSeconds();
            	System.out.println("Time Difference "+seconds);
                
            	
            }
          
            }
	}

}
