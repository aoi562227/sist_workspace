package day0214;

import java.util.Random;

public class UseSleep implements Runnable{

	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("loading");
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(System.currentTimeMillis()%1000);
				System.out.print(" . ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("finish");
	}

	public static void main(String[] args) {
		UseSleep useSleep = new UseSleep();
		Thread t = new Thread(useSleep);
		t.start();
	}//main
}