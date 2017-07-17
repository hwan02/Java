package kr.ac.hufs;

import java.util.Scanner;

public class SissorTest {

	public static void main(String[] args) {
		new Sissor3();
	}

}

class Sissor3 {
	final int SISSOR = 1;
	final int ROCK = 2;
	final int PAPER = 3;

	final String SISSOR_STR = "가위";
	final String ROCK_STR = "바위";
	final String PAPER_STR = "보";

	int comNum = -1;
	int meNum = -1;

	String comStr = "";
	String meStr = "";

	Sissor3() {
		this.comNum = getComRandomNum();
		this.comStr = getComStrFromNum(this.comNum);

		System.out.println("가위, 바위, 보 중 하나를 입력하세요.>");
		Scanner scan = new Scanner(System.in);
		this.meStr = scan.nextLine().trim();
		this.meNum = getMeNumFromStr(this.meStr);

		scan.close();
		System.out.println("알파고> " + this.comStr);
		System.out.println(" 나 > " + this.meStr);
		System.out.println("결과> " + getGameResult(this.comNum, this.meNum));
	}

	int getMeNumFromStr(String _str) {
		int resultNum = -1;

		switch (_str) {
		case SISSOR_STR:
			resultNum = SISSOR;
			break;

		case ROCK_STR:
			resultNum = ROCK;
			break;

		case PAPER_STR:
			resultNum = PAPER;
			break;

		}
		return resultNum;
	}

	String getComStrFromNum(int _num) {
		String resultStr = "";

		switch (_num) {
		case SISSOR:
			resultStr = SISSOR_STR;
			break;

		case ROCK:
			resultStr = ROCK_STR;
			break;

		case PAPER:
			resultStr = PAPER_STR;
			break;
		}
		return resultStr;
	}



	int getComRandomNum() {
		return (int) (Math.random() * 3) + 1;
	}

	String getGameResult(int _comNum, int _userNum) {
		String result = "";
		int condition = (_userNum - _comNum + 3) % 3;
		switch (condition) {
		case 2:
			result = "당신이 졌어요.";
			break;
		case 1:
			result = "당신이 이겼어요.";
			break;
		case 0:
			result = "비겼어요.";
			break;
		}
		return result;
	}
}
