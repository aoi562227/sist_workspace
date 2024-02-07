package day0112;
import day0103.Zodiac;

public class Homework {
    String ssn;
    final static int currentYear = 2024;

    Homework(String ssn) {
        // TODO Auto-generated constructor stub
        this.ssn = ssn;
    }

    private boolean isValidLength() throws Exception {
        if (ssn != null && ssn.length() == 14) {
            return true;
        } else {
            throw new Exception("주민번호의 자릿수가 잘못되었음");
        }
    }

    private boolean isValidStatement() throws Exception {
        if (ssn != null && ssn.charAt(6) == '-') {
            return true;
        } else {
            throw new Exception("-의 위치가 올바르지 않음");
        }
    }

    private String ssnToBirthString() {
   
        int birthYear = birthYear();

        String birthDateString = String.format("%d년%02d월%02d일", birthYear,
        		Integer.parseInt(ssn.substring(2, 4)),
                Integer.parseInt(ssn.substring(4, 6)));

        return birthDateString;
        
    }
    
    private int ssnToAge() {
		String birthYear = ssn.substring(0,2);
		int age = Integer.parseInt(birthYear) + (Integer.parseInt(birthYear) < 22 ? 2000 : 1900);
		return currentYear - age + 1;
	}
    
    private String sexString() {
		if (Integer.parseInt(ssn.substring(7,8)) %2 != 1) {
			return "여자";
		}else {
			return "남자";
		}
	}
    
    private int birthYear() {
    	int birthYear = (Integer.parseInt(ssn.substring(7, 8)) < 3) ? 1900 : 2000;
        return birthYear += Integer.parseInt(ssn.substring(0, 2));
	}
    
    private String ssnToZodiac() {
    	int birthYear = birthYear();
		switch (birthYear % 12) {
			case Zodiac.원숭이:
				return "원숭이";
			case Zodiac.닭:
				return "닭";
			case Zodiac.개:
				return "개";
			case Zodiac.돼지:
				return "돼지";
			case Zodiac.쥐:
				return "쥐";
			case Zodiac.소:
				return "소";
			case Zodiac.호랑이:
				return "호랑이";
			case Zodiac.토끼:
				return "토끼";
			case Zodiac.용:
				return "용";
			case Zodiac.뱀:
				return "뱀";
			case Zodiac.말:
				return "말";
			case Zodiac.양:
				return "양";
			default :
				throw new IllegalArgumentException();
		}

	}
    
    
    

    public static void main(String[] args) throws Exception {
    	String ssn = "980329-1234567";
        Homework homework = new Homework(ssn);
        
        if (homework.isValidLength()) {
        	if (homework.isValidStatement()) {
        		System.out.println(homework.ssnToBirthString());
                System.out.println(homework.ssnToAge() + "살");
                System.out.println(homework.sexString());
                System.out.println(homework.ssnToZodiac());
			}
		}

        
        
    }// main
}
