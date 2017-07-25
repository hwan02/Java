package interfaceex;

/* Ŭ������ �������̽��� �̿��� ���� ó��
 * Ŭ������: User
 * -name:String
 * +User()
 * +User(name:String)
 * +toString():String
 * 
 * �������̽���:Score
 * +sol:int(�ʱⰪ:20)
 * +getScore():int
 * 
 * �������̽�:Print
 * +toString():String
 * [���ȭ��]
 * �̸�: ȫ�浿
 * ����: 60��
 */
class User {
	private String name;

	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	// �ش�Ŭ���� �ȿ� �ִ� ��������� ���� ������ ���� ��?
	public String toString() {
		return "�̸�: " + name + "\n";
	}
}

// ----------------------------------------
interface Score {
	public int sol = 20; // ����

	public int getScore(); // '������*sol'�� ����
}

// ----------------------------------------
interface Print {
	public String toString();
}

public class InterfaceEx4 extends User implements Score, Print {
	int s;
	public InterfaceEx4(String name, int s) {
		super(name);
		this.s = s;
	}
	@Override
	public int getScore() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + "����: " + getScore() + "��\n";
	}

	/*
	 * public InterfaceEx4(String string, int i) {
	 * 
	 * @Override public int i { return 0; }
	 * 
	 * @Override public String toString() { return null; }
	 */

	public static void main(String[] args) {
		InterfaceEx4 ob = new InterfaceEx4("ȫ�浿", 3);
		System.out.println(ob.toString());
	}
}
