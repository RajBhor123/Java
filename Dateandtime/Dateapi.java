package Dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Dateapi {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Current Date:"+date);
		System.out.println(" YesterDay:"+date.minusDays(1));
		System.out.println("Tommorow:"+date.plusDays(1));
		
		System.out.print("1 Year minus"+date.minusYears(1));
		
		LocalDate date1 = LocalDate.of(2013, 8, 15);
		System.out.println("date 1"+date1);
		System.out.println("Leap Year or not "+date.isLeapYear());
		
		LocalTime time =LocalTime.now();
		System.out.println("Time :"+time);
		System.out.println("Minus hours:"+time.minusHours(1));
		
		String t="15:35:54.290261100";
		LocalTime t1=LocalTime.parse(t);
		System.out.println(t1);
	}

}
