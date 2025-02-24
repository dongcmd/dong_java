package ex07_other;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/*
 * File 클래스의 주요 메서드
 * 		String getAbsolutePath() : 절대 경로
 * 		boolean mkdir() : 하위 폴더 1개 생성 / 성공시 true 실패시 false
 * 		boolean mkdirs() : 하위 폴더 여러개 생성 / 성공시 true 실패시 false
 * 		boolean createNewFile() : 파일 생성 / 성공시 true 실패시 false
 * 		String getName() : 파일 이름
 * 		long length() : 파일의 크기(byte 단위)
 * 		boolean exists() : 파일의 존재 여부
 * 		boolean renameTo(File f1) : 파일의 이름을 f1 이름으로 변경
 * 		long lastModified() : 파일의 최종 수정시각을 밀리초로 리턴
 * 		boolean delete() : 파일 삭제
 */
public class FileEx02 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1");
		System.out.printf("%s 폴더 생성 : %b\n", f1.getAbsolutePath(), f1.mkdir());
		File f2 = new File("c:/temp1/test.txt");
		System.out.printf("%s 파일 생성 : %b\n", f2.getAbsolutePath(), f2.createNewFile());
		System.out.printf("파일 이름 : %s, 파일크기 : %,d\n", f2.getName(), f2.length());
		
		File f3 = new File("c:/temp1/test2.txt");
		
		if(f3.exists()) {
			System.out.println(f3.getName() + " 파일 존재");
		} else {
			System.out.println(f3.getName() + " 파일은 없음");
		}
		f2.renameTo(f3);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("파일의 최종 수정시간 : " + df.format(f3.lastModified()));
		System.out.printf("%s 파일 삭제 : %b\n", f3.getName(), f3.delete());
		System.out.printf("%s 디렉토리 삭제 : %b\n", f1.getName(), f1.delete());
	}
}