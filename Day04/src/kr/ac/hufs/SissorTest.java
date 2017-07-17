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

	final String SISSOR_STR = "����";
	final String ROCK_STR = "����";
	final String PAPER_STR = "��";

	int comNum = -1;
	int meNum = -1;

	String comStr = "";
	String meStr = "";

	Sissor3() {
		this.comNum = getComRandomNum();
		this.comStr = getComStrFromNum(this.comNum);

		System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ���.>");
		Scanner scan = new Scanner(System.in);
		this.meStr = scan.nextLine().trim();
		this.meNum = getMeNumFromStr(this.meStr);

		scan.close();
		System.out.println("���İ�> " + this.comStr);
		System.out.println(" �� > " + this.meStr);
		System.out.println("���> " + getGameResult(this.comNum, this.meNum));
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
			result = "����� �����.";
			break;
		case 1:
			result = "����� �̰���.";
			break;
		case 0:
			result = "�����.";
			break;
		}
		return result;
	}
}
