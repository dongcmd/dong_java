package ex03_string;
/*
 * String.format() : 형식화된 문자(서식문자)를 이용해 문자열로 리턴
 * 						static 메서드 => 객체화 필요 없음
 * 형식문자(서식문자) : %d, %f, %c, %s 등
 *    => printf() 사용법과 동일
 */
public class Stringex5 {
	public static void main(String[] args) {
		//%d : decimal. 10진 정수
		String sf = String.format("%d", 12345);
		System.out.println(sf);
		//%,d : 3자리마다 , 표시 : 1,000,000		
		System.out.println(String.format("%,d", 12345));
		
		//%,10d : 10자리 확보 후 3자리마다 , 표시		
		System.out.println(String.format("%,10d", 12345));

		//%-10d : 10자리 확보 후 좌측정렬		
		System.out.println(String.format("%-10d", 12345));
		
		//%-,10d : 10자리 확보 후 좌측정렬 후 3자리마다 , 표시		
		System.out.println(String.format("%-,10d", 12345));
		
		//%010d : 10자리 확보 후 빈자리 0으로 채움		
		System.out.println(String.format("%010d", 12345));
		
		//%X, %x : 16진수. Hexa		
		System.out.println(String.format("%X, %x", 255, 255));
		
		//%o : 8진수. Octal	
		System.out.println(String.format("%o", 10));
		
		//%b : 논리형. boolean
		System.out.println(String.format("%b, %b, %b, %b", null, 0, false, true));
		
		//%f : 부동소수점 숫자 표현
		//%.2f : 소숫점 이하 2자리로 출력. 반올림
		System.out.println(String.format("%f, %.2f", 0.12, 0.154) );
		//%,15.2f : 15자리 확보, 소수점 2자리, 세자리마다 , 표시
		System.out.println(String.format("%,15.2f", 12345.145) );
		//%,15.2f : 15자리 확보, 소수점 2자리, 세자리마다 , 표시, 좌측정렬
		System.out.println(String.format("%-,15.2f", 12345.145) );
		//%,15.2f : 15자리 확보, 소수점 2자리, 빈자리 0으로 채우기
		System.out.println(String.format("%015.2f", 12345.145) );
		
		//%s : 문자열 출력
		System.out.println(String.format("%s", "Kim") );
		//%10 : 10자리 확보하여 문자열 출력 ( - 좌측정렬) 
		System.out.println(String.format("%10s", "Kim") );
		System.out.println(String.format("%-10s", "Kim") );
		
		//%c : 문자 출력
		System.out.printf("%c\n", 'D');
		//%c : 문자 출력
		System.out.printf("%5c\n", 'D');

		
	}

}
