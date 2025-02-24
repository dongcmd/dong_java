package ex03_map;

import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
/*
 * Map 인터페이스 : (key, value) 쌍으로 이루어진 객체의 모임
 * 		put(key, value) : Map 객체에 데이터 추가
 * 		get(key) : value 값을 리턴
 * 		Set keySet() : Map타입 객체 중 key 목록 조회
 * 		Collection values() : Map타입 객체 중 value 목록 조회
 * 		Set<Map.Entry> entrySet() : Map.Entry타입 객체 조회
 * 				Map.Entry타입 객체 : (key=value) 쌍인 객체 1개
 * 									getKey(), getValue() 가능
 * 		remove(key) : 해당 key를 가진 Set 객체 제거. 그 객체의 value 리턴
 * 
 */
public class MapEx01 {
	public static void main(String[] args) {
		String[] names = { "홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓" };
		int[] nums = { 1234,4567,2350,9870,3456 };
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println(map.get("홍길동")); // 1234
		System.out.println("map 객체(요소)의 크기" + map.size());
		
		// ketSet() : key만 조회. 리턴타입 Set
		System.out.println(map.keySet());
		Set<String> keySet = map.keySet();
		for(String k : keySet)
			System.out.println(k + " : " + map.get(k));
		
		//values() : value만 조회. 리턴타입 Collection
		//			value로 key를 알 수 없음.
		Collection<Integer> values = map.values();
		for(Integer i : values) {
			System.out.println(i);
		}
		
		//entrySet() : (key, value) 쌍 객체 조회. 리턴타입 Set
		Set< Map.Entry<String, Integer> > entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + " .. " + m.getValue());
		}
		
		Integer tel = map.remove("홍길동");
		System.out.println("제거된 홍길동의 전화번호 : " + tel);
		System.out.println("map 객체의 요소 개수 : " + map.size());
		System.out.println(map);
	}
}