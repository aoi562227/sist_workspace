package day0118;

public class SuperInterImpl implements SuperInter{

	@Override
	public String toDay() {
		
		return "오늘은 목요일 입니다";
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 20;
	}
	
	public static void main(String[] args) {
		SuperInter superInter = new SuperInterImpl();
		
		System.out.println(superInter.getAge());
		
		System.out.println(superInter.defMethod());
	}//main
}
