package day0104;

public class TestFor3 {
	public static void main(String[] args) {
		
//		try{
//			System.out.println("무한 Loop");
//			for (int i = 0;;i++) {
//				System.out.println(i);
//				Thread.sleep(1000);
//			}
//		}catch(InterruptedException e){
//		    e.printStackTrace();
//		}
		
		for (int i = 0; i < 101; i++) {
			if (!(i % 2 == 1)) {
				continue;
			}
			System.out.println(i + " ");
		}
		
	}// main
}
