package kr.ac.hufs;

public class FinalTest {
	static final float PI = 3.141592f;

	public static void main(String[] args) {
		// ���� �������� 15�� ���

		showMsg("���� �������� 15�� ��� ���̴� " + circleArea(15) + "�Դϴ�.");
		showMsg("���� �������� 15�� ��� �ѷ��� " + circleRound(15) + "�Դϴ�.");

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
