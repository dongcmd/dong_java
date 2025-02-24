package ex02_super;
/*
 * super 예약어
 * super() 생성자
 *  - 부모클래스의 생성자 호출. this()처럼, 첫 줄에 구현필수.
 *	- 부모클래스의 생성자 중 매개변수 있는(없는) 생성자 있으면(없으면) super() 필수(아님).
 *  (자손 클래스의 객체 생성은 부모 클래스의 객체부터 생성한다.)
 *  
 *  super 참조변수 : 부모클래스의 객체를 참조하는 참조변수
 */

public class SuperEx01 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
