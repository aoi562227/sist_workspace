package day0104;
import java.util.logging.Logger;

/**
 * for문
 */
public class TestFor extends Thread{
	private static final Logger LOG = Logger.getGlobal();
	public static void main(String[] args) throws Exception {
		long beforeTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕하세요");
		}

		for (int i = 0; i < 100; i++) {
			System.out.print(i + 1 + " ");
		}

		System.out.print("\n");

		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n");

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("===========================================");
		int num = Integer.parseInt(args[0]);
		if (num > 9 || num < 2) {
			throw new Exception("범위 내의 숫자 입력");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		}
		
		int sum = 0;

		for (int i = 1; i < 101; i++) {
			for (int j = 0; j < 100; j++) {
				sum += i * j;
				LOG.info(Integer.toString(sum));//15287
				System.out.println(Integer.toString(sum));//2277
			}
		}
		System.out.println("sum : " + sum);
		
		long afterTime = System.currentTimeMillis();
		long secDiffTime = (afterTime - beforeTime);
		System.out.println("시간차이(m) : "+secDiffTime);
	}// main
}
