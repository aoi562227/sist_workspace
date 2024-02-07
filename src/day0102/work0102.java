package day0102;

public class work0102 {

	public static void main(String[] args) {
//		int i = 0;
//		int j = 1;
//		int result = i > j ? i : j;
//		System.out.println(result);
//		
//		int n = 105, m = 102, k = 203;
//		result = n < (m < k ? m : k) ? n : (m < k ? m : k);
//		System.out.println(result);
		
		int temp = 10;
		int temp2 = 20;
		System.out.println(++temp + temp2--);//전위 연산자와 후위 연산자가 적용된 변수끼리의 합.
		System.out.println("temp1 : " + temp + " temp2 : " + temp2);//후위 연산자가 적용된 후 변수의 값
		
		System.out.println(Integer.MAX_VALUE & 65535);
		
	}
}
