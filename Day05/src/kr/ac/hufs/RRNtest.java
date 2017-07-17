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
		System.out.println("당신의 주민번호를 입력하세요. (011231-1111222)>");
		String rrnNum = scan.nextLine();
		int indexC = rrnNum.indexOf('-');
		int genderIndex = indexC + 1;
		int gender = Integer.parseInt(rrnNum.substring(genderIndex, genderIndex + 1 ));

		switch (gender) {
		case 1:
		case 3:
			System.out.println("당신은 남자입니다.");
			break;
		case 2:
		case 4:
			System.out.println("당신은 여자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록번호입니다.");
			break;
		}
	}
}