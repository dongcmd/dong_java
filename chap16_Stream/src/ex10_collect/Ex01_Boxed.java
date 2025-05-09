package ex10_collect;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
 * Box : 기본자료형 => 객체화 (래퍼 클래스)
 * asDoubleStream() => IntStream => DoubleStream
 * boxed() : IntStream => Stream<Integer>
 */
public class Ex01_Boxed {
	static int sum = 0;
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.asDoubleStream().forEach( d -> System.out.print("double " +d+", "));System.out.println();
		intStream = Arrays.stream(intArray);
		intStream.asLongStream().forEach( d -> System.out.print("long " +d+", "));System.out.println();
		/*
		 * boxed() : Wrapper 클래스로 변경
		 */
		intStream = Arrays.stream(intArray);
		Stream<Integer> is = intStream.boxed();
		// obj.getClass()
		is.forEach(obj -> System.out.println(obj.getClass()));
		
	}
}
