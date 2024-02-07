package day0110;

public class UseHomework {
	public static void main(String[] args) {
		Homework homework = new Homework.BuilderP("마르티스").color("흰색").name("똘똘이").weight(10).build();
		
		System.out.println("견종 : " + homework.getBreed() + " 이름 : " + homework.getName() + " 색 : " + homework.getColor() 
		+ " 무게 : " + homework.getWeight());
		
		homework.bark();
		homework.run();
	}//main
}
