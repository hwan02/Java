package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		//3.���� ��Ʈ��(�ӵ��� ��������� ������ ����)
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		System.out.println("Input String : ");
		String str =br.readLine(); // ��ٸ��� �ʱ� ������ �ӵ��� ����
		System.out.println(str);
		
		
		
	}
/*		 2.����(character stream) ĳ���ͽ�Ʈ���̶�� �ַ� ǥ�� ���͸� �Ǵ��ϱ� ������ �ӵ��� �� ������.
		 BufferedReader�� ���� ������?
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Input String : ");
		char ch = '\0';
		while (ch != '\n') {
			ch = (char) isr.read(); // ���ڽ�Ʈ��(InputStreamReader), �ѱ�ó�� o
			System.out.println(ch);
		}
	}
*/

// 1.����Ʈ ��Ʈ�� -------------------------------------------------
/*
 * System.out.println("Input String : "); 
 * char ch = '\0'; //null�� ����� �ٸ���.
 * while(ch != '\n') 
 * {
 *  ch=(char) System.in.read(); ///����Ʈ ��Ʈ�� ����ó�� ���ӵǴ� ������(InputStream), �⺻������ �ѱ�ó���� �� �ȴ�. 
 * System.out.println(ch); 
 * } 
 */
}