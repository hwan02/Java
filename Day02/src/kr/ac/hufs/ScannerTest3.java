package kr.ac.hufs;

import java.util.Scanner;

public class ScannerTest3 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("�̸�: ");
			String name = scanner.nextLine();
			System.out.print("����: ");
			String age = 
			int age2 = Integer.parseInt(age) 
			System.out.print("�������: ");
			String birthYear = scanner.next();
			System.out.print("�Ҽӻ�: ");
			String eCompany = scanner.nextLine();
			System.out.print("Spoint: ");
			String sPoint = scanner.nextLine();
			System.out.print("��Ÿ: ");
	 		String etc = scanner.nextLine();
	 		scanner.close();

	 		Celeb cb = new Celeb();
	 		cb.setAll(name, birthYear, eCompanym, actContents, age2, etc);
	 		showMsg(cb.getName(), cb.getage(), cb.getBirthYear(),cb.getEcompany(), cb.getSpoint(), cb.getEtc());
	 		
	 		
	}

}
