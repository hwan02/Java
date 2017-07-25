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
	public static void setRate(double r) { // static변수를 제어하기 위한 함수
		// 유효성 검사 보통 가볍게 생각한다. 
		if(r<0.02 || r>0.12) {
			System.out.println("금리 확인하고 가실게요~");
			System.exit(0);
		}
		rate=r;
	}
	public void view() {
		System.out.println(year +"\t"+ name +"\t"+ money +"\t"+ rate);
	}
}




























