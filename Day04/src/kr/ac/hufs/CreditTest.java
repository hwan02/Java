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
		System.out.println("��������: ");
		int mKor = Integer.parseInt(scan.nextLine().trim());
		System.out.println("��������: ");
		int mEng = Integer.parseInt(scan.nextLine().trim());
		System.out.println("��������: ");
		int mMath = Integer.parseInt(scan.nextLine().trim());
		scan.close();
		setInput(mKor, mEng, mMath);
		System.out.println("����� ������: " + getCredit() + "�Դϴ�.");
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
			credit = "A����";
			break;
		case 8:
			credit = "B����";
			break;
		case 7:
			credit = "C����";
			break;
		case 6:
			credit = "D����";
			break;
		default:
			credit = "F����";
			break;
		}
		return credit;
	}
}
