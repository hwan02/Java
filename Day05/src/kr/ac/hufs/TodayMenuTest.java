package kr.ac.hufs;

import java.util.Scanner;

public class TodayMenuTest {

	public static void main(String[] args) {
		new TodayMenu();
	}

}

class TodayMenu {
	final String MENU_KOR = "한식";
	final String MENU_CHINA = "중식";
	final String MENU_JAPAN = "일식";
	final String MENU_WEST = "양식";

	String[] menu = { "한식", "중식", "일식", "양식" };
	String[] mKor = { "김치찌개", "삼겹살", "제육덮밥", "된장찌개", "오므라이스" };
	String[] mChina = { "짜장면", "짬뽕", "볶음밥", "우동", "깐쵸 새우" };
	String[] mJapan = { "스시", "야끼우동", "타코야끼", "라면", "샤브샤브" };
	String[] mWest = { "돈까스", "피자", "파스타", "리조또", "브리또" };

	String menuSelectedStr = "";
	String menuSubSelectedStr = "";


	TodayMenu(){
		this.menuSelectedStr = menu[getRandomIndex(menu.length)];
		
		switch(this.menuSelectedStr) {
		case MENU_KOR:
			this.menuSubSelectedStr = mKor[getRandomIndex(mKor.length)];
			break;
			
		case MENU_CHINA:
			this.menuSubSelectedStr = mChina[getRandomIndex(mChina.length)];
			break;
			
		case MENU_JAPAN:
			this.menuSubSelectedStr = mJapan[getRandomIndex(mJapan.length)];
			break;
			
		case MENU_WEST:
			this.menuSubSelectedStr = mWest[getRandomIndex(mWest.length)];
			break;
		}
		
		pln("오늘의 메뉴는 " + this.menuSelectedStr + " 당첨입니다.");
		pln("그럼 점심은 " + this.menuSubSelectedStr + "(으)로 먹읍시다.");
	}
	
	int getRandomIndex(int _length) {
		return (int)(Math.random()*_length);
	}
	
	void pln(String _msg) {
		System.out.println(_msg);
	}
}