/*
 * 내부 클래스에서 사용되는 this, super
 */
package chap09;


class ParentOuter {
	int iv = 0;
	int piv = 500;
}
class Outer3 extends ParentOuter {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method() {
			int iv = 300;
			/*
			 * 내부클래스의 멤버메서드에서 변수 접근 우선순위
			 * 1. 지역변수
			 * 2. 내부클래스 멤버변수 / this.멤버변수로 접근 가능
			 * 3. 외부클래스 멤버변수 / 외부클래스명.this.멤버변수로 접근 가능
			 * 4. "외부클래스의 상위 클래스" 멤버변수 / 외부클래스명.super.멤버변수로 접근 가능
			 */
			System.out.printf("iv = %d\n", iv);
			System.out.printf("iv2 = %d\n", iv2); // 내부클래스 멤버에 해당 변수가 없으니 외부클래스의 변수를 가져옴 
			System.out.printf("piv = %d\n", piv);
			// this는 속한 클래스 내를 뜻함. 외부클래스멤버에 접근불가
			System.out.printf("this.iv = %d\n", this.iv);
//			System.out.printf("super.iv = %d\n", super.iv); // 내부클래스는 상속받지 않아서 super 사용 불가
			// 외부클래스명.this.멤버명
			System.out.printf("Outer3.this.iv = %d\n", Outer3.this.iv);
			System.out.printf("Outer3.this.piv = %d\n", Outer3.this.piv);
			
			//외부클래스의 상위 멤버 iv 접근 : 외부클래스명.super.멤버명 
			System.out.printf("Outer3.super.iv = %d\n", Outer3.super.iv);
			System.out.printf("Outer3.super.piv = %d\n", Outer3.super.piv);
		}
	}
}
public class InnerEx03 {
	public static void main(String[] args) {
		new Outer3().new InstanceInner().method();
	}
}
