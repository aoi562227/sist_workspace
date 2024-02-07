package day0116;

import java.util.Iterator;

public class UseVariableArray {

	public UseVariableArray() {
		int[][] arr2 = null;

		arr2 = new int[5][];
		arr2[0] = new int[2];
		arr2[0] = new int[]{1,2,3,4,5,6,7};
		arr2[0] = new int[1];
		arr2[0] = new int[]{1,2,3};

		arr2[0][0] = 2024;
		arr2[0][3] = 42;
		arr2[1][0] = 1;
		arr2[1][1] = 16;
	
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.println(arr2.toString());
			}
		}
	}

	public static void main(String[] args) {
		new UseVariableArray();
	}// main
}
