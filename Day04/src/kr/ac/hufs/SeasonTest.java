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
		System.out.print("현재 월을 입력하세요.>");
		Scanner scan = new Scanner(System.in);
		int mMonth = Integer.parseInt(scan.nextLine().trim());
		scan.close();
		setInput(mMonth);
		System.out.println("현재의 계절은 " + getSeanson2() + "입니다.");
	}
	
	void setInput(int _month) {
		this.month = _month;
	}
//	String getSeanson() {
//		String season = "";
//		switch(this.month) {
//		default: 
//			season = "이상한 계절";
//			break;
//		case 3:
//		case 4:
//		case 5:
//			season = "봄";
//			break;
//		case 6: case 7: case 8:
//			season = "여름";
//			break;
//		case 9: case 10: case 11:
//			season = "가을";
//			break;
//		case 12: case 1: case 2:
//			season = "겨울";
//			break;
//		}
//		return season;
//	}
	String getSeanson2() {
		String season = "";
		int mMonth = this.month;
		if(3 <= month && month < 6) {
			season = "봄";
		} else if (6 <= month && month < 9 ) {
			season = "여름";
		} else if(9 <= month && month < 12) {
			season = "가을";
		} else if(12 <= month && month < 3) {
			season = "겨울";
		} else {
			season = "이상한 계절";
		}
		return season;
		
	}
}