package shape;

public class ShapeMain {

	public static void main(String[] args) {
		// ���� ���ε�
		Shape sh = null;
		sh = new Rectangle(4, 5);
		System.out.println("�簢���� ����: " + sh.getSize());
		
		sh = new Triangle(3, 7);
		System.out.println("�ﰢ���� ����: " + sh.getSize());
		// �������ε� 
		Rectangle rr = new Rectangle(4, 5);
		System.out.println("�簢���� ����: " + rr.getSize());
		
		Triangle tt = new Triangle(3, 7);
		System.out.println("�ﰢ���� ����: " + tt.getSize());
	}
}
