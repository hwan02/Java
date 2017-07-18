package kr.ac.hufs;

public class OverLoadingTest {

	public static void main(String[] args) {

	}
}

class Book {
	String name = "";
	int publishYear = 0;
	String author = "";

	// 생성자 오버로딩 or 생성자 중복
	Book() {
		this("무제", 1970, "미상");
	}

	Book(String _name, String _author) {
		this.name = _name;
		this.publishYear = 1970;
		this.author = _author;
	}

	// 매개변수의 타입이 서로 다르거나 개수가 달라야 함.  
	// 매개변수의 개수가 같더라도 타입이 서로 다르면 허용.
	Book(String _name, int _publishYear, String _author) {
		this.name = _name;
		this.publishYear = 1970;
		this.author = _author;

	}

}