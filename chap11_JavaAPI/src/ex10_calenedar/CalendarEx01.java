package ex10_calenedar;

import java.util.Calendar;
/*
 * Calendar class
 * 	추상클래스 : 객체화 불가
 * 					getInstance() 메서드로 객체 리턴  
 */				 			
public class CalendarEx01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println("년도 : " + today.get(Calendar.YEAR));
		System.out.println("월 (0~11)+1 : " + (today.get(Calendar.MONTH)+1));
		System.out.println("연 기준 몇 째주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇 째주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일  : " + today.get(Calendar.DATE));
		System.out.println("일 (월 기준)  : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("일 (연 기준)  : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 (1 ~ 7 / 일 ~ 토)  : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("월 기준 몇 번째 요일  : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전 / 오후 ( 0 / 1) : " + today.get(Calendar.AM_PM));
		System.out.println("시간 (0 ~ 11) : " + today.get(Calendar.HOUR));
		System.out.println("시간 (0 ~ 23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 (0 ~ 59) : " + today.get(Calendar.MINUTE));
		System.out.println("초 (0 ~ 59) : " + today.get(Calendar.SECOND));
		System.out.println("밀리초 (0 ~ 999) : " + today.get(Calendar.MILLISECOND));
		System.out.println("TimeZone (UTC -12 ~ 12) 밀리초로 계산 : " + today.get(Calendar.ZONE_OFFSET) / (1000 * 60 * 60));
		System.out.println("이 달의 마지막 일자 : " + today.getActualMaximum(Calendar.DATE));

	}

}
