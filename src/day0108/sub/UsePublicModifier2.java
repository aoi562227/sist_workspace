package day0108.sub;

import day0108.TestAccessModifier;

/**
 * 부모클래스의 접근지정자 접근
 */
public class UsePublicModifier2 extends TestAccessModifier{
	public static void main(String[] args) {
		UsePublicModifier2 upm2 = new UsePublicModifier2();
		upm2.a = 100;
		upm2.b = 100;
		
	}//main
}
