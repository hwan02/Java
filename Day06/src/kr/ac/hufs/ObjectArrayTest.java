package kr.ac.hufs;

import java.util.Scanner;

public class ObjectArrayTest {
	public static void main(String[] args) {

		new Object2();
		}
	}
}

class Object2 {
	final String 20 = "20";

	String[] m1 = {"���", 20, "Ʈ���̽�"};
	String[] m2 = {"���̸�", 26, "���座��"};
	String[] m3 = {"�ճ���", 23, "������ũ"};
	String[] m4 = {"����", 26, "��κ�ʽ�"};
	String[] m5 = {"����", 31, "�ɽ�����"};
	for (int i = 0; i < mOArr.length; i++) {
		System.out.println(
				"�迭[" + i + "]: " + mOArr[i].name + "[" + mOArr[i].age + "]" + "�Ҽӻ�: " + mOArr[i].ecompany);
	String name = "";
	int age = 0;
	String ecompany = "";
	String total = "";

	Object2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ڽ��� �����ϴ� ���̵� �̸��� �˻��غ�����.");
		String total = scan.nextLine();
		for(int i = 0; i < Object2.this.total; i++) {
			
		}
	

	}

	Object2(String _name, int _age, String _ecompany) {
		this.name = _name;
		this.age = _age;
		this.ecompany = _ecompany;

	}

	void setAll(String _name, int _age, String _ecompany) {
		this.name = _name;
		this.age = _age;
		this.ecompany = _ecompany;
	}
}
