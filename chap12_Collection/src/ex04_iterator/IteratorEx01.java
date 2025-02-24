package ex04_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Iterator 인터페이스 : 반복자
 * iterator() : Collection 객체는 Iterator 객체로 변환 가능
 * 메서드
 * boolean hasNext() : 조회할 요소가 있어? 
 * Object next()	 : 조회 대상 객체 리턴 
 * void remove()	 : 조회된 객체를 제거. next() 실행 이후 가능
 * 
 * Enumeration 인터페이스 : Iterator 이전의 반복자. Vector, Hashtable 에서만 사용 가능
 *  메서드
 *   boolean hasMoreElement()	: 조회할 요소 있어?
 *   Object nextElement()		: 조회 대상 객체 리턴
 */
public class IteratorEx01 {
	public static void main(String[] args) {
		Iterator it = null;
		List list = new ArrayList();
		Set set = new HashSet();
		for(int i = 1; i <=5; i++) {
			list.add(i+10);
			set.add(i*10);
		}
		it = list.iterator();
		print(it);
		it = set.iterator();
		print(it);
		System.out.println("print() 이후의 list" + list);
		System.out.println("print() 이후의 set" + set);
		
	}
	
	private static void print(Iterator it) {
		while(it.hasNext()) {
			System.out.print(it.next() + ", ");
			it.remove();
		}
		System.out.println();
	}
}