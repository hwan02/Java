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
		System.out.println("숫자 최대범위>> ");
		try {
		this.rangeNumMax = Integer.parseInt(scan.nextLine().trim());
		}catch(NumberFormatException nfe) {
			System.out.println("정수값만 입력하세요.");
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
		System.out.println("숫자를 정하였습니다. 맞추어보세요.");
		System.out.println("1~" + this.rangeNumMax + "까지 맞추어보세요.");
		int count = 0;
		for (;;) {
			count++;
			System.out.println(count + ">> ");
			int inputNum = Integer.parseInt(scan.nextLine().trim());
			if (inputNum == luckNum) {
				System.out.println("맞추셨습니다.\n" + "축하합니다.");
				System.out.println("게임을 다시 하시겠습니까?(y/n)>> ");
				String dStr = scan.nextLine().trim().toLowerCase();
				if (dStr.equals("y")) {
					setRangeNum();
					startGuessNumGame();
				} else {
					System.out.println("게임을 종료합니다.");
				}
				break;
			} else {
				if (inputNum > luckNum) {
					System.out.print("더 낮게");
					rangeMax = inputNum - 1;
					System.out.println(rangeMin + "~" + rangeMax);
				} else {
					System.out.print("더 높게");
					rangeMin = inputNum + 1;
					System.out.println(rangeMin + "~" + rangeMax);
				}
			}
		}

	}
}