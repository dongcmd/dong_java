package ex05_flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
}
public class FlatMapEx03 {
	public static void main(String[] args) {
		List<Student> list1 = Arrays.asList(
				new Student("홍길동", 10), new Student("강나라", 20),
				new Student("장일동", 30));
		List<Student> list2 = Arrays.asList(
				new Student("신창섭", 14), new Student("메벤남", 50),
				new Student("리선족", 60));
		List<List<Student>> stu = new ArrayList<>();
		stu.add(list1);
		stu.add(list2);
		stu.stream().flatMap(List::stream).forEach(System.out::println);
	}
}