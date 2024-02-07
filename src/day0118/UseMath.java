package day0118;

public class UseMath {
	
	public UseMath() {
		int i = 40;
		double d = Math.abs(2024.01);
		int j = Math.abs(2024);
		System.out.println(d + ", " + j);
		d = 10.5;
		long l = Math.round(d);
		System.out.println(d + ", " + l);
		System.out.println((int)(Math.random()*10)+1);
		
		char[] randomUpperCase = new char[8];
		for (int k = 0; k < randomUpperCase.length; k++) {
			randomUpperCase[k] = (char)((Math.random() * ('Z' - 'A' + 1) + 'A'));
		}

			System.out.println(randomUpperCase);

		
	}
	
	public static void main(String[] args) {
		new UseMath();
		 
	}//main
}
