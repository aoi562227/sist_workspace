package day0115;

import java.util.Iterator;

public class UseArray3 {
	
	public UseArray3() {
		int[][][] arr3 = null;
		arr3 = new int [2][2][3];
		
		arr3[0][1][1] = 2024;
		arr3[1][1][1] = 1;
		
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				for (int k = 0; k < arr3[i][j].length; k++) {
					System.out.printf("arr[%d][%d][%d]=%d\t",i,j,k,arr3[i][j][k]);
				}
				System.out.println();
			}
		}System.out.println();
	}
	
	public void useArray3() {
		int[][][] arr3 = new int[][][] {
			{{1, 2, 3}}, {{4, 5, 6}},
			{{7, 8, 9}}, {{10, 11, 12}}
		};
		
		System.out.printf("%d면%d행%d열\n", arr3.length, arr3[0].length, arr3[0][0].length);
		
		for (int[][] arr2 : arr3) {
			for (int[] arr1 : arr2) {
				for (int value : arr1) {
					System.out.printf("%d\t", value);
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		new UseArray3().useArray3();;
	}//main
}
