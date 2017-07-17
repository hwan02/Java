package kr.ac.hufs;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.next();
		System.out.println("나의 이름은 " + name + "입니다. ");
		scan.close();

	}

}
