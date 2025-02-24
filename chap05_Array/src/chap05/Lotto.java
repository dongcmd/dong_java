package chap05;


import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = i + 1;

		for(int i = 0; i < 100; i++) {
			int r1 = (int) (Math.random() * 45);
			int r2 = (int) (Math.random() * 45);
			int tmp = balls[r1];
			balls[r1] = balls[r2];
			balls[r2] = tmp;
		}
		
		System.out.println( Arrays.toString(balls) );
		for(int i = 0; i < lotto.length; i++)
			lotto[i] = balls[i];
		System.out.println( Arrays.toString(lotto) );
		
// 			   20, 8, 7, 14, 40, 19
//		0, 2 __8 7 14 20 19 40
//		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto.length-1; j++) {
				if( lotto[j] > lotto[j+1] ) {
					int tmp = lotto[j+1];
					lotto[j+1] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		System.out.println( Arrays.toString(lotto) );
	}

}
