package test;
/*
 * Outer1클래스의 내부 클래스 Inner1, Inner2 의 멤버변수 iv의 값 출력 하기
 */
class Outer1 {
	class Inner1 {
		int iv = 100;
	}
  static class Inner2 {
		int iv = 200;
	}
}
public class Test2 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		Outer1.Inner1 ii = out.new Inner1();
		Outer1.Inner2 si = new Outer1.Inner2();
		
		System.out.println("ii.iv = : " + ii.iv);
		System.out.println("new Outer1.Inner2().iv = : " + new Outer1.Inner2().iv);
		System.out.println("si.iv = : " + si.iv);
	}
}
