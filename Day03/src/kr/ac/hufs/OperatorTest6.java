package kr.ac.hufs;

import java.util.Scanner;

public class OperatorTest6 {

	public static void main(String[] args) {
		// id�� �����ҷ��� �� �� �̹� ������ ��� ���ϰ� �� ��
		Scanner scan = new Scanner(System.in);
		System.out.println("��û ���̵�: ");
		String id = scan.nextLine();
		id = id.trim();
		scan.close();

		if (id.equals("hufs") || id.equals("hankuk") || id.equals("foreign")) {
			System.out.println("�б� ��Ī�� ���̵�� ����Ͻ� �� �����ϴ�.");
		} else {
			System.out.println("���̵� ��û �Ϸ��߽��ϴ�.");
		}
	}
}
