package chap04;


import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
//		int value = (int) (ran * 3) + 1;
//		System.out.println(value);

		Scanner sc = new Scanner(System.in);
		double ran = Math.random();
		int com = (int) (ran * 3) + 1;
		
		System.out.println("1 가위 / 2 바위 / 3 보자기 ");
		
		System.out.print("입력하시오> ");
		int user = sc.nextInt();
		
		switch(user) {
		case 1 :
			System.out.println("사용자 : 가위"); break;
		case 2 :
			System.out.println("사용자 : 바위"); break;
		case 3 :
			System.out.println("사용자 : 보자기"); break;
		}
		
		System.out.print("컴퓨터 : ");
		
		switch(com) {
		case 1 :
			System.out.println("가위"); break;
		case 2 :
			System.out.println("바위"); break;
		case 3 :
			System.out.println("보자기"); break;
		}
		
		int result = user - com;
		
		switch(result) {
		case 0 : System.out.println("비김"); break;
		case 1 : case -2 : System.out.println("이김"); break;
		case -1 : case 2 : System.out.println("짐"); break;
		}
		
	}

}
