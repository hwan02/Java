package kr.ac.hufs;

import java.util.Scanner;

public class RRNtest {

	public static void main(String[] args) {
		new RRN();
	}

}

class RRN {
	Scanner scan = new Scanner(System.in);

	RRN() {
		System.out.println("����� �ֹι�ȣ�� �Է��ϼ���. (011231-1111222)>");
		String rrnNum = scan.nextLine();
		int indexC = rrnNum.indexOf('-');
		int genderIndex = indexC + 1;
		int gender = Integer.parseInt(rrnNum.substring(genderIndex, genderIndex + 1 ));

		switch (gender) {
		case 1:
		case 3:
			System.out.println("����� �����Դϴ�.");
			break;
		case 2:
		case 4:
			System.out.println("����� �����Դϴ�.");
			break;
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
			break;
		}
	}
}