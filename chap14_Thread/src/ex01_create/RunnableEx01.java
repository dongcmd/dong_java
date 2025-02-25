package ex01_create;
/*
 * Thread 생성
 *  1. Thread 클래스 상속. run() 구현
 *  2. Runnable 인터페이스 구현. abstract run() 구현
 *  	=> 구현클래스의 객체는 Thread 객체가 아님
 *  	=> new Thread(Runnable) 형태로 Thread 객체 생성 
 * 
 */
class Runnable1 implements Runnable {

	@Override
	public void run() { // Running 상태
		for(int i = 1; i <= 5; i++) {
			// Thread.currentThread() : 현재 실행 중인 Thread 객체 리턴
			System.out.println(i + " = " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000); // Wait 상태
			} catch(InterruptedException e) { }
		}
	} // run() 종료 : Dead 상태
	
}
public class RunnableEx01 {
	public static void main(String[] args) { // main도 Thread
		System.out.println(Thread.currentThread().getName() + " 스레드 시작");
		Runnable r = new Runnable1();
		Thread t1 = new Thread(r, "1st"); // Thread 객체 생성
		Thread t2 = new Thread(r, "2nd"); // Thread 객체 생성
		t1.start(); t2.start();
		System.out.println(Thread.currentThread().getName() + " 스레드 종료");
		
	}

}
