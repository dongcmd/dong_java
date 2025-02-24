package test;
/*
   사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
   단, 2~9 사이의 숫자가 아닌 경우 
   “2~9 사이의 숫자만 입력해주세요”를 출력하세요
   
   [결과]
   출력 시작 단을 입력하세요 : 5
   === 5단 ===
   5*2=10
   === 6단 ===
   ...
   === 9단 ===
   9*2=18
 */
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력 시작 단을 입력하세요 : ");
		int input = sc.nextInt();
		if(2 <= input && input <= 9) {
			for(int a = input; a <= 9; a++) {
				System.out.printf("=== %d단 ===\n", a);
				for(int b = 2; b <= 9; b++)
					System.out.printf("%d * %d = %d\n", a, b, a*b);
			}
			
		}
		else System.out.print("2~9 사이의 숫자만 입력해주세요"); 
		
	}

}
