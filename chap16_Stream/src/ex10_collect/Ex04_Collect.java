package ex10_collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dp.Student2;

public class Ex04_Collect {

	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("신창섭", 100, Student2.Gender.MALE),
				new Student2("메벤녀", 70, Student2.Gender.FEMALE),
				new Student2("쌀숭이", 50, Student2.Gender.MALE),
				new Student2("리선족", 80, Student2.Gender.FEMALE) );
		
		System.out.println("1. 남학생의 이름, 점수 출력. List로 만들기");
		
		List<Student2> mList = new ArrayList<Student2>();
		list.stream().filter(s -> s.getGender().equals(Student2.Gender.MALE)).forEach(s -> mList.add(s));
		
		List<Student2> maleList = list.stream()
				.filter(s -> s.getGender().equals(Student2.Gender.MALE))
				.collect(Collectors.toList());
		System.out.println("mList 출력");
		mList.forEach(s -> System.out.println(s.getName() + ", " + s.getScore()));
		Optional<Student2> stu;
		
		System.out.println("4. list socre 값의 최대값 출력 Collectors.maxBy");
		stu = list.stream().collect(Collectors.maxBy(Comparator.comparingInt(s -> s.getScore())));
		System.out.println("점수가 가장 낮은 학생 : " + stu.get().getName() + "," + stu.get().getScore());
		
		System.out.println("5. list score 값의 최소값 출력 Colletors.minBy");
		stu = list.stream().collect(Collectors.minBy(Comparator.comparingInt(s -> s.getScore())));
		System.out.println("점수가 가장 낮은 학생 : " + stu.get().getName() + "," + stu.get().getScore());
		System.out.println("6. list 학생의 이름 출력하기");
		list.stream().map(Student2::getName).forEach(s -> System.out.print(s + ", "));
		System.out.println();
		/*
		 * String Collectors.joining(부분자, 시작삽입, 끝삽입)
		 * Stream의 요소를 연결하여 문자열 리턴
		 */
		String names = list.stream().map(Student2::getName)
				.collect(Collectors.joining(",", "[", "]"));
		System.out.println(names);
		
		
	}
}