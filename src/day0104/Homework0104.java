package day0104;

public class Homework0104 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + i*j + "  ");
			}
			System.out.print("\n");
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == j) {
					System.out.print(i);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		int sum = 0;
		for (int i = 3; i < 101; i+=3) {
			sum += i;
		}
		System.out.println(sum);
	}//main
}
