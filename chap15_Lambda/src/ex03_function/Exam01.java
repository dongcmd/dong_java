package ex03_function;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * FunctionEx01.Student 클래스를 이용해, 영어 점수 합과 수학점수 합 출력 
 */
public class Exam01 {
	private static Student[] list = {
			new Student("홍길동", 91, 84, "경영"),
			new Student("김삿갓", 91, 76, "컴공"),
			new Student("이몽룡", 81, 72, "통계")
	};
	public static void main(String[] args) {
		System.out.print("학생들의 영어 점수 합계 : ");
		printTot(s -> s.getEng());
		
		System.out.print("학생들의 수학 점수 합계 : ");
		printTot(s -> s.getMath());
		
		System.out.println("학생들의 영어 점수 합계 : " + getTot(s -> s.getEng()));
		System.out.println("학생들의 수학 점수 합계 : " + getTot(s -> s.getMath()));
		System.out.println("학생들의 영어 점수 평균 avg : " + getAvg(s -> s.getEng())); // 소수점도 출력
		System.out.println("학생들의 수학 점수 평균 avg : " + getAvg(s -> s.getMath()));
	}
	private static double getAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for(Student s: list) sum += f.applyAsDouble(s);
		return sum/list.length;
	}
	private static int getTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s: list) sum += f.applyAsInt(s);
		return sum;
	}
	private static void printTot(ToIntFunction<Student> f1) {
		int sum = 0;
		for(Student s : list) {
			sum += f1.applyAsInt(s);
		}
		System.out.println(sum);
	}

}
