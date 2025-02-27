package ex06_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import dp.Student;

/*
 * SortedEx03.java 소스의 내용을 반별, 총점의 역순으로 정렬
 */
public class Exam01 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 1, 89, 56, 66),
				new Student("김삿갓", 1, 85, 56, 80),
				new Student("이몽룡", 2, 90, 78, 95),
				new Student("임꺽정", 3, 60, 56, 88),
				new Student("신창섭", 2, 100, 100, 100),
				new Student("메벤남", 2, 30, 68, 95),
				new Student("리선족", 3, 40, 79, 65),
				new Student("쌀숭이", 1, 80, 78, 91) );
		// 정렬 순위 1. 반 순 2. 총점 높은 순
		list.stream().sorted(
				Comparator.comparing(Student::getBan).thenComparing( s -> -s.getSum())).forEach(System.out::println);
		
		System.out.println("반 별 영어 내림차순");
		list.stream().sorted(
				Comparator.comparing(Student::getBan).thenComparing( s -> -s.getEng())).forEach(System.out::println);
		
		System.out.println("반 별 수학 내림차순");
		list.stream().sorted(
				Comparator.comparing(Student::getBan).thenComparing( s -> -s.getMath())).forEach(System.out::println);
		
		System.out.println("반 별 국어 내림차순");
		list.stream().sorted((s1, s2) -> s2.getKor() - s1.getKor()).sorted(Comparator.comparing(Student::getBan)).forEach(System.out::println);
	}
}