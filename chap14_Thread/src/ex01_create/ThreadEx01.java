package ex01_create;
/*
 * Thread 생성
 * 1. Thread 클래스를 상속
 * 2. run() 구현 : 스레드의 기능
 */
class Thread1 extends Thread {
	Thread1(String name) {
		super(name);
	}
	// run() : Thread가 수행 해야 할 메서드
	@Override
	public void run() { // Running 상태. run() 메서드 실행 중인 상태
		for(int i = 1; i <=5; i++) {
			System.out.println(i + " = " + getName());
			try {
				sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx01 {
	public static void main(String[] args) { // main()도 스레드
		System.out.println("main 시작");
		Thread t1 = new Thread1("First"); // Thread 생성
		Thread t2 = new Thread1("Second"); // Thread 생성
		t1.start(); // t1 객체의 Runnable 상태
		t2.start(); // t2 객체의 Runnable 상태
		/*
		 * start() : 스레드의 시작. 병렬화 시킴(멀티스레드 환경)
		 * 1. 스택영역을 병렬화 시킴
		 * 2. 병렬화된 스택영역에 run() 메서드 호출
		 */
		System.out.println("main 종료");
		
	}

}
