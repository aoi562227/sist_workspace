package day0104;

/**
 * case
 */
public class TestSwitchCase {
	public static void main(String[] args) {
		
		
//		char grade = '\u0000';
//		switch (score/10) {
//		case 10:
//			
//		case 9:
//			grade = 'A'; break;
//		case 8:
//			grade = 'B'; break;
//		case 7:
//			grade = 'C'; break;
//		case 6:
//			grade = 'D'; break;
//
//		default:
//			break;
//		}
//		System.out.println(grade);
		int score = 60;
		char grade = 64;
		
		switch (score/10) {
		case 6: grade++;
		case 7: grade++;
		case 8: grade++;
		case 9: 
		case 10: grade++; break;
		default:
			grade += 6;
		}
		System.out.println(grade);
	}//main
}
