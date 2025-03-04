package ex05_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

/*
 * IntStream flatMapToInt() : Stream을 IntStream으로 변경 
 */
public class FlatMapEx02 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("10,20,30", "40,50,60");
		Function<String, IntStream > f = data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		};
		
		IntStream isr = list.stream() // list<String> => Stream<String>
				.flatMapToInt(f); // Stream<String> => IntStream
		isr.forEach(System.out::println);
		
		//숫자들의 개수, 합, 평균 출력
		System.out.println("숫자 갯수 : " + list.stream().flatMapToInt(f).count());
		isr = list.stream().flatMapToInt(f);
		System.out.println("숫자 합 : " + list.stream().flatMapToInt(f).sum());
		isr = list.stream().flatMapToInt(f);
		System.out.println("숫자 평균 : " + list.stream().flatMapToInt(f).average().getAsDouble());
		
	}
}