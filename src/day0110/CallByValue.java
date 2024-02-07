package day0110;


public class CallByValue {
	public void swap(int i, int j) {
		int temp = 0;
		temp =i;
		i=j;
		j=temp;
		System.out.println("i : " + i + " j : " + j);
	}
	
	public CallByValue(int i) {
			System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		int i = 2024, j = 1;
		CallByValue callByValue = new CallByValue(i);
		System.out.println("전 i " + i + " j " + j);
		callByValue.swap(i, j);
		System.out.println("후 i " + i + " j " + j);

	}//main
}
 