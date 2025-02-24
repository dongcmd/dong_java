package test;
/*
1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
     소문자 = 대문자 + 32
     대문자 = 소문자 - 32
     '0'  : 48
     '1' : 49 => 21
     ('1'-'0')+20 = 21
     ('5'-'0')+20 = 25
*/
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char input = new String( sc.next() ).charAt(0);
		
		if ( Character.isUpperCase(input) )
			System.out.println( Character.toLowerCase(input) );
		else if ( Character.isLowerCase(input) )
			System.out.println( Character.toUpperCase(input) );
		else if ( Character.isDigit(input) )
			System.out.println( input - '0' + 20 );
		else
			System.out.println("기타문자");
				

	}
}
