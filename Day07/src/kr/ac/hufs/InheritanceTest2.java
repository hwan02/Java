package kr.ac.hufs;

import java.util.Scanner;

public class InheritanceTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x, y좌표>> ");
		String xyStr = scan.nextLine();
		String[] xyArr = xyStr.split(",");
		int x = Integer.parseInt(xyArr[0]);
		int y = Integer.parseInt(xyArr[1]);
		ColorPoint cp = new ColorPoint(x,y);
		cp.showPositionPln();
		cp.showPln(cp.decisionColor());;
		scan.close();
	}
}

class Point {
	int x, y;

	Point(int _x, int _y) {
		this.x = _x;
		this.y = _y;
	}

	void showPositionPln() {
		System.out.println("X좌표: " + this.x + ", Y좌표: " + this.y);
	}
	void showPln(String _msg) {
		System.out.println(_msg);
	}
}
//  클래스에서는 단일상속 밖에 안 된다.
class ColorPoint extends Point {
	final String RED_COLOR = "빨강";
	final String YELLOW_COLOR = "노랑";
	final String BLUE_COLOR = "파랑";
	final String BLACK_COLOR = "검정";

	ColorPoint(int _x, int _y) {
		super(_x, _y);

	}

	String decisionColor() {
		String resultColor = "";
		if (super.x > 0 && super.y > 0) {
			resultColor = RED_COLOR;
		} else if (super.x < 0 && super.y > 0) {
			resultColor = YELLOW_COLOR;
		} else if (super.x < 0 && super.y < 0) {
			resultColor = BLUE_COLOR;
		} else if (super.x > 0 && super.y < 0) {
			resultColor = BLACK_COLOR;
		} else {
			resultColor = "판별불가";
		}
		return resultColor;
	}

	/*
	 super: 부모 객체 
	 super(): 부모 객체의 생성자
	 
	 자바에서는 다중 상속을 지원하지 않음.
	 */
	void showColorPln(String _msg) {
		System.out.println(_msg);
	}
}
