package kr.ac.hufs;

public class FinalTest {
	static final float PI = 3.141592f;

	public static void main(String[] args) {
		// 원의 반지름이 15인 경우

		showMsg("원의 반지름이 15인 경우 넓이는 " + circleArea(15) + "입니다.");
		showMsg("원의 반지름이 15인 경우 둘레는 " + circleRound(15) + "입니다.");

	}

	static float circleArea(int r) {
		return r * r * PI;

	}

	static float circleRound(int r) {
		return 2 * PI * r;
	}

	static void showMsg(String _msg) {
		System.out.println(_msg);
	}
}
