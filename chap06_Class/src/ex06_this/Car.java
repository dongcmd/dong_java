package ex06_this;

public class Car {
	String color;
	int number, serialNo;
	static int sno;
	
	Car(String color, int number) {
		System.out.println("Car(String, int) 생성자");
		this.color = color;
		this.number = number;
		this.serialNo = ++sno;
	}
	Car() {
		// this()는 "꼭" 첫 줄에 구현해야 함.
		this("White", 1111);
		System.out.println("Car() 생성자");
	}
	Car(String color) {
		this(color, 1111);
		System.out.println("Car() 생성자");
	}
	Car(int number) {
		this("White", number);
		System.out.println("Car() 생성자");
	}
	Car(Car car) {
		this(car.color, car.number);
		System.out.println("Car() 생성자");
	}
	
	@Override
	public String toString() {
		return serialNo + "번 자동차 : " + color + "," + number;
	}
	
//	public String toString() {
//		return color + "," + number + "(" + width
//				+ ", " + height + ")";

}
