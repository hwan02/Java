package file;

import java.io.FileOutputStream;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("src/file/data1.txt");

		int value;

		System.out.println("문자열을 입력하고 마지막 줄에서 Ctrl+Z로 종료하세요.");
		while ((value = System.in.read()) != -1) 
		{
			out.write(value);
		}
		System.out.println("data1.txt로 저장되었습니다.");
		
		out.flush();
		out.close();
	}
}
