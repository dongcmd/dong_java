package ex02_method;

public class Exam01 {

	public static void main(String[] args) {
		Rec r1 = new Rec();
		r1.width = 30;
		r1.height = 20;
		r1.serialNo = ++Rec.cnt;;
		System.out.println(r1);
		//1번사각형(30,20) 생성된 사각형 갯수:1=>면적:600,둘레:100,직사각형
	}

}

class Rec {
	int width, height, serialNo;
	static int cnt;
	
	
	Rec() {
		this.serialNo = cnt++;
	}
	
	public String toString() {
		return serialNo+"번사각형("+ width +","+ height +") 생성된 사각형 갯수:"
				+ cnt+"=>면적:"+area()+",둘레:"+length()+","
				+ ( isSqaure()? "정사각형":"직사각형");
	}
	int area() {
		return width * height;
	}
	int length() {
		return 2 * (width + height);
	}
	boolean isSqaure() {
		return width == height;
	}
}