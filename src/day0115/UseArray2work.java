package day0115;

import java.util.logging.Logger;

import lombok.Setter;


public class UseArray2work {
	
	public void scorePrint() {
		String[] namesArr = {"가", "나", "다", "라", "마"};
		int[][] scoreArr = {
				{89, 91, 86},
				{91, 93, 90},
				{98, 100, 99},
				{74, 85, 83},
				{88, 90, 95},
		};
		System.out.printf("시험 응시 인원 [%d]명\n", namesArr.length);
		System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
		
		int[] totalScores = new int[namesArr.length];
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.printf("%d\t%s\t",(i+1),namesArr[i]);
			for (int j = 0; j < scoreArr[0].length; j++) {
				System.out.printf("%d\t", scoreArr[i][j]);
				totalScores[i] += scoreArr[i][j];
			}
			System.out.printf("%d\t%.2f\n",totalScore(scoreArr[i]),(double)totalScore(scoreArr[i])/3);
		}
		System.out.println("=========================================================");
		System.out.printf("\t총점\t");
		for (int i = 0; i < scoreArr[0].length; i++) {
            int columnTotal = 0;
            for (int[] scores : scoreArr) {
                columnTotal += scores[i];
            }
            System.out.printf("%d\t", columnTotal);
        }
        System.out.println();
		System.out.printf("\t평균\t");
		for (int i = 0; i < scoreArr[0].length; i++) {
            int columnTotal = 0;
            for (int[] scores : scoreArr) {
                columnTotal += scores[i];
            }
            System.out.printf("%.2f\t", (double) columnTotal / scoreArr.length);
        }
        System.out.println();
        int primaryStudentIndex = findPrimaryStudentIndex(totalScores);
		System.out.printf("\t1등학생의 번호[%d], 이름[%s]\n", primaryStudentIndex+1, namesArr[primaryStudentIndex] );
	}
	
	public int findPrimaryStudentIndex(int[] totalScores) {
		int maxIndex = 0;
        for (int i = 1; i < totalScores.length; i++) {
            if (totalScores[i] > totalScores[maxIndex]) {
                maxIndex = i;
                
            }
        }
        return maxIndex;
	}
	
	public int totalScore(int[] score) {
		int total = 0;
		for (int i : score) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {
		UseArray2work useArray2work = new UseArray2work();
		useArray2work.scorePrint();
	}// main
}
