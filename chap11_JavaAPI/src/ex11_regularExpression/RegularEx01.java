package ex11_regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 표현식 : 문자의 형식을 지정
 */
public class RegularEx01 {
	public static void main(String[] args) {
		String[] data = {"bat", "babe", "bonus", "c", "cA", "ca", "c.", "car", "combat", "count", "cTT", "data", "disk" };
		// Pattern : 문서양식
		/*
		 * c[A-Za-z]? : "c로 시작"하며 뒤에 "영문자"가 "0 또는 1개"
		 * c : 문자 c
		 * [A-Za-z] : 대/소문자 문자 1개
		 * ? : 0 또는 1개
		 * + : 1개 이상
		 * * : 0개 이상
		 */
		Pattern p = Pattern.compile("c[A-Za-z]*");
		
		for(String s : data) {
			Matcher m = p.matcher(s); // 패턴형식에 맞는 문자열인지 검증할 객체
			if(m.matches()) { System.out.print(s+ ", "); } // boolean matches() 
		}
		System.out.println();
		
		//기존의 메서드에서 정규식 이용하기
		String names = "홍길동 ,             김삿갓,       이몽룡,  성춘향, 임꺽정";
		
		/*
		 *  \\s* : \s : 공백 한 문자
		 *  		* : 0개 이상 
		 */
		String[] arr = names.split("\\s*,\\s*");
		for(String s : arr) System.out.println(s);
	}
}