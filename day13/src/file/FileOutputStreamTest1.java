package file;

import java.io.FileOutputStream;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("src/file/data1.txt");

		int value;

		System.out.println("���ڿ��� �Է��ϰ� ������ �ٿ��� Ctrl+Z�� �����ϼ���.");
		while ((value = System.in.read()) != -1) 
		{
			out.write(value);
		}
		System.out.println("data1.txt�� ����Ǿ����ϴ�.");
		
		out.flush();
		out.close();
	}
}
