package ex01_is_a;
/*
 * 상속 예제
 * 1. 자손 클래스의 객체 생성은 부모 클래스의 객체부터 생성한다.
 * 2. 클래스 간 상속은 단일 상속만 가능.
 * 3. 모든 클래스의 부모 클래스는 Object 클래스
 */
public class PhoneEx01 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power();
		sp.send();
		sp.receive();
		sp.setApp("kakao");
		
	}
}
