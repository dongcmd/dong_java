package test;
/*
1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 
값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기

입력 숫자가 1 부터 100까지의 숫자가 아닌 경우 : NumberInputException 예외 발생을 시키고 
                                        1 과 100사이의 숫자만 입력하세요 메세지출력 
입력 값이  숫자가 아닌경우 :  InputMismatchException 예외가 발생 
                        숫자만 입력하세요  메세지 출력
계속 입력을 받는다.
몇번의 입력만에 숫자를 맞추었는지 출력하기.
단 입력 오류된 경우도 입력 건수에 포함된다.
*/
import java.util.Scanner;
import java.util.InputMismatchException;

class NumberInputException extends Exception {
	private static final long serialVersionUID = 1L;
	NumberInputException() {};
	NumberInputException(String str) {
		super(str);
	}
}
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int correctAnswer = (int) (Math.random() * 100) + 1;
		int myAnswer = 0;
		System.out.println("정답 : " +correctAnswer);
		System.out.print("1 - 100 사이 숫자 입력>");
		while(true) {
			try {  cnt++;
				myAnswer = sc.nextInt();
				if( 1 > myAnswer || myAnswer > 100 ) {
					throw new NumberInputException("1 - 100 사이 숫자만 입력하세요.");
				}
				if(myAnswer > correctAnswer) { System.out.println("더 작은 수 입니다."); }
				else if(myAnswer < correctAnswer) { System.out.println("더 큰 수 입니다."); }
				else { break; }
			} catch(NumberInputException e) {
				System.out.println(e.getMessage());
			} catch(InputMismatchException e) {
				System.out.println("숫자를 입력하셈. 1-100 사이");
				sc.next();			
			}
		}
		sc.close();
		System.out.println("정답입니다. 입력 횟수 : " + cnt);
	}
}