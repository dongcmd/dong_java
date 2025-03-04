package ex11_group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dp.Student2;
import dp.Student2.City;
import dp.Student2.Gender;

public class Ex01_Group {
	public static void main(String[] args) {
		List<Student2> list = Arrays.asList(
				new Student2("가", 100, Student2.Gender.MALE, City.Seoul),
				new Student2("나", 77, Student2.Gender.FEMALE, City.Seoul),
				new Student2("다", 52, Student2.Gender.MALE, City.Pusan),
				new Student2("라", 80, Student2.Gender.FEMALE, City.Pusan) );
		// 성별의 평균점수
		
		Stream<Student2> males = list.stream().filter(s -> s.getGender().equals(Gender.MALE));
		
		double mAvg = males.mapToInt(s -> s.getScore()).average().getAsDouble() ;
		double fAvg = list.stream().filter(s -> s.getGender().equals(Gender.FEMALE))
				.mapToDouble(s -> s.getScore()).average().getAsDouble();
		System.out.println("남평 : " + mAvg);
		System.out.println("여평 : " + fAvg);

		// groupingBy(그룹 기준컬럼, 값)
		// averagingDouble(Student2::getScore) : score 값의 평균
		Map<Student2.Gender, Double> map1 = list.stream()
				.collect(Collectors.groupingBy(
						Student2::getGender, Collectors.averagingDouble(Student2::getScore)));
		
		System.out.println(map1);
		
		// 도시별 이름 출력
		System.out.print("서울 : ");
		list.stream().filter(s -> s.getCity()
				.equals(City.Seoul)).forEach(s -> System.out.print(s.getName() + ", "));
		System.out.println();
		System.out.print("부산 : ");
		list.stream().filter(s -> s.getCity()
				.equals(City.Pusan)).map(s -> s.getName()).forEach(s -> System.out.print(s+ ", "));
		System.out.println();
		
		
		Map<City, String> map2 = list.stream()
			.collect( // Collector 객체로 만드는 메서드
					Collectors.groupingBy(Student2::getCity, Collectors.mapping( // 도시 구분컬럼 K
						Student2::getName, Collectors.joining(",")
//						mapping(Student2::getName, Collectors.joining(","))
//						getName 데이터들을 변환 => 데이터 선택 | Collectors.joining(",") => 선택된 데이터를 수집
								)
						)
				);
		
		System.out.println(map2);
		
	}
}
