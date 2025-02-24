package ex02_set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
/*
 * Student 클래스 구현
 * 1. 멤버변수 studno, name, major
 * 2. 멤버메서드 : 학생정보 출력하도록 toString()
 * 				comepareTo() 기본정렬방식이 학번 순
 * 				이름과 학번이 같으면 같은 학생으로 인식
 * 3. 생성자 : 구동클래스에 맞도록 설정
 * 					
 */
class Student implements Comparable<Student> {
	int studno;
	String name, major;
	
	Student(int studno, String name, String major) {
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public String toString() {
		return String.format("(%d, %s, %s)\n", studno, name, major);
	}
	@Override
	public int compareTo(Student other) {
		Student s = (Student) other;
		return -(this.studno - s.studno);
	}
	@Override
	public boolean equals(Object other) {
		if (other instanceof Student) {
			Student s = (Student) other;
			return this.studno == s.studno && this.name.equals(s.name);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.studno;
	}
	
}
public class Exam01 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "홍길동", "경영"));
		set.add(new Student(2, "홍길순", "경영"));
		set.add(new Student(2, "홍길순", "컴공"));
		set.add(new Student(1, "홍길동", "통계"));
		set.add(new Student(3, "홍길동", "컴공"));
		System.out.println(set);
		List<Student> list = new ArrayList<Student>(set); 
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
