package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileInputStreamTest {

	public static void main(String[] args) throws Exception {
//		Reader is = new FileReader("src/file/data.txt");
		InputStreamReader is = new FileReader("src/file/data.txt");
		BufferedReader br = new BufferedReader(is);
		
		String str;
		while((str = br.readLine())!=null) {
			System.out.println(str);
			Thread.sleep(100);
		}
		br.close();
		is.close();
	}
		//2 ----------------------------------------------
		/*InputStreamReader is = new FileReader("src/file/data.txt");
		int readData;
		while (true) {

			readData = is.read(); // byte ���� �б�, �ѱ� �� ����
			
			if (readData == -1) // -1: �������� ���̶�� �ǹ�
				break;
			System.out.println((char) readData);
			Thread.sleep(100);// 1/1000�� ����

		}
		is.close();
	}*/
		// 1 ..............................................
	/*	InputStream is = new FileInputStream("src/file/data.txt");

		int readData;
		while (true) {

			readData = is.read(); // byte ���� �б�, �ѱ� ����
			if (readData == -1) // -1: �������� ���̶�� �ǹ�
				break;
			System.out.println((char) readData);
			Thread.sleep(100);// 1/1000�� ����

		}
	}*/
}
