package ex06_this;
/*
 * Quadrangle 클래스 구현
 *  this, this() 사용
 */
class Quadrangle {
	int width, height, sNo;
	static int cnt;
	boolean isSquare;
	
	Quadrangle(int width, int height) {
		sNo = ++cnt;
		this.width = width;
		this.height = height;
		if(width == height) { isSquare = true; }
		
	}
	Quadrangle() {
		this(1, 1);
	}
	Quadrangle(int width) {
		this(width, 1);
	}
	Quadrangle(Quadrangle q1) {
		this(q1.width, q1.width);
	}
	
	int area() { return width * height;	}
	int length() { return 2*(width + height); }
	String isSquare() { return isSquare ? "정사각형" : "직사각형"; }
	@Override
	public String toString() {
		return sNo + "번사각형:(" + width + "," + height +") - 면적:" +
				area() + ",둘레:" + length() + "," + isSquare();
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Quadrangle q1 = new Quadrangle(10, 10); // 10 10 정사각형
		Quadrangle q2 = new Quadrangle();		  // 1 1 정사각형
		Quadrangle q3 = new Quadrangle(10);	  // 10 1 직사각형
		Quadrangle q4 = new Quadrangle(q1);	  // 10 10 정사각형

		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
		System.out.println(q4);
		
	}

}
