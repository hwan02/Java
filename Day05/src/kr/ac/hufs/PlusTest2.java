package kr.ac.hufs;

import java.util.Scanner;

public class PlusTest2 {

	public static void main(String[] args) {
		Plus2 p = new Plus2();
	}

}

// Ŭ���� ����� ���� ? ��ü ���� ó���� �� ����� ���� ���� ���
class Plus2 {
	// ���������� �ν��Ͻ��� ����? 
	int total = 0;
	
	Scanner scan = new Scanner(System.in);

	// ()�� ���ִ� ������?������ �Լ��� �ҷ��ִ� ��
	Plus2(){
		System.out.print("5���� ���� ���� �Է����ּ���>>");
		for(int i = 1; i <=5; i++) {
			int num = scan.nextInt();
			if(num > 0) { 
				this.total += num;
			}else {
				continue;
			}
		}
		scan.close();
		pln("�Է��Ͻ� ����� ���� " + this.total + "�Դϴ�.");
	}
//	pln?? ���Ƿ� ������ �Ž��
	void pln(String _msg) {
		System.out.println(_msg);
	}
}
