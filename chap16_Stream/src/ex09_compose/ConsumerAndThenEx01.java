package ex09_compose;

import java.util.function.Consumer;

import dp.Member;
/*
 * Consumer : void accept(T) 매개변수 T, 리턴타입 없음
 * 				default 메서드 andThen()
 * andThen() : 순차적으로 연결해 실행 가능한 메서드
 * 
 * default 메서드 (인터페이스의 멤버) : 구현부 존재. 인스턴스 메서드
 */
public class ConsumerAndThenEx01 {
	public static void main(String[] args) {
		Consumer<Member> ConsumerA = m -> {
			System.out.println("consumerA : " + m.getName()); };
		ConsumerA.accept(new Member("홍길동", "hong", null));
		
		Consumer<Member> ConsumerB = m -> {
			System.out.println("consumerB : " + m.getId()); };
			ConsumerB.accept(new Member("홍길동", "hong", null));
			System.out.println("===============");
			Consumer<Member> consumerAB = ConsumerA
					.andThen(ConsumerB)
					.andThen(ConsumerB)
					.andThen(ConsumerB)
					.andThen(ConsumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
		
	}

}
