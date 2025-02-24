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

public class Test3_B {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890","099-2456-7980", 
				"088-2346-9870","013-3456-7890",};
//		-를 무시하고 번호 찾도록 수정하기. 출력시 앞에 숫자 나오게 하기. 종료하기 전까지 계속 찾기
		while(true) {
			System.out.println("숫자입력 ㄱ / Q(대소문자 구분안함) 입력시 종료");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();  
//			String str =  "23";
			if( str.equalsIgnoreCase("Q")  ) return;
			
			Pattern p = Pattern.compile("\\d*" +str+ "\\d*");
			
			for(String s : phoneNumArr) {
				String ck = s.replace("-","");
				Matcher m = p.matcher(ck);
				if(m.matches()) {
					System.out.println(s);
				}
			}
		}
	}
}
