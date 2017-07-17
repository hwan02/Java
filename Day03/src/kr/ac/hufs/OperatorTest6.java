package kr.ac.hufs;

import java.util.Scanner;

public class OperatorTest6 {

	public static void main(String[] args) {
		// id를 가입할려고 할 때 이미 있으면 사용 못하게 할 때
		Scanner scan = new Scanner(System.in);
		System.out.println("신청 아이디: ");
		String id = scan.nextLine();
		id = id.trim();
		scan.close();

		if (id.equals("hufs") || id.equals("hankuk") || id.equals("foreign")) {
			System.out.println("학교 약칭은 아이디로 사용하실 수 없습니다.");
		} else {
			System.out.println("아이디 신청 완료했습니다.");
		}
	}
}
