package ex03_method;

public class MemberCallEx01 {
	static int cv1 = 10;
	static int cv2 = cv1;
	int iv1 = 100;
	int iv2 = iv1;
	int iv3 = cv1;
//	static int cv3 = iv1;
	static int cv3 = new MemberCallEx01().iv1;
	void method1() {
		System.out.println("cv1 + cv2 = " + (cv1+cv2) );
		System.out.println("iv1 + iv2 = " + (iv1+iv2) );
	}
	
	static void method2() {
		System.out.println("cv1 + cv2 = " + (cv1+cv2) );
//		System.out.println("iv1 + iv2 = " + (iv1+iv2) );
		MemberCallEx01 m = new MemberCallEx01(); 
		System.out.println("iv1 + iv2 = " + (m.iv1+m.iv2) );
	}
	
	void method3() {
		method1();		method2();
	}
	static void method4() {
		MemberCallEx01 m = new MemberCallEx01();
//		method1();		method2();
		m.method1();		method2();
	}	
	public static void main(String[] args) {
		MemberCallEx01 mc = new MemberCallEx01();
		int n = 1;
		
		System.out.println("method" + n++);;
		mc.method1();
		
		System.out.println("method" + n++);;
		method2();
		
		System.out.println("method" + n++);;
		
		new MemberCallEx01().method3();
		System.out.println("method" + n++);;
		method4();
		
	}

}
