package family;

public class Son extends Family implements Job{
	public Son() {
		super();
	}

	public Son(String name) {
		super(name); 
	}
	@Override
	public String work() {
		return "�Ƶ��� ���θ� �Ѵ�\n";
	}
	@Override
	public String toString() {
		return super.toString()+work(); 
	}
}
