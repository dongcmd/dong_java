package ex03_waitNotify;

import java.util.Random;

/*
 * 생산자, 소비자 스레드
 * 
 * mother, son 스레드는 하나의 계좌를 공유.
 * 계좌에 잔액이 없으면 son은 wait() 상태
 * 계좌에 잔액이 있으면 mother은 wait() 상태
 * mother : 10,000 ~ 30,000 값을 계좌에 입금 후 son을 notify()
 * son	  : 잔액을 0으로 만들고 mother을 notify()
 * 
 * wait(), notify(), noyifyAll()
 *  1. 동기화 영역(동기화 블럭, 동기화 메서드)에서만 사용 가능
 *  	IllegalMonitorStateException 발생
 *  2. Object 클래스의 멤버 => 모든 객체 사용 가능.
 *  3. wait() : 현재 실행 중인 스레드를 대기상태(lock pool)로 변환.
 *  			notify(), notifyAll() 로만 해제 가능
 *  4. notify() : wait 상태의 스레드 중 (시스템이 임의로) 1개만 Runnable 상태로 변경.
 *  5. notifyAll() : wait 상태인 모든 스레드를 Runnable 상태로 변경.
 *  
 */
class Account { // 공유객체
	int money;
	synchronized void output() { // Son Thread만 호출
		while(money == 0) {
			try {
				wait(); // 동기화 영역에서만 가능
			} catch(InterruptedException e) { }
		}
		// notify() : wait 상태의 스레드 중 (시스템이 골라) 1개만 Runnable 상태로 변경.
		// notifyAll() : wait 상태인 모든 스레드를 Runnable 상태로 변경.
		notifyAll(); // 동기화 영역에서만 가능
		System.out.println(Thread.currentThread().getName() + " : " + money + " 출금");
		money = 0;
	}
	synchronized void input() { // Monther Thread만 호출
		while(money > 0) {
			try {
				wait(); // 동기화 영역에서만 가능
			} catch(InterruptedException e) { }
		}
		money = ((int)(new Random().nextInt(3)) +1 ) * 10000;
		notifyAll(); // 동기화 영역에서만 가능
		System.out.println(Thread.currentThread().getName() + " : " + money + " 입금");		
	}
}
class Mother extends Thread {
	Account account;
	Mother(Account account) {
		super("Mother");
		this.account = account;
	}
	public void run() {
		for(int i = 0; i < 20; i++) {
			account.input();
			try {
				sleep((int)(Math.random()*3000));
			} catch(InterruptedException e) {}
		}
	}
}
class Son extends Thread {
	Account account;
	Son(Account account) {
		super("Son");
		this.account = account;
	}
	public void run() {
		for(int i = 0; i < 20; i++) {
			account.output();
			try {
				sleep((int)(Math.random()*1000));
			} catch(InterruptedException e) {}
		}
	}
}
public class AccountEx01 {
	public static void main(String[] args) {
		Account acc = new Account();
		Thread m = new Mother(acc);
		Thread s = new Son(acc);
		s.start(); m.start();
	}

}
