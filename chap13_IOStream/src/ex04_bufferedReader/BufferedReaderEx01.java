package ex04_bufferedReader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * BufferedReader 보조스트림
 *  보조스트림이란?
 *  1. 기존의 스트림에 새로운 기능을 추가
 *  2. 객체 생성시 다른 스트림을 생성자에 매개변수로 받는다.
 *  3. BufferedReader의 생성자 : BufferedReader(Reader)
 *  
 *  화면에서 한줄씩 입력받아 buffered.txt 파일에 저장
 *  String readLine() : 한 줄씩 읽기
 */
public class BufferedReaderEx01 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("저장할 내용을 입력하세요. 종료 ctrl + z");
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		while( (data=br.readLine()) != null ) { // EOF
			System.out.println(data);
			fw.write(data + "\n");
		}
		fw.flush();
		fw.close();
		br.close();
		System.out.println("저장완료");
	}
}