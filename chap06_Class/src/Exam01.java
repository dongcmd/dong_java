

/*
 * [결과]
 * 사각형 면적 : 50
 * 사각형 둘레 : 30
 */
class Rectangle {
	int width;
	int height;
	void area() {
		System.out.println("사각형 면적 : " + width * height);
	}
	void length() {
		System.out.println("사각형 둘레 : " + 2 * (width + height));
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		r1.area();
		r1.length();
	}

}
