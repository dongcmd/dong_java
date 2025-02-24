package ex04_bufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 화면에서 파일명을 입력받고, 출력을 시작할 라인, 출력 라인 수를 입력 받아
 * 시작라인부터 라인수까지의 내용을 화면에 출력
 * 
 * [결과]
 * 파일명 입력
 * src/ex01_inputstream/InputStreamEx01.java
 * 시작라인
 * 1
 * 라인수
 * 3
 * 
 * package ex01.inputstream;
 * 
 * import java.io.IOException;
 * 
 */
public class Exam01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명 입력");
//		String fn = br.readLine().trim();
		String fn = "src/ex01_inputstream/InputStreamEx01.java";
		System.out.println(fn);
		System.out.println("시작 라인");
//		int start = Integer.parseInt(br.readLine());
		int start = 3;
		System.out.println("라인 수");
//		int len = Integer.parseInt(br.readLine());
		int len = 7;
		
		br = new BufferedReader(new FileReader(fn));
		String data = null;
		int cnt = 0;
		while( (data = br.readLine()) != null ) {
			cnt++;
			if(start <= cnt && cnt <= start+len) {
				System.out.println(cnt+" : "+data);
			} else if(start+len < cnt) {
				break;
			}
		}
		br.close();
		
//		FileInputStream fis = new FileInputStream(fn); // 오답
//		
//		int cnt = 1;
//		byte[] arr = new byte[fis.available()];
//		fis.read(arr);
//		for(byte a : arr) {
//			if ( (char)a == '\n' ) { cnt++; }
//			if( start <= cnt && cnt <= (start+len)) {
//				System.out.print((char)a);
//				
//			}
//		}
	}

}
