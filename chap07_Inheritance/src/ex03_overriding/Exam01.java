package ex03_overriding;

class Point {
	int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void info() {
		System.out.printf("위치 좌표 : x=%d, y=%d",x , y);
	}
}
class Point3d extends Point {
	int z;
	Point3d(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	@Override
	void info() {
		super.info();
		System.out.printf(", z=%d", z);
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Point3d p3 = new Point3d(10, 10, 10);
		p3.info();

	}

}
