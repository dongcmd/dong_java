package ex11_regularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegularEx03 {
	public static void main(String[] args) {
		String source = "핸드폰:010-1111-1111,집:02-706-3753"
					   +"이메일:regular@aaa.bbb,계좌번호:301-01-123456";
		String telP = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telP);
		Matcher m = p.matcher(source);
		int i = 0;
		System.out.println("전화번호 : ");
		
		// m.find() : source에서 패턴에 맞는 문자열을 리턴
		while(m.find()) {
			System.out.printf("%d : " + m.group() + " => " + m.group(1) + ", " + m.group(2) + ", " + m.group(3) + "\n", ++i);
		}
		
		i = 0;
		System.out.println("이메일 : ");
		String emailP = "(\\w+)@(\\w+).(\\w+)";
		p = Pattern.compile(emailP);
		m = p.matcher(source);
		while(m.find()) {
			System.out.printf("%d : " + m.group() + " => " + m.group(1) + ", " + m.group(2) + ", " + m.group(3) + "\n", ++i);
		}
		
		i = 0;
		System.out.println("계좌번호 : ");
		String accountP = "(?<!\\d)([1-9]\\d*)-(\\d+)-(\\d+)";
		p = Pattern.compile(accountP);
		m = p.matcher(source);
		while(m.find()) {
			System.out.printf("%d : " + m.group() + " => " + m.group(1) + ", " + m.group(2) + ", " + m.group(3) + "\n", ++i);
		}
		
//		계좌번호:301-01-123456";
	}
}