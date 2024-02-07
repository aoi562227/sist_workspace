package day0109;

/**
 * VA를 사용하여 console에 출력하는 method
 */
public class UseVariableArguments2 {
	public static void main(String[] args) {
//		int year = 2024, month = 1, day = 9;
//		System.out.println(year +"년"+month+"월"+day+"일");
//		System.out.printf("%d년%d월%d일", year, month, day);
//		System.out.printf("정수 출력 : [%d][%5d][%-5d]\n", 19, 19, 19);
//		System.out.printf("문자 출력 : [%c][%5c][%-5c]\n", 'A', 'A', 'A');
//		System.out.printf("불린 출력 : [%b][%5b][%-5b]\n", true, true, true);
//		System.out.printf("실수 출력 : [%f][%10.2f][%.5f]\n", 2024.0109, 2024.0109, 2024.0109);
		String name = "홍길동";
		int javaScore = 89;
		int oracleScore = 94;
		int htmlScore = 79;
		
		System.out.printf("%s님 Java SE %d점, Oracle %d점 HTML %d점\n총점 : %d점 평균 %.1f점", name, javaScore, oracleScore, htmlScore, javaScore+oracleScore+htmlScore, (float)(javaScore+oracleScore+htmlScore)/3);
		
		
	}//main
}
