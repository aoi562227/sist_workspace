package day0118;

public class LocalOutter {
	int j;
	
	public LocalOutter() {
		System.out.println("바깥 클래스의 생성자");
		
	}
	
	public void test() {
		System.out.println("바깥 클래스의 메서드");
	}
	
	public void method(int paramI, final int paramJ) {
		int locI = 2;
		final int locJ = 15;
		
		class Local{
			int i;
			public Local() {
				System.out.println("local class constructor");
			}
			public void inMethod() {
				System.out.println("local class method");
				i=18;
				System.out.println(i);
				test();
				System.out.println(paramI+ " / " + paramJ);
				System.out.println(locI+ " : " + locJ);
				
			}
		}
		
		
		Local local = new Local();
//		local.i = 10;
//		System.out.println(local.i);
		local.inMethod();
	}
	public static void main(String[] args) {
		LocalOutter localOutter = new LocalOutter();
		localOutter.method(2024, 1);
		
	}//main
}
