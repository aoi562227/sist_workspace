package day0118;

public class Outter {
	int outI;
	
	public Outter() {
		System.out.println("바깥 클래스의 생성자");
	}
	
	public void outMethod() {
		System.out.println("바깥 클래스 method");
		Inner in = this.new Inner();
		in.inMethod();
	}
	
	public class Inner{
		int inI;
		public Inner() {
			System.out.println("안쪽 클래스의 생성자");
		}
		
		public void inMethod() {
			System.out.println("안쪽 클래스의 method");
		}
	}
	
	public static void main(String[] args) {
		Outter outter = new Outter();
		outter.outMethod();
		Outter.Inner inner = outter.new Inner();
		inner.inMethod();
		
		
	
	}//main
}
