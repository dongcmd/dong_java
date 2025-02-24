package ex05_abstract;
/*
 *  추상클래스 abstract class
 *  1. 추상메서드를 멤버로 가질 수 있는 클래스
 *  2. 객체화 불가 => 상속을 통해 자손클래스의 객체화로는 객체화 가능
 *  3. 그외는 일반 클래스와 동일
 *  	- 생성자
 *  	- 멤버(변수, 메서드)
 *  	- 초기화블럭
 *  	- 다른 클래스의 자손 클래스
 *  	
 *  추상메서드 abstract method
 *  1. 메서드의 선언부 존재. 구현부({}) 없음
 *  2. 자손클래스에서 반드시 오버라이딩 필요
 */
public abstract class Shape { // 추상클래스
	String type;
	Shape(String type) {
		this.type = type;
	}
	abstract double area(); // 추상메서드 > 하위 클래스에서 오버라이딩 "필수"
	abstract double length(); //추상메서드
	@Override
	public String toString() {
		return "Shape [type=" + type + "]";
	}
}

class Circle extends Shape {
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	double area() {
		return r*r*Math.PI;
	}
	@Override
	double length() {
		return 2*r*Math.PI;
	}
	@Override
	public String toString() {
		return String.format( "%s : 반지름 %d => 면적 %f, 둘레 %f", type, r, area(), length() );
	}
}

class Qudrangle extends Shape {
	int width, height;
	
	Qudrangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	
	@Override
	double area() {
		return width * height;
	}
	@Override
	double length() {
		return 2 * (width + height);
	}
	@Override
	public String toString() {
		return String.format("%s : %d, %d => 면적 %f, 둘레 %f", type, width, height, area(), length());		
	}
}