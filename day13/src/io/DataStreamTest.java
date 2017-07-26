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
		//2.�Է�(�б�)========================================
		try{
			FileInputStream file = new FileInputStream("src/io/result.txt");
			DataInputStream dis = new DataInputStream(file);
			
			System.out.println("�̸�: " + dis.readUTF());
			System.out.println("����: " + dis.readInt());
			System.out.println("����: " + dis.readDouble());
			
			System.out.println("�̸�: " + dis.readUTF());
			System.out.println("����: " + dis.readInt());
			System.out.println("����: " + dis.readDouble());
			
			dis.close();
			file.close();
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		
		
		
		//1.���(����)=========================================
		//���Ϸ� ����� �� �׽�Ʈ
		/*try {
		FileOutputStream file = new FileOutputStream("Src/io/result.txt"); //��Ʈ���丮�� ������Ʈ�� �Ǵ� ��?????????????????????????
		DataOutputStream dos = new DataOutputStream(file);
		
		dos.writeUTF("����");
		dos.writeInt(30);
		dos.writeDouble(153.4);
		
		dos.writeUTF("�Ѻ�");
		dos.writeInt(30);
		dos.writeDouble(154.3);
		
		dos.close();
		file.close(); // ������ ���� ���� �ݾ��ִ°� �´�.
		System.out.println("result.txt���Ϸ� ����Ǿ����ϴ�.");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}*/
}
