package ex04_binding;
/*
 * Product class
 * member - price, point
 * constructor - price 입력받고 10%를 포인트로 저장
 */

class Product {
	int price, point;
	Product(int price) {
		this.price = price;
		this.point = price/10;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}

class HandPhone extends Product {
	HandPhone() {
		super(150);
	}
	@Override
	public String toString() {
		return "HandPhone";
	}
}
/*
 * Buyer class
 * member : money = 500, point
 * 			Product[] items = new Product[5]; //구매 물품 목록
 * 			int cnt; 							//물건 개수
 * 
 * 			void buy(Product p)
 * 			 1. 구매시 money 차감
 * 			 2. point 증가
 * 			 3. items에 p 제품 추가 및 cnt 값 증가
 * 			 4. p 제품의 이름출력 : TV 구입
 * 			void summary()
 * 			 1. 구매제품 전체금액 합계, 포인트 합계 계산
 * 			 2. 잔액 출력
 * 			 3. 구매 물품의 이름 출력
 */

class Buyer {
	int money = 500, point;
	Product[] items = new Product[5];
	int cnt;
	
	void buy(Product p) {
		money -= p.price;
		point += p.point;
		items[cnt++] = p;
		System.out.println(p + "구매");
	}
	void summary() {
		int sum = 0, pSum = 0;
		String pList = "";
		for(int i = 0; i < cnt; i++) {
			sum += items[i].price;
			pSum += items[i].point;
			pList += items[i].toString() + "\n";
		}
		System.out.println();
		System.out.printf("전체 구매액 : %d, 보유 포인트 : %d\n", sum, pSum);
		System.out.println("잔액 : " + money);
		System.out.println();
		System.out.println("구매리스트\n" + pList);
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		HandPhone hp = new HandPhone();
		
		b.buy(tv);
		b.buy(com);
		b.buy(hp);
		
		b.summary();
	}

}
