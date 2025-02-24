package ex01_list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/*
 * Collection interface : 객체를 여러개 저장할 수 있는 객체
 * 
 * List interface : Collection interface 의 하위 interface
 * 					객체들을 저장할 때 저장된 순서를 유지 => 배열처럼 index(첨자) 사용 가능
 * 			구현클래스 : ArrayList, Vector, LinkedList 등
 * 							- Vector : Collection 프레임워크 이전의 class.
 * 										Collection 프레임워크의 함수와 기존 사용하던 함수가 혼합.
 * Set interface  : Collection interface 의 하위 interface
 *					객체들을 중복해서 저장하지 않음
 *			구현클래스 : HashSet, TreeSet, LinkedHashSet 등
 */
public class ListEx01 {
	public static void main(String[] args) {
		/*
		 * <Integer> : Generic. 요소의 자료형을 미리 설정. 자료형이 다른 경우 컴파일 오류 발생
		 */
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);
		list.add(3);
		System.out.println(list + "기존");
		// index 사용 가능
		for(int i = 0; i < list.size(); i++) {
			System.out.print(i + " : " + list.get(i) + "|\t");
		}
		System.out.println();
		
		// 정렬하기
		// Collection <= interface
		// Collections <= class. Collection 객체의 기능을 보조하는 클래스. (s가 붙는다. Arrays 처럼 기능 보조)
		Collections.sort(list);
		System.out.println(list + "정렬");
		for(int i = 0; i < list.size(); i++) {
			System.out.print(i + " : " + list.get(i) + "|\t");
		}
		System.out.println();
		
		Collections.sort(list, Collections.reverseOrder()); // 내림차순 정렬
		System.out.println(list + "역정렬");
		Collections.shuffle(list); // 요소 순서 임의로 섞기
		System.out.println(list + "랜덤");
		System.out.println("1 - 3 index 객체 조회" + list.subList(1, 4));
		
		List<Integer> list2 = list.subList(1,4);
		System.out.println(list2);
		list2.add(100);
		System.out.println(list);
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>(list.subList(1,4));
		System.out.println(list3);
		list3.add(200);
		System.out.println(list);
		System.out.println(list3);
		
	}
}