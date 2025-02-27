package ex04_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * map : 스트림의 요소를 다른 요소로 변경할 수 있는 함수
 * 			map___
 * mapToInt : Stream형을 IntStream형으로 바꾸는 함수
 * 
 * 메서드 종류
 * Stream<R> map(Function<T, R>) : T형을 입력 받아, R로 리턴하여 R형 Stream 생성
 * Stream<R> mapToObj(IntFunction<R>) : int를 입력 받아, R로 리턴하여 R형 Stream 생성
 * Stream<R> mapToObj(LongFunction<R>) : long을 입력 받아, R로 리턴하여 R형 Stream 생성
 * Stream<R> mapToObj(DoubleFunction<R>) : double을 입력 받아, R로 리턴하여 R형 Stream 생성
 * 
 * IntStream mapToInt(ToIntFunction<T>) : T형을 입력 받아, int 형 리턴하여 IntStream 생성
 * IntStream map(IntUnaryOperator) : int 형을 입력 받아, int 형 리턴하여 IntStream 생성
 * LongStream mapToLong(ToLongFunction<T>) : T형을 입력 받아, long 형 리턴하여 LongStream 생성
 * DoubleStream mapToDouble(ToDoubleFunction<T>) : T형을 입력 받아, double 형 리턴하여 LongStream 생성
 */
public class MapEx01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전,김삿갓,구운몽,전우치전,다섯글자임".split(","));
		System.out.println();
		// 글자의 크기로 새로운 IntStream을 생성하자
		// Stream<String> list.stream()
		
//		IntStream isr = list.stream().mapToInt(s -> s.length());
		IntStream isr = list.stream().mapToInt(String::length);
		
		isr.forEach(System.out::println);
		System.out.println("전체 문자열 크기 : " + list.stream().mapToInt(String::length).sum());
		System.out.println("전체 문자열 개수 : " + list.stream().count());
		System.out.println("1 ~ 100 까지의 합 : " + IntStream.range(1,101).sum());
		
		// list의 요소를 이름으로 가진 학생 객체 출력
		Stream<Student> sts = list.stream().map( s -> new Student(s, 0, 0));
		sts.forEach(System.out::println);
	}

}
