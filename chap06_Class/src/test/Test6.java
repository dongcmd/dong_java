package test;
/*
 Test3.java의 Coin 클래스를 이용하기 
 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 앞면이 연속해서 3번 나오면 승리가 출력되도록 구동 클래스 구현하기   

 [결과예시] => 결과는 다를 수 있습니다.
 myCoin	youCoin
  앞면	뒷면
  뒷면	앞면
  앞면	앞면
  앞면	앞면
 youCoin 승리
 */
public class Test6 {
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();

		int myPt = 0;
		int youPt = 0;
		int result = 0;
		System.out.println("myCoin youCoin");
		while(true) {
			myCoin.flip();
			youCoin.flip();
			System.out.printf(" %s\t%s\n", myCoin.check(), youCoin.check() );
			if( myCoin.side == 0) { ++myPt;} else { myPt = 0;}
			if( youCoin.side == 0) { ++youPt; } else { youPt = 0; }
			if( myPt == 3 || youPt == 3) { break; }
		}
		
		if( myPt == youPt) { System.out.println("무승부"); }
		else { System.out.print( (myPt > youPt ? "myCoin" : "youCoin") + " 승리"); }
//		
//		if( myPt == 3) result-= 1;
//		if( youPt == 3) result+= 1;
//		switch(result) {
//		case -1 : System.out.print("myCoin "); break;
//		case 0 : System.out.print("무승부"); return;
//		case 1 : System.out.print("youCoin "); break;
//		}
//		System.out.println("승리");
	}
}
