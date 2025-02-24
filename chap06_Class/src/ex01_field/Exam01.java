package ex01_field;

public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 20;
		r1.sno= ++Rectangle.cnt;
		System.out.println(r1);
		//1번 사각형: 가로(10), 세로(20), 현재까지 생성된 사각형(1)
		
		Rectangle r2 = new Rectangle();
		r2.width = 1;
		r2.height = 2;
		r2.sno= ++Rectangle.cnt;
		System.out.println(r2);	
		}
}

class Rectangle {
	int width;
	int height;
	int sno;
	static int cnt;
	
	void test() {}
	@Override
	public String toString() {
		return sno+"번 사각형: 가로(" + width+ "), 세로(" + height +
				"), 현재까지 생성된 사각형(" + cnt + ")";
	}
}