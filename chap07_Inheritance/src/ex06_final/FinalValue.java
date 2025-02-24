package ex06_final;

import java.util.Arrays;

/*
 * final variant : 변경불가 변수 == 상수. 자바에선 const 예약어 사용 안함
 * final variant도 생성자를 통해 한번은 초기화 가능 == 객체별 다른 상수값 가능
 * 				   (단, 명시적 초기화를 하면 안 됨)
 */
public class FinalValue {
	final int NUM;
	FinalValue(int num) {
		NUM = num;
	}
	public static void main(String[] args) {
		final int NUM = 100;
		FinalValue f1 = new FinalValue(100);
		FinalValue f2 = new FinalValue(200);
		
		System.out.println(f1.NUM);
		System.out.println(f2.NUM);
		
		final int[] arr = { 10, 20, 30, 40, 50 };
		final int[] arr2 = { 100, 200, 300, 400, 500 };
		int[] arr3 = { 100, 200, 300, 400, 500 };
		arr[0] = 100;
		
		System.out.println(Arrays.toString(arr));
				
	}

}
