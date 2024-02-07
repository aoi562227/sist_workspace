package day0117;

public class AbstractSub extends AbstractSuper {
	
	int j;
	
	public AbstractSub() {
		System.out.println("자식의 생성자");
	}
	public void temp() {
		System.out.println("자식의 메서드");
	}
	
	@Override
	protected void printJ() {
		System.out.println("자식 : " + j);
	}
	
	public static void main(String[] args) {
		
	}//main
}
