package kr.ac.hufs;

import java.util.Scanner;

public class Scanapply {
	public static void main(String[] args) {
	Entertainer entertainer = new Entertainer();
	
		Scanner scan = new Scanner(System.in);
		String name =scan.nextLine();
		
		System.out.print("�̸�: ");
		String name = scan.next();
		System.out.println("���� �̸��� " + name + "�Դϴ�. ");
		
		
		System.out.print("���� ���̴� " + age + "�Դϴ�.>" );
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("����: "+input);
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
		System.out.println("���� �αⰡ ���� �������Դϴ�.");
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
		System.out.println("�̸�: " + name);
		System.out.println("����: " + getAge());
		System.out.println("�������: " + getBirth());
		System.out.println("�Ҽ�: " + getEcompany());
		System.out.println("Ȱ������: " + getActing());
		System.out.println("��Ÿ: " + getTherest());
	}

}