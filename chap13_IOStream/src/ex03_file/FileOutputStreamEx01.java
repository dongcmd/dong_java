package ex03_file;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * FileOutputStream 예제 : 파일에 데이터 저장.
 *  주요메서드
 *   void write(int data) : 1 byte 출력
 *   void write(byte[] buf) : buf의 내용을 출력
 *   void write(byte[] buf, int start, int len) : buf[start] 부터 len만큼 출력
 *   
 *   생성자 : FileNotFoundException 처리 필수
 *   		=> 파일의 생성 권한이 없는 경우 예외발생
 *   wrtie() : IOException 처리 필수
 */
public class FileOutputStreamEx01 {
	public static void main(String[] args) throws IOException {
		System.out.println("out.txt 파일에 내용이 저장됩니다.");
		FileOutputStream fos = new FileOutputStream("out.txt", true);
		/*
		 * fos : out.txt 파일에 내용을 쓸 수 있는 바이트형 출력 스트림
		 *    out.txt 파일이 없으면 파일 생성 후 내용 출력
		 *    out.txt 파일이 있으면 파일에 내용 출력 (기존 내용 사라짐)
		 *    
		 * new FileOutputStream("out.txt")			: out.txt 파일에 내용 출력. 기존내용 사라짐.
		 * new FileOutputStream("out.txt", true)	: out.txt 파일에 내용 출력. 기존내용에 추가.
		 */
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다');
		byte[] buf = "\nFileOutputStream 예제입니다.\n".getBytes();
		fos.write(buf);
		fos.write(buf, 5, 6);
		fos.flush();
	}
}
