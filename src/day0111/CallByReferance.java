package day0111;

public class CallByReferance {
	int i;
	int j;
	
	public CallByReferance() {
	
		// TODO Auto-generated constructor stub
	}
	
	public void swap(CallByReferance cbr) {
		int temp = i;
		i = j;
		j = temp;
		System.out.println(" i :" + i + " j :" + j);
	}
	
	public static void main(String[] args) {
		CallByReferance cbr = new CallByReferance();
		cbr.i = 2024;
		cbr.j = 1;
		
		System.out.println(" i :" + cbr.i + " j :" + cbr.j);
		cbr.swap(cbr);
		System.out.println(" i :" + cbr.i + " j :" + cbr.j);

	}//main
}
