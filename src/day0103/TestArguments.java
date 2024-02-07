package day0103;

/**
 * main method의 arg input 및 사용에 대한 연습
 * 실행) java day0103.TestArguments arg arg ...
 */
public class TestArguments {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args.length);
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		System.out.println(Math.abs(Integer.parseInt(args[0])));
	}
}
