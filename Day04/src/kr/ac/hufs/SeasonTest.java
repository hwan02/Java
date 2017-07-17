package kr.ac.hufs;

import java.util.Scanner;

public class SeasonTest {

	public static void main(String[] args) {
		new Season();
	}
}

class Season {
	int month = 0;
	Season(){
		System.out.print("���� ���� �Է��ϼ���.>");
		Scanner scan = new Scanner(System.in);
		int mMonth = Integer.parseInt(scan.nextLine().trim());
		scan.close();
		setInput(mMonth);
		System.out.println("������ ������ " + getSeanson2() + "�Դϴ�.");
	}
	
	void setInput(int _month) {
		this.month = _month;
	}
//	String getSeanson() {
//		String season = "";
//		switch(this.month) {
//		default: 
//			season = "�̻��� ����";
//			break;
//		case 3:
//		case 4:
//		case 5:
//			season = "��";
//			break;
//		case 6: case 7: case 8:
//			season = "����";
//			break;
//		case 9: case 10: case 11:
//			season = "����";
//			break;
//		case 12: case 1: case 2:
//			season = "�ܿ�";
//			break;
//		}
//		return season;
//	}
	String getSeanson2() {
		String season = "";
		int mMonth = this.month;
		if(3 <= month && month < 6) {
			season = "��";
		} else if (6 <= month && month < 9 ) {
			season = "����";
		} else if(9 <= month && month < 12) {
			season = "����";
		} else if(12 <= month && month < 3) {
			season = "�ܿ�";
		} else {
			season = "�̻��� ����";
		}
		return season;
		
	}
}