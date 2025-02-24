package test2;

import java.util.Scanner;

/*
 국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를 
 입력받은 후, 총점, 평균을 구하고 이들 모두에 대한 
 막대그래프를 아래 조건에 맞게 그릴 수 있는 프로그램을
 작성하시오.
(1) 국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를 
    각각 A, B, C, D, E, F, G 로 대표하여, 
    점수를 입력받은 후, 
    이에 대한 총점, 평균, 최대 점수, 최소 점수를 구한다. 
(2) 평균은 정수로 출력해야하며, 소수점은 모두 버린다. 
(3) 위에서 구한 점수들을 출력 후에는 이들 값을 기준으로
  모두 막대그래프로 표현한다.
 과목별 점수와, 평균, 최대점수, 최소점수가 그래프를 
 그려야할 대상이며 막대그래프는 10 점 당 '*' 하나로 
 대표하며, 10 의 단위이하의 자리숫자는 고려하지 않는다. 
(4) 그래프를 그릴 때, 각 과목에 해당하는 값은 위에서 
 언급한 영문자 한자로 대표하며, 
  최대점수는 H, 최소점수는 I, 평균은 J로 대표한다.

입력 예
78 56 87 92 47 56 77

출력예

TOT : 493
MAX : 92
MIN : 47
AVG : 70

 100                    *  *      
  90     *              *  *      
  80  *  *              *  *      
  70  *  *           *  *  *     *
  60  *  *        *  *  *  *     *
  50  *  *     *  *  *  *  *     *
  40  *  *  *  *  *  *  *  *  *  *
  30  *  *  *  *  *  *  *  *  *  *
  20  *  *  *  *  *  *  *  *  *  *
  10  *  *  *  *  *  *  *  *  *  *
      A  B  C  D  E  F  G  H  I  J
 */

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학,"
				+ " 물리, 화학, 사회, 컴퓨터 / 점수 차례로 입력");
		int[] score = new int[10];
		
		
		score[8] = Integer.MAX_VALUE;
		int TOT = 0;
		
		for(int i = 0; i < score.length-3; i++) {
			score[i] = sc.nextInt();
			TOT += score[i];
			score[7] = Math.max(score[7], score[i]);
			score[8] = Math.min(score[8], score[i]);
			
		}
		
		score[9] = TOT / (score.length-3);
				
		System.out.printf("TOT : %d\n", TOT); 
		System.out.printf("MAX : %d\n", score[7]); // H score[7]
		System.out.printf("MIN : %d\n", score[8]); // I score[8]
		System.out.printf("AVG : %d\n", score[9]); // J score[9]
		System.out.println();
		
		// 11*11
		String[][] graph= new String[11][11];
		int scoreRow = 0;
		char sub = 'A';
		int stars = 0;
		
		for(int j = 0; j < graph.length; j++) {
			for(int i = graph.length-1; i >= 0 ; i--) {
				switch(j) {
					case 0 :
						graph[i][j] = String.valueOf(scoreRow);
						if( i == graph.length-1 ) {
							graph[i][j] = " ";
							break;
						}
						scoreRow += 10;
						graph[i][j] = String.valueOf(scoreRow);
						break;
						
					case 1 : case 2 : case 3 : case 4 : 
					case 5 : case 6 : case 7 : 
					case 8 : case 9 : case 10 :
						if(i == graph.length-1) {
							stars = score[j-1] / 10;
							graph[i][j] = String.valueOf(sub);
							sub += 1;
						} else {
							if(stars-- > 0) {
								graph[i][j] = "*"; 
							} else { graph[i][j] = " ";
							}
						
						}
						break;
//					case 8 : case 9 : case 10 :
//						if(i == graph.length-1) {
//							stars = score[j-1] / 10;
//							graph[i][j] = String.valueOf(sub);
//							sub += 1;
//						} else {
//							if(stars-- != 0) {
//								graph[i][j] = "*"; 
//							} else { graph[i][j] = " ";
//							}
//						
//						}
				} // switch문 END
			}
		} // 첫 for문 END
			for(int i = 0; i < graph.length; i++) {
				for(int j = 0; j < graph[i].length; j++) {
					System.out.print(graph[i][j] + "\t");
				}
				System.out.println();
			} //출력 for문 END
	} // main method END
} //구동 class END