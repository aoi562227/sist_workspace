package day0116;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentVO {
	private int num;
	private String name;
	private int korScore;
	private int engScore;
	
	public StudentVO() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentVO(int num, String name, int korScore, int engScore) {
		this.num = num;
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
	}
}
