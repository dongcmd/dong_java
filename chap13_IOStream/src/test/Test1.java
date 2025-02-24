package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받아서 해당 파일의 내용을 화면에 출력하기.
 * 만약 파일이 없는 경우는 '해당 파일 없음' 을 출력하기
 * 한글은 깨지지 않아야 함.
 * FileInputStream 사용하기
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileInputStream fis;
		System.out.println("파일명 입력");
		try { 
			String input = sc.nextLine();
			fis = new FileInputStream(input);
		}
		catch(FileNotFoundException e) { System.out.println("해당 파일 없음"); return; }
		
		Reader r = new InputStreamReader(fis);
		PrintWriter os = new PrintWriter(System.out);
		
		int data = 0;
		while( ( data = r.read() ) != -1)  {
			os.write(data);
		}
		os.flush();
		os.close();
		sc.close();
		fis.close();
	}
}
