package kr.ac.hufs;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���.");
		int kor = scan.nextInt();
		int a = kor / 10;
		System.out.println("���������� �Է��ϼ���.");
		int met = scan.nextInt();
		int b = met / 10;
		System.out.println("���������� �Է��ϼ���.");

		int eng = scan.nextInt();
		int c = eng / 10;
		int ave = (a + b + c) / 3;

	

		switch (ave) {
		case 9:
			System.out.println("������ ������ A �Դϴ�.");
			break;
		case 8:
			System.out.println("������ ������ B �Դϴ�.");
			break;
		case 7:
			System.out.println("������ ������ C �Դϴ�.");
			break;
		case 6:
			System.out.println("������ ������ D�Դϴ�.");
			break;

		default:
			System.out.println("������ ������ F �Դϴ�.");
			break;
		}
	}
}
