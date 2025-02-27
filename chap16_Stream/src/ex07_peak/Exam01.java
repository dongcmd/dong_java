package ex07_peak;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/*
 * 1 ~ 100 사이의 임이의 수 10개를 Stream 으로 생성, 홀수 요소와 홀수의 합 출력
 */
public class Exam01 {
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++) arr[i] = (int)(Math.random() * 100 + 1);
		
		System.out.println(Arrays.toString(arr));
		int tot = Arrays.stream(arr).filter(i -> i % 2 == 1)
				.peek(i -> System.out.println(i)).sum();
		System.out.println("홀수의 합 " + tot);
		
		// Random 클래스 이용해서 Stream 생성
		IntStream isr = new Random().ints(10, 1, 101);
		tot = isr.filter(i -> i%2 == 1)
				.peek(i -> System.out.println(i)).sum();
		System.out.println("홀수의 합 " + tot);
		
//		Set<Integer> set = new TreeSet<>();
//		
//		while(set.size() < 10) {
//			set.add((int) (Math.random() * 100 + 1));
//		}
//		
//		System.out.print("임의의 수 : ");
//		set.stream().forEach(i -> System.out.print(i+", ") );
//		System.out.println();
//		System.out.print("홀수 : ");
//		set.stream().filter(i -> i%2 != 0).forEach(i -> System.out.print(i + ", "));
//		System.out.println();
//		System.out.print("홀수의 합 : ");
		
		
	}

}
