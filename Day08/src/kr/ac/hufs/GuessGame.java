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
		System.out.println("숫자를 정하였습니다. 맞추어 보세요.");
		System.out.println("1~1000 사이 수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		this.meStr = scan.nextLine().trim();
		
		for(int i = 1; i <= scape.length; i++) {
			if(true) {
				i = comNum;
				System.out.println("맞추셨습니다.\n" + "축하합니다.");
			} else {
				System.out.println("틀리셨습니다. 다시 해보세요.");
				
				
			}
		}
		
		
		
	}
	int getSpecificNum() {
		return (int) (Math.random() * 1);
	}
}