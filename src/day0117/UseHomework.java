package day0117;

public class UseHomework {
	
	
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua("똘똘이", 5, "흰색");
		Malamute malamute = new Malamute("댕댕이", 20, "회색");
		
		chihuahua.bark();
		malamute.bark();
		System.out.println();
		chihuahua.specialAction();
		malamute.specialAction();
	}//main
}
