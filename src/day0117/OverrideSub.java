package day0117;

public class OverrideSub extends OverrideSuper {
	int i;
	public OverrideSub() {
		System.out.println("자식의 생성자");
	}
	
	public void temp() {
		System.out.println("자식의 메서드");
	}
	
	@Override
	protected void printI() {
		System.out.println("자식 : " + i);
	}
	
	public static void main(String[] args) {
		OverrideSub oSub = new OverrideSub();
		oSub.i = 2024;
		oSub.i = 1;
		
		oSub.test();
		oSub.temp();
		oSub.printI();
		OverrideSuper oSuper = new OverrideSub();
		

	}//main
}
