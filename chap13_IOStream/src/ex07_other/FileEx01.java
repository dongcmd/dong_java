package ex07_other;

/*
 * File 클래스
 *  - 파일이나 폴더의 정보를 관리하는 클래스
 *  - new File(String s) : 경로
 *  - new File(String s1, String s2) : 하위경로
 *  - 윈도우 : \\(역슬래시), /
 *    리눅스 : /
 *  
 */
import java.io.File;

public class FileEx01 {
	public static void main(String[] args) {
		System.out.println("File.separator : " + File.separator);
		String filePath = "c:/";
		File f1 = new File(filePath);
		// f1 : "c:/ 폴더의 정보"
		String[] files = f1.list();
		// f1.list() : 하위 폴더/파일의 이름 리턴
		for(String f : files) { // f : c:/ 폴더 하위 목록의 이름
			File f2 = new File(filePath, f);
			if(f2.isDirectory()) {
				System.out.printf("%s : 디렉토리\n", f);
			} else {
				// f.length() : 파일의 크기
				System.out.printf("%s : 파일(%,d bytes)\n", f, f.length());
			}
		}
	}
}
