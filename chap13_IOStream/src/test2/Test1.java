package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
src/폴더 하위 폴더의 .java 파일 중 InputStream 관련 모든 소스 내용을  
InputStream예제.txt  파일 하나에 저장 하기
InputStream 관련 모든 소스 : XXXInputStreamXXX.java
*/
public class Test1 {
	public static void main(String[] args) throws IOException {
		File f = new File("src/"); 
		String[] folders = f.list();
		FileOutputStream fos = new FileOutputStream("InputStream예제.txt");
		byte[] b;
				
		for(String path : folders) {
			File f2 = new File("src/", path);
			String[] folders2 = f2.list();
			for(String path2 : folders2) {
				File f3 = new File("src/"+path, path2);
				if(f3.getName().contains("InputStream") && f3.getName().contains(".java")) {
					FileInputStream fis = new FileInputStream(f3);
					b = fis.readAllBytes();
					fos.write(b);
					fis.close();
				}
			}
		}
		fos.flush();
		fos.close();
	}
}