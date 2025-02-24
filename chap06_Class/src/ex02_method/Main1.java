package ex02_method;

public class Main1 {

	public static void main(String[] args) {
		Adder a1 = new Adder();
		
		
		int i1 = a1.add1(10, 20);
		System.out.println(i1);

		long l1 = a1.add2(10, 20);
		System.out.println(l1);

		a1.add3(10, 20);
	}

}
