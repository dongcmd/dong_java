package test3;

import java.util.Scanner;
import java.util.Calendar;

/*
 * 
년도와 월를 입력하세요
2025 02

	   2025년2월
   일  월  화   수  목  금   토
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28
 */

public class Test1_noArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int y = sc.nextInt();
//		int m = sc.nextInt();
		int y = 2025;
		int m = 1;
		int date = 1;
		boolean c = false;
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, 1);
		
		String days = "일월화수목금토";
		System.out.println("\t" + y + "년 " + m + "월");
		for(int i = 0; i < days.length(); i++)
			System.out.printf("%3c", days.charAt(i));
		System.out.println();
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				if(cal.get(Calendar.DAY_OF_WEEK) == 1+j && i == 0)
				{ c = !c; }
				if(!c) {
					System.out.printf("%4s", " ");
				} else {
					System.out.printf("%4d", date++);
				}
				if( date > cal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
					return; }
			}
			System.out.println();
		}
	}
}
