package ex03_file;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * FileWriter 클래스를 이용해 FileOutputStreamEx02.java의 내용을 out2.txt 파일에 저장하기
 * 주요메서드
 *   void write(int data) : 1 byte 출력
 *   void write(byte[] buf) : buf의 내용을 출력
 *   void write(byte[] buf, int start, int len) : buf[start] 부터 len만큼 출력
 *   void write(String str) : str 문자열의 내용 출력
 */
public class Exam01 {
	public static void main(String[] args) throws IOException {
		System.out.println("out2.txt 파일에 내용 저장");
		FileWriter fw = new FileWriter("out2.txt");
		fw.write('1');fw.write('2');fw.write('3');
		fw.write('a');fw.write('b');fw.write('c');
		fw.write('가');fw.write('나');fw.write('다');
		char[] buf = "\nFileWriter 예제\n".toCharArray();
		fw.write(buf);
		fw.write(buf, 5, 6);
		fw.write("\nFileWriter는 문자열 출력이 가능합니다.\n");
		fw.flush();
	}
}
