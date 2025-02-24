package chap10_Exception;
import java.io.IOException;
/*
 * 오버라이딩에서의 예외처리 : 같거나 좁은 범위만 가능
 *   "부모클래스 메서드의" 예외처리보다 "자손클래스 메서드" 예외처리는 같거나, 하위클래스 예외로 선언해야 한다.
 *   
 * 오버라이딩에서의 접근제어자 : 같거나 넓은 범위만 가능
 * RuntimeException은 예외처리를 생략할 수 있음
 */
class Parent {
	public void method() throws IOException {
		System.out.println("Parent클래스의 method()");
	}
}
class Child extends Parent {
	public void method() throws ArithmeticException {
		System.out.println("Child클래스의 method()");
	}
}
public class ExceptionEx07 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
