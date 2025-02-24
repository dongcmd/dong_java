package test3;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-03
2025-01-03 -2025-01-01 일자의 차이 : 2  
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 날짜를 입력하삼 yyyy-MM-dd");
		String s1 = sc.nextLine();
//		String s1 = "2025-01-01";
		System.out.println("두 번째 날짜를 입력하삼 yyyy-MM-dd");
		String s2 = sc.nextLine();
//		String s2 = "2025-01-03";
		sc.close();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = null, d2 = null;
		try {
			d1 = sf.parse(s1);
			d2 = sf.parse(s2);
		} catch(ParseException e) {
			
		}
		
		System.out.println( Math.abs(d1.getTime()-d2.getTime()) / (1000 * 60 * 60 * 24));
		
//		Calendar c1 = Calendar.getInstance();
//		Calendar c2 = Calendar.getInstance();
		

	}
}
