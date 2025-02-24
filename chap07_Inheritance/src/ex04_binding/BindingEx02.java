package ex04_binding;
/*
 * 			Parent p = Child c;
 *  1. 부모타입의 참조변수로 자손타입의 객체를 참조 가능
 *  2. 부모타입의 멤버와 자손타입의 멤버가 다를 경우
 *     부모타입의 참조변수로 자손타입의 객체 참조시, 부모타입의 멤버만 호출 가능
 */
class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	
	void drive() {
		System.out.println("페달을 슝슝");
	}
	void stop() {
		System.out.println("브레이크 끼익");
	}
	public String toString() {
		return "바이크";
	}
}
class AutoBike extends Bike {
	boolean power;
	AutoBike(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
	}
	public String toString() {
		return "오토바이크";
	}
//	@Override
//	void drive() {
//		System.out.println("버튼을 꾸욱");
//	}
}



public class BindingEx02 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		ab.power();
		ab.drive();
		ab.stop();
		System.out.println(ab.toString());
		
		Bike b = ab;
		System.out.println(b.toString());
		
		
		Object o = b;
		System.out.println(o.toString());
		
		
	}

}
