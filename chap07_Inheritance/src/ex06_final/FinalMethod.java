package ex06_final;

public class FinalMethod {
	final void method() { //재정의 불가 메서드 == 오버라이딩 불가
		System.out.println("FinalMethod class's method");
	}
}
class SubMethod extends FinalMethod {
//	void method() {
//		System.out.println("SubMethod class's method");
//	}
}
