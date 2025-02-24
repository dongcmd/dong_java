package ex03_string;
/*
 * String 주요 메서드 2
 */
public class StringEx4 {
	public static void main(String[] args) {
		String str = "This is a String";
		
		//substring() 부분 문자열
		//substring(5) 5번 인덱스 이후 부분 문자열 리턴
		System.out.println( str.substring(5) ); // is a String
		
		//substring(5, 13) 5번 부터 13번 인덱스 앞까지 부분 문자열 리턴
		//					5 ~ 12 인덱스
		System.out.println( str.substring(5,13) ); // is a Str
		
		//toUpperCase(), toLowerCase() 대소문자 변경
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());


		//trim() : 양쪽의 공백 제거, 문자열 사이의 공백 제거 못함
		str = "      문자열       ";
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println(str.length());
		System.out.println(str.trim().length());
		
		//split(기준문자열) : 문자열을 기준문자열로 분리해 배열 리턴
		str = "홍길동,이몽룡,김삿갓,abc";
		String[] arr = str.split(",");
		for(String s : arr) System.out.println(s);
		//toCharArray() : 문자열을 한개의 char로 분리해 배열 리턴
		char[] carr = str.toCharArray();
		for(char c : carr) System.out.println(c);
		str="abcdefghi";
		byte[] barr = str.getBytes();
		for(byte b : barr) System.out.println((char)b);
		
	}
}