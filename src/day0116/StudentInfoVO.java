package day0116;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Value Object의 약
 */
@Getter
@Setter
public class StudentInfoVO {
	private int num;
	private String name;
	private double height;
	private double weight;
	private String email;
	
	
	public StudentInfoVO() {
		
	}
	
	public StudentInfoVO(int num, String name, double height, double weight, String email) {
		this.num = num;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.email = email;
		
	}
	

}
