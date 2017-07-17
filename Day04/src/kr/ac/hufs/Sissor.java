package kr.ac.hufs;

import java.util.Scanner;

public class Sissor {
	public static void main(String[] args) {
		new Sissor2();
	}
}

class Sissor2 {
	int comNum = -1;
	int userNum = -1;

	Sissor2() {
		this.comNum = getComRandomNum();
		System.out.println("가위(1),바위(2),보(3) 중 하나를 입력하세요.>");
		Scanner scan = new Scanner(System.in);
		this.userNum = Integer.parseInt(scan.nextLine().trim());
		scan.close();
		System.out.println("User> " + getUser() + "");
		System.out.println("Com> " + getCom() + "");
		System.out.println("결과> " + getGameResult(this.comNum, this.userNum) + "");
	}

	int getComRandomNum() {
		return (int) (Math.random() * 3) + 1;
	}

	String getGameResult(int _comNum, int _userNum) {
		String result = "";
		switch (_userNum - _comNum) {
		case 2:
		case -1:
			result = "당신이 졌어요.";
			break;
		case 1:
		case -2:
			result = "당신이 이겼어요.";
			break;
		case 0:
			result = "비겼어요.";
			break;
		}
		return result;
	}

	String getUser() {
		String result1 = "";
		int userNum = this.userNum;
		
		switch (userNum) {
		case 1:
			result1 = "가위";
			break;
		case 2:
			result1 = "바위";
			break;
		case 3:
			result1 = "보";
			break;
		}
		return result1;
	}

	String getCom() {
		String result2 = "";
		int comNum = this.comNum;
		switch (comNum) {
		case 1:
			result2 = "가위";
			break;
		case 2:
			result2 = "바위";
			break;
		case 3:
			result2 = "보";
			break;
		}
		return result2;
	}

}