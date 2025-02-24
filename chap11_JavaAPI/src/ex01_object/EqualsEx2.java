package ex01_object;
/*
 * equals 메서드를 대부분 오버라이딩하고 있음
 * 모든 객체의 내용 비교는 equals 메서드로 판단해야함.
 */
public class EqualsEx2 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1 == str2)
			System.out.println("str1 과 str2는 같은 객체임");
		else
			System.out.println("str1 과 str2는 다른 객체임");
		if(str1.equals(str2))
			System.out.println("str1 과 str2는 같은 문자열을 가진 객체임");
		else
			System.out.println("str1 과 str2는 다른 문자열을 가진 객체임");
	}
}
