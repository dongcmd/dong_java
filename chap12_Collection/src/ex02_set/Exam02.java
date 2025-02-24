package ex02_set;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;
/*
 * Lotto 번호 생성하기
 *  1 - 45 사이 임의값 중복되지 않게 6개 선택 후 정렬하여 출력
 */
public class Exam02 {
	static void lotto() {
		int cnt = 1;
		int draw, many = 0;
		SortedSet<Integer> balls = new TreeSet<>();
		
		while(balls.size() != 6) { many++;
			draw = new Random(System.currentTimeMillis()).nextInt(45)+1;
			if( balls.add(draw) ) {
				System.out.println(cnt++ + "번 공 : " + draw);
			}
		}
		System.out.println("당첨 번호 : " + balls);
		System.out.println(many);
	}
	public static void main(String[] args) {
		lotto();
	}

}
