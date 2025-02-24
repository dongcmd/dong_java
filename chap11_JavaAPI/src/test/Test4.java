package test;
/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라익
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *  4스트라익이 되면 정답

 *  NumberInputException을 이용하여 다음의 예외 처리를 할것  
 *  4자리 수가 아닌 경우는 4자리 숫자를 입력하세요. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨 
 *  중복된 숫자가 입력된 경우 중복된 숫자가 입력되었습니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *  InputMismetchException을 이용하여 예외처리
 *  만약 숫자 아닌 값이 입력되면 숫자만 가능합니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *    
 *  [결과]
서로다른 4자리 정수를 입력하세요
1234
1234:0스트라이크, 1볼
서로다른 4자리 정수를 입력하세요
5678
5678:2스트라이크, 0볼
서로다른 4자리 정수를 입력하세요
2679
2679정답입니다.
3번 만에 맞추셨습니다. 게임을 종료합니다.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class Bbgame {
	int cnt, strike, ball;
	String cAnswer = "";
	String uAnswer = "";
	boolean check = false;
	Scanner sc = new Scanner(System.in);
	
	Bbgame() {
		int[] numPool = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] n = new int[4];
		int tmp = 0, ran1, ran2;
		for(int i = 0; i < 100; i++) {
			while(true) {
				ran1 = (int)(Math.random() * 10);
				ran2 = (int)(Math.random() * 10);
			if(ran1 != ran2) { break; }	
			}
			tmp = numPool[ran1];
			numPool[ran1] = numPool[ran2];
			numPool[ran2] = tmp;
		}
		for(int i = 0; i < n.length; i++) {
			n[i] = numPool[i];
			cAnswer += n[i];
		}
	}
	
	void start() {
		while(!check) {
			input();
			check();
		}
		end();
	}
	void input() {
		while(true) {
			cnt++;
			try {
				System.out.println("*서로 다른 4자리 정수를 입력바람*");
				
				uAnswer = "" + sc.nextLine().trim();
				if(uAnswer.length() != 4) { 
					throw new NumberInputException("4자리 숫자를 입력하세요");
				} else if( !dupCheckMethod(uAnswer) ) {
					throw new NumberInputException("중복된 숫자가 입력되었습니다.");
				}
				break;
			} catch(NumberInputException e) {
				System.out.println(e.getMessage());
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력 가능");
				sc.next();
			}
		}
	}
	boolean dupCheckMethod(String input) {
		boolean[] dupCheck = new boolean[10];
		for(char c : input.toCharArray()) {
			int digit = c - '0';
			if(dupCheck[digit]) { return false; }
			dupCheck[digit] = true;
		} return true;
	}
	boolean check() {
		if( cAnswer.equals(uAnswer) ) { check = true; return check; }
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if( i == j && cAnswer.charAt(i) == uAnswer.charAt(j) ) {
					strike++;
				} else if( i != j && cAnswer.charAt(i) == uAnswer.charAt(j) ) {
					ball++;
				}
			}
		}
		check = (strike == 4) ? true : false;
		if(!check) {
			System.out.printf("%s : %d 스트라이크, %d 볼\n", uAnswer, strike, ball);
		}
		return check;
	}
	void end() {
		System.out.println(uAnswer + "정답입니다.");
		System.out.println(cnt +"만에 정답을 맞췄습니다. 게임을 종료합니다.");
		sc.close();
	}
}
public class Test4 {
	public static void main(String[] args) {
		
		Bbgame game = new Bbgame();
		System.out.println(game.cAnswer); // 정답 확인용
		
		game.start();
		
	}
}