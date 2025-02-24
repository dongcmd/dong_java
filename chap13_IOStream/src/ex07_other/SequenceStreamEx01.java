package ex07_other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreamEx01 {

	public static void main(String[] args) throws IOException {
		File f = new File("src/ex07_other");
		String[] files = f.list();
		Vector<InputStream> v = new Vector<>();
		for(String file : files) {
			File f2 = new File(f, file);
			if(f2.isFile()) {
				v.add(new FileInputStream(f2));
			}
		}
//		 Enumeration elements() : 반복자
//		 s : [new FileInputStream("Exam1.java),
//				new FileInputStream("FileEx01.java), ...]
//			모든 스트림을 한 개의 스트림으로 연결
		SequenceInputStream s = new SequenceInputStream(v.elements());
		FileOutputStream fos = new FileOutputStream("File예제.txt");
		
		int data = 0;
		byte[] buf = new byte[8096];
		
		while( (data = s.read(buf) ) != -1 ) {
			fos.write(buf, 0, data); // File예제.txt에 내용 출력
		}
		fos.flush();
		fos.close();
		s.close();
	}
}