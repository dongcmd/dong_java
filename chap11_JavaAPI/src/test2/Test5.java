package test2;
import java.util.Random;
/*
 * int getRand(f,t) : 함수 구현하기
 *   f ~ t 또는 t~ f 까지  범위에 숫자를 임의의 수로 리턴하는 함수
 *   f, t 값은 포함됨. 
 
[결과]
-2,1,0,-3,-2,1,-1,0,-2,0,0,1,0,-3,0,-1,-1,-2,-2,1,
3,3,0,0,-1,-1,0,3,2,3,0,-1,1,1,-1,3,0,0,1,-1,    
 */

public class Test5 {
	static int getRand(int n1, int n2) {
		int a = Math.min(n1, n2);
		int b = Math.max(n1, n2);
		
		Random ran = new Random();
		// 두 수의 차로 풀어보기
		
		return ran.nextInt(a, b+1);
		
	}
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.printf("%3d,", getRand(1,-3));
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.printf("%3d,", getRand(1,-3));
		}
	}
}
