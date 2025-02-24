package test2;
/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기 
 * [결과]
 * 12,340
 */

public class Test2 {
	public static void main(String[] args) {
		String str = "1,234";
		StringBuffer sb = new StringBuffer(str);
		int i = 0;
		while(true) {
			if( !Character.isDigit( sb.charAt(i) ) ) {
				sb.deleteCharAt(i--);
			}
			if( sb.length()-1 == i) { break; }
			i++;
		}
		String result = new String(sb);
		System.out.printf("%,d", Integer.parseInt(result) * 10);
	}
}
