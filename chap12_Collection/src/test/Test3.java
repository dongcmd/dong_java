package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성
 */
class Lottery {
	private static Set<Integer> bowl = new LinkedHashSet<>();
	private static List<Integer> wBalls;
	private static List<Integer> w3, w2, w1;
	
	static void draw(int lastNo) {
		while(bowl.size() < 6) {
			bowl.add(new Random().nextInt(1, 1001));
		}
		wBalls = new ArrayList<Integer>(bowl);
		w3 = wBalls.subList(0, 3);
		w2 = wBalls.subList(3, 5);
		w1 = wBalls.subList(5, 6);
		System.out.println("3등 복권 추첨합니다.");
		for(int a: w3)
			System.out.print(a+",");
	
		System.out.println();
		System.out.println("2등 복권 추첨합니다.");
		for(int a: w2)
			System.out.print(a+",");

		System.out.println();
		System.out.println("1등 복권 추첨합니다.");
		for(int a: w1)
			System.out.print(a+",");
		System.out.println();
		System.out.println("*** 복권 추첨 결과 ***");
		System.out.print("1등 : ");
		for(int a: w1)
			System.out.print(a+",");
		
		System.out.println();
		System.out.print("2등 : ");
		for(int a: w2)
			System.out.print(a+",");

		System.out.println();
		System.out.print("3등 : ");
		for(int a: w3)
			System.out.print(a+",");
		System.out.println();
		System.out.println("====================");
		System.out.println("1등" + w1);
		Collections.sort(w2);
		System.out.println("2등" + w2);
		Collections.sort(w3);
		System.out.println("3등" + w3);	
	}
}
public class Test3 {
	public static void main(String[] args) {
		Lottery.draw(1000);
		
	}
}
