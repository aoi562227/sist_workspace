package day0108;

public class TestHomework {
	public static void main(String[] args) {
		Homework hw = new Homework();
		hw.namePrint();
		System.out.println(hw.returnFirstName());
		hw.score(59);
		hw.characterDiscrimination(',');
		System.out.println(hw.yearToAge(1998));
		System.out.println(hw.smallest(5, 8, 7));
	}//main
}
