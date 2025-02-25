package ex05_other;
class ThreadPriority extends Thread {
	ThreadPriority(String name) {
		this(name, Thread.NORM_PRIORITY);
	}
	ThreadPriority(String name, int p) {
		super(name);
		this.setPriority(p);
	}
	public void run() {
		try {
			sleep(200);
		} catch(InterruptedException e) {}
		for(int i = 0; i < 5; i++) System.out.println(this.toString());
	}
}
public class PriorityEx01 {
	public static void main(String[] args) {
		System.out.println("높은 우선순위 : " + Thread.MAX_PRIORITY);
		System.out.println("기본 우선순위 : " + Thread.NORM_PRIORITY);
		System.out.println("낮은 우선순위 : " + Thread.MIN_PRIORITY);
		Thread t1 = new ThreadPriority("First", 1);
		Thread t2 = new ThreadPriority("Second");
		Thread t3 = new ThreadPriority("Third", 10);
		t1.start(); t2.start(); t3.start();
		System.out.println("main end");
	}

}
