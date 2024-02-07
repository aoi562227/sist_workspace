package day0110;

public class UsePerson {
	public static void main(String[] args) {
		Person person = new Person.Builder(1, 1).eye(2).name("Lee").nick("YC").build();
		System.out.println(person.getEye());
		System.out.println(person.getNose());
		System.out.println(person.getMouth());
		System.out.println(person.getName());
		System.out.println(person.getNick());
			
	}//main
}
