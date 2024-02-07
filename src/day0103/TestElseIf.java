package day0103;

import day0103.Zodiac;

/**
 * else if
 */
public class TestElseIf {

	public static void main(String[] args) {
		int score = 66;
		if (score < 0) {
			System.out.println("0보다 작아서 실패");
		} else if (score > 100) {
			System.out.println("100보다 커서 실패");
		} else {
			System.out.println("성공");
		}

		char ch = ']';

		if (64 < ch && ch < 91) {
			System.out.println("대문자");
		} else if (96 < ch && ch < 123) {
			System.out.println("소문자");
		} else if (47 < ch && ch < 58) {
			System.out.println("숫자");
		} else {
			System.out.println("영어나 숫자가 아닙니다.");
		}

		int birth = 1998 % 12;
		if (0 <= birth && birth < 6) {
			if (birth == Zodiac.원숭이) {
				System.out.println("원숭이");
			} else if (birth == Zodiac.닭) {
				System.out.println("닭");
			} else if (birth == Zodiac.개) {
				System.out.println("개");
			} else if (birth == Zodiac.돼지) {
				System.out.println("돼지");
			} else if (birth == Zodiac.쥐) {
				System.out.println("쥐");
			} else if (birth == Zodiac.소) {
				System.out.println("소");
			}

		} else {
			if (birth == Zodiac.호랑이) {
				System.out.println("호랑이");
			} else if (birth == Zodiac.토끼) {
				System.out.println("토끼");
			} else if (birth == Zodiac.용) {
				System.out.println("용");
			} else if (birth == Zodiac.뱀) {
				System.out.println("뱀");
			} else if (birth == Zodiac.말) {
				System.out.println("말");
			} else if (birth == Zodiac.양) {
				System.out.println("양");
			}
		}

		switch (birth) {
		case 0:
			System.out.println("원숭이");
			break;
		case 1:
			System.out.println("닭");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("돼지");
			break;
		case 4:
			System.out.println("쥐");
			break;
		case 5:
			System.out.println("소");
			break;
		case 6:
			System.out.println("호랑이");
			break;
		case 7:
			System.out.println("토끼");
			break;
		case 8:
			System.out.println("용");
			break;
		case 9:
			System.out.println("뱀");
			break;
		case 10:
			System.out.println("말");
			break;
		case 11:
			System.out.println("양");
			break;

		default:
			break;
		}
	}// main
}
