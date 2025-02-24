package ex01_field;
/*
 * Main class for Car class
 */
public class Main1 {
	public static void main(String[] args) {
		System.out.printf("자동차의 크기 : %d, %d\n",
				Car.width, Car.height);
		Car car1 = new Car();
		car1.color = "White";
		car1.num = 1234;
		System.out.println(car1);
		System.out.println(car1.toString() + " < toString()");
		// car1 참조변수의 값을 출력하면
		//내부의 car1.toString() method 호출.
		
		Car car2 = new Car();
		car2.color = "Black";
		car2.num = 3456;
		System.out.println(car2);
		System.out.println();
		
		car1.width = 80;
		car2.width = 50;
		System.out.println(car1);
		System.out.println(car2);
		
	}

}
