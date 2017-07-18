package kr.ac.hufs;

public class OverLoadingTest2 {

	public static void main(String[] args) {

	}
}

class Calc {
	int a = 0, b = 0; 

	// 매소드 오버로딩 or 매소드 중복
	Calc(int _a, int _b) {
		this.a = _a;
		this.b = _b;
	}

	int operatorPlus() {
		return a+b;
	}
	int operatorPlus(int x, int y) {
		return x+y;
	}
	/* 
	String operatorPlus(int x, int y) {
		return String.valueOf(x+y);
	}
	*/
	/* 메소드 오버로딩 or 메소드 중복
	 1. 매개변수의 개수가 다르거나, 타입이 달라야함.
	 2. 매개변수의 개수가 같을 경우, 타입이 달라야 오버로딩으로 할 수 있다.
	 3. 리턴 타입은 반드시 같아야 함.
	*/
	int operatorSubstract() {
		return a-b;
	}
	/*double operatorSubstract() {
		return (double)(a-b);
	}
	*/
	Calc(String _name, String _author) {
		this.name = _name;
		this.publishYear = 1970;
		this.author = _author;
	}

	// 매개변수의 타입이 서로 다르거나 개수가 달라야 함.  
	// 매개변수의 개수가 같더라도 타입이 서로 다르면 허용.
	Calc(String _name, int _publishYear, String _author) {
		this.name = _name;
		this.publishYear = 1970;
		this.author = _author;

	}

}