package kr.ac.hufs;

public class VariableTest2 {

	public static void main(String[] args) {
		VariableT vt = new VariableT();
		vt.m1();
	}

}

class VariableT {

	int age = 20; // ��������

	void m1() {
		int a = 50;
		System.out.println("��������");
		
	}

	void m2() {
		// �������� age ���
		System.out.println("age=" + age);

		// m1�� �������� a ���
		// System.out.println("a=" + a); // ���� �� ��
		System.out.println("a=" + m3());

	}
	int m3() {
		int a = 50;
		System.out.println("��������");
		return a;
		
	}
}