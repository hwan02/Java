package my.entity;

public class Airplane extends Vehicle implements Flyer {
	
	public int flying(int from, int to){
		System.out.println("������ �����Ͽ� ����...");
		return to-from;
	}

	@Override
	public void transfer() {
		distance=flying(500, 1000);
	}

	@Override
	public void fly() {
		transfer();
	}
}
