package test;
/*
삼각형의 높이를 홀수로 입력하세요
5

*****
 ***
  *
 ***
*****
 
 */

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형 높이 홀수 입력");
		int h = sc.nextInt();
		sc.close();
		
		int ls = h;
		// i = 4, j = 3, ls = 2
		for(int i = 1; i <=h; i++) {
			for(int j = 1; j <= h; j++) {
				if( (i <= j && j <= ls ) || (ls <= j && j <= i ) ) {
				System.out.print("*");
				} else { System.out.print(" ");
				}
			}
			System.out.println();
			ls--;
		}
	}
}
