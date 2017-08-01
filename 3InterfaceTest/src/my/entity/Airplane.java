package my.entity;

public class Airplane extends Vehicle implements Flyer {
	
	public int flying(int from, int to){
		System.out.println("엔진을 가동하여 난다...");
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
