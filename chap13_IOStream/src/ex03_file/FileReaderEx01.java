package ex03_file;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader 클래스 : 파일에서 데이터 2 byte(1 char) 단위로 읽기
 *  주요 메서드
 *  int read() : 파일에서 데이터를 1 char 단위로 읽기
 *  int read(char[] buf) : 파일에서 buf의 크기만큼 읽어 buf에 내용 저장. 실제로 읽은 char 수 리턴
 *  int read(char[] buf, int start, int len) :
 *  	buf[start] 부터 len만큼 저장. 실제 읽은 char 수 리턴
 *  
 *  생성자 : FileNotFoundException 처리 필수
 *  read() : IOException 필수
 */
public class FileReaderEx01 {
	public static void main(String[] args) throws IOException {
		char[] buf = new char[8000];
		int data = 0;
		FileReader fr = new FileReader("src/ex01_inputStream/InputStreamEx01.java");
		System.out.println("============ read() 로 읽기");
		while( (data = fr.read()) != -1 ) {
			System.out.print((char)data);
		}
		
		System.out.println();
		System.out.println("============ read(char[] buf) 로 읽기");
		fr = new FileReader("src/ex01_inputStream/InputStreamEx01.java");
		while( (data = fr.read(buf)) != -1 ) {
			System.out.print(new String(buf, 0, data));
		}
		
		System.out.println();
		System.out.println("============ read(char[] buf, int start, int len) 로 읽기");
		fr = new FileReader("src/ex01_inputStream/InputStreamEx01.java");
		while( (data = fr.read(buf, 0, buf.length)) != -1 ) {
			System.out.print(new String(buf, 0, data));
		}
	}
}
