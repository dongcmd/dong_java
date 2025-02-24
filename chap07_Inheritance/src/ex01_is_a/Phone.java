package ex01_is_a;

public class Phone {
	boolean power;
	int number;
	
	void power() { power = !power; }
	void send() {
		if(power) { System.out.println("전화 걸기"); }
		else { System.out.println("전원이 꺼져있습니다"); }
	}
	void receive () {
		if(power) { System.out.println("전화 받기"); }
		else { System.out.println("전원이 꺼져있습니다"); }
	}

}
