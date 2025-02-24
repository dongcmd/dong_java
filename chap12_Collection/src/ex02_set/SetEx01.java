package ex02_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Set 인터페이스 : "중복 객체 저장 불가"
 * 
 *  boolean add(Object) : true - 객체 추가 성공 / false - 객체 추가 실패
 *  
 *  index 없음. 즉 index로 객체 조회 불가
 *  
 *  구현클래스
 *  	HashSet : 순서모름
 *  	TreeSet : 정렬가능
 *  	LinkedHashSet : 순서 유지
 */
public class SetEx01 {
	public static void main(String[] args) {
		Object[] arr = { "홍길동", 1, "1", "김삿갓", "이몽룡", "홍길동", "성춘향", "향단이", "홍길동", "김삿갓" };
//		Set<Object> set1 = new HashSet<>();
		Set<Object> set1 = new LinkedHashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		
		for(int i = 0; i < arr.length; i++) {
			if( !set1.add(arr[i]) ) {
				if( !set2.add(arr[i]) ) {
					set3.add(arr[i]);
				}	
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		// forEach(향상된 for) 구문으로 조회 가능
		for(Object o : set1) System.out.print(o +",");
		System.out.println();
		for(Object o : set2) System.out.print(o +",");
		System.out.println();
		for(Object o : set3) System.out.print(o +",");
		System.out.println();
	}
}
