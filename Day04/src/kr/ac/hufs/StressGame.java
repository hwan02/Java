package kr.ac.hufs;

import java.util.Scanner;

public class StressGame {

	public static void main(String[] args) {
new Dice();
	}
}

class Dice {
Scanner scan = new Scanner(System.in);
	Dice() {
		System.out.println("�ֻ��� ���̿� ������ ���� ȯ���մϴ�.");
		System.out.println("1~6 ���� ���� ���߾������ ������ ����˴ϴ�.");
		for(;;) {
			int comNum = getComRandomNum();
			System.out.println("�� >>");
			int meNum = Integer.parseInt(scan.nextLine().trim());
			System.out.println("�� >>" + comNum);
			if(comNum == meNum) {
				System.out.println("\n������ϴ�. ���ϵ帳�ϴ�.");
				break;
		}
	}
		scan.close();
}
	int getComRandomNum() {
		return (int) (Math.random() * 3) + 1;
	}

}