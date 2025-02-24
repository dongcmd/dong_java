package ex05_math;
/*
 * round(실수값, 자리수)
 *  - 실수값을 소수점 이하 자리수까지 반올림해서 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println( round(3.1215, 1) ); // 3.1
		System.out.println( round(3.1215, 2) ); // 3.12
		System.out.println( round(3.1215, 3) ); // 3.12
		
		System.out.println( truncate(3.15345,1) ); // 3.1
		System.out.println( truncate(3.15345,2) ); // 3.15
		System.out.println( truncate(3.15345,3) ); // 3.153
	}
	static double truncate(double v, int i) {
		return (int) (v * Math.pow(10,i) ) / Math.pow(10,i) ;
	}
	static String round(double v, int i) {
		return String.format("%." + i + "f", v);
	}
}