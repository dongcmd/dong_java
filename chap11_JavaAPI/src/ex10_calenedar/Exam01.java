package ex10_calenedar;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 연을 입력받아 년월의 마지막 일자와 요일 출력하기
 * Calendar 객체 이용
 */
public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int Y = sc.nextInt();
//		int M = sc.nextInt(); sc.close();
		int Y = 2025;
		int M = 2;
		String days = "일월화수목금토";
		
		Calendar cal = Calendar.getInstance();
		cal.set(Y, (M-1) , 1);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		cal.set(Y, (M-1) , lastday);
		
		
		System.out.printf("%4d-%02d-%02d %c요일", 
				cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1 , cal.get(Calendar.DATE), days.charAt(cal.get(Calendar.DAY_OF_WEEK)-1) );
		
	}

}
