package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimePackage3 {
	public TimePackage3() {
		LocalDate localDateTime =  LocalDate.now();
		LocalDate localDateTime2 = LocalDate.now();
		LocalDate localDateTime3 = LocalDate.now();
		
		localDateTime = localDateTime.withYear(2030);
		localDateTime = localDateTime.withMonth(5);
		localDateTime = localDateTime.withDayOfMonth(6);
		
		localDateTime3 = localDateTime3.plus(6, ChronoUnit.MONTHS);
		
		System.out.println(localDateTime);
		System.out.println(localDateTime2);
		System.out.println(localDateTime3);
		
		Period period = Period.between(localDateTime, localDateTime3);
		System.out.println(period);
		
		}

	public static void main(String[] args) {
		new TimePackage3();
	}// main
}
