package ex02_synchronized;
/*
 * 동기화 블럭 예제
 *  1. synchronized 예약어 사용
 *  2. lock 객체는 유일해야 함
 *  3. lock을 기본자료형 타입으로 쓸 수 없음
 */
class PrintThread2 extends Thread {
	char ch;
	static Object Lock = new Object();
//	static String Lock = "";
//	static int Lock = 0; // 기본자료형 불가
	PrintThread2(char ch) {
		this.ch = ch;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			synchronized(Lock) { // 동기화 블럭
				for(int j = 0; j < 20; j++) {
					System.out.print(ch);
				}
				System.out.println();
//				try {
//					sleep(5);
//				} catch(InterruptedException e) { }
			}
		}
	}
}
public class PrintThreadEx02 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('0');
		PrintThread2 t2 = new PrintThread2('1');
		PrintThread2 t3 = new PrintThread2('2');
		t1.start(); t2.start(); t3.start();
	}

}
