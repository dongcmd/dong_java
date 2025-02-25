package ex01_create;
/*
 * 람다방식으로, RunnableEx01와 같은 결과가 나오도록 구현
 */
public class Exam01 {
	static int A = 0;
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " 스레드 시작");
		Runnable r = () -> {
			for(int i = 1; i <= 5; i++) {
				A += 10;
				System.out.println(i + " : " + Thread.currentThread().getName() + A);
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) { }
			}
		};
			
		Thread t1 = new Thread(r, "F");
		Thread t2 = new Thread(r, "S");
		
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + " 스레드 종료");
	}

}
