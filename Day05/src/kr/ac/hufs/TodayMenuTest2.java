package kr.ac.hufs;

import java.util.Scanner;

public class TodayMenuTest2 {

	public static void main(String[] args) {
		new TodayMenu2();
	}
}

class TodayMenu2 {
	final int MENU_KOR = 0;
	final int MENU_CHINA = 1;
	final int MENU_JAPAN = 2;
	final int MENU_WEST = 3;

	String[] mKor = {"±èÄ¡Âî°³", "»ï°ã»ì", "Á¦À°µ¤¹ä", "µÈÀåÂî°³", "¿À¹Ç¶óÀÌ½º" };
	String[] mChina = { "Â¥Àå¸é", "Â«»Í", "ººÀ½¹ä", "¿ìµ¿", "±ñÃÝ »õ¿ì" };
	String[] mJapan = { "½º½Ã", "¾ß³¢¿ìµ¿", "Å¸ÄÚ¾ß³¢", "¶ó¸é", "»þºê»þºê" };
	String[] mWest = { "µ·±î½º", "ÇÇÀÚ", "ÆÄ½ºÅ¸", "¸®Á¶¶Ç", "ºê¸®¶Ç" };

	String[][] menu = {mKor, mChina, mJapan, mWest};

	String menuSelectedStr = "";
	String menuSubSelectedStr = "";

	TodayMenu2(){
		int idx = getRandomIndex(menu.length);

		switch(idx) {
		case MENU_KOR:
			menuSelectedStr = "ÇÑ½Ä";
			this.menuSubSelectedStr = menu[MENU_KOR][getRandomIndex(menu[MENU_KOR].length)];
			break;
			
		case MENU_CHINA:
			menuSelectedStr = "Áß½Ä";
			this.menuSubSelectedStr = menu[MENU_CHINA][getRandomIndex(menu[MENU_CHINA].length)];
			break;
			
		case MENU_JAPAN:
			menuSelectedStr = "ÀÏ½Ä";
			this.menuSubSelectedStr = menu[MENU_JAPAN][getRandomIndex(menu[MENU_JAPAN].length)];
			break;
			
		case MENU_WEST:
			menuSelectedStr = "¾ç½Ä";
			this.menuSubSelectedStr = menu[MENU_WEST][getRandomIndex(menu[MENU_WEST].length)];
			break;
		}
		
		pln("¿À´ÃÀÇ ¸Þ´º´Â " + this.menuSelectedStr + " ´çÃ·ÀÔ´Ï´Ù.");
		pln("±×·³ Á¡½ÉÀº " + this.menuSubSelectedStr + "(À¸)·Î ¸ÔÀ¾½Ã´Ù.");
	}
	
	int getRandomIndex(int length) {
		return (int)(Math.random()*length);
	}
	
	void pln(String _msg) {
		System.out.println(_msg);
	}
}
