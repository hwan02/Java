package kr.ac.hufs;

public class AccessTest {
	
public static void main(String[] args) {
	void mm2() {
		B b = new B();
		b.z = 100;
		
		C c = new C ();
		c.x; // private�� �پ� �ֱ⿡, ���� �Ұ�
		// ��ȸ�� ������ �޼ҵ带 ���ؼ� ����
		// getX(), setX();
		c.setX(80);
		C.getX();
	}
}
}
