package kr.ac.hufs;

import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class CreditTest {

	public static void main(String[] args) {
		new Credit(); // Credit cr = new Credit();
	}

}

class Credit {
	int kor = 0;
	int eng = 0;
	int math = 0;
	int total = 0;

	Credit() {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수: ");
		int mKor = Integer.parseInt(scan.nextLine().trim());
		System.out.println("영어점수: ");
		int mEng = Integer.parseInt(scan.nextLine().trim());
		System.out.println("수학점수: ");
		int mMath = Integer.parseInt(scan.nextLine().trim());
		scan.close();
		setInput(mKor, mEng, mMath);
		System.out.println("당신의 학점은: " + getCredit() + "입니다.");
	}

	void setInput(int _kor, int _eng, int _math) {
		this.kor = _kor;
		this.eng = _eng;
		this.math = _math;

	}

	String getCredit() {
		String credit = "";
		int total = kor + eng + math;
		switch (total / 30) {
		case 10:
		case 9:
			credit = "A학점";
			break;
		case 8:
			credit = "B학점";
			break;
		case 7:
			credit = "C학점";
			break;
		case 6:
			credit = "D학점";
			break;
		default:
			credit = "F학점";
			break;
		}
		return credit;
	}
}
