package ex07_other;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/*
 * FileEx3 예제:
 * - "data.txt" 파일을 읽어서 그 내용을 화면에 출력하는 프로그램입니다.
 * - 파일이 존재하지 않으면, "파일은 존재하지 않습니다" 메시지를 출력하고 종료합니다.
 *
 * 주요 학습 포인트:
 * 1. File 클래스: 파일이나 디렉토리의 정보를 관리합니다.
 * 2. FileInputStream: 파일을 바이트 단위로 읽어오는 스트림입니다.
 * 3. 버퍼(buffer): 한 번에 여러 바이트를 읽어서 I/O 성능을 향상시킵니다.
 * 4. 문자열 변환: 읽은 바이트 배열을 String으로 변환하여 출력합니다.
 * 5. 자원 해제: 사용 후 스트림을 닫아 메모리 누수를 방지합니다.
 *
 * 기술 면접 대비:
 * - File 클래스의 주요 메서드 (exists(), getName(), length(), list() 등)
 * - FileInputStream과 BufferedReader, BufferedInputStream의 차이점
 * - 버퍼 사용의 중요성 및 효율성 (버퍼 크기 조정 등)
 * - 예외 처리 및 자원 관리 (try-with-resources, close() 메서드)
 */
public class FileEx03 {
    public static void main(String[] args) throws IOException {
    	File f = new File("data.txt");
		if(!f.exists()) {
			System.out.println(f.getName()+" 파일은 존재하지 않습니다.");
			return;
		}
		FileInputStream fis = new FileInputStream(f);
		int len=0;
		byte[] buf = new byte[8096];
		int cnt = 0;
		while((len=fis.read(buf)) != -1) {
			cnt++;
			System.out.println(new String(buf,0,len));
		}
		System.out.println(cnt);
		fis.close();
    }
}