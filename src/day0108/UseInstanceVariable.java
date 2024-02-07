package day0108;

/**
 * Instance Variable
 * 객체마다 생성되고 사용되는 변수
 */
public class UseInstanceVariable {
//	접근지정자 field
	int i = 10;
	public static void main(String[] args) {
		UseInstanceVariable uiv = new UseInstanceVariable();
		UseInstanceVariable uiv2 = new UseInstanceVariable();
		
		uiv.i = 2024;
		uiv2.i = 1;
		System.out.println("uiv : " + uiv.i);
		System.out.println("uiv2 : " + uiv2.i);
		System.gc();
	}//main
}
