package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked Exceptoin: ����� ����ó�� �ʿ�
public class ExceptionEx3 {

	String str;

	public ExceptionEx3() {
		input();
	}
	
	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ������ �߻��Ѵ� �����⸦ �ϰų� try catch�� ���
		try {
			str=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���ڿ� �Է� ����");
		}
		
	}

	public void output() {
		System.out.println("���: " + str);
	}
	// ???????????????????????????
	public static void main(String[] args) {
		new ExceptionEx3().output();
		
	}
}
