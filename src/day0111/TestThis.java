package day0111;


public class TestThis {
	
	int i;
	int j;
	
	public void setI(int i, TestThis t2) {
		t2.i = i;
	}
	public void setJ(int j) {
		this.j = j;
	}
	
	public static void main(String[] args) {
		TestThis t = new TestThis();
		t.setI(2024, t);
		System.out.println(t.i);
		t.setJ(2024);
		System.out.println(t.j);
	}// main
}
