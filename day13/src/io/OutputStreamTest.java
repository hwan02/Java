package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(System.out); //����� ���̴ٶ�� �����ϸ� ��
		BufferedWriter bw = new BufferedWriter(osw);
		
		String str = "����ִ� Java IO�� �����ϴ� ��.....";
		bw.write(str); //System.out.println(); �� ������ ��� 
		bw.flush(); // ���� ������ ����ִ� ����
		
		bw.close();
		osw.close();
	}
}
