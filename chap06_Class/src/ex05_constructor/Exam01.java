package ex05_constructor;
/*
 * Quadrangle 클래스 구현
 * 멤버변수 : width, height
 * 생성자 : (int a, int b)
 * 멤버메서드 : 
 * 		int area(), 
 * 		int length(), 
 * 		toString()
 * 		>> width, height, 면적, 둘레
 *
 */

class Quadrangle {
	int width, height;
	
	Quadrangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	Quadrangle(int width) {
		this.width = width;
		height = 1;
	}
	int area() { return width * height;	}
	int length() { return 2*(width + height); }
	
	@Override
	public String toString() {
		return "(" + width + "," + height +") - 면적:" +
				area() + ",둘레:" + length();
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Quadrangle r1 = new Quadrangle(10, 10);
		System.out.println("r1 : " + r1);
		Quadrangle r2 = new Quadrangle(10);
		System.out.println("r2 : " + r2); // 10, 1

	}

}
