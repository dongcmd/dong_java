/*
 * 내부 클래스 : 클래스 내부에 존재하는 클래스
 * 인스턴스 내부클래스 : 객체화를 위해 외부클래스의 객체화 필요 / new Outerclass(). new InstanceInner()
 * static 내부클래스 : 객체화를 위해 외부클래스 객체화 불필요 / new Outerclass.StaticInner()
 * 지역 내부클래스 : 메서드 내부에서 선언된 클래스
 * 
 * 내부클래스 특징
 * 1. 참조자료형으로 사용됨. 외부클래스명.내부클래스명
 * 2. 객체화 가능. ( 모든 클래스는 Object클래스의 자손 클래스)
 * 3. 멤버소유 가능. 생성자 구현 가능
 * 
 *  내부클래스는 외부클래스의 멤버
 *   1. 외부클래스의 private 멤버에 접근 가능
 *   2. 인스턴스 내부클래스 : 인스턴스 멤버
 *   3. static 내부클래스 : 클래스 멤버
 *   
 */
package chap09;


class Outer1 {
	class InstanceInner { 
		int iv = 100;
		static int cv = 10;
		final static int MAX = 200;
	}
	static class StaticInner {
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner {
			int iv = 600;
			static int cv = 700;
			final static int MAX = 800;
		}
		LocalInner lc = new LocalInner();
		System.out.printf("lc.iv = %d\n", lc.iv);
		System.out.printf("lc.cv = %d\n", lc.cv);
		System.out.printf("LocalInner.cv = %d\n", lc.cv);
	}
	void method2() {
		
	}
}
public class InnerEx01 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();

		//InstanceInner class 객체화
//		Outer1.InstanceInner ii = new Outer1.InstanceInner(); // 오류
		Outer1.InstanceInner ii = new Outer1().new InstanceInner(); //ii는 out클래스의 멤버와 독립적인가?
		Outer1.InstanceInner ii2 = out.new InstanceInner(); // ii2는 out클래스의 멤버에 속하는 건가?
		
		//staticInner class 객체화
		Outer1.StaticInner si = new Outer1.StaticInner();
//		Outer1.StaticInner si = out.StaticInner(); // 오류
		
		//ii 객체 멤버 호출
		System.out.printf("ii.iv = %d\n", ii.iv);
//		System.out.printf("ii.cv = %d\n", ii.cv); // 경고, 클래스변수는 객체가 아닌 클래스를 통해 접근하는 걸 권장
		System.out.printf("ii.cv = %d\n", Outer1.InstanceInner.cv);
		System.out.printf("ii.MAX = %d\n", Outer1.InstanceInner.MAX);
		
		//si 객체 멤버 호출
		System.out.printf("si.iv = %d\n", si.iv);
//		System.out.printf("si.cv = %d\n", si.cv); // 경고, 클래스변수는 객체가 아닌 클래스를 통해 접근하는 걸 권장
		System.out.printf("si.cv = %d\n", Outer1.StaticInner.cv);
		System.out.printf("si.MAX = %d\n", Outer1.StaticInner.MAX);
		
		
	}

}
