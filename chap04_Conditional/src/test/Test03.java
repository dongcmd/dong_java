package test;
/*
 삼각형의 높이를 입력받아서 *로 삼각형 출력하기
  [결과]
  삼각형의 높이
  3
  
   *
  ***
 *****
*/
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 높이");
		int h = sc.nextInt();
		int now = 1;
		
		for(int i = h; i > 0; i--) {
			
			for(int j = i-1; j > 0; j--) {
				System.out.print(" ");						
			}
			for(int j = 1; j <= 1 + 2*(now-1); j++) {
				System.out.print("*");
			}
			System.out.println();
			now++;
		}	
	}
}
