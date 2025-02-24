package ex08_modifier.test;

public class Modifier2 {
	private int v1 = 10;
			int v2 = 20;
	protected int v3 = 30;
	public	int v4 = 40;
	public void method() {
		System.out.println("method() of ex08_modifier.test.Modifier2 class");
		System.out.println("v1 = " + v1); // private
		System.out.println("v2 = " + v2); // (default)
		System.out.println("v3 = " + v3); // protected
		System.out.println("v4 = " + v4); // public
	}
}
