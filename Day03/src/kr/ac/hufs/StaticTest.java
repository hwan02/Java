package kr.ac.hufs;

import java.util.Scanner;

public class StaticTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�: ");
		SaveInstanceMember.name = scan.nextLine();
		
		System.out.print("����: ");
		String birthYear = scan.nextLine();
		SaveInstanceMember.birthYear = Integer.parseInt(birthYear);
		
		System.out.print("��Ī: ");
		SaveInstanceMember.nick = scan.nextLine();
		
		System.out.print("�̸���: ");
		SaveInstanceMember.email = scan.nextLine();
		
		System.out.print("����: ");
		SaveInstanceMember.thumbnail = scan.nextLine();
		
		scan.close();
		//SaveInstanceMember.name = name; // static ���� => Ŭ������.����
		//SaveInstanceMember.birthYear = bYear;
		//SaveInstanceMember.nick = petName;
		//SaveInstanceMember.email = email;
		//SaveInstanceMember.thumbnail = thumbnail;
		
		showProfile();
	}
static void showProfile() {
	String allProfile = "��  ��: " + SaveInstanceMember.name + "\n";
	allProfile = allProfile + "��  ��: " + SaveInstanceMember.birthYear + "\n";
	allProfile = allProfile + "��  Ī: " + SaveInstanceMember.nick + "\n";	
	allProfile = allProfile + "�̸���: " + SaveInstanceMember.email + "\n";
	allProfile = allProfile + "��  ��: " + SaveInstanceMember.thumbnail + "\n";
	System.out.println("******************");
	System.out.println(allProfile);
	System.out.println("******************");
	
}
}
