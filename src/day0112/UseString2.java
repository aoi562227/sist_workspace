package day0112;

public class UseString2 {
	public static void main(String[] args) {
		String fileName = "Test.bat";
		String str = "  asdf    ";
		String str1 = "Java Oracle";
		String str2 = "나 지금 피씨방인데, 넌 어디니 ㅆ 178~ 6 ㅏ방새기야?";
		String str3 = "내 전화번호는 010-8077-4444 내 친구 전번은 010-2222-3333이야 내 나이는 20살 듀얼번호는 010-111-2222";
		
		
		System.out.println("파일명 :" + fileName.substring(0, fileName.lastIndexOf('.')));
		System.out.println("파일명 :" + fileName.substring(fileName.lastIndexOf('.')+1));
		System.out.println(str.trim());
		System.out.println(str1.replace("a", "AA"));
		System.out.println(str2.replaceAll("[시씨ㅆ]([0-9ㅏ-ㅣ~!@#$%^& ]*|[0-9ㅏ-ㅣ~!@#$%^&]+ *)[바방발]새?[끼기]?", "**"));
		System.out.println(str3.replaceAll("([0-9]{3})-([0-9]{4})-([0-9]{4})", "$1-****-$3"));
		
		String msg = "전화번호는 010-1234-5678";
		System.out.println(msg.replaceAll("([0-9]{3}-[0-9])([0-9]+-[0-9]+)","010-*$2"));
		
		String msg2 = "내 이메일은 test@sist.co.kr test@sist.co 과 hello Java";
		System.out.println(msg2.replaceAll("[A-Za-z0-9_%+-]+(\\.[A-Za-z0-9_%+-])?+@[A-Za-z0-9_%+-]+(\\.[A-Za-z]{2,})*", "***@***.***"));
		
	}//main
}
