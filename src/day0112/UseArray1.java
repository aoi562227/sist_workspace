package day0112;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.BiFunction;

/**
 * 데이터형[] 배열명 = new 데이터형[방의 크기]
 */
public class UseArray1 {
	
	Thread thread = new Thread();
	
	
	
	public UseArray1() {
		int[] arr = null;
		arr = new int[5];
		int sum = 0;
		System.out.println(arr);
		System.out.println(arr[0] + " " + arr[1]);
		arr[0] = 2024;
		arr[1] = 1;
		arr[2] = 12;
		arr[3] = 14;
		arr[4] = 44;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	public void scoreProcess() {
		int sum = 0;
		int filter = 0;
		System.out.println("1234");
		String[] nameArr = new String[] {"가", "나", "다", "라"};
		String[] addrArr = new String[] {"서울턱별시", "울산광역시", "천안시", "대구시"};
		int[] scoreArr = new int[] {4, 5, 6, 7};
		System.out.println("번호\t이름\t점수\t주소\n");
//		for (int i = 0; i < nameArr.length; i++) {
//			System.out.printf("%d\t%s\t%d\t%s\n", i+1, nameArr[i], scoreArr[i], addrArr[i]);
//			sum += scoreArr[i];
//		}
		for (int i = 0; i < nameArr.length; i++) {
			if(addrArr[i].matches("서울.*?")){
				System.out.printf("%d\t%s\t%d\t%s\n", i+1, nameArr[i], scoreArr[i], addrArr[i]);
				sum += scoreArr[i];
				filter++;
			}
		}
		System.out.println("-------------------------------");
		System.out.printf("총점 [%d]점 평균[%.2f]점\n\n", sum, (double)sum/filter);
		for (int i = scoreArr.length - 1; i > -1; i--) {
			System.out.printf("%d ", scoreArr[i]);
		}
	}
	
	private int flowChartTop() {
		int[] scoreArr = {5, 6, 7, 8, 9};
		int top = scoreArr[0];
		for (int i = 0; i < scoreArr.length; i++) {
			if (top < scoreArr[i]) {
				top = scoreArr[i];
			}
		}
		return top;
	}
	
	private int flowChartLow() {
		int[] scoreArr = {5123, 349, 63577, 4518, 3456};
		int low = scoreArr[0];
		for (int i = 0; i < scoreArr.length; i++) {
			if (low > scoreArr[i]) {
				low = scoreArr[i];
			}
		}
		return low;
	}
	
	private void bubbleSortArrays() {
		int[] scoreArr = {5123, 349, 63577, 4518, 3456};
		int temp = 0;
		for (int i = 0; i < scoreArr.length; i++) {
			for (int j = 0; j<scoreArr.length; j++) {
				if (scoreArr[i] < scoreArr[j]) {
					temp=scoreArr[i];
					scoreArr[i]=scoreArr[j];
					scoreArr[j]=temp;
				}
			}
		}
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println(scoreArr[i]);
		}
	}
	

	
	
	
//	public void matches(String location) {
//		int sum = 0;
//		int filter = 0;
//		String[] nameArr = new String[] {"가", "나", "다", "라"};
//		String[] addrArr = new String[] {"서울턱별시", "울산광역시", "천안시", "대구시"};
//		int[] scoreArr = new int[] {4, 5, 6, 7};
//		System.out.println("번호\t이름\t점수\t주소\n");
//		for (int i = 0; i < nameArr.length; i++) {
//			if(addrArr[i].matches(location+".*?")){
//				System.out.printf("%d\t%s\t%d\t%s\n", i+1, nameArr[i], scoreArr[i], addrArr[i]);
//				sum += scoreArr[i];
//				filter++;
//			}
//		}
//	}
	
	

	public static void main(String[] args) {
		UseArray1 useArray1 = new UseArray1();
		useArray1.scoreProcess();
		System.out.println(useArray1.flowChartTop());
		System.out.println(useArray1.flowChartLow());
		useArray1.bubbleSortArrays();

	}//main

}
