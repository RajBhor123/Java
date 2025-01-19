package Dateandtime;

import java.util.Scanner;

public class Stopwatch {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = 0;
        long endTime = 0;

        System.out.println("Enter 'start' to start the stopwatch:");
        String startInput = scanner.nextLine();

        if (startInput.equalsIgnoreCase("start")) 
        {
            startTime = System.currentTimeMillis(); // capture the current time in milliseconds
            System.out.println("Stopwatch started. Enter 'stop' to stop:");
        }

        String endInput = scanner.nextLine();

        if (endInput.equalsIgnoreCase("stop"))
        {
            endTime = System.currentTimeMillis(); // capture the current time in milliseconds
            long timeElapsed = endTime - startTime;
            System.out.println("Stopwatch stopped.");
            
            // Convert milliseconds to seconds
            double seconds = timeElapsed / 1000.0;
            System.out.println("Total Time : " + seconds + " seconds.");
        } 
        else 
        {
            System.out.println("Invalid input. Stopwatch not stopped.");
        }

        scanner.close();
    }
}



