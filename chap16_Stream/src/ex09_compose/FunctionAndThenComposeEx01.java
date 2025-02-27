package ex09_compose;

import java.util.function.Function;

import dp.Address;
import dp.Member;
/*
 * Function<T, R> : R apply(T) : T타입을 입력 받아 R을 리턴
 * andThen() : default 메서드. 순차적 연결 실행 / A 리턴값을 B로 전달
 * compose() : default 메서드. 매개변수부터 실행 / A 리턴값을 B로 전달
 */
public class FunctionAndThenComposeEx01 {
	public static void main(String[] args) {
		Function<Member, Address> functionA; // Address accept(Member)
		Function<Address, String> functionB; // String accept(Address)
		Function<Member, String> functionAB; // String accept(Member)
		String city;
		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울")) );
		System.out.println("andThen ->> 거주 도시 : " + city);
		System.out.println();
		
		functionAB = functionB.compose(functionA);
		
		city = functionAB.apply(
				new Member("홍길동", "hong", new Address("한국", "서울")) );
		System.out.println("compose ->> 거주 도시 : " + city);
	}
}
