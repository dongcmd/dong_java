package ex04_daemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DaemonThreadEx02 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		String[] data = "태연,유리,윤아,호연,수영,서현,티파니,써니,제시카,뷔,슈가,제이홉,알앰,정국,지민,진".split(",");
		int interval = 1000;
		Scanner sc = new Scanner(System.in);
		words.add(data[0]); words.add(data[1]); words.add(data[2]);
		DataAddThread t1 = new DataAddThread(words, data, interval);
		t1.setDaemon(true);
		t1.start();
		while(true) {
			System.out.println(words);
			System.out.print(">>");
			String input = sc.next().trim();
			words.remove(input); // 입력된 이름을 words 리스트의 요소에서 제거
			if(words.size() == 0) break;
		}
		System.out.println("프종");
	}
}
class DataAddThread extends Thread {
	List<String> words;
	String[] data;
	int interval;
	DataAddThread(List<String> words, String[] data, int interval){
		this.words = words;
		this.data = data;
		this.interval= interval;
	}
	public void run() {
		while(true) {
			words.add(data[(int) (Math.random() * data.length)]);
			try {
				sleep(interval);
			} catch(InterruptedException e) {}
		}
	}
}