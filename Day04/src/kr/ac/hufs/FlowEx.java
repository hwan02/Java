package kr.ac.hufs;

import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class FlowEx {

	public static void main(String[] args) {
		new flow();
	}
	
class flow {
	int spring = 0;
	int summer = 0;
	int fall = 0;
	int winter = 0;

	System.out.println("현재 월을 입력하세요.");
	
	flow(){
			Scanner fl = new Scanner(System.in);
			System.out.println("봄: ");
			int spring = Integer.parseInt(fl.nextLine().trim());
			System.out.println("여름: ");
			int summer = Integer.parseInt(fl.nextLine().trim());
			System.out.println("가을: ");
			int fall = Integer.parseInt(fl.nextLine().trim());
			System.out.println("겨울: ");
			int winter = Integer.parseInt(fl.nextLine().trim());
			fl.close();
			setInput(spring, summer, fall, winter);
			System.out.println("현재의 계절은: " + getflow() + "입니다.");
	}
	void setInput(int _spring, int _summer, int _fall, int _winter) {
		this.spring = _spring;
		this.summer = _summer;
		this.fall = _fall;
		this.winter = _winter;
	}
	String getflow() {
		String flow = "";
		int total = 
		Scanner fl = new Scanner(System.in);
		int month = fl.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
			default:
			case 12: case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
		}
		return flow;
	}
}
