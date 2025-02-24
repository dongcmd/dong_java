package ex04_stringbuffer;
/* 
 * Thread를 동기화 하냐 안하냐에 따라 다름
 * StringBuffer / StringBuilder 클래스 : 동적 문자열
 *  - 같은 메서드를 멤버로 가짐.
 *  	StringBuffer : 기존클래스. "스레드의 동기화"된 메서드를 멤버로 가짐.
 *  	StringBuilder : jdk5.0 이후에 사용가능한 클래스
 *  					"스레드의 비동기화"된 메서드를 멤버로 가짐.
 *  - equals() 오버라이딩 되어 있지 않음. 내용 비교를 안됨
 *     => 내용비교를 원한다면 String 객체로 변경하여 비교해야 함 / toString()을 사용해 변경
 *  - 동적문자열. String클래스의 보조 클래스로 사용.
 */
public class StringBufferEx01 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("sb1 == sb2 : " + (sb1 == sb2) ); // 같은 객체 false
		
		//equals() : 내용 비교를 위해 오버라이딩 되어 있지 않음
		System.out.println("sb1.equals(sb2) : " + sb1.equals(sb2) );
		
		//내용 비교를 위해 문자열 변환 필요
		System.out.println("sb1.toString().equals(sb2.toString()) : "  
								+sb1.toString().equals( sb2.toString() ) );

		StringBuilder sb3 = new StringBuilder("abc");
		StringBuilder sb4 = new StringBuilder("abc");
		System.out.println("sb3 == sb4 : " + (sb3 == sb4) ); // 같은 객체 false
		
		//equals() : 내용 비교를 위해 오버라이딩 되어 있지 않음
		System.out.println("sb3.equals(sb4) : " + sb3.equals(sb4) );
		
		//내용 비교를 위해 문자열 변환 필요
		System.out.println("sb3.toString().equals(sb4.toString()) : "  
				+sb3.toString().equals( sb4.toString() ) );
		
	}

}
