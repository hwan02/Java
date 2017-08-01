package my.entity;

public class Bird extends Animal implements Flyer{
	@Override // 기능을 가진 주석 오버라이딩 규격에 맞는지?
	public void fly(){
		System.out.println("날개를 펄럭이며 난다...");
	}

	@Override
	public void eat() {
		System.out.println("벌레를 먹고 산다...");
	}
}

