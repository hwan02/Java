package kr.ac.hufs;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = scan.next();
		System.out.println("���� �̸��� " + name + "�Դϴ�. ");
		scan.close();

	}

}
