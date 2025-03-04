package ex10_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dp.Student;

/*
 * reducing()
 */
public class Ex03_Collect {
	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("신창섭", 3, 34, 55 ,80),
				new Student("쌀숭이", 1, 60, 45 ,90),
				new Student("리선족", 3, 84, 95 ,60),
				new Student("메벤남", 3, 75, 85 ,70),
				new Student("리더지", 3, 65, 65 ,90),
				new Student("헬선족", 3, 60, 85 ,50),
				new Student("리슨족", 3, 44, 75 ,60) };
		System.out.println("1, eng 점수의 합 Collectors.reduing()");
		/*
		 * Collectors.reducing(10000, Student::getEng, Integer::sum)
		 *  10000 : 초기값
		 *  Student::getEng : 선택 컬럼
		 *  Integer::sum : 함수
		 */
		int engTotal = Stream.of(stuArr)
				.collect(Collectors.reducing(10000, Student::getEng, Integer::sum));
		System.out.println(engTotal);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		// BinaryOperator로 숫자를 더하는 연산을 정의
		Optional<Integer> sum = numbers.stream()
				.collect(Collectors.reducing( (a, b) -> a + b));
		// Optional : 값이 없을 수 있음. (값이 없다면 일단 보류)
		// ifPresent : 값이 있다면
		sum.ifPresent(System.out::println);
		
		numbers = Arrays.asList();
		Optional<Integer> sum2 = numbers.stream()
				.collect(Collectors.reducing( (a, b) -> a + b));
		sum2.ifPresent(System.out::println);
	}
}