package ex01_is_a;
/*
 * Student, Person 클래스 구현하기
 */
class Person {
	void eat() { System.out.println("우걱우걱"); }
	void sleep() { System.out.println("새근새근"); }
}
class Student extends Person {
	void study() { System.out.println("열공열공"); }
}

public class Exam01 {
	
	public static void main(String[] args) {
		Student st = new Student();
		st.eat();
		st.sleep();
		st.study();
	}
}
