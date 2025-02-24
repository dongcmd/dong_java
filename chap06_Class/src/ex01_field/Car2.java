package ex01_field;

public class Car2 {
	String color;
	int num;
	int sno;
	static int cnt;
	public String toString() {
		return "자동차 번호 : " + sno + "=>" + color + "," + num
				 + ",자동차 생산 갯수:" + cnt;
	}

}
