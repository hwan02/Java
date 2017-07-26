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
			String name = "ȫ�浿";
			int age = 25;
			double tall = 183.4;

			out.write(name.getBytes());
			out.write(Integer.toString(age).getBytes());
			out.write(Double.toString(tall).getBytes());

			// ��� bytestream filtering
			PrintStream ps = new PrintStream(out); // System.out (ȭ�����), out(���Ϸ� ���)
			ps.printf("\n\n\r�̸�: %s ����: %d ���� : %.1f\n", name, age, tall);
			// ��� bytestream filtering
						PrintWriter pw = new PrintWriter(out); // System.out (ȭ�����), out(���Ϸ� ���)
						pw.printf("\n\n\r�̸�: %s ����: %d ���� : %.1f\n", name, age, tall);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
