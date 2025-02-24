package ex06_objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 상속관계에서의 직렬화
 */

public class ObjectInputStreamEx02 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));
		
		User n1 = (User)ois.readObject();
		User n2 = (User)ois.readObject();
		
		System.out.println(n1);
		System.out.println(n2);
		ois.close();
	}
}
