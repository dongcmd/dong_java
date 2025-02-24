package chap10_Exception;
/*
 * 정상처리 12356
 * 2/0 오류 1456
 * 
 * 정상 return 1235
 * 2/0 오류 return 145
 * 
 * finally 블럭 : try블럭에서 정상처리/예외발생 모두 실행되는 블럭
 * 				  중간에 return이 실행돼도 반드시 실행되는 영역
 */
public class ExceptionEx03 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2/0);
			System.out.print(3);
//			return;
		} catch (Exception e){
			System.out.print(4);
			return;
		} finally {
			System.out.print(5);			
		}
		System.out.print(6);			
	}

}
