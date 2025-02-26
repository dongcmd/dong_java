package ex02_supplier;

import java.util.function.BooleanSupplier;

public class Exam01 {
	public static void main(String[] args) {
		// BooleanSupplier를 이용하여 data 배열의 합이 짝수인지 여부 출력
		int[] data = {1, 2, 5,78 , 4, 6, 8, 12, 1 };
		BooleanSupplier bs = () -> {
			int sum = 0;
			for(int n : data) {
				sum += n;
			}
			if(sum % 2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		if(bs.getAsBoolean())
			System.out.println("data 배열 합 짝수 맞음");
		else
			System.out.println("data 배열 합 짝수 아님");
		
	}
}
