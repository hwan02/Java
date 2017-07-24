package homework;

public class Homework1 {
	public static void main(String[] args) {
		Paystub ps = new Paystub();
	}
}
	class Paystub {
		int basicpay = 1500000;
		int allowance = 55000;
		double tax = 0.1;

		Paystub() {
			int sum = 0;
			int mul = 0;
			sum = basicpay + allowance;
			mul = (int) (basicpay * tax);
			System.out.println("실수령액: " + (sum - mul)+ "원");
		}
	}
