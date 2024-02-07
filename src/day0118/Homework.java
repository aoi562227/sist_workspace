package day0118;

import java.util.Arrays;
import java.util.Random;

public class Homework {
	public String randomString() {
		String str = "어쩔티비,저쩔티비,뇌절티비,안물티비,안궁티비,때리고싶쥬~,못때리쥬~,개킹받쥬~";
		String[] strArr = str.split(" ?, ?");
		
		return strArr[(int)(Math.random()*strArr.length)];
	}
	
	public String generatePassword() {
	    final int UPPER_CASE = 0;
	    final int LOWER_CASE = 1;
	    final int DIGIT = 2;

	    String str = "";

	    for (int i = 0; i < 8; i++) {
	        int choice = (int) (Math.random() * 3);

	        switch (choice) {
	            case UPPER_CASE:
	                str = str.concat(String.valueOf((char) ((Math.random() * ('Z' - 'A' + 1)) + 'A')));
	                break;
	            case LOWER_CASE:
	                str = str.concat(String.valueOf((char) ((Math.random() * ('z' - 'a' + 1)) + 'a')));
	                break;
	            case DIGIT:
	                str = str.concat(String.valueOf((int) (Math.random() * 10)));
	                break;
	            default:
	                throw new IllegalArgumentException();
	        }
	    }
	    return str;
	}
	
	public String randomIntLotto() {
		int[] isUsedNumber = new int[45];
		int[] result = new int[6];
		
		Arrays.fill(isUsedNumber, 0);
		for (int i = 0; i < result.length; ) {
	        int currentnumber = (int) (Math.random() * 45);

	        if (isUsedNumber[currentnumber] == 0) {
	            result[i] = currentnumber + 1;
	            isUsedNumber[currentnumber] = 1;
	            i++;
	        }
	    }
		Arrays.sort(result, 0, result.length);
		isUsedNumber = null;//다쓴 객체 참조 해제
		return Arrays.toString(result);
	}
	
	
	
	public static void main(String[] args) {
		Homework homework = new Homework();
		System.out.println(homework.generatePassword());
		System.out.println(homework.randomString());
		System.out.println(homework.randomIntLotto());
	}//main
	
	
}
