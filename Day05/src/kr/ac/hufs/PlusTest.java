package kr.ac.hufs;

import java.util.Scanner;

public class PlusTest {

	public static void main(String[] args) {
		// �Է¹��� ������ -5, 10, 8, 9, 3 ���� ���� ���� ���ϱ�
		Scanner scan = new Scanner(System.in);
		int sum = 0;

		System.out.println("���� 5���� �Է��ϼ���.> ");
//		int i = 1; �ʱⰪ�� �ǹ�  i <= 5 1, 2, 3, 4, 5 ��, 5���� ���� �� �ִ�. i++�� �ϳ��� �þ��? �ؿ� ������ ���� �� �ٽ� �þ i�� 1�� ���� ������ ������ �Ѵ� 
		// �Է��� ���� num�� ���� �� ���� ���ǿ� �°� ����ǰ� �Ѿ��.  sum += num�� �Է��� ���ڵ� �߿��� ������ �����ϰ� ���Ѵ�.
		for (int i = 1; i <= 5; i++) {
			int num = scan.nextInt();
			if (num <= 0)
				continue;
			else
				sum += num;
		}
		System.out.println("�Է��Ͻ� �� �� ������� ���� " + sum + "�Դϴ�.");

		scan.close();
	}
}