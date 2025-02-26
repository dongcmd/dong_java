package ex05_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate 인터페이스
 * 		boolean test(T) : 매개변수 있고 리턴타입 boolean
 * 
 * Predicate<T> : boolean test(T)
 * IntPredicate : boolean test(int)
 * LongPredicate : boolean test(long)
 * DoublePredicate : boolean test(double)
 */
class Student {
	private String name;
	private String gender;
	private int eng;
	private int math;
	
	public Student(String name, String gender, int eng, int math) {
		super();
		this.name = name;
		this.gender = gender;
		this.eng = eng;
		this.math = math;
	}
	public String getName() { return name; }
	public String getGender() { return gender; }
	public int getEng() { return eng; }
	public int getMath() { return math; }
	@Override // name, gender, eng, math
	public String toString() { return "[name=" + name + ", gender=" + gender + ", eng=" + eng + ", math=" + math + "]"; }
	
}
public class PredicateEx01 { 
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("ㄱ","남",70, 85),
											new Student("ㄴ","여",75, 100),
											new Student("ㄷ","남",55, 95),
											new Student("ㄹ","여",80, 95));
		System.out.println("영어 점수 60점 이상인 학생의 영어 평균 : " + avg(list , s -> s.getEng() >= 60));
		System.out.println("여학생 영어 평균 : " + avg(list, s -> s.getGender().equals("여")));
		System.out.println("남학생 영어 평균 : " + avg(list, s -> s.getGender().equals("남")));
	}
	private static double avg(List<Student> list, Predicate<Student> p) {
		double sum = 0;
		int cnt = 0;
		for(Student s : list) {
			if(p.test(s)) {
				cnt++;
				sum += s.getEng();
			}
		}
		return sum/cnt;
	}
}