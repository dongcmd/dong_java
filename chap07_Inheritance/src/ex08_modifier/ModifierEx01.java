package ex08_modifier;
import ex08_modifier.test.Modifier2;
/*
 * 제한자 : 접근제한자 + 그 외 제한자(static, abstract, final 등)
 * 
 * 접근 제한자 : 권한 범위
 *   private < (default) < protected < public
 *   
 *   private : 같은 클래스 내
 *   (default) : + 동일한 패키지에 속한 클래스 내
 *   protected : + 상속 받은 클래스 내
 *   public : 어디서든
 */
class Modifier3 extends Modifier2 {
	
	void method2() {
		System.out.println("method2() of ex08_modifier.Modifier3 class");
//		System.out.println("v1 = " + v1); // private
//		System.out.println("v2 = " + v2); // (default)
		System.out.println("v3 = " + v3); // protected
		System.out.println("v4 = " + v4); // public
	}
	@Override
	public void method() {
		System.out.println("v3 = " + v3); // protected
		System.out.println("v4 = " + v4); // public
	}
}
public class ModifierEx01{
	public static void main(String[] args) {
		Modifier1 m1 = new Modifier1();
		m1.method();
//		System.out.println("m1.v1 = " + m1.v1); // private
		System.out.println("m1.v2 = " + m1.v2); // (default)
		System.out.println("m1.v3 = " + m1.v3); // protected
		System.out.println("m1.v4 = " + m1.v4); // public
		
		Modifier2 m2 = new Modifier2();
		m2.method();
//		System.out.println("m2.v1 = " + m2.v1); // private
//		System.out.println("m2.v2 = " + m2.v2); // (default)
//		System.out.println("m2.v3 = " + m2.v3); // protected
		System.out.println("m2.v4 = " + m2.v4); // public
	}
}
class Modifier1 {
	private int v1 = 100;
	int v2 = 200;
	protected int v3 = 300;
	public	int v4 = 400;
	public void method() {
		System.out.println("method() of ex08_modifier.Modifier1 class");
		System.out.println("v1 = " + v1); // private
		System.out.println("v2 = " + v2); // (default)
		System.out.println("v3 = " + v3); // protected
		System.out.println("v4 = " + v4); // public
	}
	
}
