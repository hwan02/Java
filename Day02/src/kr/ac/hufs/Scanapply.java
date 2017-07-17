package kr.ac.hufs;

import java.util.Scanner;

public class Scanapply {
	public static void main(String[] args) {
	Entertainer entertainer = new Entertainer();
	
		Scanner scan = new Scanner(System.in);
		String name =scan.nextLine();
		
		System.out.print("이름: ");
		String name = scan.next();
		System.out.println("나의 이름은 " + name + "입니다. ");
		
		
		System.out.print("나의 나이는 " + age + "입니다.>" );
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("나이: "+input);
		System.out.printf("num=%d%n", num);
		scan.close();
	}

}

class Entertainer {
	int age = 0;
	String name = "";
	String birth="";
	String ecompany="";
	String acting="";
	String therest="";

	Entertainer() {
		System.out.println("현재 인기가 많은 연예인입니다.");
	}

	void setAll(String _name, int _age, String _birth, String _ecompany, String _acting, String _therest) {
		name = _name;
		age = _age;
		birth= _birth;
		ecompany= _ecompany;
		acting= _acting;
		therest= _therest;
	}

	String getName() {
		return name;
	}
	String getBirth() {
		return birth;
	}
	String getEcompany() {
		return ecompany;
	}
	String getActing() {
		return acting;
	}
	String getTherest() {
		return therest;
	}
	int getAge() {
		return age;
	}

	void showMsgAll() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + getAge());
		System.out.println("생년월일: " + getBirth());
		System.out.println("소속: " + getEcompany());
		System.out.println("활동내역: " + getActing());
		System.out.println("기타: " + getTherest());
	}

}