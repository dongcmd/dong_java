package ex04_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * product.txt 생성 예정
 * 
 */
class Car {
	private int month;
	private int con;
	private String car;
	private int qty;
	private String remark;
	public Car() {
		
	}
	public Car(int month, int con, String car, int qty, String remark) {
		super();
		this.month = month;
		this.con = con;
		this.car = car;
		this.qty = qty;
		this.remark = remark;
	}
	public int getMonth() {
		return month;
	}
	public int getCon() {
		return con;
	}
	public String getCar() {
		return car;
	}
	public int getQty() {
		return qty;
	}
	public String getRemark() {
		return remark;
	}
	@Override
	public String toString() {
		return "Car [month=" + month + ", con=" + con + ", car=" + car
				+ ", qty=" + qty + ", remark=" + remark + "]";
	}
	
}
public class MapEx02_product {
	static String carName = "BMW";
	static int con = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		// Stream<String> br.lines() : br의 내용을 한 줄씩 Stream으로 생성 (현재는 txt파일)
		/*
		 * int month : 생산월
		 * int con : 상태 (1 : 생산, 2 : 판매, 3 : 반품)
		 * String car : 제품명
		 * int qty : 수량
		 * String remark : 반품 사유. con값이 3인 경우만 존재.
		 */
		/*
		 * map(Fuction<String, car>) => Stream<String> 을 Stream<Car> 로 변경
		 *						   0	1	  2		3	  4 */
		br.lines().map( s -> { // "4", "3", "BMW", "4", "몰라요"
			String[] str = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			} catch(ArrayIndexOutOfBoundsException e) {
				temp = ""; }
			return new Car(Integer.parseInt(str[0]), // Car(int month, int con, String car, int qty, String remark)
					Integer.parseInt(str[1]), str[2],
					Integer.parseInt(str[3]), temp);
		})
		.filter( s -> s.getCar().equals(carName) && s.getCon() == con)
		.forEach( s -> System.out.println(s));
		br.close();
	}
}