package ex01_field;

public class Main3_StaticVal {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		c1.color = "White";
		c1.num = 1234;
		c1.sno = ++Car2.cnt;
		System.out.println(c1);
		Car2 c2 = new Car2();
		c2.color = "Black";
		c2.num = 3567;
		c2.sno = ++Car2.cnt;
		System.out.println(c1);
		System.out.println(c2);
		

	}

}
