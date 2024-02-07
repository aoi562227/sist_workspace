package day0103;

import java.util.Iterator;

/**
 * if~else : 둘중 하나의 코드를 실행해야할 때
 */
public class TestIfElse {
	public static void main(String[] args) {
		int i = 3;
		if (!(i % 2 == 1)) {
			System.out.println(i + "는 짝수\n");
		} else {
			System.out.println(i + "는 홀수\n");
		}

		int temp = Integer.parseInt(args[0]);

		if (!(0 <= temp && temp <= 100)) {
			System.out.println("무효점수");
		} else {
			System.out.println("유효점수");
		}
	}
}