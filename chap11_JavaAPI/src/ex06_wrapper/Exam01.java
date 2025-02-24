package ex06_wrapper;
/*
 * str 문자열의 숫자의 합을 출력
 */
public class Exam01 {
	public static void main(String[] args) {
		String str = "10,20,   30,   40,   50,   60";
		String[] arr = str.split(",");
		
		int sum = 0;
		for(String s : arr) {
			sum += Integer.parseInt(s.trim());
		}
		System.out.println(sum);
		
	}
}
