package chap05;


import java.util.Scanner;
public class Exam07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 행 입력");
		
		int row = sc.nextInt();
		int[][] arr = new int[row][];
		int num = 0;
		
		for(int i = 0; i < row; i++ ) {
			arr[i] = new int[i+1];
			num += i+1;
		}
		int check = 0;
		
		for(int j = 0; j < row; j++ ) {
			for(int i = row-1 ; i >= 0+check; i-- ) {
				arr[i][j] = num--;
			}
			check++;
		}
//		for(int i = 0; i < row; i++) {
//			for( int j = 0; j < row-check+1; j++) {
//				System.out.printf("%d\t", arr[i][j]);
//			}
//			System.out.println();
//			check--;
//		}
		
		for(int[] ar : arr) {
			for(int a : ar) {
				System.out.printf("%5d", a);
			}
			System.out.println();
		}
	}
}
