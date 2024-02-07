package day0103;

/**
 * 단일 if
 */
public class TestIf {
	/**
	 * @param args int sex char
	 */
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]), abs = n;

		if (n < 0) {
			abs = -n;
		}
		System.out.println(abs + "\n");

//		System.out.println("equals 문자의 비교 " + args[0].equals(args[0]));
		System.out.println("출입문 입장");
		if (!args[1].equals("남자")) {
			System.out.println("수건 두장 지급");
		}
		System.out.println("목욕탕 입실\n");
		double temperature = Double.parseDouble(args[2]);
		if (25 < temperature && temperature <= 30) {
			System.out.println("좋은 날씨입니다.\n");
		}

		char temp = args[3].charAt(0);
		if (64 < temp && temp < 91) {
			System.out.println("대문자");
		}
	}
}