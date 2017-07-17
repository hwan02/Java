package kr.ac.hufs;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("나이: ");
		int age = scanner.nextInt();
		System.out.print("생년월일: ");
		String birthYear = scanner.next();
		System.out.print("소속사: ");
		String eCompany = scanner.nextLine();
		System.out.print("Spoint: ");
		String sPoint = scanner.nextLine();
		System.out.print("기타: ");
 		String etc = scanner.nextLine();
 		scanner.close();

 		
 		
 				
		System.out.println("****************");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("생년월일: " + birthYear);
		System.out.println("소속사: " + eCompany);
		System.out.println("특  징: " + sPoint);
		System.out.println("기  타: " + etc);
		System.out.println("****************");
	}
}
