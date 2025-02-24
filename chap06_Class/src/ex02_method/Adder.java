package ex02_method;

/*
 * member method
 * 
 * 구성 요소
 * [접근 제어자] [제어자] 타입 메서드이름(매개변수) > 선언부
 * { } 												> 구현부 (알고리즘)
 */
public class Adder {
	int add1(int a, int b) {
		return a+b;
	}

	long add2(int a, int b) {
		return a+b;
	}
	
	void add3(int a, int b) {
		System.out.println(a+b);
	}

}
