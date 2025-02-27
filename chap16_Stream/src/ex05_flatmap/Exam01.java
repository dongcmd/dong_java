package ex05_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a Java book",
				"Lambda Expressions",
				"Java8 supports lambda Expressions");
		list.stream().forEach( s -> {
			Stream<String> st = Arrays.asList(s.split(" ")).stream();
			st.forEach( str -> System.out.println(str));
		});
		
		}
}
