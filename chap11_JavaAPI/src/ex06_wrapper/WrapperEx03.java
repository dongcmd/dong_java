package ex06_wrapper;
/*
 * switch 구문에서 조건값 사용할 수 있는 자료형
 *  - byte, short, int, char, String + (enum)
 *  각 기본형의 Wrapper 클래스도 가능
 *  
 */
public class WrapperEx03 {
	public static void main(String[] args) {
		int data = 0;
		switch(data) {
		case 0 : 
		default : System.out.println("switch 조건값 테스트");
		}
	}
}
/*
 * 
 * 		java.lang 패키지의 클래스
 * 		Object : 모든 클래스의 부모 클래스
 * 		String : 문자열, 정적인 문자열
 * 		StringBuilder / StringBuffer : 동적문자열. equals 메서드 오버라이딩 안함.
 * 										보조문자열
 * 		Math : 수치 계산을 위한 기능. final 클래스(상속 X), private 생성자(객체화 X), 모든 멤버가 static(Math.멤버명으로 접근)
 * 		Wrapper 클래스 : Boolean, Byte, Short, Integer, Long, Float, Double, Character
 * 						8개 클래스의 통칭. 기본 자료형을 객체화하는 기능. 기본자료형과 자동형변환 가능		
 * 
 *
 * 
*/
