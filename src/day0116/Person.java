package day0116;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
	private int eye;
	private int nose;
	private int mouth;
	private String name;

	
	
	protected Person() {
		this.eye = 2;
		this.nose = 1;
		this.mouth = 1;
	}

	public String eat() {
		return null;
	}

	public String eat(String menu, int price) {
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "나는 인간이다";
	}


}
