package ex06_wrapper;
/*
 * Character 클래스
 * 
 */
public class WrapperEx02 {
	public static void main(String[] args) {
		char[] arr = { 'A', 'a', '&', '가', '0', '李' };
		for(char c : arr) {
			if( Character.isUpperCase(c) ){  
				System.out.println(c + " : 대문자"); }
			if( Character.isLowerCase(c) ) { 
				System.out.println(c + " : 소문자"); }
			if( Character.isDigit(c) ) { 
				System.out.println(c + " : 숫자"); }
			if( Character.isAlphabetic(c) ) { 
				System.out.println(c + " : 문자"); }
			else System.out.println(c + " : 문자아님"); 
		}
		int 美 = 100;
		System.out.println(美);
	}

}
