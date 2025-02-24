package ex04_stringbuffer;
/*
 * delchar(원본문자열, 삭제대상 문자열)
 * 		=> 원본문자열에서 삭제 대상 문자열을 제거하고 나머지만 출력
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println( delchar( "(1!2@3#4$5)", "~!@#$%^&*()") ); // 12345
		System.out.println( delchar( "(1!2@3#4$5)", "12345") ); // (!@#$)
		System.out.println( delchar2( "(1!2@3#4$5)", "~!@#$%^&*()") ); // 12345
		System.out.println( delchar2( "(1!2@3#4$5)", "12345") ); // (!@#$)
	}
	static StringBuilder delchar(String s1, String s2) {
		StringBuilder sb = new StringBuilder(s1);
		for(int i = 0; i < s1.length(); i++) {
			try {
				if( s2.indexOf( sb.charAt(i) ) > 0 ) {
					sb.deleteCharAt(i);
				}
				// 1 @ 2 @ 3 # 4 %
			} catch(IndexOutOfBoundsException e) {
				
			}
		}
		return sb;
	}
	static String delchar2(String s1, String s2) {
		String s = new String();
		for(int i = 0; i < s1.length(); i++) {
			if( !s2.contains(s1.charAt(i) + "") )  {
				s += s1.charAt(i);
			}
		}
		return s;
	}
}
