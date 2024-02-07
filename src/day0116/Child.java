package day0116;

import org.apache.commons.lang3.reflect.TypeUtilsTest.This;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Child extends Parent {
	String name;
	String msg;
	public Child() {
		System.out.println("자식의 생성자");
		msg="자식의 메시지";
	}
	
	public void printMsg() {
		//System.out.println("자식 : " + super.msg + ", " + this.msg);
		System.out.println("자식 : " + msg);
		super.printMsg();
	}

	public static void main(String[] args) {
		Child child = new Child();
		
		child.setAge(20);
		System.out.println(child.getAge());
		
		child.setName("홍길동");
		System.out.println(child.getName());
		
		child.printMsg();
		
	}// main
}
