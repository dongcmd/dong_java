package ex01_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
 * Vector class
 *  - Collection 프레임워크 이전의 클래스
 *  - List의 구현클래스
 *  - 이전의 메서드와 혼합되어 있음
 *  
 */
public class ListEx02 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
//		List<Double> list = new Vector<>();
		list.add(0.3);list.add(Math.PI);
		list.addElement(5.0); // 구버전 메서드. add()와 동일.
		System.out.println("list 목록 : " + list);
		
		//요소 위치찾기
		int index = list.indexOf(5.0);
		System.out.println("5.0의 위치 : " + index);
		System.out.println("3.0의 위치 : " + list.indexOf(3.0));
		
		//요소 존재 여부
		if(list.contains(5.0)) {
			System.out.println("5.0는 list의 요소");
		} else {
			System.out.println("5.0은 list의 요소가 아님");
		}
		
		//요소를 제거
		System.out.println("list의 크기 : " + list.size());
//		list.remove(0); // remove(int n) : n번 인덱스의 요소 제거
		list.remove(5.0); // remove(Object o) : 객체 o 제거
		System.out.println("list 목록 : " + list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) list2.add(i+1);
		System.out.println("list2 목록 : " + list2);
//		int num = 1; // 1번 인덱스 제거. int 
		Integer num = 1; // 객체 1 제거. Integer은 int타입이 아님. Object의 하위클래스
		list2.remove(num);
		System.out.println("list2 목록 : " + list2);
		
		
		
		
		
		
	}

}
