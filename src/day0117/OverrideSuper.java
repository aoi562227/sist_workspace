package day0117;

public class OverrideSuper {
	int i;
	
	public OverrideSuper() {
		// TODO Auto-generated constructor stub
	}
	
	public void test() {
		System.out.println("부모의 메서드");
	}
	
	protected void printI() {
		System.out.println("부모의 prnitI" + i);
	}
}
