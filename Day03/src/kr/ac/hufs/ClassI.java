package kr.ac.hufs;

public class ClassI {

	int i = 9;

	public static void main(String[] args) {
		ClassI ci = new ClassI();
		ci.m1();
	}

	void m1() {
		if (i == 10) {
			pln("i�� 10�̴�");
		} else if (i > 10) {
			pln("i�� 10���� ũ��");
			pln("��");
		} else
			pln("i�� 10�� �ƴϰ�, 10���� ũ���� �ʴ�");
	}

	void pln(String str) {
		System.out.println(str);
	}

}
