package day0124;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class UseStack {
	public UseStack() {

		Stack<String> stack = new Stack<String>();
		
		stack.push("입니다");
		stack.push("오늘은");
		stack.push("수요일");
		
//		System.out.println(stack.empty());
//		for (Iterator iterator = stack.iterator(); iterator.hasNext();) {
//			System.out.println(stack.pop());	
//		}
		
//		while (!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i));
		}
	}
	
	public static void main(String[] args) {
		new UseStack();
	}//main
}
