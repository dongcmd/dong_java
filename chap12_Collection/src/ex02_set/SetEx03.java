package ex02_set;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet 예제 : (Set이니)중복불가. (Tree이니)정렬됨
 * SortedSet의 구현 클래스
 * SortedSet은 Set의 하위 클래스(인터페이스)
 */
public class SetEx03 {
	public static void main(String[] args) {
//		Set<String> set = new TreeSet<>();
		SortedSet<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc");set.add("alien");set.add("bat");set.add("azz");
		set.add("car");set.add("Car");set.add("disk");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");set.add("elev");set.add("fan");set.add("flower");
		SortedSet<String> set2 = set;
		
		System.out.println(set);
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to+"zzzz"));
		
		//내림차순 정렬하기
		System.out.println(set2.reversed());
		
		SortedSet<String> set2_2 = new TreeSet<>(Comparator.reverseOrder());
		set2_2.add("abc");set2_2.add("alien");set2_2.add("bat");set2_2.add("azz");
		set2_2.add("car");set2_2.add("Car");set2_2.add("disk");set2_2.add("dance");
		set2_2.add("dzzzz");set2_2.add("dZZZZ");set2_2.add("elev");set2_2.add("fan");set2_2.add("flower");
		System.out.println(set2_2);
		
		//대소문자 구분없이 (정렬되게)객체 생성
		SortedSet<String> set3 = new TreeSet<>( (s1, s2) -> s1.compareToIgnoreCase(s2) );
		set3.add("abc");set3.add("alien");set3.add("bat");set3.add("azz");
		set3.add("car");set3.add("Car");set3.add("disk");set3.add("dance");
		set3.add("dzzzz");set3.add("dZZZZ");set3.add("elev");set3.add("fan");set3.add("flower");
		System.out.println(set3);
			
		
		
		
	}
}