package ex08_modifier;
/*
 * 생성자의 접근제어자를 private : 객체 개수 제한
 * 
 */
class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}
	int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
}
public class SingletonEx01 {
	public static void main(String[] args) {
//		SingleObject o = new SingleObject();
		SingleObject o1 = SingleObject.getObject();
		SingleObject o2 = SingleObject.getObject();
		
		System.out.println("o1.value = " + o1.value);
		System.out.println("o2.value = " + o2.value);
		o1.value = 200;
		System.out.println("o1.value = " + o1.value);
		System.out.println("o2.value = " + o2.value);
		
	}

}
