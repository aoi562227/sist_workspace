package day0110;

public class TestConstructor {
	public TestConstructor() {
		// TODO Auto-generated constructor stub
		System.out.println("생성자");
	}
	
	public void test() {
		System.out.println("test method");
	}
	
	public void temp() {
		System.out.println("temp method");
		test();
		new TestConstructor();
	}
	
	public static void main(String[] args) {
		TestConstructor tc = new TestConstructor();
		tc.temp();
	}//main
}
