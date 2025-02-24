package ex07_package; // 패키지 설정
/*
 * 패키지 예제
 * package
 *  - 클래스들의 모임
 *  - 클래스의 이름은 패키지명을 포함
 *  - 패키지 설정은 파일의 처음에 한번만 기술해야 함
 *   => 같은 파일에 존재하는 모든 클래스는 같은 패키지에 속함
 *   
 * import : 클래스 이름의 패키지명을 생략할 수 있께 미리 선언해줌
 *   
 * 클래스의 패키지명을 생략할 수 있는 경우
 * 1. 같은 패키지 내 속한 클래스
 * 2. java.lang 패키지에 속한 클래스
 * 3. import 구문으로 선언된 클래스는 패키지명 생략 가능
 * 	  * 표현방식은 해당 패키지 내 모든 클래스의 패키지명 생략
 */

class Pack1 {
	void method() {
		System.out.println("metohd of ex07_package.Pack1 class");
	}
}
public class PackageEx01 {

	public static void main(String[] args) {
		Pack1 p = new ex07_package.Pack1(); // 패키지명 생략
		p.method();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
	}

}
