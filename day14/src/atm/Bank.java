package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank implements Runnable {
	private long depositMoney = 100000; // ���� �ܰ�
	private long balance; // ã�� �ݾ�
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//����ȭ�� �� �ϸ� ��°��� �̻�������.
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName() + "���� � ������~");

		System.out.println("����Ͻ� �ݾ��� �Է����ּ���.");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		withDraw();
	}

	public void withDraw() {
		if(depositMoney >= balance) {
			if(balance % 10000 == 0) {
				depositMoney = depositMoney - balance; //�긦 ��� �־��? depositMoney�� �־����
				System.out.println("�ܾ���" + depositMoney + "���Դϴ�.");
			}else {
				System.out.println("���� ������ ��� �����մϴ�.\n");
			}
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}

	}

}
