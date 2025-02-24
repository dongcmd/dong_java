package chap05;


import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// 10진수 > 16진수
		// 10 11 12 13 14 15
		//  A  B  C  D  E  F
		char[] data = "0123456789ABCDEF".toCharArray();
		char[] hex = new char[8];
		
		System.out.print("16진수로 변환할 10진수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divnum = num;
		int index = 0;
		while(true) {
			hex[index++] = data[divnum % 16];
			divnum /= 16;
			if (divnum == 0) break;
		}
		System.out.printf("%d의 16진수 : ", num);
		for(int i = index-1; i >= 0; i--) System.out.print(hex[i]);
		System.out.println();
	}

}
