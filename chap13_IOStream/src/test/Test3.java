package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
1. 반복문을 이용하여 
  파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
  파일명에 exit 가 입력되면, 프로그램 종료.
  해당 파일이 없으면 해당 파일이 없습니다. 메세지 출력

[결과]
파일명을 입력하세요(종료:exit)
aaa.txt
aaa.txt=>aaa.bak 복사완료
파일명을 입력하세요(종료:exit)
bbb.txt  
복사할 파일이 없습니다.
파일명을 입력하세요(종료:exit)
exit
*/

public class Test3 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		FileInputStream fis;
		while(true) {
			System.out.println("파일명 입력 종료 exit");
			String input = sc.nextLine();
			if(input.equalsIgnoreCase("exit")) { return; }
			
			try {
				fis = new FileInputStream(input);
			} catch(FileNotFoundException e) {
				System.out.println("복사할 파일이 없습니다");
				continue;
			}
			String fileName = input.substring(0, input.indexOf("."));
			FileOutputStream fos = new FileOutputStream(fileName+".bak");
			fos.write(fis.readAllBytes());
			fos.flush();
			System.out.println(input + "=> 복사완료 : " + fileName + ".bak");
		}
	}
}