package ex09_date;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/*
 * Date 클래스 날짜 설정하기
 */
public class DateEx02 {
	public static void main(String[] args) {
		Date now = new Date(); // 현재 일자 시간

		// 1970-01-01  09:00:00 이후부터 현재까지의 시간을 밀리초 리턴
		System.out.println(now.getTime()); // 현재시간의 밀리초 리턴
		System.out.println(System.currentTimeMillis()); // 현재시간의 밀리초 리턴
		
		SimpleDateFormat sf0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sf0.format(1));
		
		//2025-03-01 요일과 밀리초 출력
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String sday = "2025-03-01";
		Date day = null;
		try {
			day = sf.parse(sday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sday + " " + new SimpleDateFormat("E요일").format(day));
		System.out.println("밀리초 : " + day.getTime());
		
		//내일의 날짜와 요일을 출력
		now.setTime(now.getTime() + (1000 * 60 * 80 * 24) );
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(now));
	}
}