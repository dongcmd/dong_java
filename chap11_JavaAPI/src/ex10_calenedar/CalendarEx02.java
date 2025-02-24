package ex10_calenedar;

import java.util.Calendar;
/*
 * Calendar class에 날짜 설정하기
 */
public class CalendarEx02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2025, (2-1), 28 );
		System.out.printf("날짜 : %4d-%02d-%02d\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1 , cal.get(Calendar.DATE));
		
		//2025-12-25 날짜와 요일 출력
		
		cal.set(2025, (12-1), 25);
		String days ="";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1 : days = "일요일"; break;
		case 2 : days = "월요일"; break;
		case 3 : days = "화요일"; break;
		case 4 : days = "수요일"; break;
		case 5 : days = "목요일"; break;
		case 6 : days = "금요일"; break;
		case 7 : days = "토요일"; break;
		}
		System.out.printf("날짜 : %4d-%02d-%02d %s\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE), days );
	}

}
