package ex11_regularExpression;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
/*
 * data 문자열 중 점수를 찾아 총점과 평균 출력
 */
public class Exam01 {
	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학:85,과학:95";
		String scoreP = "([ㄱ-힣]{2}):(\\d{2,3})";
		
		Pattern p = Pattern.compile(scoreP);
		Matcher m = p.matcher(data);
		
		int sum = 0, avg = 0, subj = 0;
		System.out.println("점수 구하기");
		while(m.find()) {
			System.out.println(++subj + "과목 - " + m.group() );
			sum += Integer.parseInt(m.group(2));
		}
		System.out.println();
		avg = sum/subj;
		System.out.printf("과목 수 : %d\n총점 : %d, 평균 : %d\n", subj, sum, avg);
		
	}

}
