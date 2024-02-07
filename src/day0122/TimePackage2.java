package day0122;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePackage2 {
	public TimePackage2() {
		LocalDate date = LocalDate.of(2023, 3, 2);

	    // 연, 월, 일 변수에 담아서 출력
	    int year = date.getYear();
	    int month = date.getMonthValue();
	    int day = date.getDayOfMonth();
	    int dayOfYear = date.getDayOfYear();
	    int dayOfWeek = date.getDayOfWeek().getValue();
	    System.out.println("연: " + year);
	    System.out.println("월: " + month);
	    System.out.println("일: " + day);
	    System.out.println("이번 해의 " + dayOfYear + "번째 날입니다.");
	    
        System.out.println("오늘은 " + dayOfWeek + "요일입니다.");
		System.out.println("-----------------------");	    
		LocalTime time = LocalTime.of(15, 30, 45);

	    // 시, 분, 초 변수에 담아서 출력
	    int hour = time.getHour();
	    int minute = time.getMinute();
	    int second = time.getSecond();
	    System.out.println("시: " + hour);
	    System.out.println("분: " + minute);
	    System.out.println("초: " + second);	
	    
		System.out.println("-----------------------");
		LocalDateTime currentDateTime = LocalDateTime.now();

        int dayOfYear1 = currentDateTime.getDayOfYear();
        System.out.println("이번 해의 " + dayOfYear1 + "번째 날입니다.");

        String dayOfWeek1 = currentDateTime.getDayOfWeek().toString();
        System.out.println("오늘은 " + dayOfWeek1 + "입니다.");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("형식화된 날짜와 시간: " + formattedDateTime);

	    }
	
	public static void main(String[] args) {
		new TimePackage2();
	}//main
}
