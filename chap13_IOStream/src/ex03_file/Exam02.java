package ex03_file;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 화면에서 exit 값을 입력할 때까지 내용을 입력받아  data.txt에 저장하기
 * 
 * data.txt 파일에 저장할 내용 입력 (종료 exit)
 * aaa
 * bbb
 * exit
 */
public class Exam02 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("data.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("data.txt파일에 저장할 내용 입력 (종료: exit)");
		while(true) {
			str = br.readLine();
			if(str.equals("exit")) {
				break;
			} else {
				fw.write(str+"\n");
			}
		}
		fw.flush();
		fw.close();
		br.close();
		System.out.println("data.txt에 저장 완료");
		
//		
//		FileOutputStream fos = new FileOutputStream("data2.txt");
//		Scanner sc = new Scanner(System.in);
//		String str;
//		byte[] bytes;
//
//		System.out.println("data2.txt파일에 저장할 내용 입력 (종료: exit)");
//		while(true) {
//			str = sc.nextLine();
//			if(str.equals("exit")) {
//				break;
//			} else {
//				bytes = (str+"\n").getBytes();
//				fos.write(bytes);
//			}
//		}
//		fos.flush();
//		fos.close();
//		sc.close();
//		System.out.println("data2.txt에 저장 완료");
		
		
	}
}
