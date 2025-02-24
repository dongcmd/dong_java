package ex07_random;
import java.util.Random;
/*
 * true/false 값을 난수로 발생하여 시스템과 사용자 중 3번 연속 true 나오면 승리
 */
public class Exam01 {
	static void tfgame(int score) {
		int sCnt = 0, uCnt = 0;
		while(true) {
			boolean sv, uv;
			if ( sv = new Random().nextBoolean() ) {sCnt++; } else { sCnt = 0; }
			if ( uv = new Random().nextBoolean() ) {uCnt++; } else { uCnt = 0; }
			
			System.out.printf("System : %5b / User : %5b\n", sv, uv);
			if( sCnt == uCnt && uCnt == score) { System.out.println("Draw"); break;}
			else if ( sCnt == score ) { System.out.println("System win"); break;}
			else if ( uCnt == score ) { System.out.println("User win"); break; }
			
		}
	}
	
	public static void main(String[] args) {
		tfgame(5);
	}
}