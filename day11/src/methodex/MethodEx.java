package methodex;

// Ŭ������ ������Ʈ�� �ν��Ͻ���. ������Ʈ�� �ν��Ͻ��� ��� ��ü��� �Ѵ�. 
// �ڵ�� �ۼ��Ǿ� �ִ� ���°� Ŭ�����̴�. 
// Ŭ������ �ν��Ͻ��� ������Ʈ��. �ظ��ϸ� ������� ������.

public class MethodEx {

	public static void view1() {
		System.out.println("static method");
	}
	
	public static void view2() {
		System.out.println("non - static method");
	}
	
	public static void main(String[] args) {
		// Ŭ�����޼���(static method): ��ü���� ȣ�� ����
		MethodEx.view1();
		// view1();  MehodEx Ŭ�����޼���� �̸��� �����ص� �ȴ�. �ڱ��ڽ��� �޼��忡 ������ ���� Ŭ�����̸� MethodEx. ���� ����
		
		// �μ��Ͻ� �޼���(instance method): ��ü ���� �� �޼��� ȣ�� ����
		// MethodEx ob = null; �̸��� ������ִ� �� 
		MethodEx ob = new MethodEx(); // ��ü�� ��üȭ ��Ű�� �� �޸𸮿� �ø��� ��
		//ob.view1(); //��ü�̸�.~~
		ob.view2();
		
	}
}
