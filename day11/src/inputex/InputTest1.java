package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ַܼ� ������ �Է�
//�̸��� �Է��Ͻÿ�: ��ȣ��
//��� �̸��� ��ȣ���Դϴ�.
public class InputTest1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  // �ӽ��� ������
		
		String name;
		char gender;
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = br.readLine(); //�� �� �Է��� �ȴ�.
		System.out.print("������ �Է��Ͻÿ�: ");
		gender=br.readLine().charAt(0); // �ѱ����Է� "��\n\r" 0��° �ڸ� 1��° �ڸ� 2��° �ڸ�
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ������ " + gender + "�� �Դϴ�.");
		
		
	}
}
