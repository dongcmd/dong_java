package test2;
/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 * 
 * [결과]
   90   80   70  240
   95   85   75  255
   70   80   75  225
   75   70   85  230
   70   75   80  225
  400  390  385 1175
 */

import java.util.Arrays;
public class Test3 {
	public static void main(String[] args) {
		// 5 3
		int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
		
		int[][] result = new int[score.length+1][score[0].length+1];
		
		//단순 인덱스 복사		
//		for(int i = 0; i < score.length; i++) {
//			for(int j = 0; j <score[i].length; j++) {
//				result[i][j] = score[i][j];
//			}
//		}
//		
		// Arrays.copyOf()로 복사		
		for(int i = 0; i < score.length; i++) {
			result[i] = Arrays.copyOf(score[i], score[i].length+1); 
		}
		
		// 행 더하기
		for(int i = 0; i < result.length-1; i++) {
			int sum = 0;
			for(int j = 0; j < result[j].length; j++) {
				if( j != result[j].length-1) {
					sum += result[i][j];
				} else {
					result[i][j] = sum;
				}
			}
		}
		
		// 열 더하기
		for(int j = 0; j < result[j].length; j++) {
			int sum = 0;
			for(int i = 0; i < result.length; i++) {
				if( i != result.length-1) {
					sum += result[i][j];
				} else {
					result[i][j] = sum;
				}
			}
		}
		for(int[] arr : result) {
			for(int ar : arr) {
				System.out.printf("%d\t", ar);
			}
			System.out.println();
		}
	}
}
