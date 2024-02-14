package day0213;
//	1.Runnable implements
public class ImplementsRunnable implements Runnable {

	//2.run method의 override
	@Override
	public void run() {
//		3.Thread로 동작해야 할 코드를 정의
		for (int i = 0; i < 500; i++) {
			System.out.println("run i ----->" + i);
		}
	}
	
	public void test() {
		for (int i = 0; i < 500; i++) {
			System.out.println("run i =====>" + i);
		}
	}
	
	public static void main(String[] args) {
//		4.자식클래스를 객체화 한다.
		ImplementsRunnable implementsRunnable = new ImplementsRunnable();
//		5.Thread와 has a 관계로 객체화
		Thread t = new Thread(implementsRunnable);
//		6.Thread의 start()를 호출해서 동시에 실행되어야 할 코드를 정의
		t.start();
		implementsRunnable.test();
	}//main

}
