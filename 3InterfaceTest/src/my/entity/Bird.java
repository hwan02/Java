package my.entity;

public class Bird extends Animal implements Flyer{
	@Override // ����� ���� �ּ� �������̵� �԰ݿ� �´���?
	public void fly(){
		System.out.println("������ �޷��̸� ����...");
	}

	@Override
	public void eat() {
		System.out.println("������ �԰� ���...");
	}
}

