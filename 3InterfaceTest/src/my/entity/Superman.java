package my.entity;

public class Superman extends Human implements Flyer{
	@Override
	public void fly(){
		System.out.println("���並 �޷��̸� ����...");
	}
	@Override
	public void eat(){
		super.eat();
		System.out.println("���� �Դ´�...");

	}
}
