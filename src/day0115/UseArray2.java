package day0115;

import java.util.Arrays;
import java.util.Iterator;

/**
 * 이차원 배열
 */
public class UseArray2 {
	
	public UseArray2() {
		int[][] arr2 = null;
		arr2 = new int[3][4];
		System.out.println("행 : " + arr2.length);
		System.out.println("열 : " + arr2[0].length);
		
		arr2[0][0] = 2024;
		arr2[1][2] = 1;
		arr2[2][3] = 15;
		
		
		
		System.out.println("arr[0][0] = " + arr2[0][0] + "\n");
		System.out.println("arr[1][1] = " + arr2[1][1] + "\n");
		
		for (int i = 0; i  < arr2.length; i ++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println("\n");
		}
//		구구단 배열
		
		String[][] nineTonine = new String[8][9];
		for (int i = 0; i < nineTonine.length; i++) {
			for (int j = 0; j < nineTonine[0].length; j++) {
				nineTonine[i][j] = (i+2) + " * " + (j+1) + " ";
			}
		}
		
		for (int i = 0; i < nineTonine.length; i++) {
			for (int j = 0; j < nineTonine[0].length; j++) {
				System.out.printf("%s ", nineTonine[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void useArray2() {
		int[][] arr = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
		
		arr[0][2] = 300;
		arr[1][3] = 800;
		arr[2][0] = 900;
		
		for (int[] arr1 : arr) {
			System.out.println(Arrays.toString(arr1));
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new UseArray2().useArray2();
		
	}// main
}
