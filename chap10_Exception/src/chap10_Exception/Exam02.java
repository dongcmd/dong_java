package chap10_Exception;
/*
 * 화면에서 정수형 숫자를 입력받아서 정수형 숫자인 경우 숫자만큼 * 출력
 * 정수형 숫자가 아닌 경우 숫자만 입력하라는 메세지 출력. 숫자가 입력될 때 까지
 * 
 * Scanner의 nextInt() 은 정수입력이 아닌 경우 InputMismatchException 예외 발생
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc.close();
		System.out.println("숫자입력");
		while(true) {
			try {				
				int n = sc.nextInt();
				for(int i = 1; i <= n; i++) { System.out.print("*"); }
				System.out.println();
				break;
			} catch (InputMismatchException e) {
				System.out.println("int타입으로 입력하삼");
				sc.next(); // 표준입력 버퍼의 내용을 제거
			}
		}
		
	}

}
