package kr.ac.hufs;

import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		new GuessGame2();
	}
}

class GuessGame2{
	int[] scape = new int[1000];
	int meNum = -1;
	int comNum = -1;
	
	String meStr = "";
	GuessGame2(){
		this.comNum = getSpecificNum();
		System.out.println("���ڸ� ���Ͽ����ϴ�. ���߾� ������.");
		System.out.println("1~1000 ���� ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		this.meStr = scan.nextLine().trim();
		
		for(int i = 1; i <= scape.length; i++) {
			if(true) {
				i = comNum;
				System.out.println("���߼̽��ϴ�.\n" + "�����մϴ�.");
			} else {
				System.out.println("Ʋ���̽��ϴ�. �ٽ� �غ�����.");
				
				
			}
		}
		
		
		
	}
	int getSpecificNum() {
		return (int) (Math.random() * 1);
	}
}