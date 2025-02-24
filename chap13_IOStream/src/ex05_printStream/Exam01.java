package ex05_printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 예외발생한 내용을 error.log 파일에 PrintStream을 이용하여 출력
 */
public class Exam01 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("error.log", true);
		PrintStream ps = new PrintStream(fos);
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {
//			System.out.println(e.getMessage()); // 이 내용 error.log에 출력하기
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			ps.println(df.format(new Date()) + " => " + e.getMessage());
			e.printStackTrace(ps);
		} finally {
			ps.flush();
			ps.close();
		}
	}
}