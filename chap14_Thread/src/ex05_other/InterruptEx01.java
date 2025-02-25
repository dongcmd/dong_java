package ex05_other;
/*
 * 스레드 정리
 * 1. 스레드 생성
 * 		1) Thread 클래스 상속, run() 오버라이딩 ex) ThreadChild t1 = new ThreadChild t1()
 * 		2) Runnable 인터페이스 구현. run() 오버라이딩. Thread 객체에 주입 ex) Thread t1 = new Thread(Runnable r)
 * 2. 스레드 상태
 * 		Thread 생성 상태 : new Thread()
 * 		Runnable 상태 : start() 실행
 * 		Running 상태 : run() 실행 중
 * 		대기 상태 : sleep(), 동기화 lock획득 실패, wait(), 대기상태 해제시 Runnable 상태로 변경
 * 		Dead 상태 : run() 종료.
 * 3. 주요 메서드
 * 		1) start() : 병렬화 기능. 실행시 run() 호출. new 상태에서 Runnable 상태로 변경
 * 		2) run() : 스레드의 기능. 스레드가 실행하는 메서드.
 * 		3) sleep(long millis) : millis 밀리초만큼 대기
 * 		4) setDaemon(boolean b) : true 인 경우 데몬 세러드 생성. new 상태에서만 설정 가능
 * 		5) join() : 해당 스레드가 종료할 때까지 호출한 메서드가 대기.
 * 		6) setPriority(1 ~ 10) : 우선 순위 설정
 * 		7) interrupt() : InterruptedException 발생.
 * 		8) yield() : Running 상태에서 Runnable 상태로 변경
 * 		9) stop() : 스레드의 상태를 Dead 상태로 강제 변경
 * 4. 동기화 : synchronized 예약어 사용
 *    동기화 블럭 : lock 설정. 공유객체로 lock 설정해야 함.
 *    동기화 메서드 : 공유객체의 메서드여야 함.
 * 5. wait(), notify(), notifyAll()
 * 		Object의 멤버
 * 		동기화 영역에서만 사용 가능
 */
class InterruptThread extends Thread {
	public void run() {
		System.out.println("자는 중. 깨우지 마셈");
		try { sleep(1000000000); 
		} catch(InterruptedException e) { 
			System.out.println("누가 깨움?"); e.printStackTrace();
			}
		
	}
}
public class InterruptEx01 {
	public static void main(String[] args) throws InterruptedException {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000);
		t1.interrupt();
		
	}
}
