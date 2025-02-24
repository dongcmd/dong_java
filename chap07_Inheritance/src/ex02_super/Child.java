package ex02_super;

public class Child extends Parent {
	int x= 20;

	Child() { super(100); }
	
	void method() {
		int x = 30;
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
	
}
