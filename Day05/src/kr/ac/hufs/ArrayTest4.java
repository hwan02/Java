package kr.ac.hufs;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����ϴ� �������� �ּ� 3�� �̻� �Է��ϼ���.");
		String str = scan.nextLine();
		System.out.println("�Է�: " + str);
		String[] arrStr = str.split("/");
		System.out.println(arrStr[1]);
		
		for(int i =0; i< arrStr.length; i++) {
			System.out.print(arrStr[i]);
		}
		scan.close();
	}
}
