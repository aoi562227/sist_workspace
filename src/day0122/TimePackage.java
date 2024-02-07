package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimePackage {
	public TimePackage() {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
		
		System.out.println("-------------------------------------");
		
		LocalDate localDate2 = LocalDate.of(2024, 03, 29);
		LocalTime localTime2 = LocalTime.of(17, 50, 10);
		LocalDateTime localDateTime2 = LocalDateTime.of(2024, 03, 29, 12, 25);
		
		System.out.println(localDate2);
		System.out.println(localTime2);
		System.out.println(localDateTime2);
	}
	
	public static void main(String[] args) {
		new TimePackage();
	}//main
}
