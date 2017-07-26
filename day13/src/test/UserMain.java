package test;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		String pw;

		System.out.println("ID�� �Է��Ͻÿ� : ");
		id = sc.next();
		System.out.println("PW�� �Է��Ͻÿ� : ");
		pw = sc.next();

		UserProc up = new UserProc();
		// �Էµ� ���� ������ getLoginUser�� ã�� ��
		User entity = up.getLoginUser(id, pw);

		if (entity != null) {
			System.out.println(entity.getName() + "���� �����ϼ̽��ϴ�.");
			System.out.println("���� ����Ʈ�� " + entity.getPoint() + "���Դϴ�.");

			BookProc book = new BookProc();
			ArrayList<Book> list = book.getList();

			System.out.println("*** Book�� ���� ���� ***");
			for (Book ob : list) {
				System.out.println("å�̸�: " + ob.getTitle() + "\t");
				System.out.println("å����: " + ob.getAuthor() + "\t");
				System.out.println("������: " + ob.getPage() + "\t");
			}
		} else {
			System.out.println("ID �Ǵ� PW�� �������� �ʴ� ID�Դϴ�.");
		}
	}
}
