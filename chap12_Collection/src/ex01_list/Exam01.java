package ex01_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 정수들을 입력받아, 입력받은 숫자의 합계, 평균, 중간인덱스값 출력
 * 999 숫자 입력시 입력 종료
 * 
 * 평균인덱스값은 홀수의 경우 가운데 값, 짝수는 가운데 2개의 평균 인덱스 값
 */
public class Exam01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		while(true) {
			int input = sc.nextInt();
			if( input == 999) break;
			list.add(input);
			sum += input;
		}
		
		avg = (double)sum / list.size();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
