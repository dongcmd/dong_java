package ex06_objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectOutputStream을 통해 객체를 저장한 Object.ser 파일 읽기
 */
public class ObjectInputStreamEx01 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ois 스트림 : object.ser 파일에서 객체를 읽을 수 있는 스트림
		ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("object.ser"));
		Customer c1 = (Customer)ois.readObject();
//		Customer c2 = (Customer)ois.readObject();
		Object c2 = ois.readObject();
		System.out.println(c1);
		System.out.println(c2);
		
	}
}
