package ex09_date;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;

/*
 * 년도와 월을 입력받아서 월의 마지막 일자와 요일 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("년도와 연을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		int M = sc.nextInt();
//		int Y = 2025;
//		int M = 12;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String sday = String.format("%d-%d-01", Y, M+1);
		Date day = null;
		try {
			day = sf.parse(sday);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		day.setTime(day.getTime() - (1000 * 60 * 60 * 24) );
		System.out.println(sf.format(day) +" "+ new SimpleDateFormat("E요일").format(day));
	}

}
