package kr.ac.hufs;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = scanner.nextLine();
		System.out.print("����: ");
		int age = scanner.nextInt();
		System.out.print("�������: ");
		String birthYear = scanner.next();
		System.out.print("�Ҽӻ�: ");
		String eCompany = scanner.nextLine();
		System.out.print("Spoint: ");
		String sPoint = scanner.nextLine();
		System.out.print("��Ÿ: ");
 		String etc = scanner.nextLine();
 		scanner.close();

 		
 		
 				
		System.out.println("****************");
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�������: " + birthYear);
		System.out.println("�Ҽӻ�: " + eCompany);
		System.out.println("Ư  ¡: " + sPoint);
		System.out.println("��  Ÿ: " + etc);
		System.out.println("****************");
	}
}
