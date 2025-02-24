package test;
/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
*/
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int num = h*h;
		int length = h;
		
		for(int i = h ; i > 0; i--) {
			for(int j = 1; j <= h*2-1; j++) {
				if(i <= j && j <= length) {
					System.out.print(num-- + "\t");
				} else { System.err.print("\t");
			
				}
			}
			length++;
			System.out.println();
		}
	}
}
