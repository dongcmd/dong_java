package chap10_Exception;
/*
 * 사용자 예외 클래스 생성하기
 */
class LoginFailException extends Exception {
	LoginFailException(String msg) {
		super(msg);
	}
}
class LoginFailException2 extends RuntimeException {
	LoginFailException2(String msg) {
		super(msg);
	}
}
public class ExceptionEx08 {
	public static void main(String[] args) {
		String id = "hong";
		String pw = "1234";
//		try {
//			if(!( id.equals("hong1") ) || !( pw.equals("1234") ) ) {
//				throw new LoginFailException("아이디 또는 비밀번호 오류"); //정상 실행 중단
//			}
//			System.out.println("반갑습니다. hong님");
//		} catch(LoginFailException e) {
//			System.out.println(e.getMessage());
//		}
		//LoginFailException2는 예외처리를 안하도록 클래스 구현
			if(!( id.equals("hong1") ) || !( pw.equals("1234") ) ) 
				throw new LoginFailException2("아이디 또는 비밀번호 오류"); //정상 실행 중단
			System.out.println("반갑습니다. hong님");
	}
}
