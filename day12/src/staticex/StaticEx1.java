package staticex;
//�ν��Ͻ� ������ ���õ� �۾��� �ϴ� �޼���� �ν��Ͻ� �޼���(static�� ���� ���� �޼���)
//static������ ���õ� �۾��� �ϴ� �޼���� Ŭ�����޼���(static�� ���� �޼���)
class Test{
	int x;
	int y;
	static int z;
	
	static {
		System.out.println("static �ʱ�ȭ ����");
	}
	// int z �� _z �Ǵ� z1���� �ش�
	// �������� �Ű������� �ٸ��� ������� �ʵ��� �Ѵ�. x, y�� ���� �̸��� �Ȱ��� �����ش�.
	public Test(int x, int y, int _z) {
		this.x=x;
		this.y=y;
		z=_z;
		System.out.println("��ü �ʱ�ȭ ����");
	}
	// static�� �۾��� ���´�
	public void view() {
		System.out.println(x +" "+ y +" "+ z);
	}
}

public class StaticEx1 {
// 3�� ���ִ� �ڸ��� 6�� ����Ἥ 6�� ���´�. static ������ �ǹ� ����
	public static void main(String[] args) {
		Test ob1 = new Test(1, 2, 3);
		Test ob2 = new Test(4, 5, 6);
		ob1.view();
		ob2.view();
		
	}

}
