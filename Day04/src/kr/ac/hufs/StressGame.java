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
		System.out.println("주사위 놀이에 들어오신 것을 환영합니다.");
		System.out.println("1~6 사이 수를 맞추어야지만 게임이 종료됩니다.");
		for(;;) {
			int comNum = getComRandomNum();
			System.out.println("나 >>");
			int meNum = Integer.parseInt(scan.nextLine().trim());
			System.out.println("컴 >>" + comNum);
			if(comNum == meNum) {
				System.out.println("\n맞췄습니다. 축하드립니다.");
				break;
		}
	}
		scan.close();
}
	int getComRandomNum() {
		return (int) (Math.random() * 3) + 1;
	}

}