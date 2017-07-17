package kr.ac.hufs;

public class ClassI {

	int i = 9;

	public static void main(String[] args) {
		ClassI ci = new ClassI();
		ci.m1();
	}

	void m1() {
		if (i == 10) {
			pln("i는 10이다");
		} else if (i > 10) {
			pln("i는 10보다 크다");
			pln("끝");
		} else
			pln("i는 10이 아니고, 10보다 크지도 않다");
	}

	void pln(String str) {
		System.out.println(str);
	}

}
