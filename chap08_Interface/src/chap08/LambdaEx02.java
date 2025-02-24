/*
 * 추상메서드의 매개변수가 존재, 리턴타입 void인 경우
 * (매개변수) -> {...};
 * 매개변수가 1개인 경우 () 생략 가능
 * 실행구문이 1개인 경우 {} 생략 가능
 * 매개변수 -> {...};
 * 매개변수 -> ;
 */
package chap08;


interface LambdaInterface2 {
	void method(int a);
}
public class LambdaEx02 {
	public static void main(String[] args) {
		LambdaInterface2 f = (i)-> {
			System.out.println(i*5);
		};
		f.method(5);
		
		f = i -> System.out.println(i*5);
		f.method(3);
		calc(f, 10);
		
	}
	private static void calc(LambdaInterface2 f, int num) {
		f.method(num);
	}
}
