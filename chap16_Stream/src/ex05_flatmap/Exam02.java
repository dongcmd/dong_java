package ex05_flatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exam02 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc", "def", "jkl"},
				new String[] {"ABC", "GHI", "JKL"}
				);
//		strArrStrm.forEach(s -> System.out.println(s));
		
		// 각 String 객체 한줄씩 출력
		
		// Stream<String[]> => Stream<String> 변경
//		strArrStrm.flatMap(Arrays::stream).forEach(s -> System.out.println(s));
		strArrStrm.flatMap(arr -> Arrays.stream(arr)).forEach(s -> System.out.println(s));

	}

}
