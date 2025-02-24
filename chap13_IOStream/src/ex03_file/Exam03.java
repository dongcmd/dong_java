package ex03_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * src/ex01_inputStream/InputStreamEx01.java 파일을 읽어 
 * InputStreamEx01.bak 파일 생성하기
 * FileInputStream 클래스로 구현
 */
public class Exam03 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/ex01_inputStream/InputStreamEx01.java");
		FileOutputStream fos = new FileOutputStream("InputStreamEx01.bak");
//		fos.write(fis.readAllBytes());
		
		int data = 0;
		while( (data = fis.read()) != -1 ) {
			fos.write(data); 
		}
		
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("프종");
		
//		FileReader fr = new FileReader("src/ex01_inputStream/InputStreamEx01.java");
//		FileWriter fw = new FileWriter("InputStreamEx01_2.bak");
//		
//		int data = 0;
//		char[] buf = new char[100000];
//		while( (data = fr.read()) != -1 ) {
//			fw.write(buf, 0, data);
//		}
//		System.out.println("프종");
	}
}
