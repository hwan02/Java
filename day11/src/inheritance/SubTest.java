package inheritance;

//����Ʈ ������, ���� 4�� �޴� ������, toString() �߰�
public class SubTest extends SuperTest{
	private int age;
	private double score;
	
	public SubTest() {
		super();
	}

	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		this.age = age;
		this.score = score;
	}
	

	@Override
	public String toString() {
		return super.toString()+"���̴� " + age + "�� �̰� ������ " + score + "���Դϴ�.";
	}
	public static void main(String[] args) {
		SuperTest ob1 = new SuperTest("������", "�뱸");
		System.out.println(ob1.toString());
		
		SubTest ob2 = new SubTest("������", "��õ", 25, 78.5);
		System.out.println(ob2.toString());
				
	}
}
