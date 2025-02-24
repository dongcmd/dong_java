package chap10_Exception;
/*
 * 정상 12346
 * 3/0 : 예외발생 => 1256
 * 
 * catch블럭 : try블럭 내부에서 예외발생시에 실행되는 영역
 * 
 * 다중 catch
 *  - 1개의 try블럭에 여러 catch블럭이 존재 가능
 *  	=> try블럭에서 발생되는 예외가 여러 종류인 경우 예외별 예외처리 가능
 *  
 *  상위 예외클래스 일수록 catch문을 아래에 배치해야 함
 */
public class ExceptionEx02 {
	public static void main(String[] args) {
		try {
			// NumberFormatException 예외 발생시 "숫자만 입력ㄱ" 출력
			String str = null;
			System.out.println(str.trim()); // NullPointerException
			System.out.println(Integer.parseInt("asd")); // NumberFormatException
			System.out.println(args[0]); // ArrayIndexOutOfBoundsException
			System.out.print(1);
			System.out.print(2);
			System.out.print(3/0); //ArithmeticException 예외 발생
			System.out.print(4);			
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력ㄱ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에서 파라미터를 입력하세요");
		} catch (ArithmeticException e) { // try 블럭 안에서 ArithmeticException 예외 발생시 실행 
			System.out.print(5);
		} catch (Exception e) {
			System.out.println("프로그램 오류, 전산부 연락ㄱ");
		}
		System.out.println(6);
		
	}

}
