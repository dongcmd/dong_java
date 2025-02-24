package ex11_regularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
 * 정규 표현식 
 * "." : 문자 1개
 * "?" : 문자 0 또는 1개
 * "*" : 0개 이상
 * "+" : 1개 이상
 * "^" : 문자열의 시작		ex) ^[0-9] : 숫자로 시작하는 경우
 * "[^]" : 지정된 문자 제외 ex) [^0-9] : 숫자가 아닌 경우
 * "|" : OR
 * "&" : AND
 * "()" : 그룹
 * 
 * 영어 소문자 <-> 영어 대문자
 * "\s" : 공백 1개 space
 * "\S" : 공백이 아닌 문자 1개
 * "\d" : 숫자 1개 digit ( == [0-9] )
 * "\D" : 숫자가 아닌 문자 1개
 * "\w" : 일반문자 1개 word ( == [0-9A-Za-z_] )
 * "\W" : 일반문자가 아닌 문자 1개 (특수문자)
 * "{n}" : n개의 문자 (n은 숫자)
 * "{n,} : n개 이상의 문자 (n은 숫자) 
 * "{n,m} : n개 이상의 m개 이하의 문자 (n, m은 숫자 / n <= 문자길이 <= m) 
 */
public class RegularEx02 {
	public static void main(String[] args) {
		String[] patterns = { ".", "[a-z]?",  "[0-9]+",  "^[0-9]", 
				 				   "[a-z]*",  "[a-z]+",  "02|010",
				 				   "\\s"   ,  "\\S"   ,  "\\d"   ,
				 				   "\\w"   ,  "\\W" };
		String[] datas = { "", "a", "1", "12", "012", "abc" ,"02", " ", "A", "5", "*" };
		for(String s : datas) {
			if(s.equals("")) { System.out.print("빈 문자열 \"\" 패턴 => "); }
			else if(s.equals(" ")) { System.out.print("공백 문자 \" \" 패턴 => "); }
			else { System.out.print(s + " 문자의 패턴 => "); }
			
			for(String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m = pattern.matcher(s);
				if(m.matches()) { System.out.print(p + ", "); }
			}
			System.out.println();
			}
	}
}