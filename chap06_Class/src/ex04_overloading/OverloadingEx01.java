package ex04_overloading;

class Adder {
	int a = 100;
	int add(int b) {
		System.out.print("1: ");
		return a+b;
	}
		
	double add(double b) {
		System.out.print("2: ");
		return a+b;
	}
	
	String add(String b) {
		System.out.print("3: ");
		return a+b;
	}
	
}
public class OverloadingEx01 {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println(a.add(10)); // 1: 100
		System.out.println(a.add(10.5)); // 2: 110.5
		System.out.println(a.add("번")); // 3: 100번
		System.out.println(a.add(100l)); // 2: 200.0
	}
}