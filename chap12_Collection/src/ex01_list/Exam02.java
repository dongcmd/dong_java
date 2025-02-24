package ex01_list;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 * Name 클래스 구현
 * 기본 정렬 방식, 한글이름으로 설정
 * 멤버 변수 String kor, String eng;
 * 생성자 : 구동클래스에 맞춰 설정
 * 멤버 메서드 toString() 구현하기
 * 
 * [결과]
 * [김:kim, 박:park, ...]
 */
class Name implements Comparable<Name> {
	String kor, eng;
	Name(String kor, String eng) {
		this.kor = kor;
		this.eng = eng;
	}
	@Override public String toString() {
		return kor + ":" + eng;
	}
	@Override
	public int compareTo(Name other) {
		return this.kor.compareTo(other.kor);
	}
}
public class Exam02 {
	public static void main(String[] args) {
		List<Name> list = new ArrayList<>();
		list.add(new Name("김", "Kim"));list.add(new Name("이", "Lee"));
		list.add(new Name("박", "Park"));list.add(new Name("최", "Choi"));
		list.add(new Name("안", "An"));
		
		System.out.println(list);
		Collections.sort(list); // 한글이름 순으로 정렬
		System.out.println(list);
		
		System.out.println("영문 기준 정렬");
//		Collections.sort(list, new Comparator<Name>() {
//			@Override
//			public int compare(Name n1, Name n2) {
//				return n1.eng.compareTo(n2.eng);
//			}
//		}); // 영문이름 순으로 정렬
		Collections.sort(list, (n1, n2) -> n1.eng.compareTo(n2.eng) );
		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder()); // 한글 역순
		System.out.println(list);
		
		Collections.sort(list, (n1, n2) -> -(n1.eng.compareTo(n2.eng))); // 영어 역순
		System.out.println(list);
	}
}
