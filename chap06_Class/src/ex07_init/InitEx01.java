package ex07_init;
/*
 * 초기화 블럭 예제
 * static 초기화 블럭 : 클래스 변수의 초기화 담당
 * 						클래스 정보 로드시 한번만 실행 / 구동 메서드보다 먼저 실행
 * 
 * 인스턴스 초기화 블럭 : 인스턴스 변수의 초기화 담당. 생성자와 기능이 겹침
 * 							객체화시 생성자 호출 전 실행
 * 
 * 추상화 : 클래스 생성의 과정 / 클래스는 사용자 정의 자료형
 * 		variation(필드) 변수(속성, 명사적 특징)
 * 			클래스 변수(static)		: 클래스 정보 로드시 메모리 할당. 모든 객체의 공유 변수
 * 			인스턴스 변수(객체변수) : 객체화시 메모리 할당. 객체별로 다른 메모리 영역 할당
 * 
 * 		method 메서드(기능, 동사적 특징)
 * 			클래스 메서드(static) : 클래스 정보 로드시 메서드 실행 준비 완료.
 * 			인스턴스 메서드 	  : 객체화시 메서드 실행 준비 완료.
 * 
 * 		멤버란 변수(필드), 메서드(생성자 포함)를 통칭.
 * 
 * 		생성자 : 객체화시 호출되는 인스턴스 메서드(instance method).
 * 
 * 		this : 자기 참조 변수. 인스턴스 메서드에서만 사용 가능.
 * 		this() : 생성자. 같은 클래스 내의 다른 생성자 호출시 사용.
 * 
 * 		오버로딩 : 같은 클래스 내, 이름은 같고, 매개변수가 다른 메서드가 여러개 존재 가능.
 * 				   메서드의 다형성.
 * 
 * 상속   : 
 * 캡슐화 : 
 * 다형성 : 
 * 
 * 
 * 
 * 
 */
public class InitEx01 {
	static int cv;
	int iv;
	
	InitEx01() { System.out.println("5. 생성자 호출됨\n"); }
	
	static { cv = (int) (Math.random() * 100); System.out.println("1. static 초기화 블럭 실행 : cv = " + cv); }
	
	{ iv = (int) (Math.random() * 100); System.out.println("4. 인스턴스 초기화 블럭 실행 : iv = " + iv); }
	
	public static void main(String[] args) {
		System.out.println("2. main 메서드 시작");
		System.out.println("3. main 메서드 init1 객체 생성");
		InitEx01 init1 = new InitEx01();
		
		System.out.println("3. main 메서드 init2 객체 생성");
		InitEx01 init2 = new InitEx01();
		
		System.out.println("cv : " + cv);
		System.out.println("init1.iv : " + init1.iv);
		System.out.println("init2.iv : " + init2.iv);
				
	}
}
