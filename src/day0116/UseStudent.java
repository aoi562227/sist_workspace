package day0116;

public class UseStudent {
	public static void main(String[] args) {
		StudentInfoVO studentInfoVO = new StudentInfoVO(1, "홍길동", 182.4, 65.5, "test.test.com");
		StudentInfoVO studentInfoVO2 = new StudentInfoVO(2, "이미나", 192.4, 80.5, "test2.test.com");
		
		System.out.println(studentInfoVO.getNum()+ " " + studentInfoVO.getName()+ " " + studentInfoVO.getHeight());
		System.out.println(studentInfoVO2.getNum()+ " " + studentInfoVO2.getName()+ " " + studentInfoVO2.getHeight());
	}//main
}
