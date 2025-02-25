package ex02_synchronized;
/*
 * 
 */
class PrintThread1 extends Thread {
	char ch;
	PrintThread1(char ch) {
		this.ch = ch;
	}
	public void run() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
public class PrintThreadEx01 {
	public static void main(String[] args) {
		PrintThread1 t1 = new PrintThread1('0');
		PrintThread1 t2 = new PrintThread1('1');
		PrintThread1 t3 = new PrintThread1('2');
		t1.start(); t2.start(); t3.start();
	}

}
