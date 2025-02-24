package chap05;


import java.util.Scanner;

public class ChangeFormation {

	public static void main(String[] args) {
		int[] binary = new int[32];
		System.out.println("2진수로 변환할 10진수 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divnum = num;
		int index = 0;
		
		while(divnum > 0) {
			binary[index++] = divnum % 2;
			divnum /= 2;
		}
		System.out.printf("%d의 2진수 : ", num);
		for(int i = index-1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		System.out.printf("%d의 2진수 : %s",num ,Integer.toBinaryString(num));
		System.out.println("위는 Integer.toBinaryString() 사용");

	}

}
