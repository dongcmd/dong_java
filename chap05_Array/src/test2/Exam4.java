package test2;
/*
 * command 라인에서 숫자 n을 입력받아 n숫자보다 작은 
 * 소수(primary number)의 갯수를 구하기
 * 
 * 2,3,5,7, 11,13,17,19
 * 20숫자까지의 소수의 갯수:8
 * 
 * int =Integer.parseInt(args[0])
 */
public class Exam4 {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		int[] arr = new int[n];
		int index = 0;
		
		for(int i = 1; i <= n; i++) {
			int check = 0;
			for(int j = 1; j <= i; j++ ){
				if(i % j == 0) { check++; }
				
				if(j == i && check == 2) {
					arr[index] = i;
					System.out.printf("%d ,", arr[index++]);
				}
			}
		}
		System.out.println();
		System.out.printf("%d숫자까지의 소수의 갯수: %d", n ,index);
		
	}
}
