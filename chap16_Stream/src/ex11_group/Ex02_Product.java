package ex11_group;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

import dp.Car;


public class Ex02_Product {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		// 월별 판매 현황을 Map 객체로 생성
		Map<Integer, Long> map = br.lines()
			.map(s -> {	 // Stream<String> => Stream<Car>
				String[] arr = s.split(",");
				String tmp;
				try { tmp = arr[4];
				} catch (ArrayIndexOutOfBoundsException e) {
					tmp = "";
				}
				return new Car(Integer.parseInt(arr[0]), // int month 월
						Integer.parseInt(arr[1]), 		 // int con 상태( 1생산 2판매 3반품)
						arr[2], Integer.parseInt(arr[3]),// String car 이름
						tmp);							 // String remark 반품사유
			}) // Stream<Car> 로 리턴
			.filter(s -> s.getCon() == 2)
			.collect(
					Collectors.groupingBy(
							Car::getMonth, Collectors.summingLong(Car::getQty)
					)
			);
		System.out.println(map);
		
		map.entrySet().stream().map( s -> {
			String tmp = s.getKey() + "";
			if(s.getKey() < 10) tmp = "0" + tmp;
			return (tmp + "월 판매 수량 : " + s.getValue());
			}).sorted().forEach(s -> System.out.println(s));
	}
}