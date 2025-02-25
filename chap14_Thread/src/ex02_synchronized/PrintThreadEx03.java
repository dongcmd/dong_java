package ex02_synchronized;
/*
 * 동기화 메서드 방식
 * 
 * 모든 스레드에서 lock 객체는 유일해야 함(= 공유객체여야 함)
 *   
 * 동기화 영역, 임계 영역. synchronized 예약어
 * 	- 동기화 블럭
 * 		블럭에 synchronized(lock 객체) 예약어 사용
 *  - 동기화 메서드 : thread safe 메서드
 *  	메서드에 synchronized 예약어 사용. 메서드를 lock 으로 사용.
 *  	동기화 메서드도 유일해야 함. 공유 객체의 메서드여야 함.
 */
class PrintThread3 extends Thread {
	Printer prt;
	char ch;
	PrintThread3(Printer prt, char ch) {
		this.prt = prt;
		this.ch = ch;
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			prt.printChar(ch);
		}
	}
}
class Printer {
	public synchronized void printChar(char ch) {
		for(int i = 0; i < 20; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
public class PrintThreadEx03 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
//		Printer ptr2 = new Printer();
//		Printer ptr3 = new Printer();
		PrintThread3 t1 = new PrintThread3(ptr , '0');
		PrintThread3 t2 = new PrintThread3(ptr , '1');
		PrintThread3 t3 = new PrintThread3(ptr , '2');
		t1.start(); t2.start(); t3.start();
	}

}
