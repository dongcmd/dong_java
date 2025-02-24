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
        // 1. File 객체 생성: "data.txt" 파일의 정보를 관리하기 위해 사용합니다.
        //    File 클래스는 파일이나 폴더의 경로, 존재 여부, 크기 등의 정보를 제공합니다.
        File f = new File("data.txt");
        // 2. 파일 존재 여부 확인:
        //    exists() 메서드는 파일이 실제로 존재하는지 확인합니다.
        if (!f.exists()) {
            // 파일이 존재하지 않으면, 파일 이름과 함께 경고 메시지를 출력하고 프로그램을 종료합니다.
            System.out.printf(f.getName() + " 파일은 존재하지 않습니다");
            return; // 프로그램 종료
        }
        // 3. FileInputStream 생성:
        //    FileInputStream은 파일의 내용을 바이트 단위로 읽어들이는 스트림입니다.
        FileInputStream fis = new FileInputStream(f);
        // 4. 읽은 바이트 수를 저장할 변수 초기화
        int len = 0;
        // 5. 버퍼 생성:
        //    - 8096 바이트 크기의 배열을 생성하여 파일에서 데이터를 한 번에 읽어옵니다.
        //    - 버퍼를 사용하면, 한 번에 여러 바이트를 읽어서 I/O 작업의 효율성이 높아집니다.
        byte[] buf = new byte[8096];
        // 6. 파일의 내용을 반복해서 읽기:
        //    - fis.read(buf) 메서드는 버퍼 크기만큼 데이터를 읽고,
        //      실제로 읽은 바이트 수를 반환합니다.
        //    - 파일의 끝(EOF)에 도달하면 -1을 반환합니다.
        while ((len = fis.read(buf)) != -1) {
            // 7. 읽은 데이터를 문자열로 변환 후 출력:
            //    - new String(buf, 0, len) 은 buf 배열의 0번 인덱스부터 len 바이트를 문자열로 변환합니다.
            //    - 이를 통해 바이트 데이터를 사람이 읽을 수 있는 텍스트로 출력합니다.
            System.out.println(new String(buf, 0, len));
        }
        // 8. 파일 입력 스트림 닫기:
        //    - 사용한 FileInputStream을 close() 메서드를 호출하여 자원을 해제합니다.
        //    - 자원 해제는 메모리 누수 및 파일 잠금 문제를 방지합니다.
        fis.close();
    }
}