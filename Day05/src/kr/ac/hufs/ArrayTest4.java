package kr.ac.hufs;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("좋아하는 연예인을 최소 3명 이상 입력하세요.");
		String str = scan.nextLine();
		System.out.println("입력: " + str);
		String[] arrStr = str.split("/");
		System.out.println(arrStr[1]);
		
		for(int i =0; i< arrStr.length; i++) {
			System.out.print(arrStr[i]);
		}
		scan.close();
	}
}
