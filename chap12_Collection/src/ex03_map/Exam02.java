package ex03_map;

import java.util.Comparator;
import java.util.TreeMap;

public class Exam02 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		mapPut(scores);
		System.out.println(scores);
		System.out.println("first key : " + scores.firstKey());
		System.out.println("last key : " + scores.lastKey());
		System.out.println("hieght score : " + scores.lastEntry().getValue());
		System.out.println("94 직전의 점수 : " + scores.lowerKey(94));
		System.out.println("94 직후의 점수 : " + scores.higherKey(94));		
		System.out.println("~94 중 가장 큰(정렬이 가장 앞) 점수 : " + scores.floorKey(94));		
		System.out.println("~94 중 가장 작은(정렬이 가장 뒤) 점수 : " + scores.ceilingKey(94));
		System.out.println();
		scores = new TreeMap<>(Comparator.reverseOrder());
		mapPut(scores);
		System.out.println(scores);
		System.out.println("first key : " + scores.firstKey());
		System.out.println("last key : " + scores.lastKey());
	}

	private static void mapPut(TreeMap<Integer, String> scores) {
		scores.put(87,"홍길동");
		scores.put(98,"이몽룡");
		scores.put(75,"임꺽정");
		scores.put(94,"김삿갓");
		scores.put(80,"성춘향");
		scores.put(88,"향단이");
	}

}
