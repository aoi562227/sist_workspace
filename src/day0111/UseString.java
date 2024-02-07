package day0111;

public class UseString {
	
	public static void main(String[] args) {
		String str = "aoi562227@gmail.com";
		String str2 = "Java Oracle";
		String str3 = "서울시 강남구 역삼동";
//		String str4 = "오늘은 Java를 공부하였다.";
//		String str4 = "Java는 WORA가 특징인 완벽한 OOP언어입니다.";
		String str4 = "오늘도 긴시간 함께 공부하시느라 고생 많으셨Java";
//		String str1 = new String("ABCDE");
//		System.out.println(str);
//		System.out.println(str1);
//		System.out.println();
//		System.out.println(str == "ABCDE");
//		System.out.println(str1 == "ABCDE");
//		System.out.println();
//		System.out.println(str.equals("ABCDE"));
//		System.out.println(str1.equals("ABCDE"));
//		System.out.println();
//		System.out.println(str.compareTo("ABCDE"));
//		System.out.println(str1.compareTo("ABCDE"));
//		System.out.println();
//		System.out.println(str + "은 " + str.length() + "자");
//		System.out.println();
//		System.out.println(str.toUpperCase());
//		System.out.println(str1.toLowerCase());
//		System.out.println();
//		System.out.println(str.indexOf("@"));
//		char smtp = str.charAt(9);
//		System.out.println(smtp);
//		str = "Java Oracle";
//		System.out.println(str+"의 regex " + str.matches("[A-Za-z]*\s[A-Za-z]*"));
//		System.out.println(str+"의 regex " + str.matches("([A-Za-z]*\s[A-Za-z]*)*"));
//		System.out.println("R - L : " + str.lastIndexOf("6"));
		
		UseString useString = new UseString();
		useString.mailValidate(str);
		System.out.println((useString.localSubString(str)));
		System.out.println((useString.domainSubString(str)));
		if(str2.matches("^Java.*")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if (str3.matches(".*동$")) {
			System.out.println("도시");
		}else {
			System.out.println("시골");
		}
		
		if (str4.matches("^.*Java.*$")) {
			System.out.println("안에는 \"Java\"가 있음");
		}else {
			System.out.println("안에는 \"Java\"가 없음");
		}

		useString = null;
		
		
		
	}//main
	public void mailValidate(String mail) {
		
		if (mail.matches("[A-Za-z0-9_-]+@[A-Za-z0-9_-]+(\\.[A-Za-z]+)*") && mail.length() > 6) {
			System.out.println("유효 메일");
		}else {
			System.out.println("무효 메일");
		}

	}
	
	public String localSubString(String mail) {
		char smtp = (char) mail.indexOf("@");
		String result = mail.substring(0,smtp);
		return result;
	}
	
	public String domainSubString(String mail) {
		char smtp = (char) mail.indexOf("@");
		String result = mail.substring(smtp+1,mail.length());
		return result;
	}

}
