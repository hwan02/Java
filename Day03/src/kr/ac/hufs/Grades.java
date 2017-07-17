package kr.ac.hufs;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		int a = kor / 10;
		System.out.println("수학점수를 입력하세요.");
		int met = scan.nextInt();
		int b = met / 10;
		System.out.println("영어점수를 입력하세요.");

		int eng = scan.nextInt();
		int c = eng / 10;
		int ave = (a + b + c) / 3;

	

		switch (ave) {
		case 9:
			System.out.println("귀하의 학점은 A 입니다.");
			break;
		case 8:
			System.out.println("귀하의 학점은 B 입니다.");
			break;
		case 7:
			System.out.println("귀하의 학점은 C 입니다.");
			break;
		case 6:
			System.out.println("귀하의 학점은 D입니다.");
			break;

		default:
			System.out.println("귀하의 학점은 F 입니다.");
			break;
		}
	}
}
