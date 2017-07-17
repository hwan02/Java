package kr.ac.hufs;

import java.util.Scanner;

public class StaticTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		SaveInstanceMember.name = scan.nextLine();
		
		System.out.print("생년: ");
		String birthYear = scan.nextLine();
		SaveInstanceMember.birthYear = Integer.parseInt(birthYear);
		
		System.out.print("애칭: ");
		SaveInstanceMember.nick = scan.nextLine();
		
		System.out.print("이메일: ");
		SaveInstanceMember.email = scan.nextLine();
		
		System.out.print("사진: ");
		SaveInstanceMember.thumbnail = scan.nextLine();
		
		scan.close();
		//SaveInstanceMember.name = name; // static 접근 => 클래스명.변수
		//SaveInstanceMember.birthYear = bYear;
		//SaveInstanceMember.nick = petName;
		//SaveInstanceMember.email = email;
		//SaveInstanceMember.thumbnail = thumbnail;
		
		showProfile();
	}
static void showProfile() {
	String allProfile = "이  름: " + SaveInstanceMember.name + "\n";
	allProfile = allProfile + "생  년: " + SaveInstanceMember.birthYear + "\n";
	allProfile = allProfile + "애  칭: " + SaveInstanceMember.nick + "\n";	
	allProfile = allProfile + "이메일: " + SaveInstanceMember.email + "\n";
	allProfile = allProfile + "사  진: " + SaveInstanceMember.thumbnail + "\n";
	System.out.println("******************");
	System.out.println(allProfile);
	System.out.println("******************");
	
}
}
