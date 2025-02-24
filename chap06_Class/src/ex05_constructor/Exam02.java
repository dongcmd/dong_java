package ex05_constructor;
/*
 * EastCard 구현하기 / 1~10의 카드가 2장씩
 * 1 3 8 카드는 광(K)을 보유
 * 
 * 	멤버 변수
 * 		int number
 * 		boolean isKwang
 * 
 * 멤버 메서드
 * 		toString()
 */
class EastCard {
	int number;
	boolean isKwang;
	
	EastCard() { number = 1; isKwang = true; }
	EastCard(int number, boolean isKwang) { this.number = number; this.isKwang = isKwang; }
	@Override
	public String toString() { return number + (isKwang ? "K": ""); }
	
}

public class Exam02 {
	public static void main(String[] args) {
		EastCard c1 = new EastCard(3, false);
		EastCard c2 = new EastCard();
		System.out.println(c1); // 3
		System.out.println(c2); // 1K

	}

}
