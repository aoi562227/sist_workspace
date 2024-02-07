package day0119;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

import javax.naming.spi.DirStateFactory.Result;
public class UseStringTokenizer {
	
	public UseStringTokenizer() {
//		String data = "String Tokenizer";
//		StringTokenizer stk = new StringTokenizer(data);
//		System.out.println(stk.hasMoreTokens());
//		
//		while (stk.hasMoreTokens()) {
//			System.out.println(stk.nextToken());
//		}
//		
//		String data2 = "Java, Oracle, JDBC";
//		StringTokenizer stk2 = new StringTokenizer(data2, " ,");
//		while (stk2.hasMoreTokens()) {
//			System.out.println(stk2.nextToken());
//		}
	}
	
	public String[] csvData() {
		String data = "오늘은,불금.입니다.주말엔 역시 자바공부죠! 그쵸? 아닌가?";
		StringTokenizer stk = new StringTokenizer(data,", .!");
		String[] result = new String[stk.countTokens()+1];
		result[result.length - 1] = String.valueOf(stk.countTokens());
		for (int i = 0; i < result.length-1; i++) {
			result[i] = stk.nextToken();
		}
		
		return result;
	}
//	Date date = new Date();
	public void useCsvData() {
		UseStringTokenizer useStringTokenizer = new UseStringTokenizer();
		String[] args = useStringTokenizer.csvData();
		
		for (String string : args) {
			System.out.println(string);
		}
	}
	
	public static void main(String[] args) {
//		new UseStringTokenizer();
		UseStringTokenizer useStringTokenizer = new UseStringTokenizer();
		useStringTokenizer.useCsvData();
		
		
		
		
	}//main
}
