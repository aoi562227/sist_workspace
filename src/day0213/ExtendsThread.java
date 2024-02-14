package day0213;

//1. Thread를 상속
public class ExtendsThread extends Thread{

//	2.run method의 Override
	@Override
	public void run() {
//	3.Thread로 동작해야 할 코드를 정의
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
//		4.자식 클래스를 객체화
		ExtendsThread extendsThread = new ExtendsThread();
//		5.start()를 호출하여 Thread로 처리
		long st = System.currentTimeMillis();
		extendsThread.start();
//		extendsThread.run();
		extendsThread.test(); //context switch
		long et = System.currentTimeMillis();
		System.out.println(et - st + "ms");
	}//main
}
