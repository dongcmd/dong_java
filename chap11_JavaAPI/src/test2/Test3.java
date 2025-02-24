package test2;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)     
 [결과]
 가나다    
  가나다  
    가나다
가나 
 */

public class Test3 {
	static StringBuffer format(String str, int len, int align) {
		StringBuffer result = new StringBuffer(str);
		if(str.length() >= len) { return result.replace(len, str.length(), "");}
		int blank = len-str.length();
		
		switch(align) {
		case 0 :
			for(int i = 0; i < blank; i++) result.append(" ");
			break;
		case 1 :
			for(int i = 0; i < blank/2; i++) result.append(" ").insert(0, " ");
			break;
		case 2 :
			for(int i = 0; i < blank; i++) result.insert(0, " ");
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0));
		System.out.println(format(str, 7, 1));
		System.out.println(format(str, 7, 2));
		System.out.println(format(str, 2, 0));
		
	}
}
