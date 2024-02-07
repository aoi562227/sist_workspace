package day0111;

public class ThisConstructor {
	
	public ThisConstructor() {
		// TODO Auto-generated constructor stub
		this(11);
		System.out.println("기본 생성자");
	}
	
	public ThisConstructor(int i){
		System.out.println("매개변수 " + i);
	}
	
	
	public static void main(String[] args) {
		new ThisConstructor();
	}//main
}
