package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		try {
			OutputStream out = new FileOutputStream("src/file/data.txt");
			String name = "홍길동";
			int age = 25;
			double tall = 183.4;

			out.write(name.getBytes());
			out.write(Integer.toString(age).getBytes());
			out.write(Double.toString(tall).getBytes());

			// 출력 bytestream filtering
			PrintStream ps = new PrintStream(out); // System.out (화면출력), out(파일로 출력)
			ps.printf("\n\n\r이름: %s 나이: %d 신장 : %.1f\n", name, age, tall);
			// 출력 bytestream filtering
						PrintWriter pw = new PrintWriter(out); // System.out (화면출력), out(파일로 출력)
						pw.printf("\n\n\r이름: %s 나이: %d 신장 : %.1f\n", name, age, tall);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
