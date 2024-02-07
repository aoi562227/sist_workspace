package day0116;

import java.util.jar.Attributes.Name;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Homework extends Person{
	public String hobby = "";
	public Homework() {
		setName("이예찬");
		hobby = "코딩";
	}
	
	public void ride() {
		System.out.println("바이크라이드");
	}
}
