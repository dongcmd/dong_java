package ex04_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Student {
	String name;
	int eng;
	int math;
	public Student(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
public class Exam01 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90, 80),
						new Student("김삿갓", 95, 80),
						new Student("이몽룡", 95, 80));
		// Stream을 이용해, 영어/수학/전체점수 합 출력
		IntStream isr = list.stream().mapToInt(s -> s.eng);
		System.out.println("영어 합 " + isr.sum());
		System.out.println("수학 합 " + list.stream().mapToInt(s -> s.math).sum());
		System.out.println("전체 점수 합 : " + list.stream().mapToInt(s -> s.math + s.eng).sum());
		
		//메서드 참조 방식
		System.out.println("수학 합 " + list.stream().mapToInt(Student::getMath).sum());
		
		System.out.println("영어 평균 : " + list.stream().mapToInt(Student::getEng).average().getAsDouble());
		System.out.println("수학 평균 : " + list.stream().mapToInt(Student::getMath).average().getAsDouble());
				
	}

}
