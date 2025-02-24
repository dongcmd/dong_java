package ex12_scanner;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * str 문자열 내의 모든 숫자 값의 합과 평균 구하기
 */
public class Exam01 {
	public static void main(String[] args) {
		String str = "100 and 200 and 500 and animal and lion and tiger";
		Scanner sc = new Scanner(str);
		sc.useDelimiter("\\s*and\\s*");
		
		int sum = 0, cnt = 0;
		while(sc.hasNext()) {
			try {
				String token = sc.next();
				Pattern p = Pattern.compile("\\d+");
				Matcher m = p.matcher(token);
				if(m.matches()) { sum += Integer.parseInt(token); cnt++; }
//				sum += Integer.parseInt(token); cnt++;
			} catch (NumberFormatException e) { continue; }
		}
		System.out.println("합 : " + sum +"\n평균 : " + sum/cnt);
	}

}
