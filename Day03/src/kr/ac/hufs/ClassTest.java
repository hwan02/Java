package kr.ac.hufs;

import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// scan: ��ü����, �ν��Ͻ�, ������ ����, ��ü
		System.out.print("�̸�: ");
		String name = scan.nextLine();
		
		System.out.print("����: ");
		String birthYear = scan.nextLine();
		int bYear = Integer.parseInt(birthYear);
		
		System.out.print("��Ī: ");
		String petName = scan.nextLine();
		
		System.out.print("�̸���: ");
		String email = scan.nextLine();
		
		System.out.print("����: ");
		String thumbnail = scan.nextLine();
		
		scan.close();
		
		Member mb = new Member();
		mb.setAll(name, bYear, petName, email, thumbnail);
		String profile = mb.getProfile();
		System.out.println("*********************");
		System.out.println(profile);
		System.out.println("*********************");
		
		
	}
}
