package ex05_other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * join() : 스레드가 종료할 때까지 join()를 호출한 메서드가 대기함
 */

/*
 * 1 ~ 1000 합 구하기.
 *  스레드 5개가 200씩 나누어 합을 구하고, main은 대기 후 전체 합 출력하기.
 */

class SumRunnable implements Runnable {
	int firstNum, lastNum;
	int sum;
	SumRunnable(int firstNum, int lastNum) {
		this.firstNum = firstNum;
		this.lastNum = lastNum;
	}
	public void run() {
		for(int i = firstNum; i <= lastNum; i++) sum += i;
	}
}
public class JoinEx01 {
	public static void main(String[] args) throws InterruptedException {
		// List Arrays.asList(values) 
		List<SumRunnable> list = Arrays.asList(new SumRunnable(1, 200), new SumRunnable(201, 400), 
				new SumRunnable(401, 600), new SumRunnable(601, 800), new SumRunnable(801, 1000));
		List<Thread> list1 = new ArrayList<>(); // Thread 객체 5개 저장
		for(Runnable s : list) list1.add(new Thread(s));
		for(Thread t : list1) t.start(); // 5개의 스레드가 start()
		/*
		 * 모든 스레드가 종료할 때까지 main 메서드가 대기
		 */
		for(Thread t : list1) t.join();
		// 모든 스레드의 상대가 dead인 경우 실행
		// 모든 스레드 sum의 합 출력
		int sum = 0;
		for(SumRunnable s : list) sum += s.sum;
		System.out.println("전체 합계 : " + sum);		
	}

}
