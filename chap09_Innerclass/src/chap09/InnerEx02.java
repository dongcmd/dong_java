/*
 * 내부클래스에서 외부 클래스의 private 멤버의 접근
 */
package chap09;


class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	
	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
//		static int scv = outeriv; // 클래스 멤버에서 인스턴스멤버 직접호출 불가. 객체화 필요
		static int scv = new Outer2().outeriv;
		static int scv2 = outercv;
		int siv2 = outercv;
	}
	/*
	 * "지역 내부클래스에서 사용"되는 "외부 메서드의 지역변수"는 상수화 필요.
	 * 지역변수의 변경이 없는 경우 상수로 판단
	 */
	void method(int pv) {
		int lv = 100;
		class LocalInner {
			int liv = outeriv;
			int liv2 = outercv;
			void method(int num) {
				System.out.printf("outeriv =  %d\n", ++outeriv);
				System.out.printf("outercv =  %d\n", ++outercv);
				System.out.printf("liv =  %d\n", ++liv); // 내부클래스의 변수 
				System.out.printf("liv2 =  %d\n", ++liv2); //매부클래스의 변수
				System.out.printf("num =  %d\n", ++num); // 내부메서드의 지역변수 100
				System.out.printf("pv =  %d\n", pv); // 외부메서드의 지역 변수 0
				System.out.printf("lv =  %d\n", lv); // 외부메서드의 지역 변수 100
			}
		}
		//LocalInner의 method(int num)을 호출하기
		new LocalInner().method(100);
	}
}
public class InnerEx02 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(0);
		//InstanceInner, StaticInner 내부의 멤버 출력하기
		Outer2.InstanceInner ii = out.new InstanceInner();
		System.out.println("ii의 멤버");
		System.out.printf("ii.iiv =  %d\n", ii.iiv);
		System.out.printf("ii.iiv2 =  %d\n", ii.iiv2);
		
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si의 멤버");
		System.out.printf("si.siv2 =  %d\n", si.siv2);
		System.out.printf("Outer2.StaticInner.scv =  %d\n", Outer2.StaticInner.scv);
		System.out.printf("Outer2.StaticInner.scv2 =  %d\n", Outer2.StaticInner.scv2);
		
		System.out.println("out의 멤버");
//		System.out.printf("out.outeriv =  %d\n", out.outeriv); // 접근제어자 private 멤버
//		System.out.printf("out.outercv =  %d\n", out.outercv); // 접근제어자 private 멤버
		
	}

}
