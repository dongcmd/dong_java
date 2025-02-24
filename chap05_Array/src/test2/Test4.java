package test2;

/*
 [결과]
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>1
학생수>5
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>2
scores[0]>100
scores[1]>50
scores[2]>80
scores[3]>75
scores[4]>95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>3
scores[0]:100
scores[1]:50
scores[2]:80
scores[3]:75
scores[4]:95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>4
최고 점수:100
평균 점수:80.0
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>5
프로그램 종료
 */
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean onOff = true;
		int stu = 0;
		int[] scores = {};
		while(onOff) {
			System.out.println("---------------");
			System.out.println("1. 학생수 | 2. 점수입력 "
					+ "| 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------");
			System.out.print("선택>");
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1 :
					System.out.print("학생수>");
					stu = sc.nextInt();
					scores = new int[stu];
					break;
				
					//System.out.println();
				case 2 :
					for(int i = 0; i < scores.length; i++) {
						System.out.printf("scores[%d]>", i);
						scores[i] = sc.nextInt();
					}
					break;
					
				case 3 :
					for(int i = 0; i < scores.length; i++) {
						System.out.printf("scores[%d]:%d\n", i, scores[i]);
					}
					break;
					
				case 4 :
					int max = scores[0];
					int sum = 0;
					for(int i : scores) {
						max = Math.max(max, i);
						sum += i;
					}
					System.out.printf("최고 점수 : %d\n", max);
					System.out.printf("평균 점수 : %.1f\n", (double)sum/stu);
					break;
				case 5 :
					onOff = !onOff;
					System.out.println("프로그램 종료");
					break;
			}
		}
	}
}