package ex09_date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * Date 클래스
 * SimpleDateFormat : 형식화클래스 java.text 패키지의 클래스
 * 		String format(Date) : Date 객체를 지정한 형식대로 문자열로 변경하여 리턴
 * 		Date parse(String) : "형식화된 문자열"로 이루어진 날짜형태의 문자열을 Date 객체로 변경
 * 							 ParseException 예외처리 필수
 * 날짜 format에 사용되는 문자
 * yyyy : 연도 4자리 yy
 * MM	: 월 2자리 M
 * dd	: 일 2자리 D
 * HH	: 시간 2자리(24시) hh 12시
 * mm	: 분 2자리 m
 * ss	: 초 2자리 s
 * E	: 요일
 * a	: 오전/오후
 */
public class DateEx01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH시 mm분 ss초 E a");
		System.out.println(sf.format(now));
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = "2025-12-25 10:00:00";
		Date day = null;
		try {
			day = sf2.parse(formatDate);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println("33- " + day);
		
		//day 날짜를 yyyy-MM-dd E요일 형식으로 출력하기.
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf3.format(day));
	}
}
