package test;
/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int len = 2*h-1;
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= len; j++) {
				if( i <= j && j <= len) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			len--;
			System.out.println();
		}
	}
}
