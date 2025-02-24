package ex04_stringbuffer;
/*
 * StringBuffer 클래스의 주요 메서드
 */
public class StringBufferEx02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		//aapend() 객체의 마지막에 추가
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb); // abc123Afalse
		
		sb.delete(2, 4); // 2번부터 4번 이전 인덱스(2~3) 까지 문자 제거
		System.out.println(sb); // ab23Afalse
		
		sb.deleteCharAt(4); // 4번 인덱스 문자 제거
		System.out.println(sb); // ab23false
		
		sb.insert(5, "=="); // 5번 인덱스에 == 추가
		System.out.println(sb); // ab23f==alse

		sb = new StringBuilder("ABCDEFG");
		sb.replace(0, 3, "abc"); // 0번부터 3번 이전 인덱스(0~2) 까지 문자를 치환
		System.out.println(sb); // abcDEFG
		
		sb.reverse(); // 문자열 역순배치
		System.out.println(sb); // GFEDcba
		
	}
}