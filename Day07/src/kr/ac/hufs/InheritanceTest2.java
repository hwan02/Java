package kr.ac.hufs;

import java.util.Scanner;

public class InheritanceTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("x, y��ǥ>> ");
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
		System.out.println("X��ǥ: " + this.x + ", Y��ǥ: " + this.y);
	}
	void showPln(String _msg) {
		System.out.println(_msg);
	}
}
//  Ŭ���������� ���ϻ�� �ۿ� �� �ȴ�.
class ColorPoint extends Point {
	final String RED_COLOR = "����";
	final String YELLOW_COLOR = "���";
	final String BLUE_COLOR = "�Ķ�";
	final String BLACK_COLOR = "����";

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
			resultColor = "�Ǻ��Ұ�";
		}
		return resultColor;
	}

	/*
	 super: �θ� ��ü 
	 super(): �θ� ��ü�� ������
	 
	 �ڹٿ����� ���� ����� �������� ����.
	 */
	void showColorPln(String _msg) {
		System.out.println(_msg);
	}
}
