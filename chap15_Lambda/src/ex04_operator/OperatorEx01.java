package ex04_operator;

import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 *  - Function 인터페이스의 하위 인터페이스
 *  - 매개변수, 리턴값 모두 존재
 *  - T apply___(T t)
 *  
 *  - 종류
 *  	UnaryOperator<T> : T apply(T)			=> Function 인터페이스의 하위 인터페이스
 *  	BinaryOperator<T> : T apply(T, T) => BiFunction 인터페이스의 하위 인터페이스
 *  	DoubleUnaryOperator : double applyAsDouble(double)
 *  	DoubleBinaryOperator : double applyAsDouble(double, double)
 *  	IntUnaryOperator : int applyAsInt(int)
 *  	IntBinaryOperator : int applyAsInt(int, int)
 *  	LongUnaryOperator : long applyAsLong(long)
 *  	LongBinaryOperator : long applyAsLong(long, long)
 */
public class OperatorEx01 {
	private static int[] score = {92, 95, 87, 100, 6};
	
	public static void main(String[] args) {
		int min = score[0];
		int max = score[0];
		for(int i = 0; i < score.length; i++) {
			min = Math.min(min, score[i]);
			max = Math.max(max, score[i]);
		}
		System.out.print("최대값 : " + max);
		System.out.println();

		System.out.print("최소값 : " + min);
		System.out.println();
		
		System.out.print("최대값 : " + maxOrMin((a, b) -> (a > b) ? a : b));
		System.out.println();
		
		System.out.print("최소값 : " + maxOrMin((a, b) -> (a < b) ? a : b));
		System.out.println();
		
		
	}
	private static int maxOrMin(IntBinaryOperator op) {
		int result = score[0];
		for(int s : score) result = op.applyAsInt(s, result);
		return result;
	}

}
