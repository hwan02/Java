package kr.ac.hufs;

public class GcTest {

	public static void main(String[] args) {
		Gc g = new Gc();
		g.m1();

		String str1 = new String("�ѱ��ܱ�����б�");
		String str2 = new String("�̱��ܱ�����б�");

		str1 = str2; // new String("�̱��ܱ�����б�")�� Gc�� ���
		System.gc(); // ��������� ���������� �ƴϰ�, �ǰ����
		// ����޸� ���ο� ���� ���࿩�θ� JVM ����
		System.out.println(str1);
		System.out.println(str2);
	}
}

class Gc {
	Gc() {
		// ������
	}

}

	void m1() {

	}
}
