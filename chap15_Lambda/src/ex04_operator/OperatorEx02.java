package ex04_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class Student {
	private String name;
	private int eng;
	private int math;
	public Student(String name, int eng, int math) {
		super();
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
	public int getSum() {
		return eng + math;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", eng=" + eng + ", math=" + math + "]";
	}
	
}
public class OperatorEx02 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), // 186
										   new Student("김삿갓", 85, 93), // 178
										   new Student("이몽룡", 100, 90)); // 190
		System.out.println("영어 최고점 : " + minOrMax(list, (a,b) -> a.getEng() > b.getEng() ? a : b));
		System.out.println("수학 최고점 : " + minOrMax(list, (a,b) -> a.getMath() > b.getMath() ? a : b));
		System.out.println("영어 최저점 lowest : " + minOrMax(list, (a,b) -> a.getEng() < b.getEng() ? a : b));
		System.out.println("수학 최저점 lowest : " + minOrMax(list, (a,b) -> a.getMath() < b.getMath() ? a : b));
		System.out.println("합계 최고점 total highest : " + minOrMax(list, (a, b) -> a.getSum() > b.getSum() ? a : b));
		System.out.println("합계 최저점 total lowest : " + minOrMax(list, (a, b) -> a.getSum() < b.getSum() ? a : b));
		
		
	}

	private static Student minOrMax(List<Student> list, BinaryOperator<Student> f) {
		Student result = list.get(0);
		for(Student s : list) {
			result = f.apply(result, s);
		}
		return result;
	}

}
