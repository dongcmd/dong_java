/*	
 *	command 라인에서 숫자를 입력받아
 *
 *	숫자의 각 자리수 합 출력
 *
 *	java Exam04 1234
 *
 *	출력 10 
 */
package chap05;


public class Exam04 {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println(
					"숫자로된 파라미터 command라인에 입력");
			return;
		}
		for(int i1 = 0; i1 < args.length; i1++) {
			int sum = 0;
			for(int i2 = 0; i2 < args[i1].length(); i2++) {
				sum += args[i1].charAt(i2) - '0';
			}
			System.out.printf(
					"%s의 자리수 합 : %d\n", args[i1], sum);
			
		}
		

	}

}
