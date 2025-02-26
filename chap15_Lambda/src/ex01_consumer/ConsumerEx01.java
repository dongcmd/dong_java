package ex01_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/*
 * java API 에서 제공되는 인터페이스
 *  - java.util.function 패키지에 속한 인터페이스
 *  - 람다를 이용하기 위한 인터페이스(함수적 인터페이스 = FunctionalInterface)
 *  
 *  Consumer 인터페이스
 *   void accept(T t) : 매개변수가 있고 리턴값은 없는 메서드
 *   
 *   Consumer<T> : void accept(T t)
 *   BiConsumer<T, U> void accept(T t, U u)
 *   IntConsumer : void accept(int i)
 *   LongConsumer : void accept(long l)
 *   DoubleConsumer : void accept(double d)
 *   ObjIntConsumer : void accept(T t, int i)
 *   ObjLongConsumer : void accept(T t, long l)
 *   ObjDoubleConsumer : void accept(T t, double d)
 */
public class ConsumerEx01 {
	public static void main(String[] args) {
		Consumer<String> c1 = t -> System.out.println(t+8);
		c1.accept("Java");
		BiConsumer<String, String> c2 = (t, u) -> System.out.println(t+u);
		c2.accept("Java", "8.0");
		IntConsumer c3 = t -> System.out.println(t * 100);
		c3.accept(10);
		c3 = t -> {
			long sum = 0;
			for(int i =1; i<=t; i++) sum +=i;
			System.out.println("1~"+t+"까지의 합 : "+ sum);
		};
		c3.accept(100);
	}
}