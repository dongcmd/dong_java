package chap10_Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 화면에서 1-10 사이의 숫자를 입력받아, 숫자만큼 * 출력하기
 * 입력값이 숫자가 아닌경우 InputMismatchException 예외 발생함
 * 예외 발생시 "숫자만 입력하셈" 출력 후 다시 입력받기
 * catch Scanner next(); 추가
 * 
 * 1-10 사이의 숫자가 아닌 경우 NumberInputException클래스의 예외를
 * 강제발생하고 다시 숫자 입력받기
 */
class NumberInputException extends Exception{
	NumberInputException(String msg) {
		super(msg);
	}
}
public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("1-10 사이 숫자를 입력하세요 >");
		while(true) {
			try {
				n = sc.nextInt();
				if(n < 1 || 10 < n) { throw new NumberInputException("1-10 사이 숫자가 아님 재입력 >"); }
				System.out.print(n + " : ");
				for(int i = 0; i < n; i++) {
					System.out.print("*");
				}
				break;
			} catch(NumberInputException e) {
				System.out.print(e.getMessage());
			} catch(InputMismatchException e) {
				System.out.print("숫자가 아님. 재입력 >");
				sc.next();
			}
		}
		sc.close();
	}
}
