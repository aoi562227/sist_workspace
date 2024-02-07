package day0116;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Parent {
	int age;
	String msg;
	
	public Parent() {
		System.out.println("부모생성자");
		msg = "부모의 메시지";
	}
	
	public void printMsg() {
		System.out.println(msg);
	}
}
