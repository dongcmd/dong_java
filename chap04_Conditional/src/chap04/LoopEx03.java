package chap04;


import java.util.Scanner;

public class LoopEx03 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if ( i%2 == 0 || i%3 == 0)
				continue;
		sum += i;
		}
		System.out.println(sum);
		// 1633
	
		sum = 0;
		for(int i = 1; i <= 100; i++) {
			if( i%2 != 0 && i%3 != 0)
				sum += i;
		}
		System.out.println(sum);
		// 1633
	
	}

}
