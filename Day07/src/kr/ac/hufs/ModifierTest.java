package kr.ac.hufs;

public class ModifierTest {

	public static void main(String[] args) {

	}
}

class A {
	String aStr = "";
	int x = 0;
}

class B {
	int z = 0;

	void m1() {

	}
}

class C {
	private int x = 100;
	
	// ������� x�� ��ȸ�� ����
	int getX() {
		return this.x;
	}
	void setX(int _x) {
		this.x = _x;
	}
	void m2() {
		A a = new A();
		a.aStr = "�� C";
		
		new A().aStr = "�� �ٷ� C";
	}
}

// public, default, protected, private ���� ������
// public: ��Ű���� Ŭ���� ������� ������ ����
// default: ���� ��Ű�� ������ ������ ����
// protected: ���� ��Ű���̰ų� ��Ӱ������ ���� ���
// private: ���� Ŭ���� �������� ���� ���