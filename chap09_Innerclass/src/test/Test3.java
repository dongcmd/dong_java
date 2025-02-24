package test;

/* 
main 메서드에서 method1() 메서드를 호출하고, 
method1 메서드에서 value 값을 출력하여 다음의 결과가 나오도록 프로그램 수정하기
[결과]
30    => 지역변수 value
20    => 내부클래스 변수 value
10    => 외부클래스 변수 value
*/
class Outer2 {
	int value = 10;
	class Inner {
		int value = 20;
		void method1() {
			int value = 30;
			System.out.println("지역변수 value = " + value);
			System.out.println("내부클래스 value = " + this.value);
			System.out.println("외부클래스 value = " + Outer2.this.value);
		}
	}
}

public class Test3 {
	public static void main(String[] args) {
		new Outer2().new Inner().method1();
	}
}
