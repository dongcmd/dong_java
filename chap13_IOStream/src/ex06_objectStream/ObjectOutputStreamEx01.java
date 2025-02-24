package ex06_objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * ObjectOutputStream 예제
 * 	1. 객체를 외부로 전송할 수 있는 스트림
 *  2. Serializable 인터페이스를 구현한 클래스의 객체만 외부 전송 가능
 *  	=> 직렬화된 객체라 부름
 *  	=> Serializable 인터페이스를 구현하지 않은 객체를 외부 전송시 NotserializableException 발생
 *  3. ObjectOutputStream으로 전송된 객체는 ObjectInputStream으로 읽음
 */

@SuppressWarnings("serial") // warning 표시 무시
class Customer implements Serializable {
//	private static final long serialVersionUID = 1L;
	
	private String name;
	// transient : 직렬화 대상의 객체에서 해당 멤버는 제외
	private transient int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age;
	}
}
public class ObjectOutputStreamEx01 {
	public static void main(String[] args) throws IOException {
		//fos 스트림의 목적지 object.ser 파일
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("홍길동", 20);
		Customer c2 = new Customer("김삿갓", 30);
		
		System.out.println(c1);
		System.out.println(c2);
		oos.writeObject(c1); // c1 객체를 object.ser 파일로 전송
		oos.writeObject(c2);
		oos.close();
	}

}
