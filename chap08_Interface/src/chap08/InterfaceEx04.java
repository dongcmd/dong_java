/*
 * 추상클래스와 인터페이스를 이름 없는 내부 객체로 생성하기
 */
package chap08;


interface Action {
	void action();
}
abstract class Abs {
	int num = 100;
	abstract void method();
}

public class InterfaceEx04 {
	public static void main(String[] args) {
		//내부객체
		Action a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 인터페이스의 action 메서드");
			}
		};
		a.action();
		
		Abs abs = new Abs() {
			@Override
			public void method() {
				System.out.println(num);
			}
		};
		
		abs.method();
	}
}