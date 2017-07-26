package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileCacheImageOutputStream;

public class DataStreamTest {

	public static void main(String[] args) {
		//2.입력(읽기)========================================
		try{
			FileInputStream file = new FileInputStream("src/io/result.txt");
			DataInputStream dis = new DataInputStream(file);
			
			System.out.println("이름: " + dis.readUTF());
			System.out.println("나이: " + dis.readInt());
			System.out.println("신장: " + dis.readDouble());
			
			System.out.println("이름: " + dis.readUTF());
			System.out.println("나이: " + dis.readInt());
			System.out.println("신장: " + dis.readDouble());
			
			dis.close();
			file.close();
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		
		
		
		//1.출력(쓰기)=========================================
		//파일로 만드는 것 테스트
		/*try {
		FileOutputStream file = new FileOutputStream("Src/io/result.txt"); //루트디렉토리가 프로젝트가 되는 것?????????????????????????
		DataOutputStream dos = new DataOutputStream(file);
		
		dos.writeUTF("나나");
		dos.writeInt(30);
		dos.writeDouble(153.4);
		
		dos.writeUTF("뚜비");
		dos.writeInt(30);
		dos.writeDouble(154.3);
		
		dos.close();
		file.close(); // 파일은 열고 나면 닫아주는게 맞다.
		System.out.println("result.txt파일로 저장되었습니다.");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}*/
}
