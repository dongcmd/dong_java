package ex06_sort;

import java.util.Arrays;
import java.util.List;

import dp.Student;
/*
 * Student 클래스의 기본 정렬방식 구현 : 이름 순
 * sorted(Comparator) : Comparator 객체가 구현한 형태로 정렬함.  
 */
public class SortedEx02 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 1, 89, 56, 66),
				new Student("김삿갓", 1, 85, 56, 80),
				new Student("이몽룡", 2, 90, 78, 95),
				new Student("임꺽정", 3, 60, 56, 88) );
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("총점 순으로 정렬");
		list.stream().sorted(
				(s1, s2) -> s2.getSum() - s1.getSum()
				).forEach(System.out::println);
		
	}

}
