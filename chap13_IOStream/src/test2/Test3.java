package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
파일 두개의 이름을 콘솔에서 입력받아 파일의 내용이 같은지  비교하는 프로그램을
작성하기

[결과]
첫번째 파일 이름을 입력하세요>>noname.txt
두번째 파일 이름을 입력하세요>>noname2.txt
noname.txt와 noname2.txt를 비교합니다.
noname.txt와noname2.txt파일은 같은 내용의 파일입니다.
noname.txt파일의 크기 :70
noname2.txt파일의 크기 :70
*/

public class Test3 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 파일명 입력>>");
		String s1 = sc.nextLine();
		System.out.print("두 번째 파일명 입력>>");
		String s2 = sc.nextLine();
//		String s2 = "test1.txt";
//		String s1 = "test2.txt";
		File f1 = new File(s1);
		File f2 = new File(s2);
		
		if(f1.length() == f2.length()) {
			FileInputStream fis1 = new FileInputStream(f1);
			FileInputStream fis2 = new FileInputStream(f2);
			byte[] b1 = fis1.readAllBytes() ;
			byte[] b2 = fis2.readAllBytes() ;
			boolean ec = true;
			for(int i = 0; i < b1.length; i++) {
				if(b1[i] != b2[i]) {
					ec = false; break;
				}
			} if(ec) {
				System.out.printf("%s와%s 파일은 같은 내용의 파일입니다.\n", f1, f2);
				System.out.printf("%s 파일의 크기 : %dbyte\n", s1, f1.length());
				System.out.printf("%s 파일의 크기 : %dbyte\n", s2, f2.length());
				return;
			}
		}
		System.out.printf("%s와%s 파일은 다른 내용의 파일입니다.\n", f1, f2);
		System.out.printf("%s 파일의 크기 : %dbyte\n", s1, f1.length());
		System.out.printf("%s 파일의 크기 : %dbyte\n", s2, f2.length());
	}
}
