package test;
/*
 * indexOf(문자열,찾는 문자열)
 *    문자열에서 찾는 문자열의 위치 값을 출력하는 함수 구현하기
 */
public class Test5 {
	static void indexOf(String s1, String s2) {
		
	}
	public static void main(String[] args) {
		indexOf("12345AB12AB45AB", "12");  //12:0,7
		indexOf("12345AB12AB45AB", "AB");  //AB:5,9,13
		indexOf("12345", "AB");            //AB : 없음
	}
}
