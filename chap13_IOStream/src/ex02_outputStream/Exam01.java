package ex02_outputStream;
/*
 * OutputStreamWriter 클래스 이용해서 한글출력하기
 */
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Exam01 {
	public static void main(String[] args) throws IOException {
//		OutputStream out = System.out;
		Writer out = new OutputStreamWriter(System.out);
		out.write('1');out.write('2');out.write('3');
		out.write('a');out.write('b');out.write('c');
		out.write('가');out.write('나');out.write('다');
		out.flush();
	}
}