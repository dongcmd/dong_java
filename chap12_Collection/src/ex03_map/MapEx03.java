package ex03_map;
/*
 * TreeMap : key 기준으로 정렬됨
 */

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.SortedMap;

public class MapEx03 {
	public static void main(String[] args) {
		TreeMap<String, Book> books = new TreeMap<>();
		books.put("홍길동전", new Book("홍길동전", "허균", 10000));
		books.put("춘향전", new Book("춘향전", "미상", 7000));
		books.put("구운몽", new Book("구운몽", "김만중", 5000));
		books.put("가", new Book("가", "가", 5000));
		books.put("나", new Book("나", "나", 5000));
		System.out.println(books);
		System.out.println("1st key : " + books.firstKey()); // 구운몽
		System.out.println("1st entry : " + books.firstEntry());
		System.out.println("last key : " + books.lastKey()); // 홍길동
		System.out.println("last entry : " + books.lastEntry());
		System.out.println();
		//lowerEntry("춘향전") : 춘향전 직전 객체 exclusive
		System.out.println("lowerEntry : "+ books.lowerEntry("춘향전"));

		//higherEntry("춘향전") : 춘향전 직후 객체 exclusive
		System.out.println("higherEntry : "+ books.higherEntry("춘향전"));
		
		//floorEntry("춘향전") : 춘향전 까지 중 가장 큰 객체 inclusive
		System.out.println("floowerEntry : " + books.floorEntry("춘향적"));
		
		//ceilingEntry("춘향전") 춘향전 부터 중 가장 작은 inclusive
		System.out.println("ceilingEntry : " + books.ceilingEntry("춘향적"));
		
	}

}
