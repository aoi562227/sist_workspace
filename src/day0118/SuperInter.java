package day0118;

public interface SuperInter {
//	변수 생성자 일반메서드 정의 불가능
	
	public static final int MAX = 100;
	
	public String toDay();
	public abstract int getAge(); //구현 클래스가 반드시 Override할 일의 목록
	
	public default String defMethod() { //인터페이스가 기능을 제공해야 할 때
		return "인터페이스에서 처리할 작업";
	}
}
