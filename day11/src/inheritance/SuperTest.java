package inheritance;

//����Ʈ ������, ���� 2�� �޴� ������, toString() �߰�
public class SuperTest {
	private String name;
	private String addr;


	public SuperTest() {
		super();
	}

	public SuperTest(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "�̸��� " + name + "��� ���� " + addr + "�Դϴ�.\n";
	}
}
