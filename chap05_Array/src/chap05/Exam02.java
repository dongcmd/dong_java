package chap05;


import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("8진수로 변환할 10진수 입력");
		int num = sc.nextInt();
		int[] octal = new int[8];
		
		int divnum = num;
		int index = 0;
		
		while(divnum > 0) {
			octal[index++] = divnum % 8;
			divnum /= 8;
		}
		
		System.out.printf("%d의 8진수 : ", num);
		for(int i = index-1; i >= 0; i--)
			System.out.print(octal[i]);
		
		System.out.println();
		System.out.println(Integer.toOctalString(num));
		System.out.println("위는 Integer.toOctalString() 사용");
		

	}

}
