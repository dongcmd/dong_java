package ex05_flatmap;

import java.util.Arrays;
import java.util.List;
/*
 * flatMap 함수 : 다른 형태의 요소를 새로운 스트림으로 생성
 * 
 * Stream<R> flatMap(Function< T, Stream<R> >) : T타입 매개변수로 Stream<R>로 리턴
 * DoubleStream flatMap(DoubleFunction<DoubleStream>) :
 * 									double형을 매개변수로 DoubleStream으로 리턴
 * IntStream flatMap(IntFunction<IntStream>) : int형 매개변수로 IntStream으로 리턴
 * IntStream flatMapToInt(Function<T, IntStream>) :
 * 									T타입 매개변수로 IntStream으로 리턴
 */
public class FlatMapEx01 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("자바 8 버전에,추가된 스트림을,열심히 공부하자".split(","));
		list1.stream() // 3개의 문자열 요소를 Stream<String> 생성
		// public static <T> Stream<T> stream(T[] array)
		.flatMap(data -> Arrays.stream(data.split(" ")))
		.forEach(word -> System.out.println(word));
	}
}