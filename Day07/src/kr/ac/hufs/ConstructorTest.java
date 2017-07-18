package kr.ac.hufs;

public class ConstructorTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		
		System.out.println("�ѷ�: " + c.getCircleRound());
		System.out.println("����:" + c.getCircleArea());
		
		Circle cc = new Circle();
		System.out.println("�ѷ�: " + c.getCircleRound());
		System.out.println("����:" + c.getCircleArea());
	}
}

class Circle{
	final float PI = 3.1415f;
	int r = 0;
	Circle(int _r){
		this.r = _r;
	}
	/* this()
	   1. this() �����ڿ����� ��� ����
	   2. this() ���� Ŭ�������� �ٸ� �����ڸ� ȣ���� �� ���
	   3. this() �������� ù ���忡�� ���� ��.
	 */
	 
	/* ������ 
	1. �����ڸ��� Ŭ������� ����
	2. ����Ÿ��(void, int, String)�� ���� ����.
	3. �������� ȣ���� Ŭ�������� �ν��Ͻ� �����ÿ� �ڵ�ȣ��
	4. �����ڰ� �ϳ��� ���ٸ�, JVM�� �� �����ڸ� ������� 
	5. static, final ���� �� ����
	�����ڴ� �ݵ�� �־���ϴ°�? �ƴ�
	
	������ ����� ������?
	�ʱ�ȭ�� ����, Ŭ���Һ�κ��� �ν��Ͻ� ������ �ʱⰪ�� �����ϴ� ���� 
	
	�����ڴ� ������ ���� �� �ֳ�? �׷���.
	���� �̸��� �����ڸ� �ߺ��ؼ� �����Ѵٴ� �ǹ�. ��, �Ű������� ������ Ÿ���� ���� �޶���Ѵ�.
	= > ������ �����ε� or ������ �ߺ�
	JVM�� �ڵ����� �� �����ڸ� ����� �ִ� ���� �����ڰ� �ϳ��� ���� ������ �ش�. 
	
	 this: ���� ��ü �ڱ� �ڽ� , ���� �ּҰ��� ������ ����
 	 this(), this(��): ���� ��ü�� ������
	void setR(int _r) {
		this.r = _r;
	}
	Circle(){
	this.r = 1;
	*/
	float getCircleRound() {
		
		return 2*PI*r;
	}
	float getCircleArea() {
		return PI*r*r;
	}
}