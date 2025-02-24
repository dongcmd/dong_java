package ex01_list;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
 * List 정렬하기
 *  - Collections.sort(List<Comparable>)
 *  - List 객체를 정렬하기 위해선, 요소 객체가 Comparable interface 구현 객체여야 함.
 *  
 *  Comparable<T> 인터페이스는 Functional Interface
 *  			클래스로 구현해서, 클래스의 기본 정렬방식을 설정할 때 사용
 *  	추상메서드 : int CompareTo(T t)
 *  			결과 : - 현재 객체 앞
 *  				 : + 현재 객체 뒤
 *  Comparator<T> 인터페이스는 Functional Interface
 *  			정렬 실행시 동적으로 정렬 방식을 설정할 때 사용
 *  	추상메서드 : int compare(T t1, T t2)
 *  			결과 : - 현재 객체 앞
 *  				 : + 현재 객체 뒤
 */
class Data implements Comparable<Data>{
	int value;
	Data(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value+"";
	}

	@Override
	public int compareTo(Data d) {
		return value - d.value;
	}
}
class Data2 {
	int value;
	Data2(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value+"";
	}
}
public class ListEx03 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");list.add("c");list.add("d");
		list.add("b");list.add("f");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data(1));list2.add(new Data(3));list2.add(new Data(5));
		list2.add(new Data(2));list2.add(new Data(4));
		System.out.println(list2);
		
		Collections.sort(list2);
		System.out.println(list2);
		
		Collections.sort(list2, Comparator.reverseOrder());
		System.out.println(list2);
		
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(1));list3.add(new Data2(3));list3.add(new Data2(5));
		list3.add(new Data2(2));list3.add(new Data2(4));
		System.out.println(list3);
		
//		Collections.sort(list3, new Comparator<Data2>() {
//			@Override
//			public int compare(Data2 d1, Data2 d2) {
//				return d1.value - d2.value; 
//			}
//		});
		// 람다 방식
		Collections.sort(list3, (d1, d2) -> d1.value - d2.value );
		System.out.println(list3);
		
		Comparator<Data2> f = (d1, d2) -> d2.value - d1.value; // 역순
		Collections.sort(list3
				, ( Comparator<Data2> ) (d1, d2) -> d2.value - d1.value);
//		Collections.sort(list3, f);
		System.out.println(list3);
		
	}

}
