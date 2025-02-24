package ex03_file;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream : 파일의 내용을 읽어 화면에 출력
 * 
 * 주요 메서드
 * int read() : 1 byte 읽어서 내용 리턴
 * int read(byte[] buf) : buf 크기만큼 읽어서 내용 buf에 저장. 읽은 byte수 리턴
 * int read(byte[] buf, int start, int len) : buf[start] 부터 len만큼 내용 저장. 읽은 byte 수 리턴
 * int available() : 읽기 가능한 바이트 수 리턴
 * 
 */
public class FileInputStreamEx01 {
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("src/ex01_inputstream/InputStreamEx01.java");
		int data = 0;
		System.out.println("========= read() 이용해 읽기");
		while( (data = fis.read() ) != -1 ) {
			System.out.print((char)data);
		}
		
		
		System.out.println("========= read(byte[] buf) 이용해 읽기");
		fis = new FileInputStream("src/ex01_inputstream/InputStreamEx01.java");
		// fis.available() : 읽기 가능한 바이트 수
		byte[] buf = new byte[fis.available()]; System.out.println("fis.available() = " + fis.available());
		// fis.read(buf) : fis에서 buf만큼 읽은 내용을 buf 저장. 실제 읽은 크기 리턴
		//			data : 실제 읽은 바이트 수
		while( (data = fis.read(buf) ) != -1 ) {
			// new String(buf, 0, data) : buf의 0번인덱스부터 data까지의 문자열 객체로 생성
			System.out.print(new String(buf, 0, data));
			System.out.println(data);
		}
		
		System.out.println("========= read(byte[] buf, int start, int len) 이용해 읽기");
		fis = new FileInputStream("src/ex01_inputstream/InputStreamEx01.java");
		buf = new byte[fis.available()+10];
		buf[0] = 'A';
		
		while( (data = fis.read(buf, 1, buf.length-1) ) != -1 ) {
			System.out.print(new String(buf, 0, data));
		}
	}
}
