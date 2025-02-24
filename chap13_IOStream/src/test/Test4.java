package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * apple.gif 파일을 읽어서, apple2.gif 파일로 복사하기
 */
public class Test4 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/test/apple.gif");
		FileOutputStream fos = new FileOutputStream("apple2.gif");
		int data = 0;
		byte[] buf = new byte[1000];
		buf = fis.readAllBytes();
		fos.write(buf);
		System.out.println("프종");
	}
}
