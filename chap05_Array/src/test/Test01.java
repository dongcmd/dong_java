package test;
/*
 *  농장에 강아지,병아리가 있음.
 *  강아지 병아리 전체 마리수 입력받고
 *  강아지 다리수와 병아리 다리수 전체를 입력받는다.
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  20
 *  강아지 병아리 전체 다리수를 입력하세요
 *  60
 *  
 *  강아지 : xx마리
 *  병아리 : yy마리
 *  
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  10
 *  강아지 병아리 전체 다리수를 입력하세요
 *  10
 *   
 *  계산안됨 
 */
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dog, chic, total, totalLeg;
		
		System.out.println("강아지 병아리 마리수를 입력하세요");
		total = sc.nextInt();
		System.out.println(
				"강아지 병아리 전체 다리수를 입력하세요");
		totalLeg = sc.nextInt();
		int j;
		for(int i = 0; i <= total; i++) {
			dog = i;
			chic = total - dog;
			int dogLeg = dog * 4;
			int chicLeg = chic * 2;
			
			if( totalLeg == dogLeg + chicLeg) {
				System.out.printf("강아지 : %d마리\n", dog);
				System.out.printf("병아리 : %d마리\n", chic);
				System.out.println();
				System.out.printf("%d+%d=%d", dog, chic, total);
				System.out.println();
				System.out.printf("%d+%d=%d", dogLeg, chicLeg, totalLeg);
				System.out.println();
				return;
			}
		}
		System.out.println("계산안됨");
	}
}
