package day0119;

public class UseStringBuffer {
	public void useStringBuffer() {
		StringBuffer stringBuffer = new StringBuffer("hello");
		System.out.println(stringBuffer);
		if (stringBuffer.toString().equals("hello")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println(stringBuffer.toString().toUpperCase());

	}
	public void useStringBuilder() {
		StringBuilder stringBuilder = new StringBuilder("hello");
		System.out.println(stringBuilder);
		if (stringBuilder.toString().equals("hello")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		System.out.println(stringBuilder.toString().toUpperCase());
	}
	
	public static void main(String[] args) {
		UseStringBuffer useStringBuffer = new UseStringBuffer();
		UseStringBuffer useStringBuilder = new UseStringBuffer();
		useStringBuffer.useStringBuffer();
		useStringBuilder.useStringBuilder();
		
	}//main
}
