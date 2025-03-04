package ex10_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dp.Student;
/*
 * collect(Collector 인터페이스) : Collection 객체로 변경
 * Collectors 클래스 : Collector 인터페이스 구현 클래스
 * 		toList() : List 객체로 변경
 */
public class Ex02_Collect {
	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("신창섭", 3, 34, 55 ,80),
				new Student("쌀숭이", 1, 60, 45 ,90),
				new Student("리선족", 3, 84, 95 ,60),
				new Student("메벤남", 3, 75, 85 ,70),
				new Student("리더지", 3, 65, 65 ,90),
				new Student("헬선족", 3, 60, 85 ,50),
				new Student("리슨족", 3, 44, 75 ,60) };
		System.out.println("1. 학생 이름만 뽑아 List<String>에 저장");
		// Stream<Student> Stream.of(stuArr)
		// map(Student::getName) : Stream<Student> => Stream<String> 
		List<String> names = Stream.of(stuArr)
				.map(Student::getName) //이름들만 Stream 객체로 생성
				.collect(Collectors.toList());
		System.out.println(names);
		
		System.out.println("2. 학생 이름만 뽑아 String[]에 저장");
		String[] arrnames = Stream.of(stuArr)
				.map(Student::getName)
				.toArray(String[]::new);
		System.out.println(Arrays.asList(arrnames));
		
		System.out.println("3. Map<String, Student>로 변환. key는 name");
		Map<String, Student> map = Stream.of(stuArr)
//			s : Student
//			s.getName() : K |  s : V
//			Function<? super Student, ? extends String> keyMapper
//											: Student 입력받아 String 리턴
//			,Function<? super Student, ? extends Student> valueMapper
//											: Student 입력받아 Student 리턴
				.collect(Collectors.toMap(s -> s.getName(), s -> s) );
		for(String name : map.keySet()) {
			System.out.println(name + " : " + map.get(name));
		}
		System.out.println("4. Stream의 요소 갯수 출력");
		long cnt = Stream.of(stuArr).count();
		System.out.println("요소의 갯수 : " + cnt);
		cnt = Stream.of(stuArr).collect(Collectors.counting());
		System.out.println("요소의 갯수 : " + cnt);
	}
}
