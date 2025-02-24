package ex01_field;

public class Main2_LocalValue {
	public static void main(String[] args) {
		int num;
//		System.out.println(num); // 지역변수는 초기화 필수
		boolean b = true;
		
		if(b) num = 100;
//		System.out.println(num); // 초기화 되지 않을 가능성 있어 오류
//								// else 문이 없음
		if(b) num = 100;
		else num = 200;
		System.out.println(num);
		

	}

}
