package ex06_wrapper;
/*
 * Wrapper 클래스 : 8개의 기본자료형을 객체화 하기 위한 클래스
 * 기본 자료형		  Wrapper class
 *   boolean		Boolean
 *   char			Character
 *   byte			Byte
 *   short			Short
 *   int			Int
 *   long			Long
 *   float			Float
 *   double			Double
 *   
 *   기본 자료형과 참조자료형은 형변환 불가
 *     String str = 'A';  (X)
 *   예외적으로 기본자료형과 Wrapper 클래스간의 형 변환 가능 (jdk5.0 이후부터 가능)
 *   참조형 <= 기본형 : auto Boxing
 *   참조형 => 기본형 : auto Unboxing
 */
public class WrapperEx01 {
	public static void main(String[] args) {
		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2); // true
		System.out.println(i1 == 100); // true
		System.out.println(i1.equals(i2)); // true
		
		//int 형 정보
		System.out.println("int형의 최대값" + Integer.MAX_VALUE);
		System.out.println("int형의 최소값" + Integer.MIN_VALUE);
		System.out.println("int형의 bit 크기" + Integer.SIZE);

		//double 형 정보
		System.out.println("double형의 최대값" + Double.MAX_VALUE);
		System.out.println("double형의 최소값" + Double.MIN_VALUE);
		System.out.println("double형의 bit 크기" + Double.SIZE);
		
		// int형 < 문자열, Integer.parseInt(숫자문자열)
		System.out.println(Integer.parseInt("123"));
		// int형 < 문자열, Integer.parseInt(숫자문자열, 문자열의 진법)
		System.out.println(Integer.parseInt("10", 8));
		System.out.println(Integer.parseInt("10", 16));
		
		// double < 문자열
		System.out.println(Double.parseDouble("123.5"));
		// float < 문자열
		System.out.println(Float.parseFloat("123.5"));
		// 255를 2진법으로 변경
		System.out.println(Integer.toBinaryString(255));
		// 255를 8진법으로 변경
		System.out.println(Integer.toOctalString(255));
		// 255를 16진법으로 변경
		System.out.println(Integer.toHexString(255));
	}

}
