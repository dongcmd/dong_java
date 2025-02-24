package ex03_overriding;

public class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "페달을 슝슝";
	}
	String stop() {
		return "브레이크 끼이익";
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
	@Override
	String drive() {
		return "출발버튼 꾹";
	}
}