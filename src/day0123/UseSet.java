package day0123;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UseSet {
	public UseSet() {
		Set<String> set = new HashSet<>();
		
		set.add("가");
		set.add("나");
		set.add("다");
		
		String[] arr = new String[set.size()];
		set.toArray(arr);
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
		    String value = iterator.next();
		    System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		new UseSet();
	}//main
}
