package ex05_printStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
/*
 * p.getInputStream() : ping 외부 프로세스로 부터 Data 읽기
 * new InputStreamReader(InputStream, Encoding 방식) : UTF-8이 기본
 * 		=> 텍스트의 Encoding 방식 설정
 */
public class PrintStreamEx02 {
	public static void main(String[] args) throws IOException {
		String[] cmds = {"ping", "192.168.7.1" };
		//Process : 현재 실행 중인 프로그램 ( Process는 과정, 절차)
		Process p = Runtime.getRuntime().exec(cmds);
		Reader r = new InputStreamReader(p.getInputStream(), "EUC-KR");
		int data = 0;
		PrintStream ps = new PrintStream(new FileOutputStream("ping.txt"));
		while( (data = r.read() ) != -1 ) {
			ps.print( (char) data );
			System.out.print((char) data);
		}
	}
}
