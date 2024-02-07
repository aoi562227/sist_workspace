package day0109;

import java.util.Arrays;

/**
 * 가변 인수
 */
public class UseVariableArguments {
	public void testVA(int ... i) {
		System.out.println(Arrays.toString(i));
	}
	
	public static void main(String[] args) {
		UseVariableArguments useVariableArguments = new UseVariableArguments();
		useVariableArguments.testVA(78, 9);
	}//main
}
