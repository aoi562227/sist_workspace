package day0108;

public class Homework {
	public void namePrint() {
		System.out.println("이예찬");
	}
	
	public char returnFirstName() {
		return '이';
	}
	
	public void score(int score) {
	    if (score < 0 || score > 100) {
	        System.out.println("잘못된 점수");
	    } else {
	        score = score / 10;

	        switch (score) {
	            case 10:
	            case 9:
	            case 8:
	            case 7:
	            case 6:
	                System.out.println("합격");
	                break;
	            case 5:
	            case 4:
	                System.out.println("다른 과목을 참조");
	                break;
	            case 3:
	            case 2:
	            case 1:
	                System.out.println("과락");
	                break;
	            default:
	                System.out.println("과락");
	                break;
	        }
	    }
	}
	
	public void characterDiscrimination(char c) {
		 
		if (Character.isUpperCase(c)) {
		    System.out.println("대문자");
		} else if (Character.isLowerCase(c)) {
		    System.out.println("소문자");
		} else if (Character.isDigit(c)) {
		    System.out.println("숫자");
		} else {
		    System.out.println("대문자, 소문자, 숫자가 아닙니다.");
		}
		    
	}
	
	public int yearToAge(int year) {
		return 2024 - year + 1;
	}
	
	public int smallest(int num, int num2, int num3) {
		return Math.min(num, Math.min(num2, num3));
	}

	
	
}
