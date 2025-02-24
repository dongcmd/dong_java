package ex04_binding;
/*
 *     		Parent p	=		new Child();  << 가능  
 *  1. 부모타입의 참조변수로 자손타입의 객체를 참조 가능 : 다형성
 *  2. 부모타입의 참조변수로 자손타입의 객체를 참조하는 경우
 *  	같은 멤버의 경우
 *  	변수 : 참조변수의 자료형을 기준으로 호출
 *  	메서드 : 객체의 최종 오버라이딩된 메서드 호출
 *  3. 모든 클래스의 객체는 Object 타입으로 형변환 가능
 *  4. 모든 클래스의 객체는 Object 타입의 참조변수로 참조 가능
 */
class Parent {
	int x = 10;
	void method() {
		System.out.println("Parent class method");
	}
}
class Child extends Parent {
	int x = 20;
	void method() {
		super.method();
		System.out.println("Child class method");
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}
public class BindingEx01 {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.x);
		p.method();
		
		Child c = (Child) p;
		// 자손 < 부모 : 형변환 연산자 필수. 명시적 형변환
		Object o = p;
		// 부모 < 자식 : 형변환 연산자 생략 가능. 자동 형변환
//		
//		System.out.println(c.x);
//		c.method();
		
		
		
//		Child c = new Parent();
//		c.method();
//		System.out.print(c.x);
		
	}

}
