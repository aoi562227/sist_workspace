package day0116;

import java.util.Iterator;

public class UseStudentVO {
	public static void main(String[] args) {
		StudentVO[] studentVOArr = null;
		studentVOArr = new StudentVO[3];

		studentVOArr[0] = new StudentVO(1, "홍길동", 60, 76);
		studentVOArr[1] = new StudentVO(2, "이미나", 100, 100);
		studentVOArr[2] = new StudentVO();

		studentVOArr[2].setNum(3);
		studentVOArr[2].setName("김철수");
		studentVOArr[2].setKorScore(94);
		studentVOArr[2].setEngScore(98);

		for (StudentVO studentVO : studentVOArr) {
			System.out.printf("%d\t%s\t%d\t%d\n", studentVO.getNum(), studentVO.getName(), studentVO.getKorScore(),
					studentVO.getEngScore());
		}
	}// main
}
