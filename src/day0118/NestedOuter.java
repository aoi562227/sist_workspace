package day0118;

public class NestedOuter {
	int outI;
	static int outj;
	
	public NestedOuter() {
		System.out.println("바깥 클래스의 생성자");
	}
	
	public void outInsMethod() {
		System.out.println("바깥 클래스의 Instance Method");
		
	}
	public static void outStaMethod() {
		System.out.println("바깥 클래스의 Instance Method");
		
	}
	
	static class Inner{
		int inI;
		
		public static void inMethod() {
			System.out.println("안쪽 클래스의 method");
			outj = 20;
			outStaMethod();
//			NestedOuter.out
		}
	}

	public static void main(String[] args) {
		Inner.inMethod();
		
	}//main
	
}
