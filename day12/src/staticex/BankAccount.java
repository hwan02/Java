package staticex;

public class BankAccount {
	private int year;
	private String name;
	private int money;
	private static double rate;
	public BankAccount(int year, String name, int money, double r) {
		super();
		this.year = year;
		this.name = name;
		this.money = money;
		rate=r;
	}
	public static void setRate(double r) { // static������ �����ϱ� ���� �Լ�
		// ��ȿ�� �˻� ���� ������ �����Ѵ�. 
		if(r<0.02 || r>0.12) {
			System.out.println("�ݸ� Ȯ���ϰ� ���ǰԿ�~");
			System.exit(0);
		}
		rate=r;
	}
	public void view() {
		System.out.println(year +"\t"+ name +"\t"+ money +"\t"+ rate);
	}
}




























