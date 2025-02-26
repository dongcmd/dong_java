package ex03_function;

import java.util.function.Function;
import java.util.function.ToIntFunction;
/*
 * Function 계열 인터페이스
 *  R apply(T t) : 매개변수 존재, 리턴값 존재
 *  
 *  Function<T, R> : R apply(T t)
 *  BiFunction<T, U, R> : R apply(T t, U u)
 *  IntFunction<R> : R apply(int)
 *  DoubleFunction<R> : R apply(double)
 *  ToIntFunction<T> : int apllyAsInt(T t)
 *  ToDoubleFunction<T> : double apllyAsDouble(T t)
 */
class Student { // Bean 클래스
	private String name;
	private int eng;
	private int math;
	private String major;
	
	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	// getter : 멤버 변수의 값을 리턴 - String getName() => name Get프로퍼티(property)
	// seeter : 멤버 변수의 값을 저장 - void setName(String name) => name Set프로퍼티(property)

	public String getName() {
		return name;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public String getMajor() {
		return major;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
}
public class FunctionEx01 {
	private static Student[] list = {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
	};
	public static void main(String[] args) {
		System.out.print("학생의 이름 : ");
		for(Student s : list) {
			System.out.print(s.getName()+", ");
		}
		
		System.out.println();
		System.out.print("학생의 이름 : ");
		Function<Student, String> f1 = s -> s.getName();
		for(Student s : list) {
			System.out.print(f1.apply(s) + ", ");
		}
		
		System.out.println();
		System.out.print("학생의 이름 : ");
		printString(s -> s.getName());

		System.out.println();
		System.out.print("학생 전공명 : ");
		printString(s -> s.getMajor());
		
		System.out.println();
		System.out.print("학생의 영어 : ");
		printInt(s -> s.getEng());
		
		System.out.println();
		System.out.print("학생의 수학 : ");
		printInt(s -> s.getMath());
		
		System.out.println();
		System.out.print("학생이름(영어점수) : ");
		Function<Student, String> f2 = s -> s.getName() + "(" + s.getEng() +")";
		for(Student s : list) {
			System.out.print(f2.apply(s) + ", ");
		}
		
		System.out.println();
		System.out.print("학생이름(수학점수) : ");
		printString(s -> s.getName()+"(" + s.getMath() +")");
	}
	static void printInt(ToIntFunction<Student> f) {
		for(Student s : list) {
			System.out.print(f.applyAsInt(s) + ", ");
		}
	}
	static void printString(Function<Student, String> f) {
		for(Student s : list) {
			System.out.print(f.apply(s) + ", ");
		}
	}
}