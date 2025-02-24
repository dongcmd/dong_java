package chap05;


import java.util.Scanner;
public class Exam06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 행을 입력 : ");
		int row = sc.nextInt();
		
		int[][] arr = new int[row][];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j <= i; j++) {
				arr[i] = new int[j+1];
//				arr[i][j] = 0;
//				System.out.printf("%d ", arr[i][j]);
//			System.out.println();
			}
		}
		for(int[] ar : arr) {
			for(int a : ar) {
				System.out.printf("%d  ", a);
			}
		System.out.println();
		}
	}

}
