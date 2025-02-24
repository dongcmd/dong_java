package ex08_modifier;

abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat();
}
interface Flyable{
	void fly();
}
class Dove extends Animal implements Flyable{
	Dove() {
		super("비둘기");
	}
	@Override
	void eat() {
		System.out.println(name + "는 벌레를 먹는다");
	}
	@Override
	public void fly() {
		System.out.println(name + "는 날아다닌다");
	}
}

class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}
	@Override
	void eat() {
		System.out.println(name + "는 열매를 먹는다");
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
	}

}
