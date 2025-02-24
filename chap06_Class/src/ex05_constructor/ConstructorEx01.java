package ex05_constructor;
/*
 * 생성자란?
 *  객체화시 호출되는 메서드
 *  생성자 없는 객체는 생성 불가.
 *  생성자의 주요 기능은 인스턴스변수의 초기화 담당
 *  클래스 내부에 생성자 미구현시 컴파일시 기본생성자를 제공.
 *  
 * 기본 생성자
 *  public 클래스명() {} 
 */
public class ConstructorEx01 {

	public static void main(String[] args) {
		Number1 n1 = new Number1();
		/*
		 * new 예약어 기능
		 * 1. 메모리 할당. heap 영역에 할당 (객체)
		 * 2. 멤버필드의 값을 명시된 값으로 초기화(없다면 기본값)
		 * 3. 생성자 호출
		 */
		Number2 n2 = new Number2(10);
		
		System.out.println(n1.num);
		System.out.println(n2.num);
	}

}
