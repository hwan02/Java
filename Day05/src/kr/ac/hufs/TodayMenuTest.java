package kr.ac.hufs;

import java.util.Scanner;

public class TodayMenuTest {

	public static void main(String[] args) {
		new TodayMenu();
	}

}

class TodayMenu {
	final String MENU_KOR = "�ѽ�";
	final String MENU_CHINA = "�߽�";
	final String MENU_JAPAN = "�Ͻ�";
	final String MENU_WEST = "���";

	String[] menu = { "�ѽ�", "�߽�", "�Ͻ�", "���" };
	String[] mKor = { "��ġ�", "����", "��������", "�����", "���Ƕ��̽�" };
	String[] mChina = { "¥���", "«��", "������", "�쵿", "���� ����" };
	String[] mJapan = { "����", "�߳��쵿", "Ÿ�ھ߳�", "���", "�������" };
	String[] mWest = { "���", "����", "�Ľ�Ÿ", "������", "�긮��" };

	String menuSelectedStr = "";
	String menuSubSelectedStr = "";


	TodayMenu(){
		this.menuSelectedStr = menu[getRandomIndex(menu.length)];
		
		switch(this.menuSelectedStr) {
		case MENU_KOR:
			this.menuSubSelectedStr = mKor[getRandomIndex(mKor.length)];
			break;
			
		case MENU_CHINA:
			this.menuSubSelectedStr = mChina[getRandomIndex(mChina.length)];
			break;
			
		case MENU_JAPAN:
			this.menuSubSelectedStr = mJapan[getRandomIndex(mJapan.length)];
			break;
			
		case MENU_WEST:
			this.menuSubSelectedStr = mWest[getRandomIndex(mWest.length)];
			break;
		}
		
		pln("������ �޴��� " + this.menuSelectedStr + " ��÷�Դϴ�.");
		pln("�׷� ������ " + this.menuSubSelectedStr + "(��)�� �����ô�.");
	}
	
	int getRandomIndex(int _length) {
		return (int)(Math.random()*_length);
	}
	
	void pln(String _msg) {
		System.out.println(_msg);
	}
}