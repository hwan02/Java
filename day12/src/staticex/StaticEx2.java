package staticex;

public class StaticEx2 {
	public static void main(String[] args) {
		System.out.println("**** 입금 당시의 금리 ****");
		BankAccount ba1 = new BankAccount(1994, "kim", 1000, 0.07);
		ba1.view();
		BankAccount ba2 = new BankAccount(1998, "lee", 1000, 0.12);
		ba2.view();
		BankAccount ba3 = new BankAccount(2005, "park", 1000, 0.07);
		ba3.view();
		
		System.out.println("**** 2005년 현재의 금리 ****");
		ba1.view();
		ba2.view();
		ba3.view();
		
		System.out.println("*** 0.04로 변동된 금리 ****");
		//static함수에 접근할 때는 '클래스명.static멤버함수()'로 호출 
		BankAccount.setRate(0.04); 
		ba1.view();
		ba2.view();
		ba3.view();
	}
}
