package test;
/*
   시스템과 주사위 숫자 비교하기
   시스템의 주사위 값을 저장하고,
   사용자의 주사위 값도 임의의값으로  시스템의 값과 비교하여, 
   시스템의 주사위 값이 크면 시스템 승리
   사용자의 주사위 값이 크면 사용자 승리
   시스템과 사용자의 주사위값이 같으면 동점입니다.
   [결과]
   시스템 주사위값 :3,사용자 주사위값:5=>사용자 승리.   
*/
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comD = (int) (Math.random() * 6) + 1;
		int userD = (int) (Math.random() * 6) + 1;
		String result;
		
		if(comD > userD)
			result = "시스템 승리";
		else if(comD < userD)
			result = "사용자 승리";
		else
			result = "동점";
		
		System.out.printf
		("시스템 주사위값 : %d, 사용자 주사위 값 : %d => %s"
				, comD, userD, result);
	}
}
