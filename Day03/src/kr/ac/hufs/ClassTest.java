package kr.ac.hufs;

import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// scan: 객체변수, 인스턴스, 참조형 변수, 객체
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		System.out.print("생년: ");
		String birthYear = scan.nextLine();
		int bYear = Integer.parseInt(birthYear);
		
		System.out.print("애칭: ");
		String petName = scan.nextLine();
		
		System.out.print("이메일: ");
		String email = scan.nextLine();
		
		System.out.print("사진: ");
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
