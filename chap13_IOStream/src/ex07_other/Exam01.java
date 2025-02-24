package ex07_other;

import java.io.File;
import java.io.IOException;

/*
 * c:/Windows 폴더의 하위 폴더/파일 개수와 파일 크기의 합
 */
public class Exam01 {
	public static void main(String[] args) {
		String path = "C:/Windows";
		File f1 = new File(path);
		String[] files = f1.list();
		int folderNums = 0;
		int fileNums = 0;
		int fileByteSum = 0;
		
		for(String f : files) {
			File f2 = new File(path, f);
			if(f2.isDirectory()) {
				folderNums++;
			} else if(f2.isFile()) {
				fileNums++;
				fileByteSum += f2.length();
			}
		}
		System.out.printf("%s 경로 내 정보\n", path);
		System.out.printf("폴더 개수 : %d\n", folderNums);
		System.out.printf("파일 개수 : %d\n파일 크기의 합 : %,dbyte\n", fileNums, fileByteSum);
	}

}
