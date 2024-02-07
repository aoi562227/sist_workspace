package day0122;

public class UseDayEnum {
	public static void main(String[] args) {
		for (Week day : Week.values()) {
			System.out.println(day);
		}
		System.out.println(Week.Monday);
	}//main
}
