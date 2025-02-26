package ex02_array;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 배열 객체를 이용하여 Stream 생성하기
 */
public class ArraysEx01 {
	public static void main(String[] args) {
		String[] arr = "a,b,c".split(",");
		Stream<String> stream1 = Arrays.stream(arr);
		stream1.forEach(s -> System.out.print(s + "\t" ));
		
		System.out.println();
		Stream<String> stream2 = Arrays.stream(arr, 1, 3);
		stream2.forEach(s -> System.out.print(s + "\t"));
		
		System.out.println();
		int[] intArr = {1, 2, 3, 4, 5};
		System.out.println("Arrays.stream 메서드를 이용하여 IntStream 생성");
		IntStream intSt1 = Arrays.stream(intArr);
		intSt1.forEach( s -> System.out.print(s + ", "));
		System.out.println();

		System.out.println("IntStream.of 메서드를 이용하여 IntStream 생성");
		intSt1 = IntStream.of(intArr);
		intSt1.forEach( s -> System.out.print(s + ", "));
		System.out.println();

		System.out.println("IntStream.range 메서드를 이용하여 IntStream 생성");
		intSt1 = IntStream.range(3, 10);
		intSt1.forEach( s -> System.out.print(s + ", "));
		System.out.println();

		System.out.println("IntStream.rangeClosed 메서드를 이용하여 IntStream 생성");
		intSt1 = IntStream.rangeClosed(3, 10);
		intSt1.forEach( s -> System.out.print(s + ", "));
		System.out.println();
		
	}
}