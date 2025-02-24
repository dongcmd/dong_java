package chap08;


@FunctionalInterface // 함수적 인터페이스로 설정하므로 추상메서드가 1개만 있단 표시
interface LambdaInterface1 {
	void method();
//	void method2();
}
@FunctionalInterface
interface Lam {
	void m1();
	default void m2() { System.out.println("default m2"); }
}
public class LambdaEx01 {
	public static void main(String[] args) {
		LambdaInterface1 fi;
		fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("기존 내부객체로 생성");
			}
		};
		fi.method();
		System.out.println();
		
		Lam l1;
		l1 = new Lam() {
			public void m1() { System.out.println("m1"); }
//			public void m2() { System.out.println("m2"); }
		};
		
		l1 = () -> System.out.println("내부구현 m1");
		l1.m1();
		l1.m2();
		
		
		// 1. 람다방식으로 변경
		fi = () -> {
			String str = "람다방식1";
			System.out.println(str);
		};
		fi.method();
		
		//2. 람다방식 : 내부문장이 1개인 경우 {} 생략 가능
		fi = () -> System.out.println("람다방식2");
		fi.method();
		
		execute( ()-> System.out.println("execute 메서드에서 호출") );
		// execute 함수를 이용하여 1~100합 출력
		execute( () -> {
			int sum = 0;
			for(int i =  1; i <= 100; i++) { sum += i; }
			System.out.println("1~100 합 " + sum); });
		
		// execute 함수를 이용해 1~100 짝수의 합 출력
		execute( () -> {
			int sum = 0;
			for(int i = 2; i<= 100; i+= 2) { sum += i; }
			System.out.println("1~100 짝수합 " + sum);
		});
	}
	static void execute(LambdaInterface1 f) {
		f.method();
	}

}
