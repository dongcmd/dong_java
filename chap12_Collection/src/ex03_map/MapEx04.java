package ex03_map;

import java.util.HashMap;
import java.util.Hashtable;

/*
 * Map 구현 클래스
 * HashMap : (K, V) 쌍 객체. 순서 모름
 * TreeMap : (K, V) 쌍 객체. K값으로 정렬
 * Hashtable : (K, V) 쌍 객체. 순서 모름. 구버전 클래스. 메서드가 동기화 되었다.
 * 					동기화 : 스레드에 대해 safe 하다
 */
public class MapEx04 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("학생", "student");
		map.put("선생", "teacher");
		map.put(null , "null");
		System.out.println(map);

		Hashtable<String, String> map2 = new Hashtable<>();
		map2.put("학생", "student");
		map2.put("선생", "teacher");
//		map.put(null , "null");  // Hashtable 객체에서는 null을 K로 사용 불가.
		System.out.println(map2);
	}

}
