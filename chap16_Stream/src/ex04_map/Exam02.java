package ex04_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

/*
 * product.txt에서 그랜저의 반품(con 3) 목록 출력하기
 */
public class Exam02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src/ex04_map/product.txt"));
		Function<String, Car> f =  s -> {
			String[] str = s.split(",");
			String tmp = "";
			try { str[4] = tmp;
			} catch ( ArrayIndexOutOfBoundsException e) {
				tmp = ""; } // Car(int month, int con, String car, int qty, String remark)
			return new Car(Integer.parseInt(str[0]),
					Integer.parseInt(str[1]),
					str[2], Integer.parseInt(str[3]),tmp);
		};
		
		br.lines().map(f)
		.filter( s -> s.getCar().equals("그랜저") && s.getCon() == 3)
		.forEach(s -> System.out.println(s));
		br.close();
		
		
		// 그랜저 반품 수량 출력
		br = new BufferedReader(new FileReader("src/ex04_map/product.txt"));

		int sum = br.lines().map(f)
				.filter( s -> s.getCar().equals("그랜저") && s.getCon() == 3)
				.mapToInt(s -> s.getQty())
				.sum();
		
		System.out.println(sum);
		
		br.close();
		
	}
}
