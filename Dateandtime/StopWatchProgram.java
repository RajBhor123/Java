package Dateandtime;


import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class StopWatchProgram {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        LocalTime startTime = null;
	        LocalTime endTime = null;

	        System.out.println("Enter 'start' to start the stopwatch:");
	        String startInput = scanner.nextLine();

	        if (startInput.equalsIgnoreCase("start")) {
	            startTime = LocalTime.now(); // capture the current time using LocalTime
	            System.out.println("Stopwatch started at " + startTime + ".\n Enter 'stop' to stop:");
	        }

	        String endInput = scanner.nextLine();

	        if (endInput.equalsIgnoreCase("stop")) {
	            endTime = LocalTime.now(); // capture the stop time using LocalTime
	            Duration timeElapsed = Duration.between(startTime, endTime); // calculate the time difference
	            System.out.println("Stopwatch stopped at " + endTime + ".");
	            
	            // Get the time elapsed in seconds
	            long seconds = timeElapsed.getSeconds();
	            System.out.println("Time elapsed: " + seconds + " seconds.");
	        } else {
	            System.out.println("Invalid input. Stopwatch not stopped.");
	        }

	        scanner.close();
	    }
	}


