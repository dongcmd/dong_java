package test;
/*
3. 동전을 표현하는 Coin 클래스 구현하기
      멤버변수 :  동전의 면(side) 
      멤버메서드 : flip() 
           기능 : 동전을 던져 동전의 면을 변경한다. Math.random() 메서드 이용. 
                 앞면,뒷면 출력함. 
*/
class Coin {
	int side;
	
	void flip() {
		side = (int) (Math.random() * 2);
	}
	//임의 추가
	String check() {
		return side==0?"앞면":"뒷면";
	}	
}

public class Test3 {
	public static void main(String[] args) {
		Coin coin = new Coin();
		System.out.println(coin.side==0?"앞면":"뒷면");
		coin.flip();
		System.out.println(coin.side==0?"앞면":"뒷면");
		System.out.println(coin.check());
	}
}
