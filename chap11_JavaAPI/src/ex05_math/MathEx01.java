package ex05_math;
/*
 * Math 클래스 : 수치계산 기능
 *  - final 클래스 : 상속 불가
 *  - 생성자의 접근 제한자 private : 객체 생성 불가
 *  - 모든 멤버가 static인 클래스 멤버.
 *  - 두개의 상수
 *    Math.PI : 원주율 3.141952...
 *    Math.E  : 자연로그
 */
public class MathEx01 {
	public static void main(String[] args) {
		//abs() : 절대값
		System.out.println(Math.abs(5));
		System.out.println(Math.abs(-5.22));
		
		//근사정수 : ceil(), floor(), rint()
		//ceil() : 큰 근사정수
		System.out.println(Math.ceil(5.4)); // 6.0
		System.out.println(Math.ceil(-5.4)); // -5.0
		//floor() : 작은 근사정수 
		System.out.println(Math.floor(5.4)); // 5.0
		System.out.println(Math.floor(-5.4)); // 6.0
		//rint() : 근사정수
		System.out.println(Math.rint(5.4)); // 5.0
		System.out.println(Math.rint(-5.4)); // -5.0
		
		//max(), min() : 최대, 최소
		System.out.println(Math.max(1, 7)); // 7
		System.out.println(Math.min(-5.2, -2)); // -5.2
		
		//round() : 반올림
		System.out.println(Math.round(5.4)); // 5
		System.out.println(Math.round(5.5)); // 6
		
		//random() : 난수 0 <= value < 1.0
		System.out.println(Math.random());
		
		//삼각함수 : 각도의 단위가 Radians임. Degrees가 아님
		System.out.println(Math.toDegrees(Math.PI/2)); // 90.0
		//sin(90도)
		System.out.println(Math.sin( Math.PI/2 )); // 1.0
		//cos(60도)
		System.out.println(Math.cos( Math.toRadians(60) ) ); // 0.5
		//tan(45도)
		System.out.println(Math.tan( Math.PI/4 )); // 1
		//log
		System.out.println(Math.log(Math.E)); // 1.0
		//제곱근
		System.out.println(Math.sqrt(25)); // 5.0
		//제곱
		System.out.println(Math.pow(10, 3)); // 1000.0
	}
}