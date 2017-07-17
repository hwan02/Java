package kr.ac.hufs;

import java.util.Scanner;

public class TodayMenuTest2 {

	public static void main(String[] args) {
		new TodayMenu2();
	}
}

class TodayMenu2 {
	final int MENU_KOR = 0;
	final int MENU_CHINA = 1;
	final int MENU_JAPAN = 2;
	final int MENU_WEST = 3;

	String[] mKor = {"��ġ�", "����", "��������", "�����", "���Ƕ��̽�" };
	String[] mChina = { "¥���", "«��", "������", "�쵿", "���� ����" };
	String[] mJapan = { "����", "�߳��쵿", "Ÿ�ھ߳�", "���", "�������" };
	String[] mWest = { "���", "����", "�Ľ�Ÿ", "������", "�긮��" };

	String[][] menu = {mKor, mChina, mJapan, mWest};

	String menuSelectedStr = "";
	String menuSubSelectedStr = "";

	TodayMenu2(){
		int idx = getRandomIndex(menu.length);

		switch(idx) {
		case MENU_KOR:
			menuSelectedStr = "�ѽ�";
			this.menuSubSelectedStr = menu[MENU_KOR][getRandomIndex(menu[MENU_KOR].length)];
			break;
			
		case MENU_CHINA:
			menuSelectedStr = "�߽�";
			this.menuSubSelectedStr = menu[MENU_CHINA][getRandomIndex(menu[MENU_CHINA].length)];
			break;
			
		case MENU_JAPAN:
			menuSelectedStr = "�Ͻ�";
			this.menuSubSelectedStr = menu[MENU_JAPAN][getRandomIndex(menu[MENU_JAPAN].length)];
			break;
			
		case MENU_WEST:
			menuSelectedStr = "���";
			this.menuSubSelectedStr = menu[MENU_WEST][getRandomIndex(menu[MENU_WEST].length)];
			break;
		}
		
		pln("������ �޴��� " + this.menuSelectedStr + " ��÷�Դϴ�.");
		pln("�׷� ������ " + this.menuSubSelectedStr + "(��)�� �����ô�.");
	}
	
	int getRandomIndex(int length) {
		return (int)(Math.random()*length);
	}
	
	void pln(String _msg) {
		System.out.println(_msg);
	}
}
