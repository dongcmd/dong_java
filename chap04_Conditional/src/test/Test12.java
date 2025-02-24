package test;
/*
 * 가로 구구단 출력하기
 * 2*2=4    3*2=6  ...  9*2=18
 * 2*3=6
 * ...
 * 2*9=18   3*9=27      9*9=81 
 */
import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int b = 2; b <= 9; b++) {
			for(int a = 2; a <= 9; a++) {
				System.out.printf("%d*%d=%d\t", a, b, a*b);
			}
			
			System.out.println();
		}

	}
}
