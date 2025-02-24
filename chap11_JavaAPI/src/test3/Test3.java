package test3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

/*
 * 찾고자 하는 번호의 일부를 입력받아 번호를 출력하기
 * [결과]
 * 찾는 번호의 일부를 입력하세요:
 * 3456
 * 012-3456-7890
 * 013-3456-7890
 */

public class Test3 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890","099-2456-7980", 
				"088-2346-9870","013-3456-7890",};
		Scanner sc = new Scanner(System.in);
		String str = sc.next();  
		sc.close();
//		String str =  "3456";
		
		Pattern p = Pattern.compile(String.format("(.*%s.*)-(\\d+)-(\\d+)|(\\d+)-(.*%s.*)-(\\d+)|(\\d+)-(\\d+)-(.*%s.*)", str, str, str));
		
		for(String s : phoneNumArr) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.println(s);
			}
		}
	}
}
