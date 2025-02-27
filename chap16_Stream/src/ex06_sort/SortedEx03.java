package ex06_sort;

import java.util.Comparator;
import java.util.stream.Stream;

import dp.Student;

public class SortedEx03 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("홍길동", 1, 89, 56, 66),
				new Student("김삿갓", 1, 85, 56, 80),
				new Student("이몽룡", 2, 90, 78, 95),
				new Student("임꺽정", 3, 60, 56, 88),
				new Student("신창섭", 2, 100, 100, 100),
				new Student("메벤남", 2, 30, 68, 95),
				new Student("리선족", 3, 40, 79, 65),
				new Student("쌀숭이", 1, 80, 78, 91) );
		studentStream.sorted(
				Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder()))
		.forEach(System.out::println);
	}
}