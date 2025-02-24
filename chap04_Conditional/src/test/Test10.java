package test;
/*

 * 화면에서 2~9까지의 숫자를 입력받아 입력된 수의 구구단을 출력하기
 * [결과]
 * 출력 구구단 : 3
 * 3*2=6
 * 3*9=9
 * ...
 * 3*9=27 
 */
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력 구구단 : ");
		int a = sc.nextInt();
		
		for(int b = 2; b < 10; b++)
			System.out.printf("%d * %d = %d\n", a, b, a * b);

	}
}
