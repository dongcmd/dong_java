package ex06_objectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 상속관계에서의 직렬화
 */

class UserInfo {
	protected String name;
	protected String password;
	public UserInfo() {}
	public UserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return name + "," + password;
	}
}

@SuppressWarnings("serial")
class User extends UserInfo implements Serializable {
//	private static final long serialVersionUID = 1L;
	
	private int age;
	public User(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	@Override
	public String toString() {
		return super.toString() + "," + age;
	}
	//부모 객체 멤버를 직렬화에 추가하기
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
	
	
}

// User("홍길동", "1234", 20);
// User("김삿갓", "3456", 30);
// object2.ser 파일에 객체 2개 저장
public class ObjectOutputStreamEx02 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		User u1 = new User("홍길동", "1234", 20);
		User u2 = new User("김삿갓", "3456", 30);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.ser"));
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		
		System.out.println(u1);
		System.out.println(u2);
		oos.writeObject(u1);
		oos.writeObject(u2);
		oos.close();
		
//		User n1 = (User)ois.readObject();
//		User n2 = (User)ois.readObject();
//		
//		System.out.println(n1);
//		System.out.println(n2);
//		ois.close();
	}
}
