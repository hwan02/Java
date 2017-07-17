package kr.ac.hufs;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		int total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		int n = Integer.parseInt(scan.nextLine().trim());
		scan.close();
		// 1~n 합을 구하는 프로그램
		for(int i = 1; i <= n; i++) {
			total = total + i;
		}
		System.out.println("1~" +n + "까지 합은 " +total + "입니다.");
	}

}
