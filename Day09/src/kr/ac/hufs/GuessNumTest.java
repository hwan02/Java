package kr.ac.hufs;

import java.util.Scanner;

public class GuessNumTest {
	public static void main(String[] args) {
		new GuessNumGame();
	}

}

class GuessNumGame {
	Scanner scan = new Scanner(System.in);
	int rangeNumMax = 0;

	GuessNumGame() {
		setRangeNum();
		startGuessNumGame();
	}

	void setRangeNum() {
		System.out.println("���� �ִ����>> ");
		try {
		this.rangeNumMax = Integer.parseInt(scan.nextLine().trim());
		}catch(NumberFormatException nfe) {
			System.out.println("�������� �Է��ϼ���.");
		}finally {
		}
	}

	int randomNum(int _range) {
		return (int) (Math.random() * _range) + 1;

	}

	void startGuessNumGame() {
		int rangeMin = 1;
		int rangeMax = this.rangeNumMax;

		int luckNum = randomNum(this.rangeNumMax);
		System.out.println("���ڸ� ���Ͽ����ϴ�. ���߾����.");
		System.out.println("1~" + this.rangeNumMax + "���� ���߾����.");
		int count = 0;
		for (;;) {
			count++;
			System.out.println(count + ">> ");
			int inputNum = Integer.parseInt(scan.nextLine().trim());
			if (inputNum == luckNum) {
				System.out.println("���߼̽��ϴ�.\n" + "�����մϴ�.");
				System.out.println("������ �ٽ� �Ͻðڽ��ϱ�?(y/n)>> ");
				String dStr = scan.nextLine().trim().toLowerCase();
				if (dStr.equals("y")) {
					setRangeNum();
					startGuessNumGame();
				} else {
					System.out.println("������ �����մϴ�.");
				}
				break;
			} else {
				if (inputNum > luckNum) {
					System.out.print("�� ����");
					rangeMax = inputNum - 1;
					System.out.println(rangeMin + "~" + rangeMax);
				} else {
					System.out.print("�� ����");
					rangeMin = inputNum + 1;
					System.out.println(rangeMin + "~" + rangeMax);
				}
			}
		}

	}
}