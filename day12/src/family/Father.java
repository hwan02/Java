package family;

public class Father extends Family implements Job {
	public Father() {
		super();
	}

	public Father(String name) {
		super(name); //�ƺ��� �̸��� ������ �ö󰣴�
	}
	@Override
	public String work() {
		return "�ƺ��� ������ ���� �Ѵ�\n";
	}
	@Override
	public String toString() {
		return super.toString()+work(); //�θ�Ŭ�������� ������ �ͼ� �ϴϱ� super
	}
	
}
