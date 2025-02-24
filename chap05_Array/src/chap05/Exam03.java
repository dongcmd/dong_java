package chap05;


import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		String str = "public static void main(String[] args)";
		// 소문자의 개수 각 구하기
		
		int[] arr = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			if( 'a' <= str.charAt(i) && str.charAt(i) <= 'z' )
				arr[str.charAt(i)-'a']++;
		}
		
		int sum = 0;
		char letter = 'a';
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%c의 개수 : %d ", letter++, arr[i]);
			for(int j = arr[i]; j > 0; j--)
				System.out.print("*");
			System.out.println();
			sum += arr[i];
		}
		System.out.println("합계 " +sum);
		
		
		

	}

}
