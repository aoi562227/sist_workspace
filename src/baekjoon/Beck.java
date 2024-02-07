package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Beck {
	
	public static void main(String[] args) {
		int count = 0;
		try (Scanner sc = new Scanner(System.in)) {
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int[] beutifulInt = new int[1000000000];
				Arrays.fill(beutifulInt, 0);
				for (int j = 0; i < T; i++) {
					int n = sc.nextInt();
					if (beutifulInt[n] == 0) {
						beutifulInt[n] = 1;
					}else {
						count += 1;
					}
				}
				System.out.println(count);
			}

		}

	}//main

	
	
}
