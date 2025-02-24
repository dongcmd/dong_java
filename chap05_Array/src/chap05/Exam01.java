package chap05;


import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		
		// 합, 평균, 최대값, 최소값, 최대 인덱스, 최소 인덱스
		Scanner sc = new Scanner(System.in);
			
		int[] num = new int[5];
		int sum = 0;
		int maxVal, minVal, maxIndex, minIndex;
		double avg = 0;
		
		avg = maxVal = minVal = maxIndex = minIndex = 0;
		
		System.out.println("정수 5개 입력ㄱ");
		for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
			
			if (i == 0)
				maxVal = minVal= num[i];
			if(maxVal < num[i]) {
				maxVal = num[i];
				maxIndex = i;
			} else if(minVal > num[i]) {
				minVal = num[i];
				minIndex = i;
			}
			
		}
		// 합, 평균, 최대값, 최소값, 최대 인덱스, 최소 인덱스
		avg = (double)sum / num.length;
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %f\n", avg);
		System.out.printf("최대값 : %d\n", maxVal);
		System.out.printf("최소값 : %d\n", minVal);
		System.out.printf("최대 인덱스 : %d\n", maxIndex);
		System.out.printf("최소 인덱스 : %d\n", minIndex);
		sc.close();
	}
}
