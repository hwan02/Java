package kr.ac.hufs;

public class OverridingTest {

	static void Paint(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
		
		Line l = new Line();
		l.draw();
		
		
		new Rect().draw(); // ���� ���ε� �� �� ���� �ö��ڸ��� ���ÿ����� ���� �����ϰ� �������� �� 
		Rect r = new Rect(); // ���� ���ε� 
		r.draw();
		
		System.out.println("**************");
		Paint(new Shape());
		Paint(new Line());
		Paint(new Rect());
		Paint(new Circle2());
		
	}
}

class Shape{
	void draw() {
		System.out.println("shape");
	}
}

class Line extends Shape{
	/*void draw() {
		System.out.println("shape");
	}*/
	void draw() {
		System.out.println("Line");
	}
}
// �������̵�
// �θ� Ŭ�������� ���ǵ� �޼ҵ带 �ڽ� Ŭ�������� �������ϴ� ��
// �� ��� �θ� Ŭ�������� ���ǵ� �޼ҵ�� ����ȭ ��.
class Rect extends Shape{
	void draw() {
		System.out.println("Rect");
	}
}
class Circle2 extends Shape{
	void draw() {
		System.out.println("Circle2");
	}
}
/* �����ε�
 1. �θ�Ŭ���� or �ڽ�Ŭ�������� ������ �̸��� �޼ҵ带 �ߺ� �ۼ�
 2. ������ Ŭ���������� ��Ӱ���
 3. �������� �޼ҵ带 �ߺ��ۼ��Ͽ� ���ÿ� ����
 4. �޼ҵ�(������) ���� ���� && �Ű������� ������ Ÿ���� �޶����
 5. �������ε�: ������ ������ �ߺ��� �޼ҵ� �߿��� ȣ�� ���ΰ� ���� 
 
 ���� ���̵�
 1. ��� �ڽ� Ŭ�������� �θ� Ŭ������ �޼ҵ带 ������ �̸����� ���ۼ��Ͽ� ���.
 2. ��� ����
 3. �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ������ �޼ҵ�� �������Ͽ� ���
 4. �θ�Ŭ������ �޼ҵ�� �Ű����� �� ����Ÿ���� ����.
 5. ���� ���ε�: ��Ÿ��(����) ������ ȣ��
*/