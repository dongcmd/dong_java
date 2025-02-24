/*
 * LambdaInterace2 인터페이스를 이용하여 1부터 입력된 값까지의 합 구하기
 * 
 * interface LambdaInterface2 {
 * 		void method(int a);
 * }
 */
package chap08;


public class Exam02 {
	private static void calc(LambdaInterface2 f, int num) {
		f.method(num);
	}

	public static void main(String[] args) {
		LambdaInterface2 f = null;
		f = i -> {
			int sum = 0;
			int o = i;
			while(i > 0) {
				sum += i--;
			}
			System.out.printf("1~%d까지의 합 : %d\n", o, sum);
		};
		calc(f, 10); // 55
		calc(f, 100); // 5050
		// n! 값 출력
		
		f = n -> {
			int result = 1;
			for(int i = 1; i <= n; i++) {
				result *= i;
			}
			System.out.printf("%d! : %d\n", n, result);
		};
		calc(f, 4); // 24
		calc(f, 5); // 120
		
	}
}
