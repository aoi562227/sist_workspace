package day0123;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class UseList2 {
	public void useArrayList() {
		List<String>list = new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		System.out.println(list);
//		System.out.println(list.size());
		
		String[] arr = new String[list.size()];
		list.toArray(arr);
		
	}
	
	public void useVector() {
		List<String>list = new Vector<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		System.out.println(list);
//		System.out.println(list.size());
		
		String[] arr = new String[list.size()];
		list.toArray(arr);
	}
	
	public void useLinkedList() {
		List<String>list = new LinkedList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("JDBC");
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		System.out.println(list);
//		System.out.println(list.size());
		
		String[] arr = new String[list.size()];
		list.toArray(arr);
	}
	
	public static void main(String[] args) {
		UseList2 useList2 = new UseList2();
		System.out.println("Array List");
		useList2.useArrayList();
		useList2.useVector();
		useList2.useLinkedList();
		
		
		
	}//main
}
