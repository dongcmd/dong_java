package ex03_method;

class Value { int val; }

public class ParameterEx01 {
	public static void main(String[] args) {
		Value v= new Value();
		v.val = 100;
		change1(v.val);
		System.out.println("change1 이후 : "  + v.val);
		
		change2(v);
		System.out.println("change2 이후 : "  + v.val);
	}
	private static void change1(int val) {
		val+= 100;
		System.out.println("change1() : " + val);
	}
	
	private static void change2(Value v) {
		v.val+= 100;
		System.out.println("change2() : " + v.val);
	}
}
