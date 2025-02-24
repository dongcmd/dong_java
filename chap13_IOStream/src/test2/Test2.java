package test2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/*
 * command 라인에서 파일명을 입력받기 : args[0]
 * args값이 없으면 noname.txt 파일 설정하기
 * 키보드에서 받은 입력된 내용을 설정된 파일에 저장하기
 * "exit"문자열이 입력되면 파일 저장을 끝내고 프로그램이 종료됨.
 * Scanner 사용하지 않기
 * 
 * [결과]
 * "file명" 에 저장할 내용을 입력하세요
 * 안녕하세요.
 * Hello
 * exit
 * 
 * "file명"내용
 * 안녕하세요.
 * Hello
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		if(args.length == 0) {
			args[0] = "noname.txt";
		}
		System.out.printf("%s에 저장할 내용을 입력하세요\n", args[0]);
		Reader r = new Reader(System.in);
		FileOutputStream fos = new FileOutputStream(args[0], true);
		byte[] b;
		while(!(new String(b=is.readAllBytes()).equalsIgnoreCase("exit")) ) {
			System.out.println(123);
		}
		
		
	}
}
