package day0123;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UseMap {
	
	public void useHashTable() {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("A", "유사과학 - A");
		map.put("B", "유사과학 - B");
		map.put("AB", "유사과학 - AB");
		map.put("O", "유사과학 - O");
		
		
//		System.out.println(map.get("A"));
		String key = "A";
		if (map.containsKey(key)) {
			System.out.println(key + "의 특징은 " + map.get(key));
		}else {
			System.out.println("없음");
		}
	}
	public void useHashMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "유사과학 - A");
		map.put("B", "유사과학 - B");
		map.put("AB", "유사과학 - AB");
		map.put("O", "유사과학 - O");
		
		
//		System.out.println(map.get("A"));
		String key = "A";
		if (map.containsKey(key)) {
			System.out.println(key + "의 특징은 " + map.get(key));
		}else {
			System.out.println("없음");
		}
	}
	
	
	public static void main(String[] args) {
		UseMap useMap = new UseMap();
		useMap.useHashTable();
		
		useMap.useHashMap();
	}//main
}
