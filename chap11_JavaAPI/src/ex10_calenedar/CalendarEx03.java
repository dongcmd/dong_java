package ex10_calenedar;

import java.util.Date;
import java.util.Calendar;

/*
 * Date 클래스와 연결
 */
public class CalendarEx03 {
	public static void main(String[] args) {
		// Calendar 객체 <= Date 객체
		
		Date now = new Date();
		now.setTime(now.getTime() + (1000L * 60 * 60 * 24) );
		System.out.println(now);
		Calendar cal = Calendar.getInstance();
		cal.setTime(now); // Date 클래스를 이용해 Calendar 객체의 날짜 설정
		System.out.printf("날짜 : %4d-%02d-%02d\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1 , cal.get(Calendar.DATE));
		
		// Date 객체 <= Calendar 객체
		Date day = new Date();
		day.setTime( cal.getTimeInMillis() );
		System.out.print(day);
		
	}

}
