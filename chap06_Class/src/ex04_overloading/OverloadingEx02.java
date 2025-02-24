package ex04_overloading;

class Adder2 {
	int add(int a, int b) {
		System.out.print("1:");
		return a+b;
	}
	long add(long a, int b) {
		System.out.print("2:");
		return a+b;
	}
	long add(int a, long b) {
		System.out.print("3:");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("4:");
		return a+b;
	}
}
public class OverloadingEx02 {
	public static void main(String[] args) {
		Adder2 a = new Adder2();
		System.out.println(a.add(10,10));
		System.out.println(a.add(10,10L));
		System.out.println(a.add(10L,10));
		System.out.println(a.add(10L,10L));
		
	}
}