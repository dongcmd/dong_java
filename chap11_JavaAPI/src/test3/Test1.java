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

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int y = sc.nextInt();
//		int m = sc.nextInt();
		int y = 2025;
		int m = 2;
		
		Calendar cal = Calendar.getInstance();

		cal.set(y, m-1, 1);
		
		int[][] eachDay = new int[6][7];
		int day = 0;
		String days = "일월화수목금토";
		System.out.println("\t" + y + "년 " + m + "월");
		for(int i = 0; i < 7; i++) {
			System.out.printf("%3s", days.charAt(i));
			if(i+1 >= Calendar.DAY_OF_WEEK) {
				eachDay[0][i] = ++day ;			
			}
		}
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 7; j++) {
				eachDay[i+1][j] = ++day;
				if(eachDay[i][j] == 0) { System.out.printf("    "); }
				else { System.out.printf("%4d",eachDay[i][j]); }
				if(eachDay[i][j] == cal.getActualMaximum(Calendar.DAY_OF_MONTH)) { return; }
			}
			System.out.println();
		}
	}
}
