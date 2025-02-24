


class Phone {
	String color;
	boolean power;
	String no;
	void power() {
		power = !power;
	}
	
	void send(String no) {
		System.out.println(no + "로 전화 거는 중");
	}
	void recieve(String no) {
		System.out.println(no + "에서 전화 받는 중");
	}
}
public class PhoneEx01 {

	public static void main(String[] args) {
		Phone p1 = new Phone(); // 객체화(인스턴스화)
		/* new : 객체화 기능
		 * 1. 힙 영역에 메모리 할당 > 객체
		 * 2. 멤버필드를 기본값으로 초기화
		 * 3. 생성자 호출
		 * 
		 */
		p1.color = "검정";
		p1.power = true;
		p1.no = "010-1234-5678";
		System.out.printf("%s, %b, %s\n", 
				p1.color, p1.power, p1.no);

		Phone p2 = new Phone(); // 객체화(인스턴스화)
		p2.color = "파랑";
		p2.power = true;
		p2.no = "010-1111-2222";
		System.out.printf("%s, %b, %s\n", 
				p2.color, p2.power, p2.no);
		p1.send(p2.no);
		p2.recieve(p1.no);
		
		p2 = p1;
		System.out.printf("%s, %b, %s\n", 
				p1.color, p1.power, p1.no);
		System.out.printf("%s, %b, %s\n", 
				p2.color, p2.power, p2.no);
		
	}
}
