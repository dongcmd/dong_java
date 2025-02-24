package ex06_this;

public class ThisEx01 {

	public static void main(String[] args) {
		Car c1 = new Car("Blue", 1234);
		System.out.println(c1); // Blue 1234
		System.out.println();
		Car c2 = new Car();
		System.out.println(c2); // White 1111
		System.out.println();
		Car c3 = new Car("Red");
		System.out.println(c3); // Red 1111
		System.out.println();
		Car c4 = new Car(1234);
		System.out.println(c4); // White 1234
		System.out.println();
		Car c5 = new Car(c1);
		System.out.println(c5); // Blue 1234
		System.out.println();
		

	}

}
