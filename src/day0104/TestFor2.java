package day0104;

import java.util.Iterator;

import javax.sound.midi.Soundbank;

/**
 * 다중 for문
 */
public class TestFor2 extends Thread{
	public static void main(String[] args) {
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + " * " + j + " = " + i*j);
//			}
//			System.out.println();
//		}
		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < i+1; j++) {
//				System.out.print(i + " " + j + " ");
//			}
//			System.out.println();
//		}
		
//		for (int i = 0; i < 5; i++) {
//			for (int j = i + 1; j < 6; j++) {
//				System.out.print(i + " " + j + " ");
//			}
//			System.out.println();
//		}
		int sum = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(sum + " ");
				sum++;
			}
			System.out.println();
		}
	}//main
}
